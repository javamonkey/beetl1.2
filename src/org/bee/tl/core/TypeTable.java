/*
 [The "BSD license"]
 Copyright (c) 2011-2013 Joel Li (李家智)
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
     notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
     notice, this list of conditions and the following disclaimer in the
     documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
     derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.bee.tl.core;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

import org.antlr.runtime.tree.CommonTree;
import org.bee.tl.core.compile.NullClass;
import org.bee.tl.core.exception.PreCompileException;

/**
 * TypeTable相当于变量表，在优化模式下，保存了节点类型，以用于生成java代码
 * 此为核心类之一
 * 
 * @author joelli
 * 
 */
public class TypeTable
{

	//模板中需要传入的变量名和属性
	Map<String, List<String>> typesAttrMap = new ConcurrentHashMap<String, List<String>>();
	Map<String, TypeClass> typeClassMap = new ConcurrentHashMap<String, TypeClass>();
	Map<String, Class> funMap = new ConcurrentHashMap<String, Class>();
	private CoreScriptRunner scriptRunner = null;
	static Logger logger = Logger.getLogger(TypeTable.class.toString());

	public TypeTable(CoreScriptRunner sriptRunner)
	{
		this.scriptRunner = sriptRunner;
	}

	/**
	 * 在推测节点类型的之前，用于确定哪些节点（变量）是需要推测其类型的，譬如:
	 * <p>
	 * 
	 * <pre>
	 * var a = user.name;
	 * </pre>
	 * 
	 * 对于以上beetl代码，此方法将会找出user变量需要确定类型，这样，a类型就知道了，analyseFirst将会将变量 user放入变量表里
	 * 
	 * @param tree
	 */
	public void analyseFirst(BeeCommonNodeTree tree)
	{
		Context tempContext = new Context();
		Object tempObject = new Object();
		tempContext.set("__table", this);
		if (tree != null)
		{
			iterateForTypeTable(tree, tempContext, tempObject);
		}

	}

	/**
	 * 找到所有应该在赋值的变量
	 * 
	 * @param t
	 * @param localCtx
	 * @param tempObject
	 */
	private void iterateForTypeTable(CommonTree t, Context localCtx, Object tempObject)
	{

		// 只能找到模板文件里使用过的变量
		if (t.getToken() == null)
		{
			for (int i = 0; i < t.getChildCount(); i++)
			{
				iterateForTypeTable((CommonTree) t.getChild(i), localCtx, tempObject);

			}
		}
		else
		{
			int tokeType = t.getToken().getType();
			switch (tokeType)
			{
				case BeeParser.VAR_DEFINE:
				{
					CommonTree assignNode = (CommonTree) t.getChild(0);
					CommonTree varName = (CommonTree) assignNode.getChild(0);
					CommonTree expTree = (CommonTree) assignNode.getChild(1);
					localCtx.defineVar(varName.getToken().getText(), tempObject);
					//					//										我什么时候加上这个得，应该不需要啊
					//					this.addType(varName.getToken().getText());
					iterateForTypeTable(expTree, localCtx, tempObject);
					break;

				}
				case BeeParser.VAR_REFER:
				{

					List<CommonTree> list = (List<CommonTree>) t.getChildren();
					CommonTree indentifyNode = list.get(0);
					String varName = indentifyNode.getToken().getText();
					// if (varName.startsWith("__V"))
					// {
					// return;
					// }
					Object result = localCtx.getVarWithoutException(varName);
					if (result == null)
					{
						// 加入到变量表里,需要从模板种传入以判断类型
						this.addType(varName);

					}

					if (list.get(list.size() - 1).getType() == BeeParser.SAFE_OUTPUT)
					{
						iterateForTypeTable(list.get(list.size() - 1), localCtx, tempObject);
					}
					if (list.size() > 1)
					{
						// 还引用了属性，找到此属性
						// todo:目前暂时没有用到这些属性作为推测依据，但这些属性可以推测类型是否是其接口或者父类
						CommonTree attrNode = list.get(1);
						if (attrNode.getToken().getType() == BeeParser.ATTR_NAME)
						{
							String attrName = ((CommonTree) attrNode.getChild(0)).getToken().getText();
							if (this.typesAttrMap.containsKey(varName))
							{
								this.addTypeAttribute(varName, attrName);
							}

						}
						// list or map
					}

					break;

				}
				case BeeParser.FOR:
				{
					CommonTree idNode = (CommonTree) t.getChild(0);
					CommonTree expNode = (CommonTree) t.getChild(1);
					String name = idNode.getToken().getText();
					Context newCtx = new Context(localCtx);
					newCtx.defineVar(name, tempObject, idNode.getToken());
					newCtx.defineVar(name + "_index", tempObject, idNode.getToken());
					newCtx.defineVar(name + "_size", tempObject, idNode.getToken());

					iterateForTypeTable((CommonTree) expNode, newCtx, tempObject);
					iterateForTypeTable((CommonTree) t.getChild(2), newCtx, tempObject);
					if (t.getChildCount() == 4)
					{
						newCtx = new Context(localCtx);
						iterateForTypeTable((CommonTree) t.getChild(3), newCtx, tempObject);
					}
					break;
				}
				case BeeParser.CLASS_FUNCTION:
				{
					if (((BeeCommonNodeTree) t.getChild(t.getChildCount() - 1)).getToken().getType() == BeeParser.CLASS_METHOD)
					{
						if (t.getChildCount() == 2
								&& !BeetlUtil.isClassName(((CommonTree) t.getChild(0)).getToken().getText()))
						{
							// instance
							String identity = ((CommonTree) t.getChild(0)).getToken().getText();
							this.addType(identity);
							BeeCommonNodeTree classMethodNode = (BeeCommonNodeTree) t.getChild(1);
							String methodName = classMethodNode.getChild(0).getText();
							//标示非属性，而是本地调用，这将在setTypeClass中判断
							this.addTypeAttribute(identity, "@" + methodName);
							for (int i = 1; i < classMethodNode.getChildCount(); i++)
							{
								this.iterateForTypeTable((BeeCommonNodeTree) classMethodNode.getChild(i), localCtx,
										tempObject);
							}

						}

					}
					else
					{
						if (t.getChildCount() == 2
								&& !BeetlUtil.isClassName(((CommonTree) t.getChild(0)).getToken().getText()))
						{
							String identity = ((CommonTree) t.getChild(0)).getToken().getText();
							this.addType(identity);
							String propertyName = ((CommonTree) t.getChild(t.getChildCount() - 1)).getToken().getText();
							this.addTypeAttribute(identity, "!" + propertyName);
						}
					}
					break;

				}
				case BeeParser.SLIST:
				{
					List<BeeCommonNodeTree> list = t.getChildren();
					if (list == null)
						break;
					int size = list.size();
					BeeCommonNodeTree node = null;
					for (int i = 0; i < size; i++)
					{
						node = (BeeCommonNodeTree) list.get(i);
						iterateForTypeTable(node, new Context(localCtx), tempObject);
					}
					break;
				}
				default:
				{
					int size = t.getChildCount();
					for (int i = 0; i < size; i++)
					{
						CommonTree child = (CommonTree) t.getChild(i);
						iterateForTypeTable(child, localCtx, tempObject);
					}
				}
			}
		}
	}

	public void infer(BeeCommonNodeTree tree, Context ctx)
	{

		if (tree.getToken() == null)
		{
			for (int i = 0; i < tree.getChildCount(); i++)
			{
				infer((BeeCommonNodeTree) tree.getChild(i), ctx);

			}
			return;
		}

		int tokenType = tree.getToken().getType();
		switch (tokenType)
		{
			case BeeParser.INT:
			{
				tree.setExpType(BeeNumber.class);
				break;
			}
			case BeeParser.DOUBLE:
			{
				tree.setExpType(BeeNumber.class);
				break;
			}
			case BeeParser.BOOLEAN:
			{
				tree.setExpType(Boolean.class);
				break;
			}
			case BeeParser.StringLiteral:
			{
				tree.setExpType(String.class);
				tree.setCached(tree.getToken().getText());
				break;
			}
			case BeeParser.NEGATOM:
			{
				infer((BeeCommonNodeTree) tree.getChild(0), ctx);
				tree.setExpType(BeeNumber.class);
				break;
			}
			case BeeParser.MINUS:
			case BeeParser.MULTIP:
			case BeeParser.MOD:
			case BeeParser.DIV:
			case BeeParser.ADD:
			{
				// 控制还需要严格，区别整形，字符创，字符，对象，加减乘等各种情况
				BeeCommonNodeTree left = (BeeCommonNodeTree) tree.getChild(0);
				BeeCommonNodeTree right = (BeeCommonNodeTree) tree.getChild(1);
				if (left.getExpType() == null)
				{
					infer(left, ctx);
				}
				if (right.getExpType() == null)
				{
					infer(right, ctx);
				}
				Class leftType = left.getExpType();
				Class rightType = right.getExpType();

				if (leftType.equals(Object.class) || rightType.equals(Object.class))
				{
					// 动态决定，当前不支持。
					tree.setExpType(Object.class);
					return;
				}
				else if (leftType.equals(String.class) || rightType.equals(String.class))
				{
					tree.setExpType(String.class);
				}
				else if (leftType.equals(Character.class) || rightType.equals(Character.class))
				{
					tree.setExpType(String.class);
				}
				else if (Number.class.isAssignableFrom(leftType) || Number.class.isAssignableFrom(rightType))
				{
					tree.setExpType(BeeNumber.class);
				}
				else if (NullClass.class.equals(leftType) && NullClass.class.equals(rightType))
				{
					tree.setExpType(NullClass.class);
				}
				else
				{
					throw new PreCompileException("Error Exp," + left.getToken().getText() + " or "
							+ right.getToken().getText());
				}
				// else if (leftType.equals(Double.class) ||
				// leftType.equals(Double.class))
				// {
				//
				// }
				//
				// else
				// {
				// tree.setExpType(Integer.class);
				// }
				break;
			}
			case BeeParser.JSONARRAY:
			{
				tree.setExpType(List.class);

				for (int i = 0; i < tree.getChildCount(); i++)
				{
					this.infer((BeeCommonNodeTree) tree.getChild(i), ctx);
				}
				break;
			}
			case BeeParser.JSONMAP:
			{
				tree.setExpType(Map.class);
				for (int i = 0; i < tree.getChildCount(); i++)
				{
					BeeCommonNodeTree keyValue = (BeeCommonNodeTree) tree.getChild(i);

					this.infer((BeeCommonNodeTree) keyValue.getChild(1), ctx);
				}
				break;
			}
			case BeeParser.NOT_EQUAL:
			case BeeParser.EQUAL:
			case BeeParser.LARGE:
			case BeeParser.LARGE_EQUAL:
			case BeeParser.LESS:
			case BeeParser.LESS_EQUAL:
			{
				BeeCommonNodeTree left = (BeeCommonNodeTree) tree.getChild(0);
				BeeCommonNodeTree right = (BeeCommonNodeTree) tree.getChild(1);
				if (left.getExpType() == null)
				{
					infer(left, ctx);
				}
				if (right.getExpType() == null)
				{
					infer(right, ctx);
				}
				break;
			}
			case BeeParser.NOT:
			{
				BeeCommonNodeTree condition = (BeeCommonNodeTree) tree.getChild(0);
				infer(condition, ctx);
				break;
			}
			case BeeParser.NULL:
			{
				tree.setExpType(NullClass.class);
				break;
			}

			case BeeParser.FUNCTION:
			{

				BeeCommonNodeTree fnNameNode = ((BeeCommonNodeTree) tree.getChild(0));
				Function fn = (Function) fnNameNode.getCached();
				String fnName = null;
				if (fn == null)
				{
					fnName = BeetlUtil.getFunctionFullName(fnNameNode);
					fn = scriptRunner.getFunction(fnName);
					if (fn == null)
					{
						throw new PreCompileException("function not exist:" + fnName);
					}
					fnNameNode.setCached(fn);
				}

				Method[] ms = fn.getClass().getMethods();
				Method call = null;
				//@todo 通过反射找到Call方法
				for (Method m : ms)
				{
					if (m.getName().equals("call"))
					{
						call = m;
						break;
					}
				}

				Class c = call.getReturnType();
				tree.setExpType(c);
				for (int i = 1; i < tree.getChildCount(); i++)
				{
					infer((BeeCommonNodeTree) tree.getChild(i), ctx);
				}
				//				this.funMap.put(fnName, fn.getClass());

				break;
			}
			case BeeParser.TEXT_PROCESS:
			{
				BeeCommonNodeTree processNode = (BeeCommonNodeTree) tree.getChild(0);
				String processName = processNode.getToken().getText();
				if (processName == null)
				{
					processName = BeetlUtil.getFunctionFullName(processNode);
					processNode.setCached(processName);
				}

				BeeCommonNodeTree blockNode = (BeeCommonNodeTree) tree.getChild(1);
				int size = tree.getChildCount();
				Object[] paras = new Object[size - 2];
				BeeCommonNodeTree paraNode = null;
				for (int i = 2; i < size; i++)
				{
					paraNode = (BeeCommonNodeTree) tree.getChild(i);
					this.infer(paraNode, ctx);
				}
				this.infer(blockNode, ctx);
				break;
			}

			case BeeParser.ASSIGNMENT:
			{
				BeeCommonNodeTree indentifyTree = (BeeCommonNodeTree) tree.getChild(0);
				BeeCommonNodeTree exp = (BeeCommonNodeTree) tree.getChild(1);
				infer(exp, ctx);
				if (exp.getType() == BeeParser.SLIST)
				{
					indentifyTree.setExpType(SuperVar.class);
				}
				else
				{
					indentifyTree.setExpType(exp.getExpType());
				}

				String varName = indentifyTree.getToken().getText();
				BeeCommonNodeTree parentTree = (BeeCommonNodeTree) tree.getParent();
				if (parentTree != null && !parentTree.isNil()
						&& parentTree.getToken().getType() == BeeParser.VAR_DEFINE)
				{
					// 如果是变量定义

					// 如果是类型为null，则延迟到以后推测
					if (indentifyTree.getExpType().equals(NullClass.class))
					{
						TypeClass tc = new TypeClass();
						tc.setRawType(NullClass.class);
						tc.setRef(parentTree);

						ctx.defineVar(varName, tc, indentifyTree.getToken());
						parentTree.setTypeClass(tc);
					}
					else
					{
						ctx.defineVar(varName, indentifyTree.getTypeClass(), indentifyTree.getToken());
						parentTree.setExpType(indentifyTree.getExpType());

					}

				}
				else
				{
					// 如果赋值
					TypeClass oldTypeClass = (TypeClass) ctx.getVar(varName);
					TypeClass newTypeClass = indentifyTree.getTypeClass();
					// 如果已经被赋值过了
					if (oldTypeClass != null)
					{
						if (oldTypeClass.getRawType().equals(NullClass.class))
						{
							BeeCommonNodeTree varDefinNode = (BeeCommonNodeTree) oldTypeClass.getRef();
							varDefinNode.setTypeClass(newTypeClass);
						}
						else if (!oldTypeClass.equals(newTypeClass))
						{
							throw new PreCompileException(varName + "类型定义不一致在行 " + indentifyTree.getToken().getLine());
						}
						else
						{
							// do nothing
						}

					}
					ctx.setVar(varName, newTypeClass);

				}
				break;

			}

			case BeeParser.SLIST:
			{
				Context newCtx = new Context(ctx);
				List<BeeCommonNodeTree> list = tree.getChildren();
				if (list == null)
					break;
				int size = list.size();
				BeeCommonNodeTree node = null;
				for (int i = 0; i < size; i++)
				{
					node = (BeeCommonNodeTree) list.get(i);
					infer(node, newCtx);
				}
				break;
			}

			case BeeParser.SWITCH:
			{
				BeeCommonNodeTree exp = (BeeCommonNodeTree) tree.getChild(0);
				this.infer(exp, ctx);
				int caseCount = tree.getChildCount() - 1;
				BeeCommonNodeTree caseTree = null;
				BeeCommonNodeTree comparedTree = null;
				BeeCommonNodeTree caseExpTree = null;
				for (int i = 0; i < caseCount; i++)
				{
					caseTree = (BeeCommonNodeTree) tree.getChild(i + 1);

					if (caseTree.getToken().getType() != BeeParser.DEFAULT)
					{
						comparedTree = (BeeCommonNodeTree) caseTree.getChild(0);
						this.infer(comparedTree, ctx);
						caseExpTree = (BeeCommonNodeTree) caseTree.getChild(1);
						this.infer(caseExpTree, ctx);
					}
					else
					{
						caseExpTree = (BeeCommonNodeTree) caseTree.getChild(0);
						this.infer(caseExpTree, ctx);

					}

				}

				break;

			}
			case BeeParser.WHILE:
			{
				BeeCommonNodeTree condNode = (BeeCommonNodeTree) tree.getChild(0);
				infer(condNode, ctx);
				BeeCommonNodeTree blockNode = (BeeCommonNodeTree) tree.getChild(1);
				infer(blockNode, ctx);
				break;
			}
			case BeeParser.FOR:
			{
				BeeCommonNodeTree idNode = (BeeCommonNodeTree) tree.getChild(0);
				BeeCommonNodeTree varRef = (BeeCommonNodeTree) tree.getChild(1);
				Context newCtx = new Context(ctx);
				TypeClass typeClass = new TypeClass();
				typeClass.setRawType(Long.class);
				newCtx.defineVar(idNode.getToken().getText() + "_index", typeClass);
				infer(varRef, newCtx);

				if (Iterable.class.isAssignableFrom(varRef.getTypeClass().getRawType()))
				{

					Class type = varRef.getTypeClass().getPtypeMap().get("E");
					if (type == null)
					{
						type = Object.class;
					}
					idNode.setExpType(type);

				}

				else if (varRef.getTypeClass().getRawType().isArray())
				{

					idNode.setExpType(varRef.getTypeClass().getRawType().getComponentType());

				}
				else if (Map.class.isAssignableFrom(varRef.getTypeClass().getRawType()))
				{
					TypeClass entryType = new TypeClass();
					entryType.setRawType(MapEntry.class);
					Class keyType = varRef.getTypeClass().getPtypeMap().get("K");
					Class valueType = varRef.getTypeClass().getPtypeMap().get("V");
					if (keyType == null)
					{
						keyType = Object.class;
					}
					if (valueType == null)
					{
						valueType = Object.class;
					}
					entryType.getPtypeMap().put("K", keyType);
					entryType.getPtypeMap().put("V", valueType);
					idNode.setTypeClass(entryType);

				}
				else
				{
					throw new PreCompileException("For 循环类型是 " + varRef.getTypeClass().getRawType() + ",位于行"
							+ varRef.getToken().getLine() + ",for循环里明确类型将有助于优化");
				}

				newCtx.defineVar(idNode.getToken().getText(), idNode.getTypeClass());
				BeeCommonNodeTree blockNode = (BeeCommonNodeTree) tree.getChild(2);
				infer(blockNode, newCtx);
				if (tree.getChildCount() == 4)
				{
					BeeCommonNodeTree elseForNode = (BeeCommonNodeTree) tree.getChild(3);
					newCtx = new Context(ctx);
					infer(elseForNode, newCtx);
				}
				break;
			}
			case BeeParser.IF:
			{
				List<BeeCommonNodeTree> list = tree.getChildren();
				BeeCommonNodeTree conditionNode = (BeeCommonNodeTree) list.get(0);
				infer(conditionNode, ctx);

				BeeCommonNodeTree block = (BeeCommonNodeTree) list.get(1);
				infer(block, ctx);

				if (list.size() == 3)
				{
					BeeCommonNodeTree elseBlock = (BeeCommonNodeTree) list.get(2);
					infer(elseBlock, ctx);
				}

				break;

			}

			case BeeParser.CLASS_FUNCTION:
			{

				BeeCommonNodeTree exp = (BeeCommonNodeTree) tree;

				if (((BeeCommonNodeTree) exp.getChild(exp.getChildCount() - 1)).getToken().getType() == BeeParser.CLASS_METHOD)
				{
					// method call,first find the class or instance
					if (exp.getChildCount() == 2
							&& !BeetlUtil.isClassName(((CommonTree) exp.getChild(0)).getToken().getText()))
					{
						// instance method .such as :aa.GetName();
						String identity = ((BeeCommonNodeTree) exp.getChild(0)).getToken().getText();
						TypeClass typeClass = (TypeClass) ctx.getVar(identity);
						Class c = typeClass.getRawType();
						BeeCommonNodeTree classMethodNode = null;
						String methodName = null;
						Method method = null;
						classMethodNode = (BeeCommonNodeTree) exp.getChild(exp.getChildCount() - 1);
						methodName = ((BeeCommonNodeTree) classMethodNode.getChild(0)).getToken().getText();
						Class[] parameterType = new Class[classMethodNode.getChildCount() - 1];
						for (int j = 1; j < classMethodNode.getChildCount(); j++)
						{
							BeeCommonNodeTree para = (BeeCommonNodeTree) classMethodNode.getChild(j);
							this.infer(para, ctx);
							parameterType[j - 1] = para.getTypeClass().getRawType();
						}

						MethodConf mc = (MethodConf) exp.getCached();
						if (mc == null)
						{
							mc = MethodUtil.findMethod(c, methodName, parameterType);
						}

						if (mc != null)
						{
							if (scriptRunner.containIllegalNativeCall(mc.method.getDeclaringClass().toString()))
							{
								throw new PreCompileException("此本地调用不允许 " + mc.method.getName());
							}

							this.setExpType(exp, mc.method.getReturnType());
							exp.setCached(mc);
						}
						else
						{
							throw new PreCompileException("本地方法调用未找到!");
						}

					}
					else
					{
						StringBuilder sb = new StringBuilder();
						Class target = null;
						Object o;
						for (int i = 0; i < exp.getChildCount() - 1; i++)
						{
							sb.append(exp.getChild(i).getText()).append(".");
						}
						sb.setLength(sb.length() - 1);

						try
						{
							target = Class.forName(sb.toString());

						}
						catch (SecurityException e)
						{
							throw new PreCompileException("本地方法调用不被JVM允许，在行" + exp.getToken().getLine(), e);
						}
						catch (ClassNotFoundException e)
						{
							throw new PreCompileException("未找到类" + sb.toString() + "，在行" + exp.getToken().getLine(), e);
						}
						BeeCommonNodeTree classMethodNode = null;
						String methodName = null;
						Method method = null;

						classMethodNode = (BeeCommonNodeTree) exp.getChild(exp.getChildCount() - 1);
						methodName = ((BeeCommonNodeTree) classMethodNode.getChild(0)).getToken().getText();

						Class[] parameterType = new Class[classMethodNode.getChildCount() - 1];
						for (int j = 1; j < classMethodNode.getChildCount(); j++)
						{
							BeeCommonNodeTree para = (BeeCommonNodeTree) classMethodNode.getChild(j);
							this.infer(para, ctx);
							parameterType[j - 1] = para.getTypeClass().getRawType();
						}

						MethodConf mc = (MethodConf) exp.getCached();
						if (mc == null)
						{
							mc = MethodUtil.findMethod(target, methodName, parameterType);

						}
						if (mc != null)
						{
							if (scriptRunner.containIllegalNativeCall(mc.method.getDeclaringClass().toString()))
							{
								throw new PreCompileException("此本地调用不允许 " + mc.method.getName());
							}
							exp.setCached(mc);
							this.setExpType(exp, mc.method.getReturnType());
						}
						else
						{
							throw new PreCompileException("本地方法调用未找到!");
						}

					}

				}
				else
				{
					// property access
					if (exp.getChildCount() == 2
							&& !BeetlUtil.isClassName(((CommonTree) exp.getChild(0)).getToken().getText()))
					{
						// public field of instance
						String identity = ((CommonTree) exp.getChild(0)).getToken().getText();
						TypeClass typeClass = (TypeClass) ctx.getVar(identity);
						Class c = typeClass.getRawType();

						String propertyName = ((CommonTree) exp.getChild(exp.getChildCount() - 1)).getToken().getText();
						try
						{

							Class returnClass = c.getDeclaredField(propertyName).getType();
							this.setExpType(exp, returnClass);
						}
						catch (IllegalArgumentException e)
						{
							throw new PreCompileException("错误的native属性调用，符号" + identity + ","
									+ exp.getToken().getLine() + "行", e);
						}
						catch (SecurityException e)
						{
							throw new PreCompileException("错误的native属性调用，符号" + identity + ","
									+ exp.getToken().getLine() + "行", e);
						}
						catch (NoSuchFieldException e)
						{
							throw new PreCompileException("错误的native属性调用，无此属性:" + propertyName + ","
									+ exp.getToken().getLine() + "行", e);
						}
					}
					else
					{
						StringBuilder sb = new StringBuilder();
						Class target = null;

						for (int i = 0; i < exp.getChildCount() - 1; i++)
						{
							sb.append(exp.getChild(i).getText()).append(".");
						}
						sb.setLength(sb.length() - 1);

						try
						{
							target = Class.forName(sb.toString());

						}
						catch (SecurityException e)
						{
							throw new PreCompileException("错误的native调用," + exp.getToken().getLine() + "行", e);
						}
						catch (ClassNotFoundException e)
						{
							throw new PreCompileException("错误的native class:" + sb + "," + exp.getToken().getLine()
									+ "行", e);
						}

						String propertyName = null;

						CommonTree propertyNode = (CommonTree) exp.getChild(exp.getChildCount() - 1);
						propertyName = propertyNode.getToken().getText();
						try
						{
							Class returnClass = target.getDeclaredField(propertyName).getType();
							this.setExpType(exp, returnClass);

						}
						catch (IllegalArgumentException e)
						{
							throw new PreCompileException("错误的native调用," + exp.getToken().getLine() + "行", e);
						}
						catch (SecurityException e)
						{
							throw new PreCompileException("错误的native调用," + exp.getToken().getLine() + "行", e);
						}
						catch (NoSuchFieldException e)
						{
							throw new PreCompileException("错误的native属性调用，无此属性:" + propertyName + ","
									+ exp.getToken().getLine() + "行", e);

						}

					}

				}
				break;
			}

			case BeeParser.HOLDER:
			{
				BeeCommonNodeTree varTextNode = (BeeCommonNodeTree) tree.getChild(0);
				infer(varTextNode, ctx);
				BeeCommonNodeTree expNode = (BeeCommonNodeTree) varTextNode.getChild(0);
				if (expNode.getTypeClass().getRawType() != null
						&& expNode.getTypeClass().getRawType().equals(NullClass.class))
				{
					throw new PreCompileException("行:" + expNode.getLine() + "变量仍然为null，无法推测");
				}

				break;
			}
			case BeeParser.TEXT_VAR_REFER:
			{
				BeeCommonNodeTree idNode = (BeeCommonNodeTree) tree.getChild(0);
				idNode.setExpType(String.class);
				break;
			}
			case BeeParser.VAR_REFER:
			{
				BeeCommonNodeTree idNode = (BeeCommonNodeTree) tree.getChild(0);
				String varName = idNode.getToken().getText();
				TypeClass type = (TypeClass) ctx.getVar(varName);
				idNode.setTypeClass(type);
				BeeCommonNodeTree parentNode = null;
				boolean hasSafeOutput = false;

				if (tree.getChildCount() > 1)
				{

					int count = tree.getChildCount();
					if (tree.getChild(tree.getChildCount() - 1).getType() == BeeParser.SAFE_OUTPUT)
					{
						parentNode = (BeeCommonNodeTree) tree.getParent();
						// if (!(parentNode.getType() == BeeParser.VAR_TEXT ||
						// parentNode
						// .getType() == BeeParser.FOR)) {
						// throw new PreCompileException("必须出现在占位符号里 "
						// + tree.getParent().getText());
						//
						// } else {
						// 提前告诉占位符号，需要特殊处理
						parentNode.getTypeClass().setRef(Boolean.TRUE);
						// 推测安全部分的类型
						this.infer((BeeCommonNodeTree) tree.getChild(count - 1), ctx);
						count = count - 1;
						hasSafeOutput = true;
						// }
					}
					// session["user"].messages
					for (int i = 1; i < count; i++)
					{
						BeeCommonNodeTree attrNode = (BeeCommonNodeTree) tree.getChild(i);
						int attrType = attrNode.getToken().getType();
						switch (attrType)
						{
							case BeeParser.ATTR_NAME:
							{
								BeeCommonNodeTree commonAttr = (BeeCommonNodeTree) attrNode.getChild(0);

								String attrName = commonAttr.getToken().getText();
								try
								{

									Class returnClass = null;
									if (type.getRawType().equals(MapEntry.class))
									{
										if (attrName.equals("key"))
										{
											returnClass = type.getPtypeMap().get("K");
										}
										else
										{
											returnClass = type.getPtypeMap().get("V");
										}
									}
									else
									{
										if (type.getRawType().equals(Object.class))
										{
											// 允许编译这种情况
											returnClass = Object.class;
											type = new TypeClass(returnClass);
											break;
											// // 设置此节点类型为Object
											// tree.setTypeClass(type);
											// return;
										}
										else
										{
											Method getMethod = PropertyUtil.getReadMethod(type.getRawType(), attrName);
											if (getMethod == null)
											{
												// todo:
												// 有时候，PropertyUtil不能得到父类的读属性，奇怪，譬如
												// javax.servlet.http.HttpServletRequest.class的paramerterMap
												throw new PreCompileException("不能找到属性:" + type.getRawType() + ":"
														+ attrName);
											}
											returnClass = getMethod.getReturnType();

										}

									}

									if (Number.class.isAssignableFrom(returnClass))
									{
										type = new TypeClass(BeeNumber.class);
									}
									else if (returnClass == int.class || returnClass == long.class
											|| returnClass == double.class || returnClass == float.class)
									{
										type = new TypeClass(BeeNumber.class);
									}
									else
									{
										type = new TypeClass(returnClass);
									}

								}
								catch (PreCompileException pe)
								{
									throw pe;
								}
								catch (Exception ex)

								{
									ex.printStackTrace();
									throw new PreCompileException(ex.getMessage());
								}

								break;
							}
							case BeeParser.MAP_LIST_INDEX:
							{
								if (List.class.isAssignableFrom(type.getRawType()))
								{
									if (type.getPtypeMap().get("E") != null)
									{
										type = new TypeClass(type.getPtypeMap().get("E"));
									}
									else
									{
										type = new TypeClass(Object.class);
									}

									BeeCommonNodeTree expNode = (BeeCommonNodeTree) attrNode.getChild(0);
									this.infer(expNode, ctx);
								}
								else if (type.getRawType().isArray())
								{
									type = new TypeClass(type.getRawType());
									BeeCommonNodeTree expNode = (BeeCommonNodeTree) attrNode.getChild(0);
									this.infer(expNode, ctx);
								}
								else
								{

									if (Map.class.isAssignableFrom(type.getRawType()))
									{
										if (type.getPtypeMap().get("V") != null)
										{
											type = new TypeClass(type.getPtypeMap().get("V"));
										}
										else
										{
											type = new TypeClass(Object.class);
										}

									}
									else
									{
										BeeCommonNodeTree expNode = (BeeCommonNodeTree) attrNode.getChild(0);
										this.infer(expNode, ctx);
										// 不是Map,而是generic get,
										Method m = (Method) attrNode.getCached();
										if (m == null)
										{
											Object cached = expNode.getCached();
											if (cached != null && cached instanceof String)
											{
												String attribute = (String) cached;
												m = PropertyUtil.getGetMehod(type.getRawType(), attribute);
												if (m == null)
												{
													m = PropertyUtil.getGetMehod(type.getRawType(), null);
												}

											}
											attrNode.setCached(m);

										}

										if (m == null)
										{
											throw new PreCompileException("Not Map,Not Generic Get!");
										}
										type = new TypeClass(m.getReturnType());

									}

								}
								break;
							}
							case BeeParser.VIRTUAL_ATTR_NAME:
							{
								BeeCommonNodeTree commonAttr = (BeeCommonNodeTree) attrNode.getChild(0);
								String attrName = commonAttr.getToken().getText();
								Class t = type.getRawType();
								VirtualAttributeEval virEval = scriptRunner.getVirtualAttributeEval(t, attrName);
								Method call = null;

								try
								{
									call = virEval.getClass().getMethod("eval", Object.class, String.class,
											Context.class);
								}
								catch (SecurityException e)
								{
									logger.warning(e.getMessage());
									throw new PreCompileException("虚拟方法：" + attrName + "获取失败," + e.getMessage());
								}
								catch (NoSuchMethodException e)
								{
									logger.warning(e.getMessage());
									throw new PreCompileException("虚拟方法：" + attrName + "不存在," + e.getMessage());
								}

								type = new TypeClass(call.getReturnType());

							}

						}
						attrNode.setTypeClass(type);
					}
				}

				if (hasSafeOutput && parentNode.getType() != BeeParser.FOR)
				{
					BeeCommonNodeTree safeNode = (BeeCommonNodeTree) tree.getChild(tree.getChildCount() - 1);
					if (safeNode.getTypeClass().equals(type))
					{
						tree.setTypeClass(type);
					}
					else
					{
						tree.setExpType(Object.class);
					}
				}
				else
				{
					tree.setTypeClass(type);
				}

				break;

			}
			case BeeParser.SAFE_OUTPUT:
			{
				if (tree.getChildCount() == 0)
				{
					tree.setExpType(NullClass.class);
				}
				else
				{
					BeeCommonNodeTree atomNode = (BeeCommonNodeTree) tree.getChild(0);
					this.infer(atomNode, ctx);
					tree.setExpType(atomNode.getExpType());
				}
				break;
			}
			default:
			{
				for (int i = 0; i < tree.getChildCount(); i++)
				{
					this.infer((BeeCommonNodeTree) tree.getChild(i), ctx);
				}

			}

		}

	}

	public List<String> getTypeAttribute(String varName)
	{
		return typesAttrMap.get(varName);
	}

	public TypeClass getTypeClass(String varName)
	{
		return typeClassMap.get(varName);
	}

	public boolean mustInfer()
	{
		if (typeClassMap.size() == typesAttrMap.size())
		{

			return false;
		}
		else
		{
			return true;
		}
	}

	/** 设置一个模板变量的类型
	 * @param varName
	 * @param newClassType
	 */
	public void setTypeClass(String varName, TypeClass newClassType)
	{
		if (typeClassMap.containsKey(varName))
		{
			TypeClass olderClass = typeClassMap.get(varName);
			if (olderClass.equals(newClassType))
			{
				return;
			}
			else
			{

				TypeClass betterClass = check(varName, olderClass, newClassType);
				if (betterClass == null)
				{
					throw new IllegalArgumentException("类型推测失败，预编译方式必须传入相同的类型，转入解释执行方式" + varName + ":" + newClassType);
				}
				typeClassMap.put(varName, betterClass);
			}

		}
		else
		{

			if (Map.class.isAssignableFrom(newClassType.getRawType()))
			{
				typeClassMap.put(varName, newClassType);
			}
			else if (List.class.isAssignableFrom(newClassType.getRawType()))
			{
				typeClassMap.put(varName, newClassType);
			}
			else if (newClassType.getRawType().isArray())
			{
				typeClassMap.put(varName, newClassType);
			}
			else
			{
				//				如果是个native调用，这attrs为空，无法判断，这个还要继续优化
				TypeClass realType = getRealType(varName, newClassType);
				if (realType == null)
				{
					throw new PreCompileException("变量" + varName + "的类型不确定");
				}
				typeClassMap.put(varName, realType);
			}

		}
	}

	/** 判断变量真正的类型，譬如，类型应该是某个接口
	 * @param varName
	 * @param newClassType
	 * @return
	 */
	protected TypeClass getRealType(String varName, TypeClass newClassType)
	{

		List<String> attrs = typesAttrMap.get(varName);
		if (attrs.size() == 0)
		{
			return newClassType;
		}

		Class c1 = newClassType.getRawType();
		List<Class> c1List = PropertyUtil.getAllClass(c1);
		;
		if (c1List.size() == 1)
		{
			//只有自己，不做判断,返回自己
			return newClassType;
		}

		for (Class c : c1List)
		{

			//有共同的接口，还必须支持模板里出现的所有属性
			if (hasAllField(c, attrs))
			{
				TypeClass t = new TypeClass();
				t.setRawType(c);
				return t;
			}
			else
			{
				continue;
			}

		}
		//找不到共同属性，只能解释模式执行了
		return null;

	}

	public List<String> allType()
	{
		return new ArrayList<String>(typesAttrMap.keySet());
	}

	public Map<String, TypeClass> getTypeClass()
	{
		return this.typeClassMap;
	}

	/**
	 * 指定某个变量需要推测
	 * @param varName
	 */
	public void addType(String varName)
	{
		if (!typesAttrMap.containsKey(varName))
		{
			List<String> attrs = new ArrayList<String>();
			typesAttrMap.put(varName, attrs);
			return;
		}

	}

	//	/** 模板中变量的属性，用于判断模板此变量的类
	//	 * @param varName
	//	 * @param attributeName
	//	 */
	public void addTypeAttribute(String varName, String attributeName)
	{
		//		if (!typesAttrMap.containsKey(varName))
		//		{
		//			throw new IllegalArgumentException(varName);
		//		}
		List<String> attrs = typesAttrMap.get(varName);
		if (attrs == null)
		{
			attrs = new ArrayList<String>();
			typesAttrMap.put(varName, attrs);

		}
		attrs.add(attributeName);

	}

	/**
	 * 检查varName 实际类型
	 * @param varName
	 * @param olderClass
	 * @param newClass
	 * @return
	 */
	private TypeClass check(String varName, TypeClass olderClass, TypeClass newClass)
	{
		//		return newClass;
		Class c1 = olderClass.getRawType();
		Class c2 = newClass.getRawType();
		if (c1.isAssignableFrom(c2))
		{
			return olderClass;
		}
		else if (c2.isAssignableFrom(c1))
		{
			return newClass;
		}

		//有共同接口或者基础类
		List<String> attrs = typesAttrMap.get(varName);
		if (attrs.size() == 0)
		{
			//没有属性引用，也许是个Native调用
			return newClass;
		}

		List<Class> c1List = PropertyUtil.getAllClass(c1);

		List<Class> c2List = PropertyUtil.getAllClass(c2);

		for (Class c : c1List)
		{
			if (c2List.contains(c))
			{
				//有共同的接口，还必须支持模板里出现的所有属性
				if (hasAllField(c, attrs))
				{
					TypeClass t = new TypeClass();
					t.setRawType(c);
					return t;
				}
				else
				{
					continue;
				}
			}
		}
		throw new PreCompileException("模板里的变量类型没有共同的基类或者接口，不能编译成class");

	}

	/**判断class是否有attrs的所有属性
	 * @param c
	 * @param attrs
	 * @return
	 */
	private boolean hasAllField(Class c, List<String> attrs)
	{
		//对于Map来说，总是有各种属性
		if (Map.class.isAssignableFrom(c))
		{
			return true;
		}
		for (String attr : attrs)
		{
			if (attr.startsWith("@"))
			{
				//非属性，而是native method
				String methodName = attr.substring(1);
				if (!PropertyUtil.contain(c, methodName))
				{
					return false;
				}

			}
			else if (attr.startsWith("!"))
			{
				String publicProertyName = attr.substring(1);
				try
				{
					Field f = c.getDeclaredField(publicProertyName);
					continue;
				}
				catch (Exception e)
				{
					return false;
				}

			}
			else
			{
				if (PropertyUtil.getGetMehod(c, attr) == null)
				{
					return false;
				}
			}

		}
		return true;
	}

	private void setExpType(BeeCommonNodeTree exp, Class returnClass)
	{
		if (returnClass.isPrimitive())
		{
			if (returnClass == int.class || returnClass == float.class || returnClass == long.class
					|| returnClass == double.class)
			{
				exp.setExpType(BeeNumber.class);
			}
			else
			{
				exp.getTypeClass().setRawType(returnClass);
			}
		}
		else
		{
			if (Number.class.isAssignableFrom(returnClass))
			{
				exp.setExpType(BeeNumber.class);
			}
			else
			{
				exp.getTypeClass().setRawType(returnClass);
			}
		}
	}

	public Map<String, Class> getFunMap()
	{
		return funMap;
	}

	public void setFunMap(Map<String, Class> funMap)
	{
		this.funMap = funMap;
	}

}

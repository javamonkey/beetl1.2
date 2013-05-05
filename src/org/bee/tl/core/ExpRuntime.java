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

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bee.tl.core.exception.BeeRuntimeException;

/**
 *  表达式解释执行引擎
 * @author joelli
 * @create 2011-6-14
 */
public class ExpRuntime
{

	public ExpRuntime()
	{

	}

	public static boolean condition(BeeCommonNodeTree exp, Context ctx, RuntimeControl control)
	{

		try
		{
			int tokeType = exp.getToken().getType();
			switch (tokeType)
			{

				case BeeParser.EQUAL:
				{
					return condtionEqualCompare((BeeCommonNodeTree) exp.getChild(0),
							(BeeCommonNodeTree) exp.getChild(1), ctx, control);

				}
				case BeeParser.LARGE:
				{
					int result = condtionCompare((BeeCommonNodeTree) exp.getChild(0),
							(BeeCommonNodeTree) exp.getChild(1), ctx, control);
					return result > 0;
				}
				case BeeParser.LARGE_EQUAL:
				{
					int result = condtionCompare((BeeCommonNodeTree) exp.getChild(0),
							(BeeCommonNodeTree) exp.getChild(1), ctx, control);
					return result > 0 || result == 0;
				}
				case BeeParser.LESS:
				{
					int result = condtionCompare((BeeCommonNodeTree) exp.getChild(0),
							(BeeCommonNodeTree) exp.getChild(1), ctx, control);
					return result < 0;
				}
				case BeeParser.LESS_EQUAL:
				{
					int result = condtionCompare((BeeCommonNodeTree) exp.getChild(0),
							(BeeCommonNodeTree) exp.getChild(1), ctx, control);
					return result < 0 || result == 0;
				}
				case BeeParser.NOT_EQUAL:
				{
					return !condtionEqualCompare((BeeCommonNodeTree) exp.getChild(0),
							(BeeCommonNodeTree) exp.getChild(1), ctx, control);

				}
				case BeeParser.NOT:
				{
					return !condition((BeeCommonNodeTree) exp.getChild(0), ctx, control);
				}
				case BeeParser.OR:
				{

					return condition((BeeCommonNodeTree) exp.getChild(0), ctx, control)
							|| condition((BeeCommonNodeTree) exp.getChild(1), ctx, control);
				}
				case BeeParser.AND:
				{

					return condition((BeeCommonNodeTree) exp.getChild(0), ctx, control)
							&& condition((BeeCommonNodeTree) exp.getChild(1), ctx, control);
				}

				default:
				{

					Object o = eval(exp, ctx, control);
					if (o instanceof Boolean)
					{
						return (Boolean) o;
					}
					else
					{
						throw new BeeRuntimeException(BeeRuntimeException.BOOLEAN_EXPECTED_ERROR, exp.getToken());
					}
				}
			}
		}
		catch (BeeRuntimeException ex)
		{
			throw ex;
		}
		catch (Exception ex)
		{

			throw new BeeRuntimeException(BeeRuntimeException.BOOLEAN_EXPECTED_ERROR, exp.getToken(), ex);
		}

	}

	public static int condtionCompare(BeeCommonNodeTree a, BeeCommonNodeTree b, Context ctx, RuntimeControl control)
	{
		Object v1 = eval(a, ctx, control);
		Object v2 = eval(b, ctx, control);
		Comparable c1;
		Comparable c2;
		if (v1 instanceof Comparable)
		{
			c1 = (Comparable) v1;
		}
		else
		{
			throw new BeeRuntimeException(BeeRuntimeException.BOOLEAN_EXPECTED_ERROR, a.getToken());
		}

		if (v2 instanceof Comparable)
		{
			c2 = (Comparable) v2;
		}
		else
		{
			throw new BeeRuntimeException(BeeRuntimeException.BOOLEAN_EXPECTED_ERROR, b.getToken());
		}

		return c1.compareTo(c2);

	}

	public static boolean condtionEqualCompare(BeeCommonNodeTree a, BeeCommonNodeTree b, Context ctx,
			RuntimeControl control)
	{
		Object v1 = eval(a, ctx, control);
		Object v2 = eval(b, ctx, control);
		/*
		if(b.getType()==BeeParser.NULL){
			if(v1==null) return true;
			else return false ;
		}else{
			//big change,与编译引擎保持一致 20130328
			return v1.equals(v2);
		}
		*/
		
		if(v1==null&&v2==null){
			return true ;
		}
		if (v1 != null || v2 != null)
		{
			if (v1 != null)
			{
				return v1.equals(v2);
			}
			else
			{
				return v2.equals(v1);
			}

		}
		else if (v1 == null)
		{
			return v2 == null;
		}
		else
		{
			return v1 == null;
		}
	}

	public static Object eval(BeeCommonNodeTree exp, Context ctx, RuntimeControl control)
	{

		try
		{
			int tokeType = exp.getType();
			switch (tokeType)
			{

				case BeeParser.TEXT_VAR_REFER:
				{
					// Log.key2Start();
					BeeCommonNodeTree textNode = (BeeCommonNodeTree) exp.getChild(0);
					String varName = textNode.getToken().getText();
					Object text = ctx.getTextVar(varName);
					((BeeCommonNodeTree) exp.getParent().getParent()).setCached(text);
					return text;

				}
				case BeeParser.VAR_REFER:
				{

					Object o = evalVarRef(exp.getChildren(), ctx, exp, control);
					if (o instanceof Number)
					{
						return control.nf.y((Number)o);

					}else{
						return o;
					}

					

				}

				case BeeParser.JSONARRAY:
				{
					int count = exp.getChildCount();
					List list = new ArrayList(count);
					BeeCommonNodeTree child = null;
					Object value = null;
					for (int i = 0; i < count; i++)
					{
						child = (BeeCommonNodeTree) exp.getChild(i);
						value = eval(child, ctx, control);
						list.add(value);
					}
					return list;
				}
				case BeeParser.JSONMAP:
				{
					int count = exp.getChildCount();
					Map map = new HashMap(count);
					BeeCommonNodeTree child = null;
					BeeCommonNodeTree keyTree = null;
					BeeCommonNodeTree valueTree = null;
					Object value = null;
					for (int i = 0; i < count; i++)
					{
						child = (BeeCommonNodeTree) exp.getChild(i);
						keyTree = (BeeCommonNodeTree) child.getChild(0);
						valueTree = (BeeCommonNodeTree) child.getChild(1);
						String varName = keyTree.getText();
						if (keyTree.getType() == BeeParser.StringLiteral)
						{
							// antlr似乎没有执行StringLiteral
							varName = varName.substring(1, varName.length() - 1);
						}
						//也有可能是Identifier

						map.put(varName, eval(valueTree, ctx, control));
					}
					return map;
				}
				case BeeParser.ADD:
				{
					return nodeAdd((BeeCommonNodeTree) exp.getChild(0), (BeeCommonNodeTree) exp.getChild(1), ctx,
							control);

				}
				case BeeParser.MINUS:
				{
					return nodeMinus((BeeCommonNodeTree) exp.getChild(0), (BeeCommonNodeTree) exp.getChild(1), ctx,
							control);
				}
				case BeeParser.MULTIP:
				{
					return nodeMutiple((BeeCommonNodeTree) exp.getChild(0), (BeeCommonNodeTree) exp.getChild(1), ctx,
							control);
				}
				case BeeParser.DIV:
				{
					return nodeDiv((BeeCommonNodeTree) exp.getChild(0), (BeeCommonNodeTree) exp.getChild(1), ctx,
							control);
				}
				case BeeParser.MOD:
				{
					return nodeMod((BeeCommonNodeTree) exp.getChild(0), (BeeCommonNodeTree) exp.getChild(1), ctx,
							control);
				}
				case BeeParser.NEGATOM:
				{
					BeeNumber number = (BeeNumber) eval((BeeCommonNodeTree) exp.getChild(0), ctx, control);
					return number.negate();

				}
				case BeeParser.INT:
				{
					Object o = control.nf.y(Integer.parseInt(exp.getToken().getText()));
					return o;

				}
				case BeeParser.DOUBLE:
				{
						
					Object o = control.nf.y(exp.getToken().getText());
					return o;

				}
				case BeeParser.BOOLEAN:
				{
					return new Boolean(exp.getToken().getText());
				}
				case BeeParser.StringLiteral:
				{
					return exp.getToken().getText();

				}
				case BeeParser.FUNCTION:
				{
					return function(exp, ctx, control);
				}
				case BeeParser.CLASS_FUNCTION:
				{
					Object o = classNativeCall(exp, ctx, control);
					if (o instanceof Number)
					{
						return control.nf.y((Number)o);
						
					
					}
					else
					{
						return o;

					}

				}
				case BeeParser.NULL:
				{
					return null;
				}
				case BeeParser.SAFE_OUTPUT:
				{
					if (exp.getChildCount() != 0)
					{
						return eval((BeeCommonNodeTree) exp.getChild(0), ctx, control);
					}
					else
					{
						return null;
					}
				}
				default:
				{
					//为啥是这个？忘记了.........
					return condition(exp, ctx, control);
					// throw new BeeRuntimeException(
					// BeeRuntimeException.DO_NOT_SUPPORT, exp.getToken());
				}
			}

		}
		catch (BeeRuntimeException bre)
		{
			throw bre;
		}
		catch (Exception ex)
		{
			throw new BeeRuntimeException(BeeRuntimeException.EXPRESSION_INVALID, exp.getToken(), ex);
		}

	}

	public static Object classNativeCall(BeeCommonNodeTree node, Context ctx, RuntimeControl control)
	{

		BeeCommonNodeTree exp = (BeeCommonNodeTree) node;
		if (((BeeCommonNodeTree) exp.getChild(exp.getChildCount() - 1)).getToken().getType() == BeeParser.CLASS_METHOD)
		{
			try
			{
				// method call,first find the class or instance
				if (exp.getChildCount() == 2 && !isClassName((BeeCommonNodeTree) exp.getChild(0)))
				{

					// instance method .such as :aa.GetName();
					String identity = ((BeeCommonNodeTree) exp.getChild(0)).getToken().getText();
					Object o = ctx.getVar(identity);
					BeeCommonNodeTree classMethodNode = (BeeCommonNodeTree) exp.getChild(exp.getChildCount() - 1);
					MethodConf mc = (MethodConf) exp.getCached();
					Object[] args = new Object[classMethodNode.getChildCount() - 1];

					for (int j = 1; j < classMethodNode.getChildCount(); j++)
					{
						args[j - 1] = eval((BeeCommonNodeTree) classMethodNode.getChild(j), ctx, control);

					}

					if (mc == null)
					{

						Class target = null;

						try
						{
							target = o.getClass();

						}
						catch (SecurityException e)
						{
							throw new BeeRuntimeException(BeeRuntimeException.NATIVE_CALL_INVALID, exp.getToken(),
									"SecurityException:" + e.getMessage());
						}

						Class[] parameterType = new Class[args.length];
						for (int j = 0; j < args.length; j++)
						{
							if (args[j] == null)
							{
								parameterType[j] = null;
							}
							else
							{
								parameterType[j] = args[j].getClass();
							}

						}

						String methodName = ((BeeCommonNodeTree) classMethodNode.getChild(0)).getToken().getText();
						mc = MethodUtil.findMethod(target, methodName, parameterType);
						if (mc == null)
						{
							throw new BeeRuntimeException(BeeRuntimeException.NATIVE_CALL_INVALID, exp.getToken(),
									methodName);
						}
						CoreScriptRunner scriptRunner = (CoreScriptRunner) ctx.getVar("__core");
						if (scriptRunner.containIllegalNativeCall(target.getName()))
						{
							throw new BeeRuntimeException(BeeRuntimeException.NATIVE_CALL_INVALID, node.getToken(),
									"此本地调用不允许");
						}
						exp.setCached(mc);
					}

					o = MethodUtil.invoke(o, mc, args);

					return o;

				}
				else
				{
					// staic call

					MethodConf mc = (MethodConf) exp.getCached();
					BeeCommonNodeTree classMethodNode = (BeeCommonNodeTree) exp.getChild(exp.getChildCount() - 1);

					Object[] args = new Object[classMethodNode.getChildCount() - 1];

					for (int j = 1; j < classMethodNode.getChildCount(); j++)
					{
						args[j - 1] = eval((BeeCommonNodeTree) classMethodNode.getChild(j), ctx, control);

					}

					if (mc == null)
					{

						Class target = null;
						StringBuilder sb = new StringBuilder();

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
							throw new BeeRuntimeException(BeeRuntimeException.NATIVE_CALL_INVALID, exp.getToken(),
									"SecurityException:" + e.getMessage());
						}
						catch (ClassNotFoundException e)
						{
							throw new BeeRuntimeException(BeeRuntimeException.NATIVE_CALL_INVALID, exp.getToken(),
									"ClassNotFoundException:" + e.getMessage());
						}

						Class[] parameterType = new Class[args.length];
						for (int j = 0; j < args.length; j++)
						{
							if (args[j] == null)
							{
								parameterType[j] = null;
							}
							else
							{
								parameterType[j] = args[j].getClass();
							}

						}

						String methodName = ((BeeCommonNodeTree) classMethodNode.getChild(0)).getToken().getText();
						mc = MethodUtil.findMethod(target, methodName, parameterType);
						if (mc == null)
						{
							throw new BeeRuntimeException(BeeRuntimeException.NATIVE_CALL_INVALID, exp.getToken(),
									methodName);
						}
						CoreScriptRunner scriptRunner = (CoreScriptRunner) ctx.getVar("__core");
						if (scriptRunner.containIllegalNativeCall(target.getName()))
						{
							throw new BeeRuntimeException(BeeRuntimeException.NATIVE_CALL_INVALID, node.getToken(),
									"此本地调用不允许");
						}
						exp.setCached(mc);
					}

					Object o = MethodUtil.invoke(null, mc, args);

					return o;

				}
			}
			catch (Exception ex)
			{
				throw new BeeRuntimeException(BeeRuntimeException.NATIVE_CALL_EXCEPTION, node.getToken(), ex);
			}

		}
		else
		{
			if (exp.getChildCount() == 2 && !isClassName((BeeCommonNodeTree) exp.getChild(0)))
			{
				// public field of instance
				String identity = ((BeeCommonNodeTree) exp.getChild(0)).getToken().getText();
				Object o = ctx.getVar(identity);
				BeeCommonNodeTree classMethodNode = null;
				String propertyName = ((BeeCommonNodeTree) exp.getChild(exp.getChildCount() - 1)).getToken().getText();
				try
				{
					return o.getClass().getDeclaredField(propertyName).get(o);
				}
				catch (IllegalArgumentException e)
				{
					throw new BeeRuntimeException(BeeRuntimeException.NATIVE_CALL_INVALID, exp.getToken(),
							e.getMessage());
				}
				catch (SecurityException e)
				{
					throw new BeeRuntimeException(BeeRuntimeException.NATIVE_CALL_INVALID, exp.getToken(),
							e.getMessage());
				}
				catch (IllegalAccessException e)
				{
					throw new BeeRuntimeException(BeeRuntimeException.NATIVE_CALL_INVALID, exp.getToken(),
							e.getMessage());
				}
				catch (NoSuchFieldException e)
				{
					throw new BeeRuntimeException(BeeRuntimeException.NATIVE_CALL_INVALID, exp.getToken(),
							e.getMessage());
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
					throw new BeeRuntimeException(BeeRuntimeException.NATIVE_CALL_INVALID, exp.getToken(),
							e.getMessage());
				}
				catch (ClassNotFoundException e)
				{
					throw new BeeRuntimeException(BeeRuntimeException.NATIVE_CALL_INVALID, exp.getToken(), "类未找到:"
							+ e.getMessage());
				}

				String propertyName = null;

				BeeCommonNodeTree propertyNode = (BeeCommonNodeTree) exp.getChild(exp.getChildCount() - 1);
				propertyName = propertyNode.getToken().getText();
				try
				{
					o = target.getDeclaredField(propertyName).get(null);
				}
				catch (IllegalArgumentException e)
				{
					throw new BeeRuntimeException(BeeRuntimeException.NATIVE_CALL_INVALID, exp.getToken(),
							e.getMessage());
				}
				catch (SecurityException e)
				{
					throw new BeeRuntimeException(BeeRuntimeException.NATIVE_CALL_INVALID, exp.getToken(),
							e.getMessage());
				}
				catch (IllegalAccessException e)
				{
					throw new BeeRuntimeException(BeeRuntimeException.NATIVE_CALL_INVALID, exp.getToken(),
							e.getMessage());
				}
				catch (NoSuchFieldException e)
				{
					throw new BeeRuntimeException(BeeRuntimeException.NATIVE_CALL_INVALID, exp.getToken(),
							e.getMessage());
				}
				return o;

			}

		}

	}

	private static boolean isClassName(BeeCommonNodeTree node)
	{
		String name = node.getToken().getText();
		char c = name.charAt(0);
		if (Character.isUpperCase(c))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static Object function(BeeCommonNodeTree exp, Context ctx, RuntimeControl control)
	{

		BeeCommonNodeTree fnNameNode = ((BeeCommonNodeTree) exp.getChild(0));
		Function fn = (Function) fnNameNode.getCached();

		if (fn == null)
		{
			CoreScriptRunner scriptRunner = ((CoreScriptRunner) ctx.getVar("__core"));
			String fnName = BeetlUtil.getFunctionFullName(fnNameNode);
			fn = scriptRunner.getFunction(fnName);
			if (fn == null)
			{
				throw new BeeRuntimeException(BeeRuntimeException.FUNCTION_NOT_FOUND,
						((BeeCommonNodeTree) exp.getChild(0)).getToken());
			}
			fnNameNode.setCached(fn);
		}

		int size = exp.getChildCount();
		Object[] paras = new Object[size - 1];
		for (int i = 1; i < size; i++)
		{
			paras[i - 1] = eval((BeeCommonNodeTree) exp.getChild(i), ctx, control);
		}
		try
		{

			Object o = fn.call(paras, ctx);
			if (o instanceof Number)
			{
				return control.nf.y((Number)o);
				
			
			}
			else
			{

				return o;
			}
		}
		catch (Exception ex)
		{
			throw new BeeRuntimeException(BeeRuntimeException.NATIVE_CALL_EXCEPTION,
					((BeeCommonNodeTree) exp.getChild(0)).getToken(), ex);
		}

	}

	public static Object evalVarRef(List<BeeCommonNodeTree> list, Context ctx, BeeCommonNodeTree exp,
			RuntimeControl control)
	{

		Object defaultValue = null;
		boolean hasSafeOutput = false;
		int count = list.size();
		// 很多地方都需要异常处理，目前忽略
		BeeCommonNodeTree lastNode = (BeeCommonNodeTree) list.get(0);
		String varName = lastNode.getToken().getText();
		Object value = null;

		if (list.size() > 1)
		{
			// 安全输出，需要检查是否合法（未来放到语法分析阶段检查）
			if (list.get(list.size() - 1).getType() == BeeParser.SAFE_OUTPUT)
			{
				// if (exp.getParent().getType() ==
				// BeeParser.VAR_TEXT||exp.getParent().getType() ==
				// BeeParser.FOR)
				// {

				defaultValue = eval(list.get(list.size() - 1), ctx, control);
				count = count - 1;
				// 如果变量不存在
				if (!ctx.contain(varName))
				{
					return defaultValue;
				}
				hasSafeOutput = true;
				// }
				// else
				// {
				// //将在语法解析阶段做这事情
				// throw new
				// BeeRuntimeException(BeeRuntimeException.EXPRESSION_INVALID,
				// exp.getToken(),
				// "只能在占位符里使用,如$user.wife.name!'bachelor'$");
				//
				// }
			}
			else if (control.derective.safeOutput)
			{
				hasSafeOutput = true;
			}

		}

		try
		{
			if(hasSafeOutput){
				value =  ctx.getVarWithoutException(varName) ;
				if(value==null&&count==1) return defaultValue;
			}else{
				value =  ctx.getVar(varName);
			}
			
		}
		catch (NullPointerException ex)
		{
			throw new BeeRuntimeException(BeeRuntimeException.VAR_NOT_DEFINED, lastNode.getToken(), ex.getMessage());
		}

		for (int i = 1; i < count; i++)
		{
			if (value == null)
			{

				if (hasSafeOutput)
				{
					return defaultValue;
				}
				else
				{
					throw new BeeRuntimeException(BeeRuntimeException.NULL, lastNode.getToken());
				}

			}

			lastNode = (BeeCommonNodeTree) list.get(i);
			int type = lastNode.getType();
			switch (type)
			{
				case BeeParser.MAP_LIST_INDEX:
				{

					Object index = eval((BeeCommonNodeTree) lastNode.getChild(0), ctx, control);

					try
					{

						if (lastNode.getCached() != null)
						{
							// 并非map调用，而是对象get方法调用
							Method m = (Method) lastNode.getCached();
							if (index instanceof String)
							{
								value = m.invoke(value, new Object[]
								{ index });
							}
							else
							{
								throw new BeeRuntimeException(BeeRuntimeException.GET_CALL_ERROR, lastNode.getToken(),
										"要求输出参数必须是String类型");
							}

						}
						else
						{
							value = ctx.getValueAsMapListKey(value, index, lastNode);
						}

					}
					catch (IndexOutOfBoundsException ex)
					{
						throw new BeeRuntimeException(BeeRuntimeException.ARRAY_INDEX_ERROR, lastNode.getToken(),
								ex.getMessage());

					}
					catch (IllegalArgumentException ex)
					{
						BeeCommonNodeTree errorMapOrList = (BeeCommonNodeTree) list.get(i - 1);
						// 得到前一个符号
						BeeCommonNodeTree errorNode = (BeeCommonNodeTree) errorMapOrList.getChild(0);
						if (errorNode != null)
						{
							throw new BeeRuntimeException(BeeRuntimeException.CAST_LIST_OR_MAP_ERROR,
									errorNode.getToken(), mapOrListErrorDetail(list, i));

						}
						else
						{
							throw new BeeRuntimeException(BeeRuntimeException.CAST_LIST_OR_MAP_ERROR,
									errorMapOrList.getToken(), mapOrListErrorDetail(list, i));

						}

					}
					catch (BeeRuntimeException bee)
					{
						throw bee;
					}
					catch (Exception ex)
					{
						throw new BeeRuntimeException(BeeRuntimeException.ATTRIBUTE_INVALID, lastNode.getToken(),
								ex.getMessage());
					}
					break;
				}
				case BeeParser.VIRTUAL_ATTR_NAME:
				{
					lastNode = (BeeCommonNodeTree) lastNode.getChild(0);
					String attrName = lastNode.getToken().getText();

					VirtualAttributeEval veval = ((CoreScriptRunner) ctx.getVar("__core")).getVirtualAttributeEval(
							value.getClass(), attrName);
					if (veval != null)
					{
						try
						{
							value = veval.eval(value, attrName, ctx);

						}
						catch (Exception ex)
						{
							throw new BeeRuntimeException(BeeRuntimeException.NATIVE_CALL_EXCEPTION,
									lastNode.getToken(), ex.getMessage());
						}

					}
					else
					{
						throw new BeeRuntimeException(BeeRuntimeException.VIRTUAL_ATTRIBUTE_NOT_FOUND_EVAL,
								lastNode.getToken());
					}
					break;
				}
				default:
				{
					// Log.key1Start();
					// ATTR_Name ,or Generic get
					lastNode = (BeeCommonNodeTree) lastNode.getChild(0);
					String attrName = lastNode.getToken().getText();

					try
					{
						value = ctx.getValueAttribute(value, attrName, lastNode);

					}
					catch (Exception ex)
					{
						throw new BeeRuntimeException(BeeRuntimeException.ATTRIBUTE_INVALID, lastNode.getToken(),
								ex.getMessage());
					}
					// Log.key1End();
				}
			}

		}
		
		if (value == null&&hasSafeOutput)
		{

			return defaultValue;

		}else{
			return value;
		}
		
	}

	private static String mapOrListErrorDetail(List<BeeCommonNodeTree> list, int i)
	{
		BeeCommonNodeTree errorMapOrList = (BeeCommonNodeTree) list.get(i - 1);
		// 得到前一个符号
		BeeCommonNodeTree errorNode = (BeeCommonNodeTree) errorMapOrList.getChild(0);
		if (errorNode == null)
		{
			errorNode = errorMapOrList;
		}
		return "必须是List或者Map [" + errorNode.getText() + "]";
	}

	public static Object nodeMod(BeeCommonNodeTree a, BeeCommonNodeTree b, Context ctx, RuntimeControl control)
	{

		try
		{
			BeeNumber aValue = (BeeNumber) eval(a, ctx, control);
			BeeNumber bValue = (BeeNumber) eval(b, ctx, control);
			Long aLong = aValue.longValue();
			Long bLong = bValue.longValue();
			return  control.nf.y(aLong % bLong);

		}
		catch (ClassCastException cc)
		{
			// 应该在语法阶段检查，为了保持语法文件简单，先暂时忽略
			throw new BeeRuntimeException(BeeRuntimeException.EXPRESSION_INVALID,
					((BeeCommonNodeTree) a.getParent()).getToken());

		}

	}

	public static Object nodeDiv(BeeCommonNodeTree a, BeeCommonNodeTree b, Context ctx, RuntimeControl control)
	{
		try
		{
			BeeNumber aValue = (BeeNumber) eval(a, ctx, control);
			BeeNumber bValue = (BeeNumber) eval(b, ctx, control);
			BeeNumber number = ((BeeNumber) aValue).divide(((BeeNumber) bValue));
			return number;
		}
		catch (ClassCastException cc)
		{
			// 应该在语法阶段检查，为了保持语法文件简单，先暂时忽略
			throw new BeeRuntimeException(BeeRuntimeException.EXPRESSION_INVALID,
					((BeeCommonNodeTree) a.getParent()).getToken());

		}
	}


	public static Object nodeMutiple(BeeCommonNodeTree a, BeeCommonNodeTree b, Context ctx, RuntimeControl control)
	{
		try
		{
			BeeNumber aValue = (BeeNumber) eval(a, ctx, control);
			BeeNumber bValue = (BeeNumber) eval(b, ctx, control);
			BeeNumber number = ((BeeNumber) aValue).multiply(((BeeNumber) bValue));
			return number;
		}
		catch (ClassCastException cc)
		{
			// 应该在语法阶段检查，为了保持语法文件简单，先暂时忽略
			throw new BeeRuntimeException(BeeRuntimeException.EXPRESSION_INVALID,
					((BeeCommonNodeTree) a.getParent()).getToken());

		}
	}

	public static Object nodeMinus(BeeCommonNodeTree a, BeeCommonNodeTree b, Context ctx, RuntimeControl control)
	{
		try
		{
			BeeNumber aValue = (BeeNumber) eval(a, ctx, control);
			BeeNumber bValue = (BeeNumber) eval(b, ctx, control);
			BeeNumber number = ((BeeNumber) aValue).min(((BeeNumber) bValue));
			return number;
		}
		catch (ClassCastException cc)
		{
			// 应该在语法阶段检查，为了保持语法文件简单，先暂时忽略
			throw new BeeRuntimeException(BeeRuntimeException.EXPRESSION_INVALID,
					((BeeCommonNodeTree) a.getParent()).getToken());

		}

	}

	public static Object nodeAdd(BeeCommonNodeTree a, BeeCommonNodeTree b, Context ctx, RuntimeControl control)
	{

		Object aValue = eval(a, ctx, control);
		Object bValue = eval(b, ctx, control);

		if (aValue instanceof String || bValue instanceof String)
		{

			StringBuilder sb = new StringBuilder();
			if (aValue != null)
			{
				sb.append(aValue.toString());
			}
			if (bValue != null)
			{
				sb.append(bValue.toString());
			}
			return sb.toString();
		}
		else if (aValue instanceof Character || bValue instanceof Character)
		{
			StringBuilder sb = new StringBuilder();
			if (aValue != null)
			{
				sb.append(aValue.toString());
			}
			if (bValue != null)
			{
				sb.append(bValue.toString());
			}
			return sb.toString();

		}
		else
		{
			try
			{

				BeeNumber number = ((BeeNumber) aValue).add(((BeeNumber) bValue));

				return number;
			}
			catch (NullPointerException ex)
			{
				if (aValue == null)
				{
					throw new BeeRuntimeException(BeeRuntimeException.NULL, a.getToken());
				}
				else
				{
					throw new BeeRuntimeException(BeeRuntimeException.NULL, b.getToken());
				}

			}

		}

	}

}

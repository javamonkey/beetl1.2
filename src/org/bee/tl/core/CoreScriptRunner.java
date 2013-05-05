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

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.bee.tl.core.exception.BeeRuntimeException;
import org.bee.tl.core.exception.MVCStrictException;
import org.bee.tl.core.exception.WrapperAntlrLexerException;
import org.bee.tl.core.io.ByteWriter;
import org.bee.tl.core.io.ByteWriter_Char;
import org.bee.tl.core.number.NumberFactory;
import org.bee.tl.ext.Println;

/**
 * 解释执行引擎，核心类之一，当模版为解释执行的时候调用此类
 * @author joelli
 *
 */
public class CoreScriptRunner
{

	ScriptGlobal global = ScriptGlobal.defaultScriptGlobal;
	//脚本
	Reader reader = null;
	//脚本运行输出的字符集 ,默认是咱中国的,不再是ISO889-1,:)	,必须初始化这俩个属性
	//@todo:CoreScriptRunner 不需要知道这俩属性，应该放到别的地方去，
	String CR = System.getProperty("line.separator");
	String charset = "GBK";

	// function,textprocess, format, virturalAttribute
	Map<String, Function> fnMap = new HashMap<String, Function>(0);
	Map<String, Class<Tag>> textProcessMap = new HashMap<String, Class<Tag>>(0);
	Map<String, Format> formatMap = new HashMap<String, Format>(0);
	Map<Class, Format> defaultFormatMap = new HashMap<Class, Format>(0);
	
	List<VirtualAttributeEval> virtualAttributeList = new ArrayList<VirtualAttributeEval>(0);
	List<String> illegalNativeCallFilter = new ArrayList<String>(Arrays.asList("java.lang"));

	boolean isStrict = false;
	boolean nativeCall = false;
	boolean directByteOutput = false;
	boolean isBigNumberSupport = true ;

	//解析结果
	BeeCommonNodeTree tree = null;
	boolean isParseSuccess = false;
	boolean hasParsed = false;
	ANTLRReaderStream antlrReader = null;
	BeeLexer lexer = null;
	CommonTokenStream tokens = null;
	BeeParser parser = null;
	//脚本解析出现的异常
	RecognitionException lasetRe = null;
	//脚本里的文本常量
	Map textVar = null;

	public CoreScriptRunner()
	{
	}

	public CoreScriptRunner(String str)
	{
		this.reader = new StringReader(str);
	}

	public void setScriptInputReader(Reader reader)
	{
		this.reader = reader;
	}
	

	/**
	 * 如果模板已经转化成类，清除此模板，
	 */
	protected void clearAST(){
		antlrReader = null;
		lexer = null;
		tokens = null;
		parser = null;
		tree = null;
		
	}

	public void parse() throws IOException
	{

		if (reader == null)
		{
			throw new IOException("No Script Input");
		}
		antlrReader = new ANTLRReaderStream(reader);
		lexer = new BeeLexer(antlrReader);
		tokens = new CommonTokenStream(lexer);
		parser = new BeeParser(tokens);
		parser.setCoreScriptRunner(this);
		parser.setStrictMVC(isStrict);
		parser.setNativeCall(nativeCall);

		parser.setTreeAdaptor(new BeeNodeAdaptor());

		BeeParser.prog_return r = null;
		try
		{
			r = parser.prog();
			this.isParseSuccess = true;
		}
		catch (MVCStrictException ex)
		{
			this.isParseSuccess = false;
			this.lasetRe = ex;
			return;
		}
		catch (WrapperAntlrLexerException e)
		{
			this.lasetRe = (RecognitionException) e.getCause();
			this.isParseSuccess = false;
			return;
		}
		catch (RecognitionException e)
		{

			this.lasetRe = e;
			this.isParseSuccess = false;
			return;
		}
		finally
		{
			hasParsed = true;
		}

		tree = (BeeCommonNodeTree) r.getTree();
		this.reader.close();

	}

	/**  运行脚本，结果输出到pw里
	 * @param pw 输出流
	 * @param context 变量
	 * @throws IOException IO异常
	 * @throws BeeException 脚本运行异常
	 */
	public void runScript(ByteWriter pw, Context context) throws IOException, BeeException
	{

		// 解析

		if (this.isParseSuccess)
		{

			if (tree == null)
				return;
			try
			{
				//设置内置变量
				context.replace("__pw", pw);
				context.replace("__core", this);
				
				RuntimeControl control = new RuntimeControl();
				if(this.isBigNumberSupport){
					control.nf = NumberFactory.big;
				}else{
					control.nf = NumberFactory.general;
				}
				
				//设置全局变量
				if (global != null)
				{
					Map<String, Object> sharedVaribles = this.global.getSharedVaribles();
					for (Entry<String, Object> entry : sharedVaribles.entrySet())
					{
						context.set(entry.getKey(), entry.getValue());
					}

					this.print(tree, context, pw, control);
				}

			}
			catch (BeeRuntimeException ex)
			{
				BeeException beeException = null;
				if (ex.getCause() != null && ex.getCause() instanceof BeeException)
				{
					beeException = (BeeException) ex.getCause();
				}
				else
				{
					beeException = new BeeException(ex);

				}

				throw beeException;

			}
			catch (Exception ex)
			{
				// could not happen,just throw
				ex.printStackTrace();
				throw new RuntimeException(ex.getMessage(), ex);

			}
			pw.flush();
		}
		else
		{
			//throw last parser error as BeeException
			BeeException ex = new BeeException(this.lasetRe);
			throw ex;

		}
	}

	public void print(BeeCommonNodeTree t, Context localCtx, ByteWriter pw, RuntimeControl control) throws IOException
	{

		if (control.jump > control.FOR_RESET)
		{
			return;
		}
		if (t.getToken() == null)
		{

			for (int i = 0; i < t.getChildCount(); i++)
			{

				print((BeeCommonNodeTree) t.getChild(i), localCtx, pw, control);

				if (control.jump > control.FOR_RESET)
				{

					return;
				}

			}

		}
		else
		{
			int tokeType = t.getToken().getType();
			switch (tokeType)
			{

				case BeeParser.HOLDER:
				{
					//					Log.key2Start();
					if (t.getChildCount() == 2)
					{
						// SAFE OUTPUT
						try
						{
							parserHolder(t, localCtx, pw, control);
						}
						catch (Exception ex)
						{
							// do nothing for save output
						}

					}
					else
					{
						parserHolder(t, localCtx, pw, control);
					}
					//					Log.key2End();
					break;
				}
				case BeeParser.TEXT_HOLDER:
				{

					Object value = t.getCached();
					if (value == null)
					{
						String id = t.getChild(0).getText();
						value = localCtx.getTextVar(id);
						t.setCached(value);
					}

					if (directByteOutput)
					{

						byte[] bs = (byte[]) value;

						pw.write(bs);

					}
					else
					{
						//						Log.key3Start();
						pw.write((String) value);
						//						Log.key3End();

					}

					break;
				}
				case BeeParser.DIRECTIVE:
				{
					String text = t.getChild(0).getText();
					if (text.equals("SAFE_OUTPUT_OPEN"))
					{
						control.derective.safeOutput = true;
					}
					else if (text.equals("SAFE_OUTPUT_CLOSE"))
					{
						control.derective.safeOutput = false;
					}
					//其他暂时不支持
					break;

				}

				case BeeParser.ASSIGNMENT:
				{
					this.parseAssignment(t, localCtx, pw, control);
					break;
				}
				case BeeParser.IF:
				{
					List list = t.getChildren();
					BeeCommonNodeTree conditionNode = (BeeCommonNodeTree) list.get(0);
					boolean st1 = ExpRuntime.condition(conditionNode, localCtx, control);
					if (st1)
					{
						BeeCommonNodeTree block = (BeeCommonNodeTree) list.get(1);
						print(block, localCtx, pw, control);
					}
					else
					{
						if (list.size() == 3)
						{
							BeeCommonNodeTree block = (BeeCommonNodeTree) list.get(2);
							print(block, localCtx, pw, control);
						}
					}
					break;
				}
				case BeeParser.SLIST:
				{

					//					localCtx = new Context(localCtx);
					Context newCtx = new Context(localCtx);
					List list = t.getChildren();
					if (list == null || list.size() == 0)
						return;
					int size = list.size();
					BeeCommonNodeTree node = null;
					for (int i = 0; i < size; i++)
					{
						node = (BeeCommonNodeTree) list.get(i);
						print(node, newCtx, pw, control);
						if (control.jump == control.FOR_CONTINUE || control.jump == control.FOR_BREAK
								|| control.jump == control.RETURN)
						{
							return;
						}
					}
					break;
				}
				case BeeParser.VAR_DEFINE:
				{
					BeeCommonNodeTree assignNode = (BeeCommonNodeTree) t.getChild(0);
					print(assignNode, localCtx, pw, control);
					break;
				}
				case BeeParser.FUNCTION:
				{
					ExpRuntime.function(t, localCtx, control);
					break;
				}
				case BeeParser.CLASS_FUNCTION:
				{
					ExpRuntime.classNativeCall(t, localCtx, control);
					break;
				}
				case BeeParser.TEXT_PROCESS:
				{

					this.parseTag(t, localCtx, pw, control);
					break;
				}
				case BeeParser.WHILE:
				{
					BeeCommonNodeTree condNode = (BeeCommonNodeTree) t.getChild(0);
					BeeCommonNodeTree expNode = (BeeCommonNodeTree) t.getChild(1);
					while ((Boolean) ExpRuntime.eval(condNode, localCtx, control))
					{
						this.print(expNode, localCtx, pw, control);
						// 嵌套循环有问题？？
						if (control.jump == control.FOR_BREAK)
						{
							control.jump = control.FOR_RESET;
							return;
						}
						else if (control.jump == control.FOR_CONTINUE)
						{
							control.jump = control.FOR_RESET;
							continue;
						}
						else if (control.jump == control.RETURN)
						{
							// beetl return ;
							return;
						}
					}
					// 恢复
					control.jump = control.FOR_RESET;
					break;
				}
				case BeeParser.FOR:
				{

					this.parseFor(t, localCtx, pw, control);

					break;
				}
				case BeeParser.SWITCH:
				{

					this.parseSwitch(t, localCtx, pw, control);
					break;

				}
				case BeeParser.BREAK:
				{
					control.jump = control.FOR_BREAK;
					return;
				}
				case BeeParser.CONTINUE:
				{
					control.jump = control.FOR_CONTINUE;
					return;
				}
				case BeeParser.RETURN:
				{
					control.jump = control.RETURN;
					return;
				}
				default:
				{
					for (int i = 0; i < t.getChildCount(); i++)
					{

						print((BeeCommonNodeTree) t.getChild(i), localCtx, pw, control);

					}
				}
			}

		}

	}

	private void parseAssignment(BeeCommonNodeTree t, Context localCtx, ByteWriter pw, RuntimeControl control)
			throws IOException
	{
		List list = t.getChildren();
		BeeCommonNodeTree varNode = (BeeCommonNodeTree) list.get(0);
		ByteWriter oldWriter = null;
		String varName = varNode.getText();
		if (list.size() == 2)
		{
			BeeCommonNodeTree expNode = (BeeCommonNodeTree) list.get(1);
			Object value = null;
			if (expNode.getType() == BeeParser.SLIST)
			{
				oldWriter = pw;
				pw = oldWriter.getTempWriter();
				localCtx.replace("__pw", pw);
				this.print(expNode, localCtx, pw, control);
				value = new SuperVar(pw);
				localCtx.replace("__pw", oldWriter);

			}
			else
			{
				value = ExpRuntime.eval(expNode, localCtx, control);
			}

			BeeCommonNodeTree parentTree = (BeeCommonNodeTree) t.getParent();
			if (parentTree != null && !parentTree.isNil() && parentTree.getToken().getType() == BeeParser.VAR_DEFINE)
			{
				if (localCtx.contain(varName))
				{
					throw new BeeRuntimeException(BeeRuntimeException.VAR_ALREADY_DEFINED, varNode.getToken());
				}
				else
				{
					localCtx.defineVar(varName, value, varNode.getToken());
				}

			}
			else
			{
				try
				{
					localCtx.setVar(varName, value);
				}
				catch (Exception ex)
				{
					throw new BeeRuntimeException(BeeRuntimeException.VAR_READONLY, varNode.getToken(), ex);
				}

			}

		}
	}

	private void parseSwitch(BeeCommonNodeTree t, Context localCtx, ByteWriter pw, RuntimeControl control)
			throws IOException
	{
		BeeCommonNodeTree exp = (BeeCommonNodeTree) t.getChild(0);
		Object o = ExpRuntime.eval(exp, localCtx, control);
		boolean hasDefault = false;
		boolean isMatch = false;
		int caseCount = t.getChildCount() - 1;
		if (t.getChild(t.getChildCount() - 1).getType() == BeeParser.DEFAULT)
		{
			caseCount = caseCount - 1;
			hasDefault = true;
		}
		BeeCommonNodeTree caseTree = null;
		BeeCommonNodeTree comparedTree = null;
		Object comparedObject = null;
		BeeCommonNodeTree caseExpTree = null;
		for (int i = 0; i < caseCount; i++)
		{
			caseTree = (BeeCommonNodeTree) t.getChild(i + 1);
			comparedTree = (BeeCommonNodeTree) caseTree.getChild(0);
			Object caseObject = ExpRuntime.eval(comparedTree, localCtx, control);
			if (o.equals(caseObject))
			{
				isMatch = true;
				for (int j = 1; j < caseTree.getChildCount(); j++)
				{
					caseExpTree = (BeeCommonNodeTree) caseTree.getChild(j);
					this.print(caseExpTree, localCtx, pw, control);
					// 还需要在antlr 语法里判断是否运行continue，这些延迟到以后解决以避免复杂化语法文件
					if (control.jump == control.FOR_BREAK)
					{
						control.jump = control.FOR_RESET;
						return;
					}
					if (control.jump == control.RETURN)
					{
						// beetl return ;
						return;
					}
				}

			}

		}

		if (!isMatch && hasDefault)
		{
			BeeCommonNodeTree defaultTree = (BeeCommonNodeTree) t.getChild(t.getChildCount() - 1);
			BeeCommonNodeTree expTree = null;
			for (int i = 0; i < defaultTree.getChildCount(); i++)
			{
				expTree = (BeeCommonNodeTree) defaultTree.getChild(i);
				this.print(expTree, localCtx, pw, control);
			}

		}
	}

	private void parseFor(BeeCommonNodeTree t, Context localCtx, ByteWriter pw, RuntimeControl control)
			throws IOException
	{

		BeeCommonNodeTree idNode = (BeeCommonNodeTree) t.getChild(0);
		BeeCommonNodeTree varRef = (BeeCommonNodeTree) t.getChild(1);
		boolean hasElseFor = t.getChildCount() == 4;
		Object o = ExpRuntime.eval(varRef, localCtx, control);

		localCtx = new Context(localCtx);
		if (o == null)
		{
			if (varRef.getChild(varRef.getChildCount() - 1).getType() == BeeParser.SAFE_OUTPUT)
			{
				if (hasElseFor)
				{
					BeeCommonNodeTree elseForBlock = (BeeCommonNodeTree) t.getChild(3);
					this.print(elseForBlock, localCtx, pw, control);
				}
				return;
			}
			else
			{
				throw new BeeRuntimeException(BeeRuntimeException.NULL, varRef.getToken());
			}

		}

		String name = idNode.getToken().getText();
		localCtx.defineVar(name + "_index", 0, idNode.getToken());
		int index = 0;
		//下面代码可以简化，使用CanLoopObject
		if (o instanceof Collection)
		{
			Collection c = (Collection) o;
			if (hasElseFor && c.size() == 0)
			{
				BeeCommonNodeTree elseForBlock = (BeeCommonNodeTree) t.getChild(3);
				this.print(elseForBlock, localCtx, pw, control);

				return;
			}
			Iterator it = c.iterator();
			//@todo:如果未用此变量，这不需要设置，可性能优化，下同
			localCtx.defineVar(name + "_size", c.size());
			localCtx.defineVar(name, null);
			while (it.hasNext())
			{
				Object temp = it.next();
				localCtx.fastSetVar(name, temp);
				localCtx.fastSetVar(name + "_index", index++);

				BeeCommonNodeTree slist = (BeeCommonNodeTree) t.getChild(2);

				this.print(slist, localCtx, pw, control);

				if (control.jump == control.FOR_BREAK)
				{
					control.jump = control.FOR_RESET;
					return;
				}
				else if (control.jump == control.FOR_CONTINUE)
				{
					control.jump = control.FOR_RESET;
					continue;
				}
				else if (control.jump == control.RETURN)
				{
					// beetl return ;
					return;
				}

			}

			control.jump = control.FOR_RESET;

		}
		else if (o instanceof Map)
		{
			Map map = (Map) o;
			if (hasElseFor && map.size() == 0)
			{
				BeeCommonNodeTree elseForBlock = (BeeCommonNodeTree) t.getChild(3);
				this.print(elseForBlock, localCtx, pw, control);

				return;
			}
			Iterator<Entry> it = map.entrySet().iterator();
			Entry entry0 = null;
			Object key = null;
			Object value = null;
			MapEntry entry = null;
			localCtx.defineVar(name + "_size", map.size());
			localCtx.defineVar(name, null);
			while (it.hasNext())
			{
				entry0 = it.next();
				entry = new MapEntry(entry0.getKey(), entry0.getValue());
				localCtx.fastSetVar(name, entry);
				localCtx.fastSetVar(name + "_index", index++);

				BeeCommonNodeTree slist = (BeeCommonNodeTree) t.getChild(2);
				this.print(slist, localCtx, pw, control);
				if (control.jump == control.FOR_BREAK)
				{
					control.jump = control.FOR_RESET;
					return;
				}
				else if (control.jump == control.FOR_CONTINUE)
				{
					control.jump = control.FOR_RESET;
					continue;
				}
				else if (control.jump == control.RETURN)
				{
					// beetl return ;
					return;
				}

			}

		}
		else if (o.getClass().isArray())
		{
			Object[] array = (Object[]) o;
			if (hasElseFor && array.length == 0)
			{
				BeeCommonNodeTree elseForBlock = (BeeCommonNodeTree) t.getChild(3);
				this.print(elseForBlock, localCtx, pw, control);

				return;
			}
			localCtx.defineVar(name + "_size", array.length);
			localCtx.defineVar(name, null, idNode.getToken());
			for (Object temp : array)
			{

				localCtx.fastSetVar(name, temp);
				localCtx.fastSetVar(name + "_index", index++);
				BeeCommonNodeTree slist = (BeeCommonNodeTree) t.getChild(2);
				this.print(slist, localCtx, pw, control);
				if (control.jump == control.FOR_BREAK)
				{
					control.jump = control.FOR_RESET;
					return;
				}
				else if (control.jump == control.FOR_CONTINUE)
				{
					control.jump = control.FOR_RESET;
					continue;
				}
				else if (control.jump == control.RETURN)
				{
					// beetl return ;
					return;
				}

			}

			control.jump = control.FOR_RESET;
		}
		else if (o instanceof Iterable)
		{

			Iterable iterable = (Iterable) o;
			localCtx.defineVar(name, null);
			Iterator it = iterable.iterator();
			boolean inLoop = false;
			while (it.hasNext())
			{
				inLoop = true;
				Object temp = it.next();
				localCtx.fastSetVar(name, temp);
				localCtx.fastSetVar(name + "_index", index++);

				BeeCommonNodeTree slist = (BeeCommonNodeTree) t.getChild(2);

				this.print(slist, localCtx, pw, control);

				if (control.jump == control.FOR_BREAK)
				{
					control.jump = control.FOR_RESET;
					return;
				}
				else if (control.jump == control.FOR_CONTINUE)
				{
					control.jump = control.FOR_RESET;
					continue;
				}
				else if (control.jump == control.RETURN)
				{
					// beetl return ;
					return;
				}

			}

			if (hasElseFor && !inLoop)
			{
				BeeCommonNodeTree elseForBlock = (BeeCommonNodeTree) t.getChild(3);
				this.print(elseForBlock, localCtx, pw, control);
				return;
			}

			control.jump = control.FOR_RESET;
		}
		else
		{
			throw new BeeRuntimeException(BeeRuntimeException.DO_NOT_SUPPORT, varRef.getToken());
		}

	}

	private void parseTag(BeeCommonNodeTree t, Context localCtx, ByteWriter pw, RuntimeControl control)
			throws IOException
	{
		BeeCommonNodeTree processNode = (BeeCommonNodeTree) t.getChild(0);

		String processName = (String) processNode.getCached();
		if (processName == null)
		{

			processName = BeetlUtil.getFunctionFullName(processNode);
			processNode.setCached(processName);
		}
		Tag pf = null;

		pf = this.getTag(processName);

		if (pf == null)
		{
			throw new BeeRuntimeException(BeeRuntimeException.TAG_NOT_FOUND, processNode.getToken());
		}
		pf.setContext(localCtx);

		BeeCommonNodeTree blockNode = (BeeCommonNodeTree) t.getChild(1);
		int size = t.getChildCount();
		Object[] paras = new Object[size - 2];
		BeeCommonNodeTree paraNode = null;
		for (int i = 2; i < size; i++)
		{
			paraNode = (BeeCommonNodeTree) t.getChild(i);
			paras[i - 2] = ExpRuntime.eval(paraNode, localCtx, control);

		}

		try
		{
			pf.setParas(paras);
			boolean usingByte = false;
			if (directByteOutput && pf instanceof ByteSupportTag)
			{
				usingByte = true;
			}

			if (pf.requriedInput())
			{

				ByteWriter temp = pw.getTempWriter();
				ByteWriter oldWriter = (ByteWriter) localCtx.getVar("__pw");
				localCtx.replace("__pw", temp);
				this.print(blockNode, localCtx, temp, control);

				if (usingByte)
				{

					byte[] input = (byte[]) temp.getTempContent();
					localCtx.replace("__pw", oldWriter);
					((ByteSupportTag) pf).setByteInput(input);
				}
				else
				{

					String input = temp.toString();
					localCtx.replace("__pw", oldWriter);
					pf.setInput(input);
				}

			}

			if (usingByte)
			{
				byte[] output = null;
				output = ((ByteSupportTag) pf).getOutputAsByte();
				if (output != null)
				{
					pw.write(output);
				}

			}
			else
			{

				String output = pf.getOutput();

				if (output != null)
				{
					pw.write(output);
				}

			}

		}
		catch (BeeRuntimeException bre)
		{
			throw bre;
		}
		catch (Exception ex)
		{
			if (ex.getCause() != null && ex.getCause() instanceof BeeException)
			{
				throw new BeeRuntimeException(BeeRuntimeException.NATIVE_CALL_EXCEPTION, processNode.getToken(),
						ex.getCause());
			}
			else
			{
				throw new BeeRuntimeException(BeeRuntimeException.NATIVE_CALL_EXCEPTION, processNode.getToken(), ex);
			}

		}

	}

	private void parserHolder(BeeCommonNodeTree t, Context localCtx, ByteWriter pw, RuntimeControl control)
			throws IOException
	{

		List list = t.getChildren();
		BeeCommonNodeTree vartextNode = (BeeCommonNodeTree) list.get(0);

		Object value = ExpRuntime.eval((BeeCommonNodeTree) vartextNode.getChild(0), localCtx, control);
		String pattern = null;
		Format format  = null;
		if (vartextNode.getChildren().size() > 1)
		{

			BeeCommonNodeTree fmNode = (BeeCommonNodeTree) vartextNode.getChildren().get(1);
			if(fmNode.getType()==BeeParser.FM){
				BeeCommonNodeTree fmNameNode = (BeeCommonNodeTree) fmNode.getChild(0);
				String fmFunction = (String) fmNameNode.getCached();
				if (fmFunction == null)
				{
					fmFunction = BeetlUtil.getFunctionFullName(fmNameNode);
					fmNameNode.setCached(fmFunction);
				}
			
				if (fmNode.getChildCount() == 2)
				{
					pattern = ((BeeCommonNodeTree) fmNode.getChild(1)).getToken().getText();
					pattern = pattern.substring(1, pattern.length() - 1);
				}
				 format = getFormat(fmFunction);
				if (format == null)
				{
					throw new BeeRuntimeException(BeeRuntimeException.FORMAT_NOT_FOUND,
							((BeeCommonNodeTree) fmNode.getChild(0)).getToken());
				}
				
				try
				{
					value = format.format(value, pattern);
				}
				catch (Exception ex)
				{
					throw new BeeRuntimeException(BeeRuntimeException.NATIVE_CALL_EXCEPTION,
							((BeeCommonNodeTree) fmNode.getChild(0)).getToken(), ex);
				}
			
			}else{
					//BeeParser.DEFAULT_FM
					BeeCommonNodeTree pattenNode = (BeeCommonNodeTree) fmNode.getChild(0);
					pattern = pattenNode.getText();
					pattern = pattern.substring(1, pattern.length() - 1);
					Class type = value.getClass();
					
					 format = this.getDefaultFormat(type);
					if (format == null)
					{
						throw new BeeRuntimeException(BeeRuntimeException.DEFAULT_FORMAT_NOT_FOUND,
								((BeeCommonNodeTree)vartextNode.getChild(0)).getToken() , type.toString());
					}
					
					try
					{
						value = format.format(value, pattern);
					}
					catch (Exception ex)
					{
						throw new BeeRuntimeException(BeeRuntimeException.NATIVE_CALL_EXCEPTION,
								((BeeCommonNodeTree) fmNode.getChild(0)).getToken(), ex);
					}
					
				
				}
			}
		
		
		if (value != null)
		{
			if (directByteOutput)
			{
				if (value instanceof byte[])
				{
					pw.write((byte[]) value);
				}
				else if (value instanceof SuperVar)
				{
					pw.write(((SuperVar) value).toByte());
				}
				else
				{
					pw.write(value.toString().getBytes(charset));
				}

			}
			else
			{
				pw.write(value.toString());
			}

		}

	}

	public ScriptGlobal getGlobal()
	{
		return global;
	}

	public void setGlobal(ScriptGlobal global)
	{
		this.global = global;
	}

	public void registerFunction(String name, Function fn)
	{
		if (this.containTag(name))
		{
			throw new RuntimeException("Function和Tag方法名不能重复");
		}
		this.fnMap.put(name, fn);
	}

	public void registerTagClass(String name, Class process)
	{
		if (this.containFunction(name))
		{
			throw new RuntimeException("Tag和Function方法名不能重复");
		}

		if (BeetlUtil.checkTag(process))
		{
			this.textProcessMap.put(name, process);
		}
		else
		{
			throw new RuntimeException("Class " + process + " is not a Tag or can not create instance");
		}

	}

	public void registerFormat(String name, Format format)
	{
		this.formatMap.put(name, format);
	}
	
	public void registerDefaultFormat(Class type,Format format){
		this.defaultFormatMap.put(type,format);
	}
	
	public Format getDefaultFormat(Class type){
		
		Format f = this.global.getDefaultFormat(type);
		if(f==null){
			return this.defaultFormatMap.get(type);
		}else{
			return f;
		}
		//或者便利defaultFormatMap，看key是否是type的超类或者接口,看哪个性能好了
	
	}

	public void registerVirtualAttributeEval(VirtualAttributeEval e)
	{
		virtualAttributeList.add(e);
	}

	public Function getFunction(String name)
	{
		//
		Function fn = this.global.getFunction(name);
		if (fn != null)
		{
			return fn;
		}
		else
		{
			return this.fnMap.get(name);
		}

	}

	public Tag getTag(String name)
	{

		Tag tag = this.global.getTag(name);
		if (tag == null)
		{
			Class classTag = this.textProcessMap.get(name);
			if (classTag == null)
			{
				return null;
			}
			try
			{
				return (Tag) classTag.newInstance();
			}
			catch (InstantiationException e)
			{
				return null;
			}
			catch (IllegalAccessException e)
			{
				return null;
			}
		}
		else
		{
			return tag;
		}

	}

	public Format getFormat(String name)
	{
		Format format = this.global.getFormat(name);
		if (format != null)
		{
			return format;
		}
		else
		{
			return this.formatMap.get(name);
		}

	}

	public VirtualAttributeEval getVirtualAttributeEval(Class c, String name)
	{

		VirtualAttributeEval geval = this.global.getVirtualAttributeEval(c, name);
		if (geval != null)
		{
			return geval;
		}
		else
		{
			for (VirtualAttributeEval eval : virtualAttributeList)
			{
				if (eval.isSuppoert(c, name))
				{
					return eval;
				}
			}
			return null;
		}

	}

	public boolean containFunction(String name)
	{
		// TODO Auto-generated method stub
		if (!global.containFunction(name))
		{
			return this.fnMap.containsKey(name);
		}
		else
		{
			return true;
		}

	}

	public boolean containTag(String name)
	{
		if (!global.containTag(name))
		{
			return this.textProcessMap.containsKey(name);
		}
		else
		{
			return true;
		}
	}

	public boolean containFormat(String name)
	{
		if (!global.containFormat(name))
		{
			return this.formatMap.containsKey(name);
		}
		else
		{
			return true;
		}
	}

	public boolean containIllegalNativeCall(String name)
	{
		if (!this.global.containIllegalNativeCall(name))
		{
			if (!BeetlUtil.contain(illegalNativeCallFilter, name))
			{
				return false;
			}
		}
		return true;
	}

	public List<String> getIllegalNativeCallFilter()
	{
		return illegalNativeCallFilter;
	}

	public void setIllegalNativeCallFilter(List<String> illegalNativeCallFilter)
	{
		this.illegalNativeCallFilter = illegalNativeCallFilter;
	}

	public void enableDirectOutputByte()
	{
		this.directByteOutput = true;
	}

	public void enableNativeCall()
	{
		this.nativeCall = true;
	}

	public void enableStrict()
	{

		this.isStrict = true;
	}

	public String getCharset()
	{
		return charset;
	}

	public void setCharset(String charset)
	{
		this.charset = charset;
	}

	public String getCR()
	{
		return CR;
	}

	public void setCR(String cR)
	{
		CR = cR;
	}

	public boolean isStrict()
	{
		return isStrict;
	}

	public boolean isNativeCall()
	{
		return nativeCall;
	}

	public boolean isDirectByteOutput()
	{
		return directByteOutput;
	}
	
	public void setBigNumberSupport(boolean support){
		this.isBigNumberSupport = support;
	}
	
	public boolean isBigNumberSupport(){
		return this.isBigNumberSupport;
	}
	
	
	public static void main(String[] args) throws Exception
	{
		CoreScriptRunner scriptRunner = new CoreScriptRunner();
		scriptRunner.registerFunction("println", new Println());
		String script = "var a=1;println(a+2+age);";
		scriptRunner.setScriptInputReader(new StringReader(script));
		scriptRunner.parse();
		Context ctx = new Context();
		ctx.set("age", 19);
		StringWriter out = new StringWriter();
		ByteWriter pw = new ByteWriter_Char(out, "utf-8");
		scriptRunner.runScript(pw, ctx);
		System.out.println(out.toString());
	}

}

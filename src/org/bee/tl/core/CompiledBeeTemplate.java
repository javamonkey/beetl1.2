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

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.bee.tl.core.compile.CompiledClass;
import org.bee.tl.core.exception.BeeRuntimeException;
import org.bee.tl.core.exception.VaribaleCastException;
import org.bee.tl.core.io.ByteWriter;

/**
 * 得到编译过后的模板
 * @author joelli
 *
 */
public class CompiledBeeTemplate extends AbstractTemplate
{

	CompiledClass cls = null;
	String child = null;
	static Logger logger = Logger.getLogger(CompiledBeeTemplate.class.toString());

	public CompiledBeeTemplate(String child, GroupTemplate group) throws IOException
	{
		this.child = child;
		this.group = group;

		cls = group.classMap.getClass(child);
		if (cls == null)
		{

			this.createPreCompiledClass(false);

		}
		else
		{
			this.resource = cls.getResource();
			this.scriptRunner = cls.getScriptRunner();
			this.scriptRunner.setGlobal(group.scriptGlobal);
		}

	}

	public void getTextByByteWriter(ByteWriter pw) throws IOException, BeeException
	{

		try
		{
			this.context.set("__group", this.group);
			this.context.set("__core", this.scriptRunner);
			//如果是预编译类发生的错误，将不抛出来内部以Runtime方式处理，参考PreCompiledClass
			cls.service(pw, this.context);
		}
		catch (VaribaleCastException ex)
		{
			ex.printStackTrace();
			this.createPreCompiledClass(true);
			this.delete();
			this.runAsPreCompiledClass(pw, child);
		}

		catch (BeeException ex)
		{
			handleBeeException(ex);
		}

		catch (Error ex)
		{
			if (ex.getMessage() != null || ex.getMessage().indexOf("Unresolved compilation problem:") != -1)
			{
				// 不能正确运行，某些类已经改变,重新优化
				if (group.isDebug())
					logger.info("Class is Changed,rebuild template class");
				delete();
				this.createPreCompiledClass(false);
				runAsPreCompiledClass(pw, child);
			}
			else
			{
				throw ex;
			}

		}
	}

	private void runAsRuntimeTemplate(ByteWriter pw, String key) throws IOException, BeeException
	{
		try
		{

			BeeTemplate newTemplate = new BeeTemplate(this.resource, scriptRunner);
			newTemplate.setGroupTemplate(this.group);
			newTemplate.setContext(this.context);
			newTemplate.getTextByByteWriter(pw);
		}

		catch (BeeException ex)
		{
			handleBeeException(ex);

		}

	}

	private void runAsPreCompiledClass(ByteWriter pw, String key) throws IOException, BeeException
	{
		try
		{

			cls.service(pw, this.context);

		}

		catch (BeeException ex)
		{
			handleBeeException(ex);
		}

	}

	private void delete()
	{

		String[] strs = BeetlUtil.getPackage2Class(this.child);
		String classFile = strs[0].replace('.', File.pathSeparatorChar) + File.separator + strs[1];
		File f = new File(group.getTargetClassPath() + File.separator + classFile + ".class");
		if (!f.delete())
		{
			// bug ,can not delete ,why?
			System.out.println("can not delete file " + f.toString());
		}
	}

	private void createPreCompiledClass(boolean isWrong) throws IOException
	{
		if (isWrong)
		{
			cls = new WrongCompiledClass();
		}
		else
		{
			cls = new PreCompiledClass();
		}

		Transformator tf = new Transformator(group.placeholderStart, group.placeholderEnd, group.statementStart,
				group.statementEnd);
		Resource resource = new Resource(child, group.root, group.charset);
		Reader textReader = resource.getReader();
		Reader scriptReader = tf.transform(textReader);
		scriptRunner = new CoreScriptRunner();
		scriptRunner.setScriptInputReader(scriptReader);
		if (group.directByteOutput)
		{
			scriptRunner.enableDirectOutputByte();
		}
		if (group.isStrict)
		{
			scriptRunner.enableStrict();
		}
		if (group.nativeCall)
		{
			scriptRunner.enableNativeCall();
		}
		scriptRunner.setGlobal(group.scriptGlobal);
		if (this.scriptRunner.directByteOutput)
		{
			// 直接二进制输出
			Map<String, String> texts = tf.getTextMap();
			Map<String, byte[]> byteMap = new HashMap<String, byte[]>(texts.size());
			for (Map.Entry<String, String> entry : texts.entrySet())
			{
				byteMap.put(entry.getKey(), entry.getValue().getBytes(group.charset));
			}

			scriptRunner.textVar = byteMap;

		}
		else
		{
			scriptRunner.textVar = tf.getTextMap();
		}

		resource.setCR(tf.lineSeparator);
		scriptRunner.setCharset(group.charset);
		scriptRunner.setCR(tf.lineSeparator);
		scriptRunner.parse();
		tf.clear();
		if (isWrong)
		{
			((WrongCompiledClass) cls).init(child, group, scriptRunner, resource);

		}
		else
		{

			try
			{
				((PreCompiledClass) cls).init(child, group, scriptRunner, resource);
			}
			catch (BeeRuntimeException ex)
			{
				final BeeException parseException = new BeeException(ex);
				parseException.setResource(this.cls.getResource());
				cls = new WrongCompiledClass();
				((WrongCompiledClass) cls).init(child, group, scriptRunner, resource);
				((WrongCompiledClass) cls).setParseException(parseException);

			}

		}
		group.classMap.cacheCompiledClass(child, cls);

	}

	public void handleBeeException(BeeException ex) throws BeeException
	{
		//如果异常相关的resource没有
		if (ex.getResource() == null)
		{
			if (cls.getResource() == null)
			{
				//对于编译好的class抛此错误，需要创建一个cls;
				Resource resource = new Resource(child, new File(group.root.toString(), child), group.charset);
				resource.setCR(cls.getCR());
				cls.setResource(resource);
				ex.setResource(resource);

			}
			else
			{

				ex.setResource(cls.getResource());
			}
		}

		if (this.group.errorHandler != null)
		{
			this.group.errorHandler.processExcption(ex);
		}
		else
		{
			throw ex;
		}
	}

	public String getCR()
	{
		return cls.getCR();
	}

	public String getPlaceholderStart()
	{
		return group.getPlaceholderStart();
	}

	public void setPlaceholderStart(String placeholderStart)
	{
		throw new UnsupportedOperationException("设置不允许，因为CoreScriptRunner已经初始化完毕");

	}

	public String getPlaceholderEnd()
	{
		return group.getPlaceholderEnd();
	}

	public void setPlaceholderEnd(String placeholderEnd)
	{
		throw new UnsupportedOperationException("设置不允许，因为CoreScriptRunner已经初始化完毕");

	}

	public String getStatementStart()
	{
		// TODO Auto-generated method stub
		return group.getStatementStart();
	}

	public void setStatementStart(String statementStart)
	{
		throw new UnsupportedOperationException("设置不允许，因为CoreScriptRunner已经初始化完毕");

	}

	public String getStatementEnd()
	{
		return group.getStatementEnd();
	}

	public void setStatementEnd(String statementEnd)
	{
		throw new UnsupportedOperationException("设置不允许，因为CoreScriptRunner已经初始化完毕");

	}

}

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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

import org.bee.tl.core.io.ByteWriter;
import org.bee.tl.core.io.ByteWriter_Byte;
import org.bee.tl.core.io.ByteWriter_Char;
import org.bee.tl.core.number.NumberFactory;

public abstract class AbstractTemplate implements Template
{
	GroupTemplate group = null;

	Context context = new Context();

	//模板的输入
	Resource resource = null;
	//脚本引擎
	CoreScriptRunner scriptRunner = null;

	public CoreScriptRunner getScriptRunner()
	{
		return scriptRunner;
	}

	public void setScriptRunner(CoreScriptRunner scriptRunner)
	{
		this.scriptRunner = scriptRunner;
	}

	public Resource getResource()
	{
		return resource;
	}

	public abstract void getTextByByteWriter(ByteWriter pw) throws IOException, BeeException;

	public void getText(Writer pw) throws IOException, BeeException
	{
		ByteWriter_Char bw = new ByteWriter_Char(pw, group.getCharset());
		this.getTextByByteWriter(bw);
	}

	public void getText(OutputStream os) throws IOException, BeeException
	{

		ByteWriter_Byte bwb = new ByteWriter_Byte(os, this.group.charset);
		this.getTextByByteWriter(bwb);

	}

	public String getTextAsString() throws IOException, BeeException
	{
		if (scriptRunner.directByteOutput)
		{
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			getText(os);
			byte[] result = os.toByteArray();
			return new String(result, group.charset);
		}
		else
		{
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			getText(pw);

			return sw.toString();
		}

	}

	public void set(String name, Object o)
	{
		
	
		if(o instanceof Number){
			if(this.scriptRunner.isBigNumberSupport()){
				context.set(name, NumberFactory.big.y((Number)o));
			}else{
				context.set(name,  NumberFactory.general.y((Number)o));
			}
		}else{
			context.set(name, o);
		}
		

	}

	public void setRawValue(String name, Object o)
	{
		//o should be list
		context.setRawValue(name, o);

	}

	public void setContext(Context ctx)
	{
		this.context = ctx;
	}

	public void setGroupTemplate(GroupTemplate group)
	{
		this.group = group;

	}

	public GroupTemplate getGroupTemplate()
	{
		return this.group;
	}

	public void registerFunction(String name, Function fn)
	{

		scriptRunner.registerFunction(name, fn);
	}

	public void registerTagClass(String name, Class process)
	{
		scriptRunner.registerTagClass(name, process);

	}

	public void registerFormat(String name, Format format)
	{
		scriptRunner.registerFormat(name, format);

	}

	public void registerVirtualAttributeEval(VirtualAttributeEval e)
	{
		scriptRunner.registerVirtualAttributeEval(e);
	}

	public Function getFunction(String name)
	{
		return scriptRunner.getFunction(name);

	}

	public Tag getTag(String name)
	{

		return scriptRunner.getTag(name);

	}

	public Format getFormat(String name)
	{
		return scriptRunner.getFormat(name);

	}

	public VirtualAttributeEval getVirtualAttributeEval(Class c, String name)
	{

		return this.scriptRunner.getVirtualAttributeEval(c, name);

	}

	public Context getContext()
	{
		return this.context;
	}

	public boolean containFunction(String name)
	{
		return this.scriptRunner.containFunction(name);

	}

	public boolean containTag(String name)
	{
		return this.scriptRunner.containTag(name);
	}

	public boolean containFormat(String name)
	{
		return this.scriptRunner.containFormat(name);
	}

	public void enableDirectOutputByte()
	{

		if (scriptRunner == null || !scriptRunner.hasParsed)
		{
			this.scriptRunner.enableDirectOutputByte();
		}
		else
		{
			throw new IllegalStateException("设置不允许，因为CoreScriptRunner已经初始化完毕");
		}

	}

	public void enableNativeCall()
	{
		if (scriptRunner == null || !scriptRunner.hasParsed)
		{
			scriptRunner.enableNativeCall();
		}
		else
		{
			throw new IllegalStateException("设置不允许，因为CoreScriptRunner已经初始化完毕");
		}

	}

	public void enableStrict()
	{

		if (scriptRunner == null || !scriptRunner.hasParsed)
		{
			scriptRunner.enableStrict();
		}
		else
		{
			throw new IllegalStateException("设置不允许，因为CoreScriptRunner已经初始化完毕");
		}

	}

}

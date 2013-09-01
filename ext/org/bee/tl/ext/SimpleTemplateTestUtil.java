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
package org.bee.tl.ext;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.Map;

import org.bee.tl.core.BeeException;
import org.bee.tl.core.Context;
import org.bee.tl.core.CoreScriptRunner;
import org.bee.tl.core.DefaultErrorHandler;
import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Resource;
import org.bee.tl.core.Template;
import org.bee.tl.core.io.ByteWriter_Char;

/**
 * 用于在后台没有准备好情况下，测试模板是否在正确。
 * 
 * @author joelli
 * 
 */
public class SimpleTemplateTestUtil
{
	String input;
	String json;
	GroupTemplate gt = null;
	Writer os;
	boolean isOk = false;

	public SimpleTemplateTestUtil(String template, String json, Writer w)
	{
		this.gt = new GroupTemplate();
		gt.setErrorHandler(null);
		this.input = template;
		this.json = json;
		this.os = w;
	}

	public SimpleTemplateTestUtil(GroupTemplate gt, String template, String json, Writer w)
	{
		this.gt = gt;
		gt.setErrorHandler(null);
		this.input = template;
		this.json = json;
		this.os = w;
	}

	public GroupTemplate getGroupTemplate()
	{
		return gt;
	}

	public void run()
	{
		run(null);
	}

	public void run(Map paras)
	{
		DefaultErrorHandler h = new DefaultErrorHandler();
		Context ctx = null;
		if (json == null || json.length() == 0)
		{
			ctx = new Context();
		}
		else
		{
			CoreScriptRunner scriptRunner = new CoreScriptRunner(json);
			ctx = new Context();
			try
			{
				scriptRunner.parse();
				scriptRunner.runScript(new ByteWriter_Char(os, "UTF-8"), ctx);

			}
			catch (IOException e)
			{
				throw new RuntimeException(e.getMessage());
			}
			catch (BeeException e)
			{
				e.setResource(new Resource(json));
				h.processExcption(e, new PrintWriter(this.os));

				return;
			}
		}

		Template t = gt.getStringTemplate(input);

		Map map = ctx.getVars();
		Iterator it = map.keySet().iterator();
		Object key = null;
		while (it.hasNext())
		{
			key = it.next();
			t.set(key.toString(), map.get(key));
		}

		if (paras != null)
		{
			it = paras.keySet().iterator();
			while (it.hasNext())
			{
				key = it.next();
				t.set(key.toString(), paras.get(key));
			}
		}

		try
		{
			t.getText(os);
		}
		catch (IOException e)
		{
			throw new RuntimeException(e.getMessage());
		}
		catch (BeeException e)
		{
			h.processExcption(e, new PrintWriter(this.os));
			return;
		}

		isOk = true;

	}

	public boolean isOk()
	{
		return isOk;
	}

	public void setOk(boolean isOk)
	{
		this.isOk = isOk;
	}

	public static void main(String[] args)
	{
		String input = "this is template,${user.name},${sessions['userId']}";
		String json = "var user = {'name':'joel'},sessions={'userId':'12345'};";
		Writer w = new StringWriter();
		SimpleTemplateTestUtil util = new SimpleTemplateTestUtil(input, json, w);
		util.run();
		System.out.println(util.isOk());
		System.out.println(w);
	}

}

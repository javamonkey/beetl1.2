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
package org.bee.tl.ext.jfinal;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Enumeration;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;
import org.bee.tl.ext.spring.WebVariable;

import com.jfinal.render.Render;
import com.jfinal.render.RenderException;

public class BeetlRender extends Render
{
	GroupTemplate gt = null;
	private transient static final String encoding = getEncoding();
	private transient static final String contentType = "text/html; charset=" + encoding;

	public BeetlRender(GroupTemplate gt, String view)
	{
		this.gt = gt;
		this.view = view;
	}

	@Override
	public void render()
	{
		Writer writer = null;
		OutputStream os = null;
		try
		{
			response.setContentType(contentType);
			Template template = gt.getFileTemplate(view);
			Enumeration<String> attrs = request.getAttributeNames();

			while (attrs.hasMoreElements())
			{
				String attrName = attrs.nextElement();
				template.set(attrName, request.getAttribute(attrName));

			}
			WebVariable webVariable = new WebVariable();
			webVariable.setRequest(request);
			webVariable.setResponse(response);
			webVariable.setSession(request.getSession());

			template.set("servlet", webVariable);
			template.set("request", request);
			template.set("ctxPath", request.getContextPath());
			// Jfinal do not suggest handle session,please use
			// SessionInViewInterceptor
			// HttpSession hs = request.getSession(false);
			// if (hs != null)
			// template.setRawValue("session", new SessionWrapper(hs));
			if (gt.isDirectByteOutput())
			{
				os = response.getOutputStream();
				template.getText(os);
			}
			else
			{
				writer = response.getWriter();
				template.getText(writer);
			}

		}
		catch (Exception e)
		{
			throw new RenderException(e);
		}
		finally
		{
			try
			{
				if (writer != null)
					writer.close();
				if (os != null)
				{
					os.close();
				}
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

	}

}
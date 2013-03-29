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
package org.bee.tl.ext.struts2;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.StrutsResultSupport;
import org.apache.struts2.views.util.ResourceUtil;
import org.bee.tl.core.Config;
import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;
import org.bee.tl.ext.spring.SessionWrapper;
import org.bee.tl.ext.spring.WebVariable;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.inject.Inject;
import com.opensymphony.xwork2.util.ValueStack;
import com.opensymphony.xwork2.util.reflection.ReflectionProvider;

public class Struts2BeetlActionResult extends StrutsResultSupport
{

	public static GroupTemplate gt = null;
	ReflectionProvider reflectionProvider = null;

	@Inject
	public void setReflectionProvider(ReflectionProvider prov)
	{
		this.reflectionProvider = prov;
	}

	protected void doExecute(String locationArg, ActionInvocation invocation) throws Exception
	{

		ActionContext ctx = invocation.getInvocationContext();

		HttpServletRequest req = (HttpServletRequest) ctx.get(ServletActionContext.HTTP_REQUEST);
		HttpServletResponse rsp = (HttpServletResponse) ctx.get(ServletActionContext.HTTP_RESPONSE);

		if (!locationArg.startsWith("/"))
		{
			String base = ResourceUtil.getResourceBase(req);
			locationArg = base + "/" + locationArg;
		}

		GroupTemplate groupTemplate = getGroupTemplate(ServletActionContext.getServletContext());
		Template template = groupTemplate.getFileTemplate(locationArg);

		ValueStack stack = ctx.getValueStack();
		// 第一个元素一定是Action么?
		Object action = stack.getRoot().pop();
		Map<String, Object> values = reflectionProvider.getBeanMap(action);

		for (Map.Entry<String, Object> entry : values.entrySet())
		{
			template.set(entry.getKey(), entry.getValue());
		}

		WebVariable webVariable = new WebVariable();
		webVariable.setRequest(req);
		webVariable.setResponse(rsp);
		webVariable.setSession(req.getSession());

		template.set("servlet", webVariable);
		template.set("request", req);
		template.set("ctxPath", req.getContextPath());
		HttpSession session = req.getSession(false);
		template.setRawValue("session", new SessionWrapper(session));

		Enumeration en = req.getAttributeNames();
		while (en.hasMoreElements())
		{
			String key = (String) en.nextElement();
			template.set(key, req.getAttribute(key));
		}

		template.set("request", req);
		addCommonProperty(template, req, rsp);
		rsp.setContentType("text/html;charset=UTF-8");
		if (gt.isDirectByteOutput())
		{
			template.getText(rsp.getOutputStream());
		}
		else
		{
			template.getText(rsp.getWriter());
		}

		// Iterator iter = stack.getRoot().
		// List stackValues = new ArrayList(stack.getRoot().size());
		// while (iter.hasNext()) {
		// Object o = iter.next();
		//
		// try {
		// values =
		// System.out.println(values);
		// } catch (Exception e) {
		// throw new StrutsException(
		// "Caught an exception while getting the property values of "
		// + o, e);
		// }
		//
		// }

		// Object action = ctx.getValueStack().getRoot().
		// template.set("model", new BeetlModelWrap(ctx.getValueStack()));

	}

	public synchronized GroupTemplate getGroupTemplate(ServletContext servletContext)
	{
		if (gt == null)
		{
			try
			{
				Config config = new Config();
				String realPath = servletContext.getRealPath("/");
				config.put(Config.TEMPLATE_ROOT, realPath);
				gt = config.createGroupTemplate();
				initGroupTemplate(gt);

			}
			catch (IOException e)
			{
				throw new RuntimeException("Beetl faild:" + e.getMessage());
			}
		}

		return gt;
	}

	/**设置group的其他属性，使用者可以继承此类，重载这个方法来定制group
	 * @param group
	 */
	public void initGroupTemplate(GroupTemplate group)
	{

	}

	/** 每次渲染前调用此方法，使用者可以继承此类，重载这个方法。
	 * @param t
	 * @param req
	 * @param rsp
	 */
	public void addCommonProperty(Template t, HttpServletRequest req, HttpServletResponse rsp)
	{

	}
}

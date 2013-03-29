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
package org.bee.tl.ext.spring;

import java.io.File;
import java.util.logging.Logger;

import javax.servlet.ServletContext;

import org.bee.tl.core.GroupTemplate;
import org.springframework.web.context.ServletContextAware;

/**
 * 
 * 
 *  <pre>&lt;bean id="beetlConfig" class="org.bee.tl.ext.spring.BeetlGroupUtilConfiguration" init-method="init">
		&lt;property name="root" value="/"/>		
		&lt;property name="optimize" value="true"/>
		&lt;property name="nativeCall" value="true"/>
		&lt;property name="check" value="2"/>		
	&lt;/bean>
	
	&lt;bean id="viewResolver" class="org.bee.tl.ext.spring.BeetlSpringViewResolver">
		&lt;property name="contentType" value="text/html;charset=UTF-8"></property>
	&lt;/bean>
	</pre>
 * beetl 在spring mvc 中的配置
 * <p>
 * 用户继承此类，并实现 initOther方法,以注册自己的函数，标签等
 * @author javamonkey
 *
 */
public class BeetlGroupUtilConfiguration implements ServletContextAware
{
	protected GroupTemplate group;
	protected String root = "/";
	protected String webPath = null;
	protected String tempFolder = null;
	protected boolean optimize = true;
	protected boolean nativeCall = true;
	protected String statementStart = "<%";
	protected String statementEnd = "%>";
	protected String placeholderStart = "${";
	protected String placeholderEnd = "}";
	protected String charset = "GBK";
	protected String suffix = "";
	Logger logger = Logger.getLogger(BeetlGroupUtilConfiguration.class.toString());
	//每2秒检测一次,用于开发
	int check = 2;

	public void setServletContext(ServletContext sc)
	{

		webPath = sc.getRealPath("/");
		root = webPath + root;

	}

	public String getCharset()
	{
		return charset;
	}

	public void setCharset(String charset)
	{
		this.charset = charset;
	}

	public String getRoot()
	{
		return root;
	}

	public void setRoot(String root)
	{
		this.root = root;
	}

	public boolean isOptimize()
	{
		return optimize;
	}

	public void setOptimize(boolean optimize)
	{
		this.optimize = optimize;
	}

	public void init()
	{

		group = new GroupTemplate(new File(root));
		group.config(statementStart, statementEnd, placeholderStart, placeholderEnd);
		if (tempFolder != null)
		{
			group.setTempFolder(tempFolder);
		}
		else
		{
			File target = new File(webPath + File.separator + "WEB-INF", ".temp");
			target.mkdirs();
			tempFolder = target.toString();
			group.setTempFolder(target.toString());
		}

		if (nativeCall)
			group.enableNativeCall();
		if (optimize)
		{
			group.enableOptimize();
			logger.info("Beetl允许优化，位于:" + tempFolder);
		}
		if (check != 0)
			group.enableChecker(check);
		group.setCharset(charset);
		initOther();

	}

	public void initOther()
	{
		//如注册方法，格式化函数等
		/**
		 * group.register......
		 */
	}

	public GroupTemplate getGroupTemplate()
	{
		return this.group;
	}

	public String getTempFolder()
	{
		return tempFolder;
	}

	public void setTempFolder(String tempFolder)
	{
		this.tempFolder = tempFolder;
	}

	public String getStatementStart()
	{
		return statementStart;
	}

	public void setStatementStart(String statementStart)
	{
		this.statementStart = statementStart;
	}

	public String getStatementEnd()
	{
		return statementEnd;
	}

	public void setStatementEnd(String statementEnd)
	{
		this.statementEnd = statementEnd;
	}

	public String getPlaceholderStart()
	{
		return placeholderStart;
	}

	public void setPlaceholderStart(String placeholderStart)
	{
		this.placeholderStart = placeholderStart;
	}

	public String getPlaceholderEnd()
	{
		return placeholderEnd;
	}

	public void setPlaceholderEnd(String placeholderEnd)
	{
		this.placeholderEnd = placeholderEnd;
	}

	public boolean isNativeCall()
	{
		return nativeCall;
	}

	public void setNativeCall(boolean nativeCall)
	{
		this.nativeCall = nativeCall;
	}

	public int getCheck()
	{
		return check;
	}

	public void setCheck(int check)
	{
		this.check = check;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
}
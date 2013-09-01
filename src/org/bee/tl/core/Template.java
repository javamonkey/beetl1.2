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
import java.io.OutputStream;
import java.io.Writer;

import org.bee.tl.core.io.ByteWriter;

/**
 * 可以通过调用<code>GroupTemplate</code>得到Template,用于渲染模版
 * 
 * <pre>
 * Template t = group.getStringTemplate(&quot;today is ${date}&quot;);
 * t.set(&quot;date&quot;, new Date());
 * String result = t.getTextAsString();
 * </pre>
 * 
 * or 
 * 
 * <pre>
 * t.getText(writer);
 * </pre>
 * <p>
 * 模版可以来自文件，或者字符串，以及更为通用的Reader，模版的输出可以是字符串，也可以是Writer
 * 或者是OutputStream，详情可以参考GroupTemplate
 * </p>
 * Template 还具备如下功能
 * <ul>
 * <li>设置模版里的占位符号，以及控制语句起始符号 </li>
 * <li>注册方法，格式化函数，标签，虚拟属性</li>
 * <li>设置模版的全局变量</li>
 * <li>设置是否采用严格的MVC策略</li>
 * <li>设置是否允许class调用，以及相关的安全策略</li>
 * 
 * </ul>
 * 
 * 尽管Template 具备如上这么多功能，<b>但最好通过GroupTemplate来统一设置如上模版属性</b>，
 * 解释执行模版的BeeTemplate可以单独控制如上属性，这主要是为了兼容以前的版本
 * 在编译模式下获得的CompliledBeeTemplate模版，则不允许单独设置如上属性。
 * 
 * @author joel li
 * @create 2012-2-29
 * @see GroupTemplate
 */
public interface Template
{

	/**
	 * merge 模板和模型，将内容输出到Writer里。
	 * 
	 * @param pw
	 * @throws IOException
	 *             IO异常
	 * @throws BeeException
	 *             运行异常，如语法错等
	 */
	public void getText(Writer pw) throws IOException, BeeException;

	public void getTextByByteWriter(ByteWriter pw) throws IOException, BeeException;

	/**
	 * 设置变量，在编译方式，beetl总是假设同一个模板，同一个变量名，对应的类型是一致的。解释方式则无此假设。
	 * 
	 * @param name
	 * @param o
	 */
	public void set(String name, Object o);

	/**
	 * 设置变量，并告诉Beetl，如果变量是容器类，不需要推测期类型
	 * 
	 * @param name
	 * @param o
	 */
	public void setRawValue(String name, Object o);

	public void setContext(Context ctx);

	/**
	 * 将模板输出到os指定的输出流，beetl将转化为Writer写入，建议直接调用getText(Writer pw)
	 * 
	 * @param os
	 * @throws IOException
	 * @throws BeeException
	 */
	public void getText(OutputStream os) throws IOException, BeeException;

	/**
	 * 返回模板输出成字符串
	 * 
	 * @return
	 * @throws IOException
	 *             IO异常
	 * @throws BeeException
	 *             运行异常，如语法错等
	 */
	public String getTextAsString() throws IOException, BeeException;

	/**
	 * 使用严格的MVC模式，不允许使用复杂的变量表达式，方法调用等语法
	 */
	public void enableStrict();

	/**
	 * 允许模板里直接调用java类,直接调用java类的方法或者变量时在变量名前使用@，默认是不是用的
	 */
	public void enableNativeCall();

	/**
	 * 允许将模板里的文本以byte方式直接输出，这样会省略字符集编码，提高20%性能以及CPU消耗，此方式是用还必须配合
	 * getText(OutputStream os)是用。
	 * 
	 */
	public void enableDirectOutputByte();

	/**
	 * 注册一个方法,如果同名，beetl总是优先使用GroupTemplate的方法
	 * 
	 * @param name
	 * @param fn
	 */
	public void registerFunction(String name, Function fn);

	/**
	 * 注册一个标签,如果同名，beetl总是优先使用GroupTemplate的标签
	 * 
	 * @param name
	 * @param tagClass
	 */
	public void registerTagClass(String name, Class tagClass);

	/**
	 * 注册一个格式化函数,如果同名，beetl总是优先使用GroupTemplate的格式化函数
	 * 
	 * @param name
	 * @param format
	 */
	public void registerFormat(String name, Format format);

	/**
	 * 注册一个对象的虚拟属性,如果同名，beetl总是优先使用GroupTemplate的虚拟属性
	 * 
	 * @param e
	 */
	public void registerVirtualAttributeEval(VirtualAttributeEval e);

	public Function getFunction(String name);

	public Tag getTag(String name);

	public Format getFormat(String name);

	public boolean containFunction(String name);

	public boolean containTag(String name);

	public boolean containFormat(String name);

	public String getPlaceholderStart();

	/**
	 * 设置占位符起始符号，如${
	 * 
	 * @param placeholderStart
	 */
	public void setPlaceholderStart(String placeholderStart);

	public String getPlaceholderEnd();

	/**
	 * 设置占位符结束符号，如}
	 * 
	 * @param placeholderEnd
	 */
	public void setPlaceholderEnd(String placeholderEnd);

	public String getStatementStart();

	/**
	 * 设置控制语句起始符号，如<%
	 * 
	 * @param statementStart
	 */
	public void setStatementStart(String statementStart);

	public String getStatementEnd();

	/**
	 * 设置控制语句结束符号,如%>
	 * 
	 * @param statementEnd
	 */
	public void setStatementEnd(String statementEnd);

	public GroupTemplate getGroupTemplate();

	public void setGroupTemplate(GroupTemplate group);

	/**
	 * 模板内容的回车换行符号，如果模板只有一行，没有回车，则返回\n\r
	 * 
	 * @return
	 */
	public String getCR();

	public Context getContext();

}

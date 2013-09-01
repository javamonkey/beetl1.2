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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.Token;
import org.bee.tl.core.exception.BeeRuntimeException;
import org.bee.tl.core.number.NumberFactory;

/**
 * 解释执行保存模板运行的变量，同时，也保存了模板的常量
 * 
 * 
 * @author joelli
 * @since 0.5
 * 
 */
public class Context
{
	Map<String, Object> vars = new HashMap<String, Object>();
	Map text = new HashMap();
	// boolean orginalContextChanged = false;
	Set<String> rawList = null;
	Context parent = null;
	NumberFactory nf = null;

	public Context()
	{

	}

	/**
	 * 
	 * 构造一个新的Context，变量继承parent，对应与语法里的
	 * 
	 * <pre>
	 * {
	 * 	var name = user.name;
	 * 	// parent context
	 * 	{
	 * 		var id = name + &quot;_id&quot;;
	 * 		// new content
	 * 	}
	 * }
	 * </pre>
	 * 
	 * @param parent
	 */
	public Context(Context parent)
	{
		this();
		this.parent = parent;
		this.nf = parent.getNumberFactory();

	}

	/**设置全局变量,仅仅在java代码里调用，模板解析使用setVar
	 * @param name
	 * @param value
	 */
	public void set(String name, Object value)
	{

		if (parent != null)
		{
			throw new RuntimeException("不能设置或者改变全局变量");
		}

	
		this.vars.put(name, value);

	}

	/** 不要调用此方法，内部使用
	 * @param name
	 * @param value
	 */
	public void replace(String name, Object value)
	{
		if (this.parent != null)
		{
			this.parent.replace(name, value);
		}
		else
		{
			this.vars.put(name, value);
		}
	}

	/* 指示此容器包含对象为Object，不需要预编译进行类型推测 */
	public void setRawValue(String name, Object value)
	{
		this.set(name, value);
		if (rawList == null)
		{
			rawList = new HashSet<String>();
		}
		rawList.add(name);

	}

	public Set<String> getRawList()
	{

		return rawList;
	}

	/**
	 * 模板种定义一个临时变量并赋值
	 * 
	 * @param name
	 * @param value
	 */
	protected void defineVar(String name, Object value)
	{

		if (this.contain(name))
		{
			throw new RuntimeException("变量已经定义");
		}
		vars.put(name, value);
	}

	protected void defineVar(String name, Object value, Token token)
	{

		if (this.contain(name))
		{
			throw new BeeRuntimeException(BeeRuntimeException.VAR_ALREADY_DEFINED, token, "变量已经定义");
		}
		vars.put(name, value);
	}

	/**
	 * 模板临时变量赋值
	 * 
	 * @param name
	 * @param value
	 */
	protected void setVar(String name, Object value)
	{

		if (this.vars.containsKey(name))
		{
			vars.put(name, value);

		}
		else if (parent != null && parent.contain(name))
		{
			parent.setVar(name, value);
		}
		else
		{
			throw new RuntimeException("变量未定义");

		}

	}

	/**
	 * 不检测变量是否存在，直接赋值，用于稍微提高性能
	 * @param name
	 * @param value
	 */
	protected void fastSetVar(String name, Object value)
	{
		this.vars.put(name, value);
	}

	public Object getVar(String name)
	{

		if (this.vars.containsKey(name))
		{
			return vars.get(name);

		}
		else
		{
			if (parent != null)
			{
				return parent.getVar(name);
			}
			else
			{
				throw new NullPointerException("符号" + name + "未发现");

			}

		}

	}

	/**
	 * 为NULL等内置变量的时候调用此 2011-6-28 javamonkey
	 */
	public Object getVarWithoutException(String name)
	{
		if (this.vars.containsKey(name))
		{
			return vars.get(name);

		}
		else
		{
			if (parent != null)
			{
				return parent.getVarWithoutException(name);
			}
			else
			{
				return null;

			}

		}
	}

	/**
	 * 当前scope是否包含变量，同时也会检测parent context
	 * 
	 * @param name
	 * @return
	 */
	public boolean contain(String name)
	{
		return vars.containsKey(name) || (this.parent != null && this.parent.contain(name));

	}

	protected void putTextVar(Map map)
	{
		this.text.putAll(map);
	}

	protected Object getTextVar(String key)
	{
		if (this.text.containsKey(key))
		{
			return text.get(key);

		}
		else if (parent != null)
		{
			return parent.getTextVar(key);
		}
		else
		{
			throw new NullPointerException(key);
		}

	}

	//其他方法，要放到beetlutil类里

	protected Object getValueAsMapListKey(Object o, Object exp, BeeCommonNodeTree node)
	{
		if (o instanceof Map)
		{
			Map map = (Map) o;
			return map.get(exp);
		}
		else if (o instanceof List)
		{
			List list = (List) o;
			BeeNumber index = (BeeNumber) exp;
			int i = index.intValue();
			return list.get(i);
		}
		else if (o.getClass().isArray())
		{
			Object[] array = (Object[]) o;
			BeeNumber index = (BeeNumber) exp;
			int i = index.intValue();
			return array[i];
		}

		else
		{
			Method m = (Method) node.getCached();
			if (m == null)
			{
				// not map,it's attribute
				m = PropertyUtil.getGetMehod(o.getClass(), (String) exp);
				if (m == null)
				{
					// Generic get
					m = PropertyUtil.getGetMehod(o.getClass(), null);
				}
				// 对象有get(String key)方法
				if (m != null)
				{
					node.setCached(m);

				}

				else
				{
					// 并不支持其他集合类型
					throw new IllegalArgumentException("Must be Map or List,Array,or Generic Get for []");
				}
			}

			try
			{
				if (m.getParameterTypes().length == 1)
				{
					// Generic Get
					if (exp instanceof String)
					{
						return m.invoke(o, (String) exp);
					}
					else
					{
						throw new BeeRuntimeException(BeeRuntimeException.GET_CALL_ERROR, node.getToken(),
								"Generic Get Must be String as Parameter,such as user[\"key\"]");
					}

				}
				else
				{
					// java bean attribute
					return m.invoke(o, null);
				}

			}
			catch (Exception ex)
			{
				throw new BeeRuntimeException(BeeRuntimeException.GET_CALL_ERROR, node.getToken(), ex.getMessage());
			}

		}
	}

	protected Object getValueAttribute(Object o, String attrName, BeeCommonNodeTree node)
	{
		//
		//		if (o instanceof Map)
		//		{
		//			return ((Map) o).get(attrName);
		//		}
		Object[] minfo = (Object[]) node.getCached();
		Class c = o.getClass();
		Method m = null;
		boolean isGeneralGet = false;

		try
		{

			if (minfo == null)
			{
				m = PropertyUtil.getReadMethod(c, attrName);

				//			m = PropertyUtil.getReadMethod(o.getClass(), attrName);
				if (m == null)
				{
					throw new RuntimeException("Object '" + o + "' call attrbute " + attrName
							+ " with error:no read method " + attrName);
				}
				if (m.getParameterTypes().length == 0)
				{
					node.setCached(new Object[]
					{ m, false });

				}
				else
				{
					node.setCached(new Object[]
					{ m, true });
					isGeneralGet = true;
				}

			}
			else
			{
				m = (Method) minfo[0];
				if (((Boolean) minfo[1]).booleanValue())
				{
					isGeneralGet = true;
				}
			}

			if (!isGeneralGet)
			{
				Object r = m.invoke(o, new Object[0]);
				return r;
			}
			else
			{
				// generic get
				Object r = m.invoke(o, new Object[]
				{ attrName });
				return r;
			}

		}
		catch (IllegalArgumentException e)
		{
			throw new RuntimeException("Object '" + o + "' call attrbute " + attrName + " with illegal argument:"
					+ e.getMessage());
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			throw new RuntimeException("Object '" + o + "' call attrbute " + attrName + " with ecception:"
					+ e.getMessage());
		}

	}

	public Map<String, Object> getVars()
	{
		return vars;
	}

	/**
	 * 得到模板变量
	 * @return
	 */
	public Map<String, Object> getRootVars()
	{
		if (parent != null)
		{
			return this.parent.getRootVars();
		}
		else
		{
			return this.vars;
		}
	}
	
	protected NumberFactory getNumberFactory(){
		return nf;
	}

	public void setVars(Map<String, Object> vars)
	{
		this.vars = vars;
	}

	public Map<String, Object> getText()
	{
		return text;
	}

	public void setText(Map<String, Object> text)
	{
		this.text = text;
	}

}

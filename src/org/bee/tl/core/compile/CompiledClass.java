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
package org.bee.tl.core.compile;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.bee.tl.core.BeeException;
import org.bee.tl.core.Context;
import org.bee.tl.core.CoreScriptRunner;
import org.bee.tl.core.Format;
import org.bee.tl.core.Function;
import org.bee.tl.core.PropertyUtil;
import org.bee.tl.core.Resource;
import org.bee.tl.core.Tag;
import org.bee.tl.core.VirtualAttributeEval;
import org.bee.tl.core.exception.BeeRuntimeException;
import org.bee.tl.core.exception.PreCompileException;
import org.bee.tl.core.io.ByteWriter;
import org.bee.tl.core.number.NumberFactory;

public class CompiledClass
{
	static Logger logger = Logger.getLogger(CompiledClass.class.toString());

	protected Resource resource = null;
	protected String CR = "\n";
	protected CoreScriptRunner scriptRunner;
	protected boolean compileError = false;
	public static int version = 128;
	protected NumberFactory nf = null;

	public Resource getResource()
	{
		return resource;
	}

	public void setResource(Resource resource)
	{
		this.resource = resource;
	}

	public CoreScriptRunner getScriptRunner()
	{
		return scriptRunner;
	}

	public void setScriptRunner(CoreScriptRunner scriptRunner)
	{
		this.scriptRunner = scriptRunner;
	}

	public long getVersion()
	{
		// return 1320461026890l;
		throw new UnsupportedOperationException("必须在生成的代码中实现");
	}

	public void service(ByteWriter out, Context ctx) throws IOException, BeeException
	{

	}

	public Object callFunction(String funName, Context ctx, Object... paras) throws Exception
	{
		Function fun = scriptRunner.getFunction(funName);
		return fun.call(paras, ctx);

	}

	public Object callFunction(String funName, int line, Context ctx, Object... paras) throws Exception
	{
		Function fun = scriptRunner.getFunction(funName);
		return fun.call(paras, ctx);

	}

	/**
	 * 根据json表达式创建一个java的map，如 {"key1":value1,"key2":value2}
	 * 将转为为键值分别为key1,key2，值分别为value1,value2的Map
	 * 
	 * @param paras
	 *            类似这个，key1,value1,key2,value2
	 * @return
	 */
	public Map<String, Object> createMapFromJson(Object... paras)
	{
		Map<String, Object> map = new HashMap<String, Object>(paras.length / 2);
		String key = null;
		Object value = null;
		for (int i = 0; i < paras.length; i = i + 2)
		{
			key = (String) paras[i];
			value = paras[i + 1];
			map.put(key, value);
		}
		return map;
	}

	public List<Object> createListFromJson(Object... paras)
	{
		return Arrays.asList(paras);
	}

	public Object defaultFormat(Object input,String pattern){
		if(input==null){
			return "";
		}
		Format format = scriptRunner.getDefaultFormat(input.getClass());
		if (format == null)
		{
			throw new PreCompileException("can not find default format for class " + input.getClass());
		}
		return format.format(input, pattern);
	}
	public Object format(String funName, Object input, String pattern)
	{
		Format format = scriptRunner.getFormat(funName);
		if (format == null)
		{
			throw new PreCompileException("can not find format " + funName);
		}
		return format.format(input, pattern);
	}

	public Object evalVirtualAttribute(Object o, String attrName, Context ctx)
	{
		VirtualAttributeEval eval = scriptRunner.getVirtualAttributeEval(o.getClass(), attrName);
		Object result = eval.eval(o, attrName, ctx);
		if (result instanceof Number)
		{
			if (result instanceof BigDecimal)
			{
				return nf.y((BigDecimal) result);
			}
			else
			{
				return nf.y((Number)result);
			}
		}
		else
		{
			return result;
		}
	}

	public String stringValue(Object o)
	{
		if (o != null)
		{
			return o.toString();
		}
		else
		{
			return "";
		}
	}

	public Tag getTag(String funName)
	{
		Tag tpf = scriptRunner.getTag(funName);
		return tpf;

	}

	public Object arithmetic_add(Object a, Object b)
	{
		if (a instanceof String || b instanceof String)
		{
			return a != null ? a.toString() : "" + b != null ? b.toString() : "";
		}
		else if (a instanceof Number && b instanceof Number)
		{
			
			return nf.y((Number)a).add((Number)b);
			
		}
		else
		{
			throw new RuntimeException("type mismatch," + a.getClass() + "+" + b.getClass() + " for add");
		}
	}

	public Object arithmetic_min(Object a, Object b)
	{
		if (a instanceof Number && b instanceof Number)
		{
			return nf.y((Number)a).min((Number)b);
		}
		else
		{
			throw new RuntimeException("type mismatch," + a.getClass() + "+" + b.getClass() + " for minus");
		}
	}

	public Object arithmetic_multiply(Object a, Object b)
	{
		if (a instanceof Number && b instanceof Number)
		{
			return nf.y((Number)a).multiply((Number)b);
		}
		else
		{
			throw new RuntimeException("type mismatch," + a.getClass() + "+" + b.getClass() + " for multiply");
		}
	}

	public Object arithmetic_divide(Object a, Object b)
	{
		if (a instanceof Number && b instanceof Number)
		{
			return nf.y((Number)a).divide((Number)b);
		}
		else
		{
			throw new RuntimeException("type mismatch," + a.getClass() + "+" + b.getClass() + " for divide");
		}
	}

	public int objectCompare(Object a, Object b/*
												 * ,ErrorToken aToken,ErrorToken
												 * bToken
												 */)
	{

		if (a instanceof Number && b instanceof Number)
		{
			return nf.y((Number)a).compareTo((Number)b);
		}
		else
		{
			Comparable c1;
			Comparable c2;
			if (a instanceof Comparable)
			{
				c1 = (Comparable) a;
			}
			else
			{
				throw new RuntimeException(BeeRuntimeException.BOOLEAN_EXPECTED_ERROR);
			}

			if (b instanceof Comparable)
			{
				c2 = (Comparable) b;
			}
			else
			{
				throw new RuntimeException(BeeRuntimeException.BOOLEAN_EXPECTED_ERROR);
			}

			return c1.compareTo(c2);
		}

	}
	
	public boolean isObjectNotSame(Object v1,Object v2){
		return !this.isObjectSame(v1, v2);
	}
	
	public boolean isObjectSame(Object v1,Object v2){
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

	// public void checkFunction(Map<String,Class> map){
	// Iterator<Map.Entry<String,Class>> it = map.entrySet().iterator();
	// Map.Entry<String,Class> entry = null;
	// Function f = null;
	// while(it.hasNext()){
	// entry = it.next();
	// f = group.getFunction(entry.getKey());
	// if(f==null){
	// throw new PreCompileException("can not find function "+entry.getKey());
	// }
	// for (Method m : f.getClass().getMethods())
	// {
	// if (m.getName().equals("call"))
	// {
	// if(!m.getReturnType().equals(entry.getClass())){
	// throw new
	// PreCompileException("error return type of function "+entry.getKey()+" expecte "+entry.getKey()+",but"+m.getReturnType());
	// }
	// }
	// }
	//
	// }
	// }

	// public Object add(Object a,Object b){
	//
	// }
	//

	public boolean isCompileError()
	{
		return compileError;
	}

	public void setCompileError(boolean compileError)
	{
		this.compileError = compileError;
	}

	protected BeeException getException(Exception ex, String lineMap)
	{

		if (ex.getCause() != null && ex.getCause() instanceof BeeException)
		{
			return (BeeException) ex.getCause();
		}
		int codeLine = -1;
		for (StackTraceElement st : ex.getStackTrace())
		{
			if (st.getMethodName().equals("service") && st.getClassName().equals(this.getClass().getName()))
			{
				codeLine = st.getLineNumber();
				break;
			}
		}

		int from = lineMap.indexOf("-" + codeLine + "=");
		if (from == -1)
		{
			// 没有找到对应的行数，返回此异常,不太可能发生，除非代码没有测试
			return new BeeException(ex);
		}
		int to = lineMap.indexOf("-", from + 1);
		String tempLine = lineMap.substring(from + 1 + (codeLine + "").length() + 1, to);
		int templateLine = Integer.parseInt(tempLine);
		ErrorToken token = new ErrorToken();
		token.set("", templateLine);
		BeeRuntimeException beeRuntimeException = new BeeRuntimeException(BeeRuntimeException.ERROR, token, ex);
		return new BeeException(beeRuntimeException);

	}

	public Object evalObjectAttribute(Object o, String attrName)
	{

		Method m = PropertyUtil.getReadMethod(o.getClass(), attrName);
		if (m == null)
		{
			throw new RuntimeException("Object '" + o + "' call attrbute " + attrName + " with error:no read method "
					+ attrName);
		}

		try
		{
			if (m.getParameterTypes().length == 0)
			{
				Object r = m.invoke(o, new Object[0]);
				return r;
			}
			else
			{
				//generic get
				Object r = m.invoke(o, new Object[]
				{ attrName });
				return r;
			}

		}
		catch (IllegalArgumentException e)
		{
			// TODO Auto-generated catch block
			throw new RuntimeException("Object '" + o + "' call attrbute " + attrName + " with error:" + e.getMessage());
		}
		catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			throw new RuntimeException("Object '" + o + "' call attrbute " + attrName + " with error:" + e.getMessage());
		}
		catch (InvocationTargetException e)
		{
			// TODO Auto-generated catch block
			throw new RuntimeException("Object '" + o + "' call attrbute " + attrName + " with error:" + e.getMessage());
		}

	}

	public Object evalKey(Object o, Object key)
	{
		if (o instanceof Map)
		{
			return ((Map) o).get(key);
		}
		else if (o instanceof List)
		{
			if (key instanceof Number)
			{
				int index = ((Number) key).intValue();
				return ((List) o).get(index);
			}
		}
		else if (o.getClass().isArray())
		{
			Object[] array = ((Object[]) o);
			if (key instanceof Number)
			{
				int index = ((Number) key).intValue();
				return array[index];
			}
		}
		else
		{
			//generic get
			Method m = PropertyUtil.getGetMehod(o.getClass(), null);
			if (m != null)
			{
				try
				{
					return m.invoke(o, (String) key);
				}
				catch (Exception e)
				{
					//could not happen since runtime has called
					throw new RuntimeException("Generic Get error " + e.getMessage());
				}
			}

		}
		throw new RuntimeException("wrong type object= " + o.getClass() + "key=" + key.getClass());

	}

	public String getCR()
	{
		return CR;
	}

}

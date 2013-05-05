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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bee.tl.ext.AssertFunction;
import org.bee.tl.ext.CheckExistFunction;
import org.bee.tl.ext.DateFormat;
import org.bee.tl.ext.DateFunction;
import org.bee.tl.ext.DebugFunction;
import org.bee.tl.ext.DecodeFunction;
import org.bee.tl.ext.DeleteTag;
import org.bee.tl.ext.EmptyFunction;
import org.bee.tl.ext.IncludeFileTemplateTag;
import org.bee.tl.ext.LayoutTag;
import org.bee.tl.ext.NVLFunction;
import org.bee.tl.ext.NumberFormat;
import org.bee.tl.ext.Print;
import org.bee.tl.ext.Printf;
import org.bee.tl.ext.Println;
import org.bee.tl.ext.StringUtil;
import org.bee.tl.ext.TruncFunction;
import org.bee.tl.ext.cache.CacheTag;

public class ScriptGlobal {
	public static ScriptGlobal defaultScriptGlobal = new ScriptGlobal();

	static {
		initEmbed(defaultScriptGlobal);
	}

	Map<String, Function> fnMap = new HashMap<String, Function>();
	Map<String, Class> textProcessMap = new HashMap<String, Class>();
	Map<String, Format> formatMap = new HashMap<String, Format>();
	List<VirtualAttributeEval> virtualAttributeList = new ArrayList<VirtualAttributeEval>();
	Map<String, Object> sharedVarible = new HashMap<String, Object>();
	Map<Class, Format> defaultFormatMap = new HashMap<Class, Format>(0);
	List<String> illegaleNativeCall = new ArrayList<String>(
			Arrays.asList("java.lang"));

	public static ScriptGlobal createScriptGlobal() {
		ScriptGlobal sg = new ScriptGlobal();
		initEmbed(sg);
		return sg;

	}

	public void addSharedVarible(String name, Object value) {
		this.sharedVarible.put(name, value);
	}

	public void registerVirtualAttributeEval(VirtualAttributeEval e) {
		virtualAttributeList.add(e);

	}

	/**
	 * 注册一个自定义函数,参考{@link org.bee.tl.ext.DateFunction} 注意，不能定义一个同名标签
	 * 
	 * @param name
	 * @param fn
	 */
	public void registerFunction(String name, Function fn) {
		if (this.containTag(name)) {
			throw new RuntimeException("Function和Tag方法名不能重复:" + name);
		}
		this.fnMap.put(name, fn);
	}

	/**
	 * 注册一个function包，包名由packageName指定，方法名是对象o里的所有方法
	 * 如果方法定义为void，则方法返回null，如果方法参数最后一个Context，则传入一个Context
	 * 
	 * @param packageName
	 * @param o
	 */
	public void registerFunctionPackage(String packageName, Object o) {
		
		List<FunctionWrapper>  list = FunctionWrapper.getFunctionWrapper(o);
		Method[] ms = BeetlUtil.getSelfMethod(o);
		for (FunctionWrapper fw : list) {			
			this.registerFunction(packageName + "." + fw.getFunctionName(), fw);
		}

	}

	/**
	 * 注册一个自定义标签，参考{@link org.bee.tl.ext.IncludeFileTemplate} 注意，不能定义一个同名函数
	 * 
	 * @param name
	 * @param tag
	 */
	public void registerTag(String name, Class tag) {
		if (this.containFunction(name)) {
			throw new RuntimeException("Tag和Function方法名不能重复:" + name);
		}
		if (BeetlUtil.checkTag(tag)) {
			this.textProcessMap.put(name, tag);
		} else {
			throw new RuntimeException("Class " + tag
					+ " is not a Tag or can not create instance");
		}
	}

	/**
	 * 注册一个自定义格式化函数，参考{@link org.bee.tl.ext.DateFormat}
	 * 
	 * @param name
	 * @param format
	 */
	public void registerFormat(String name, Format format) {

		this.formatMap.put(name, format);
	}

	public void registerDefaultFormat(Class type, Format format) {
		this.defaultFormatMap.put(type, format);
	}

	public Format getDefaultFormat(Class type) {

		// 或者便利defaultFormatMap，看key是否是type的超类或者接口,看哪个性能好了
	
		return this.defaultFormatMap.get(type);
	
	}

	protected VirtualAttributeEval getVirtualAttributeEval(Class c,
			String attributeName) {
		for (VirtualAttributeEval eval : virtualAttributeList) {
			if (eval.isSuppoert(c, attributeName)) {
				return eval;
			}
		}
		return null;
	}

	protected Tag getTag(String name) {
		Class process = this.textProcessMap.get(name);
		if (process == null) {
			return null;
		} else {
			try {

				Tag tag = (Tag) process.newInstance();

				return tag;
			} catch (InstantiationException e) {
				return null;
			} catch (IllegalAccessException e) {
				return null;
			}
		}

	}

	public Function getFunction(String name) {
		Function fn = fnMap.get(name);
		return fn;
	}

	public Format getFormat(String name) {
		Format fn = formatMap.get(name);
		return fn;
	}

	public boolean containFunction(String name) {
		return fnMap.containsKey(name);
	}

	public boolean containTag(String name) {
		return textProcessMap.containsKey(name);
	}

	public boolean containFormat(String name) {
		return formatMap.containsKey(name);
	}

	public boolean containIllegalNativeCall(String name) {
		return BeetlUtil.contain(illegaleNativeCall, name);

	}

	public Map<String, Object> getSharedVaribles() {
		return this.sharedVarible;
	}

	public Object getSharedVarible(String name) {
		return this.sharedVarible.get(name);
	}

	public void addNativeCall(String packageName) {
		this.illegaleNativeCall.add(packageName);
	}

	public List<String> getIllegaleNativeCall() {
		return illegaleNativeCall;
	}

	public static void initEmbed(ScriptGlobal sg) {
		sg.registerFunction("date", new DateFunction());
		sg.registerFunction("nvl", new NVLFunction());
		sg.registerFunction("debug", new DebugFunction());
		sg.registerFunction("exist", new CheckExistFunction());
		sg.registerFunction("printf", new Printf());
		sg.registerFunction("decode", new DecodeFunction());
		sg.registerFunction("assert", new AssertFunction());
		sg.registerFunction("print", new Print());
		sg.registerFunction("println", new Println());
		sg.registerFunction("prinf", new Printf());
		sg.registerFunction("trunc", new TruncFunction());
		sg.registerFunction("empty", new EmptyFunction());

		sg.registerFunctionPackage("strutil", new StringUtil());

		// format
		Format dateForamt = new DateFormat();
		Format numberFormat = new NumberFormat();
		
		sg.registerFormat("dateFormat",dateForamt);
		sg.registerFormat("numberFormat",numberFormat);
		
		sg.registerDefaultFormat(java.util.Date.class, dateForamt);
		sg.registerDefaultFormat(java.sql.Date.class, dateForamt);
		sg.registerDefaultFormat(java.sql.Time.class, dateForamt);
		sg.registerDefaultFormat(java.sql.Timestamp.class, dateForamt);
		
		sg.registerDefaultFormat(java.lang.Short.class, numberFormat);
		sg.registerDefaultFormat(java.lang.Long.class, numberFormat);
		sg.registerDefaultFormat(java.lang.Integer.class, numberFormat);
		sg.registerDefaultFormat(java.lang.Float.class, numberFormat);
		sg.registerDefaultFormat(java.lang.Double.class, numberFormat);
		sg.registerDefaultFormat(java.math.BigInteger.class, numberFormat);
		sg.registerDefaultFormat(java.math.BigDecimal.class, numberFormat);
		sg.registerDefaultFormat(java.util.concurrent.atomic.AtomicLong.class, numberFormat);
		sg.registerDefaultFormat(java.util.concurrent.atomic.AtomicInteger.class, numberFormat);
		sg.registerDefaultFormat(org.bee.tl.core.number.BigDecimalNumber.class, numberFormat);
		sg.registerDefaultFormat(org.bee.tl.core.number.GeneralNumber.class, numberFormat);

		// tag
		sg.registerTag("deleteTag", DeleteTag.class);
		sg.registerTag("includeFileTemplate", IncludeFileTemplateTag.class);
		sg.registerTag("include", IncludeFileTemplateTag.class);
		// sg.registerTag("includeJsp", IncludeJSPTag.class);
		sg.registerTag("layout", LayoutTag.class);
		sg.registerTag("cache", CacheTag.class);

		// virtual attribute
		sg.registerVirtualAttributeEval(new VirtualAttributeEval() {
			public Integer eval(Object o, String attributeName, Context ctx) {
				if (attributeName.equals("size")) {
					if (o instanceof Collection) {
						return ((Collection) o).size();
					} else if (o instanceof Map) {
						return ((Map) o).size();
					} else if (o.getClass().isArray()) {
						return ((Object[]) o).length;

					} else {
						throw new IllegalArgumentException();
					}

				} else {
					throw new IllegalArgumentException();
				}

			}

			public boolean isSuppoert(Class c, String attributeName) {
				if ((Map.class.isAssignableFrom(c)
						|| Collection.class.isAssignableFrom(c) || c.isArray())
						&& attributeName.equals("size")) {
					return true;
				} else {
					return false;
				}
			}
		});

	}

}

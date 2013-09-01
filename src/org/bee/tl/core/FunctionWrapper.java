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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 用于FunctionPackage，包装一个类的某一个方法成为Function，如果这个方法最后一个参数是
 * Context，则传入，如果没有，则不传入Context
 * 
 * @author jeolli
 * 
 */
public class FunctionWrapper implements Function {
	Object target;
	Method method;
	Class[] parametersType = null;
	List<MethodContext> listMethod = null;
	boolean isReturnVoid = false;
	Class[] parameters;
	boolean requiredContext = false;
	String functionName = null;
	boolean isSingleMethod = true;

	public FunctionWrapper(Object o, Method m) {
		this.target = o;
		this.method = m;
		parametersType = method.getParameterTypes();
		if (m.getReturnType() == null)
			isReturnVoid = true;
		parameters = m.getParameterTypes();
		if (parameters.length != 0) {
			if (parameters[parameters.length - 1].equals(Context.class)) {
				requiredContext = true;
			}
		}
		method.setAccessible(true);
		this.functionName = m.getName();
		isSingleMethod = true;
	}

	public FunctionWrapper(Object o, List<MethodContext> ms) {
		functionName = ms.get(0).m.getName();
		this.listMethod = ms;
		isSingleMethod = false;
		this.target = o;

	}

	public String getFunctionName() {
		return this.functionName;
	}

	/*
	 * 如果目标方法有ctx参数，则传入，如果没有，则不传入 (non-Javadoc)
	 * 
	 * @see org.bee.tl.core.Function#call(java.lang.Object[],
	 * org.bee.tl.core.Context)
	 */
	public Object call(Object[] paras, Context ctx) {

		if (this.isSingleMethod) {
			return singleMethodCall(paras, ctx);
		} else {
			return mutilpleMethodCall(paras, ctx);
		}

	}

	private Object mutilpleMethodCall(Object[] paras, Context ctx) {
		List<Object[]> matchMethodList = new ArrayList<Object[]>();
		for (MethodContext mc : this.listMethod) {
			Method m = mc.m;
			boolean cr = mc.contextRequired;

			Class[] args = new Class[paras.length];
			int i = 0;
			for (Object o : paras) {
				if (o != null) {
					args[i++] = o.getClass();
				} else {
					args[i++] = null;
				}
			}
		
			//模糊匹配
			MethodConf methodConf = MethodUtil.match(
					m,
					args,
					cr ? m.getParameterTypes().length - 1 : m
							.getParameterTypes().length);
			if (methodConf != null) {
				if (methodConf.isExactMatch) {
					matchMethodList.add(0, new Object[] { methodConf, mc });
					break;
				} else {
					// 排序，参数最长的在最前篇
					matchMethodList.add(new Object[] { methodConf, mc });
				}
			}

		}
		
		if (matchMethodList.size() != 0) {
			// 得到最匹配的
			MethodConf methodConf = (MethodConf) matchMethodList.get(0)[0];
			MethodContext mc = (MethodContext) matchMethodList.get(0)[1];
			if(!methodConf.isExactMatch){
				if(matchMethodList.size()>=2){
					throw new RuntimeException("最匹配的方法有"+matchMethodList.size()+"个，不知道调用哪个?"+this.functionName);
				}
			}
			try {
				
				Class[]  types = methodConf.method.getParameterTypes();
				int i = 0;
				Object[] args = new Object[types.length];
				for (; i < paras.length; i++) {
					args[i] = paras[i];
				}
				for (; i < types.length; i++) {
					args[i] = MethodUtil.getDefaultValueByType(types[i]);
				}

				if (mc.contextRequired) {
					args[args.length - 1] = ctx;
				}
				
				return MethodUtil.invoke(target, methodConf, args);
				
			
			} catch (IllegalArgumentException e) {
				throw new RuntimeException("参数错误" + e.getMessage());
			} catch (IllegalAccessException e) {
				throw new RuntimeException("非法调用" + e.getMessage());
			} catch (InvocationTargetException e) {
				Throwable t = e.getTargetException();
				throw new RuntimeException(t);
			}

		} else {
			// still not find
			throw new RuntimeException("找不到对应的调用方法：" + target.getClass()
					+ " name=" + this.functionName);
		}

	}

	private Object singleMethodCall(Object[] paras, Context ctx) {
		Object[] args = null;
		if (requiredContext) {
			if (paras.length > parametersType.length + 1) {
				throw new RuntimeException("期望参数个数与实际参数不匹配:"
						+ method.toString());
			}
			args = new Object[parametersType.length + 1];

		} else {
			if (paras.length > parametersType.length) {
				throw new RuntimeException("期望参数个数与实际参数不匹配:"
						+ method.toString());
			}
			args = new Object[parametersType.length];

		}

		int i = 0;
		for (; i < paras.length; i++) {
			args[i] = paras[i];
		}
		for (; i < parametersType.length; i++) {
			args[i] = MethodUtil.getDefaultValueByType(parametersType[i]);
		}

		if (requiredContext) {
			args[args.length - 1] = ctx;
		}

		try {
			Object result = method.invoke(target, args);

			return result;
		} catch (IllegalArgumentException e) {
			throw new RuntimeException("参数错误" + e.getMessage());
		} catch (IllegalAccessException e) {
			throw new RuntimeException("非法调用" + e.getMessage());
		} catch (InvocationTargetException e) {
			Throwable t = e.getTargetException();
			throw new RuntimeException(t);
		}
	}

	public static List<FunctionWrapper> getFunctionWrapper(Object o) {
		Method[] ms = BeetlUtil.getSelfMethod(o);
		// 同名方法
		Map<String, List<MethodContext>> map = new HashMap<String, List<MethodContext>>();

		for (Method method : ms) {
			String name = method.getName();
			List<MethodContext> list = map.get(name);
			if (list == null) {
				list = new ArrayList<MethodContext>();
				map.put(name, list);
			}
			MethodContext mc = new MethodContext();
			mc.m = method;
			int len = method.getParameterTypes().length;
			if (len != 0) {
				if (method.getParameterTypes()[len - 1].equals(Context.class)) {
					mc.contextRequired = true;
				}
			}
			list.add(mc);

		}

		List<FunctionWrapper> fwList = new ArrayList<FunctionWrapper>();
		for (Entry<String, List<MethodContext>> entry : map.entrySet()) {

			if (entry.getValue().size() == 1) {
				FunctionWrapper fw = new FunctionWrapper(o, entry.getValue()
						.get(0).m);
				fwList.add(fw);
			} else {
				FunctionWrapper fw = new FunctionWrapper(o, entry.getValue());
				fwList.add(fw);
			}

		}
		return fwList;

	}

	static class MethodContext {
		Method m = null;
		boolean contextRequired = false;
	}

}

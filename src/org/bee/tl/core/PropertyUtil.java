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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bee.testcase.objref.ComplicatedModelTestCase.CommonOrder;

/**
 * 得到javabean的 get方法
 * 
 * @author joelli
 * @since 1.1
 * 
 */
public class PropertyUtil
{
	public static Map<String, Method> readMethodMap = Collections.synchronizedMap(new HashMap<String, Method>());
	public static Map<String, Method> getMethodMap = Collections.synchronizedMap(new HashMap<String, Method>());
	static Method mapGetmetod = null;
	static
	{
		try
		{
			mapGetmetod = Map.class.getMethod("get", new Class[]
			{ Object.class });
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	/**
	 * 得到类的指定读属性
	 * 
	 * @param c
	 * @param readMethod
	 * @return
	 */
	// public static Method getReadMethod(Class c, String readMethod) {
	// StringBuilder sb = new StringBuilder(64);
	// sb.append(c.getName()).append("_").append(readMethod);
	// String key = sb.toString();
	// if(readMethodMap.containsKey(key)){
	// return readMethodMap.get(key);
	// }
	// BeanInfo beanInfo = null;
	// try {
	// beanInfo = Introspector.getBeanInfo(c);
	// } catch (IntrospectionException e) {
	// return null;
	// }
	// PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
	// if (descriptors == null) {
	// return null;
	// }
	// Method method = null;
	// for(PropertyDescriptor pd:descriptors){
	// method = pd.getReadMethod();
	// System.out.println(method);
	//			
	// if(pd.getName().equals(readMethod)){
	// if(method.getParameterTypes().length==0){
	// readMethodMap.put(key, method);
	// return method ;
	// }
	// }
	// }
	//		
	// return null;
	//
	// }
	/**
	 * 得到对象的get方法，或者getXXXX方法
	 */
	public static Method getGetMehod(Class c, String attribute)
	{

		StringBuilder sb = new StringBuilder(64);
		sb.append(c.getName()).append("_").append(attribute);
		String key = sb.toString();
		if (getMethodMap.containsKey(key))
		{
			return getMethodMap.get(key);
		}
		MethodConf mc = null;
		Method method = null;
		if (attribute == null)
		{
			mc = MethodUtil.findMethod(c, "get", new Class[]
			{ String.class });
			if (mc != null)
			{
				method = mc.method;
				method.setAccessible(true);
				return method;
			}
			else
			{
				return null;
			}

		}
		else
		{

			StringBuilder mbuffer = new StringBuilder("get");
			mbuffer.append(attribute.substring(0, 1).toUpperCase()).append(attribute.substring(1));
			mc = MethodUtil.findMethod(c, mbuffer.toString(), new Class[]
			{});
			if (mc != null)
			{
				method = mc.method;
				method.setAccessible(true);
				return method;
			}
			else
			{
				return null;
			}

		}

	}

	public static Method getReadMethod(Class c, String readMethod)
	{

		StringBuilder sb = new StringBuilder(64);
		sb.append(c.getName()).append("_").append(readMethod);
		String key = sb.toString();
		if (readMethodMap.containsKey(key))
		{
			return readMethodMap.get(key);
		}
		if (Map.class.isAssignableFrom(c))
		{
			return mapGetmetod;
		}
		StringBuilder mbuffer = new StringBuilder();
		mbuffer.append(readMethod.substring(0, 1).toUpperCase()).append(readMethod.substring(1));
		Method method = null;
		MethodConf mc = null;

		mc = MethodUtil.findMethod(c, "get" + mbuffer.toString(), new Class[]
		{});
		if (mc == null)
		{
			mc = MethodUtil.findMethod(c, "is" + mbuffer.toString(), new Class[]
			{});
			if (mc == null)
			{
				mc = MethodUtil.findMethod(c, "get", new Class[]
				{ String.class });
			}
		}

		if (mc != null)
		{
			method = mc.method;
			method.setAccessible(true);
			readMethodMap.put(key, method);
			return method;
		}
		else
		{
			return null;
		}

	}

	//	/**
	//	 * 得优化
	//	 * 
	//	 * @param m1
	//	 * @param m2
	//	 * @return
	//	 */
	//	public static Method getCommonMethod(Method m1, Method m2)
	//	{
	//		Class c1 = m1.getDeclaringClass();
	//		Class c2 = m2.getDeclaringClass();
	//		Class commonInterface = null;
	//		List<Class> c1List = new ArrayList<Class>();
	//		List<Class> c2List = new ArrayList<Class>();
	//		getAllClass(c1, c1List);
	//		getAllClass(c2, c2List);
	//		for (Class c : c1List)
	//		{
	//			if (c2List.contains(c))
	//			{
	//				try
	//				{
	//					Method m = c.getMethod(m1.getName(), m1.getParameterTypes());
	//					m.setAccessible(true);
	//					return m;
	//				}
	//				catch (Exception e)
	//				{
	//					continue;
	//				}
	//
	//			}
	//		}
	//		return null;
	//
	//	}
	//

	/** 得到指定类的所有接口和父类，越在顶层，排得越靠前
	 * @param c1  
	 * @param interfaceList
	 * @param classList
	 */
	public static void getAllClass(Class c1, List interfaceList, List classList)
	{
		if (c1 == null || c1.equals(Object.class) || c1.equals(java.io.Serializable.class))
			return;
		if (c1.isInterface())
		{
			interfaceList.add(0, c1);
		}
		else
		{
			classList.add(0, c1);
		}
		Class parent = c1.getSuperclass();

		getAllClass(parent, interfaceList, classList);
		Class[] allInterface = c1.getInterfaces();
		if (allInterface == null || allInterface.length == 0)
		{
			return;
		}
		for (Class inf : allInterface)
		{
			getAllClass(inf, interfaceList, classList);
		}

	}

	public static List getAllClass(Class c1)
	{
		List interfaceList = new ArrayList();
		List classList = new ArrayList();
		getAllClass(c1, interfaceList, classList);
		interfaceList.addAll(classList);
		return interfaceList;

	}

	/**判断类里是否有指定的方法，这主要用于类型推测，先不考虑参数情况
	 * @param c
	 * @param methodName
	 * @return
	 */
	public static boolean contain(Class c, String methodName)
	{
		if (c == null || c.equals(Object.class))
			return false;
		Method[] ms = c.getMethods();
		for (Method m : ms)
		{

			if (m.getName().equals(methodName))
			{
				return true;
			}
		}
		//		return contain(c.getSuperclass(), methodName);
		return false;

	}

	public static void main(String[] args) throws Exception
	{
		List interfaceList = new ArrayList();
		List classList = new ArrayList();
		getAllClass(CommonOrder.class, interfaceList, classList);
		interfaceList.addAll(classList);
		System.out.println(interfaceList);

	}

}

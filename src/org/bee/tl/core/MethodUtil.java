package org.bee.tl.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class MethodUtil
{

	static Map<Class, Method[]> cacheMap = new HashMap<Class, Method[]>();

	public static void main(String[] args) throws Exception
	{
		MethodUtil util = new MethodUtil();
		MethodConf config = null;
		config = util.findMethod(VipOrder.class, "getOrderId", new Class[]
		{});
		Method m = config.method;

		System.out.println(m.invoke(new VipOrder(), new Object[]
		{}));

		System.out.println(m.invoke(new Order(), new Object[]
		{}));

	}

	public void test(String a, Integer i, float j)
	{

	}

	public static interface IOrder
	{
		String getOrderId();
	}

	public static class Order implements IOrder
	{
		protected String orderId = "123";

		public String getOrderId()
		{
			return orderId;
		}

		public void setOrderId(String orderId)
		{
			this.orderId = orderId;
		}

	}

	public static class VipOrder implements IOrder
	{
		public String getOrderId()
		{
			return "456";
		}
	}

	public static class CommonOrder extends Order
	{
		public String getOrderId()
		{
			return "890";
		}
	}

	public static Object invoke(Object o, MethodConf conf, Object[] paras) throws IllegalAccessException,
			IllegalArgumentException, InvocationTargetException
	{

		Object[] targets = null;
		if (conf.isNeedConvert)
		{
			targets = new Object[paras.length];
			for (int i = 0; i < paras.length; i++)
			{
				if (conf.convert[i] != 0)
				{
					targets[i] = conf.convert(paras[i], i);
				}
				else
				{
					targets[i] = paras[i];
				}
			}

			return conf.method.invoke(o, targets);

		}
		else
		{
			targets = paras;
		}
		return conf.method.invoke(o, targets);
	}

	/**
	 * 找到某个类的某个方法，方法名是methodName,参数是parameterType。该方法尽可能找到接口方法，同时，该方法
	 * 试图考虑到带有原始类型或者wrap类型的参数
	 * 
	 * @param target
	 * @param methodName
	 * @param parameterType
	 * @return
	 */
	public static MethodConf findMethod(Class target, String methodName, Class[] parameterType)
	{
		int[] convert = new int[parameterType.length];

		Method[] ms = cacheMap.get(target);
		if (ms == null)
		{
			ms = target.getMethods();

		}

		Method temp = null;
		for (int i = 0; i < ms.length; i++)
		{
			temp = ms[i];
			if (temp.getName().equals(methodName))
			{
				Class[] paras = temp.getParameterTypes();
				boolean isMatch = true;

				if (paras.length == parameterType.length)
				{
					for (int j = 0; j < paras.length; j++)
					{

						if (parameterType[j] == null)
						{
							// 认为匹配
							continue;
						}

						if (paras[j] == Object.class)
						{

							if (BeeNumber.class.isAssignableFrom(parameterType[j]))
							{
								convert[j] = 11;
							}
							else
							{
								convert[j] = 0;

							}
							continue;
						}
						else if (paras[j].isAssignableFrom(parameterType[j]))
						{
							convert[j] = 0;
							continue;
						}

						else if (paras[j].isPrimitive() &&  BeeNumber.class.isAssignableFrom(parameterType[j]))
						{

							if (paras[j] == int.class)
							{
								convert[j] = 1;
							}
							else if (paras[j] == long.class)
							{
								convert[j] = 2;
							}
							else if (paras[j] == double.class)
							{
								convert[j] = 3;
							}
							else if (paras[j] == float.class)
							{
								convert[j] = 4;
							}
							else if (paras[j] == short.class)
							{
								convert[j] = 5;
							}
						}
						else if (Number.class.isAssignableFrom(paras[j]) && BeeNumber.class.isAssignableFrom(parameterType[j]))
						{
							if (paras[j] == Integer.class)
							{
								convert[j] = 1;
							}
							else if (paras[j] == Long.class)
							{
								convert[j] = 2;
							}
							else if (paras[j] == Double.class)
							{
								convert[j] = 3;
							}
							else if (paras[j] == Float.class)
							{
								convert[j] = 4;
							}
							else if (paras[j] == Short.class)
							{
								convert[j] = 5;
							}
						}
						else
						{
							isMatch = false;
						}
					}

					if (isMatch)
					{
						MethodConf mc = null;
						Class[] interfaces = target.getInterfaces();
						for (Class inf : interfaces)
						{
							if (inf.equals(java.io.Serializable.class))
							{
								continue;
							}
							mc = findMethod(inf, methodName, parameterType);
							if (mc != null)
							{
								break;
							}
						}
						if (mc == null)
						{
							Class parent = target.getSuperclass();
							if (parent != null && !parent.equals(Object.class))
							{
								mc = findMethod(parent, methodName, parameterType);
							}
						}

						if (mc == null)
						{
							mc = new MethodConf();
							mc.method = temp;
							mc.convert = convert;
							for (int c : convert)
							{
								if (c != 0)
								{
									mc.isNeedConvert = true;
									break;
								}
							}
							return mc;
						}
						else
						{
							return mc;
						}

					}
				}
			}
		}

		return null;
	}

}

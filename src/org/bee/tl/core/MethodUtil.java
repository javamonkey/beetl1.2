package org.bee.tl.core;

import static org.bee.tl.core.MethodConf.DOUBLE_CONVERT;
import static org.bee.tl.core.MethodConf.FLOAT_CONVERT;
import static org.bee.tl.core.MethodConf.INT_CONVERT;
import static org.bee.tl.core.MethodConf.LONG_CONVERT;
import static org.bee.tl.core.MethodConf.NO_CONVERT;
import static org.bee.tl.core.MethodConf.ORGINAL_CONVERT;
import static org.bee.tl.core.MethodConf.SHORT_CONVERT;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class MethodUtil {

	static Map<Class, Method[]> cacheMap = new HashMap<Class, Method[]>();

	public static void main(String[] args) throws Exception {
		MethodUtil util = new MethodUtil();
		MethodConf config = null;
		config = findMethod(VipOrder.class, "getOrderId", new Class[] {});
		Method m = config.method;

		System.out.println(m.invoke(new VipOrder(), new Object[] {}));

		System.out.println(m.invoke(new Order(), new Object[] {}));

	}

	public void test(String a, Integer i, float j) {

	}

	public static interface IOrder {
		String getOrderId();
	}

	public static class Order implements IOrder {
		protected String orderId = "123";

		public String getOrderId() {
			return orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

	}

	public static class VipOrder implements IOrder {
		public String getOrderId() {
			return "456";
		}
	}

	public static class CommonOrder extends Order {
		public String getOrderId() {
			return "890";
		}
	}

	public static Object invoke(Object o, String methodName, Object[] paras)
			throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {
		Class target = o.getClass();
		Class[] parameterType = new Class[paras.length];
		int i = 0;
		for (Object para : paras) {
			parameterType[i++] = para.getClass();
		}
		MethodConf mf = findMethod(target, methodName, parameterType);
		Object result = invoke(o, mf, paras);
		return result;
	}

	public static Object invoke(Object o, MethodConf conf, Object[] paras)
			throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {

		Object[] targets = null;
		if (conf.isNeedConvert) {
			targets = new Object[paras.length];
			for (int i = 0; i < paras.length; i++) {
				if (conf.convert[i] != 0) {
					targets[i] = conf.convert(paras[i], i);
				} else {
					targets[i] = paras[i];
				}
			}

			return conf.method.invoke(o, targets);

		} else {
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
	public static MethodConf findMethod(Class target, String methodName,
			Class[] parameterType) {

		Method[] ms = cacheMap.get(target);
		if (ms == null) {
			ms = target.getMethods();

		}
		Method temp = null;
		for (int i = 0; i < ms.length; i++) {
			temp = ms[i];
			if (temp.getName().equals(methodName)) {
				MethodConf selfMc = match(temp, parameterType);
				if (selfMc != null&&selfMc.isExactMatch) {
					Class[] interfaces = target.getInterfaces();
					// 优先返回接口
					for (Class inf : interfaces) {
						if (inf.equals(java.io.Serializable.class)) {
							continue;
						}
						MethodConf interfaceMc = findMethod(inf, methodName,
								parameterType);
						if (interfaceMc != null) {
							return interfaceMc;
						}
					}
					// 在返回父类
					Class parent = target.getSuperclass();
					if (parent != null && !parent.equals(Object.class)) {
						MethodConf parentMc = findMethod(parent, methodName,
								parameterType);
						if (parentMc != null) {
							return parentMc;
						}
					}
					// 最后返回自己
					return selfMc;

				}
			}

		}

		return null;
	}

	public static MethodConf match(Method method, Class[] parameterType) {		
		return match(method, parameterType,-1);
	}

	
	/**看给定的参数是否匹配给定方法的前parameterCount参数 joelli
	 * @param method 
	 * @param parameterType 输入的参数
	 * @param parameterCount 如果为-1，则是精确匹配，输入参数与方法得参数个数必须一致
	 * @return
	 */
	public static MethodConf match(Method method, Class[] parameterType,
			int parameterCount) {
		Class[] paras = method.getParameterTypes();
		if(parameterCount==-1){			
			if(parameterType.length!=paras.length){
				return null;
			}
			parameterCount = parameterType.length;
		}
		
		if ( parameterType.length > parameterCount) {
			return null;
		}
		

		int[] convert = new int[parameterCount];

		boolean isMatch = true;

		for (int j = 0; j < parameterType.length; j++) {

			if (parameterType[j] == null) {
				// 认为匹配
				continue;
			}

			if (paras[j] == Object.class) {

				if (BeeNumber.class.isAssignableFrom(parameterType[j])) {
					convert[j] = ORGINAL_CONVERT;
				} else {
					convert[j] = NO_CONVERT;

				}
				continue;
			} else if (paras[j].isAssignableFrom(parameterType[j])) {
				convert[j] = NO_CONVERT;
				continue;
			}

			else if (paras[j].isPrimitive()
					&& BeeNumber.class.isAssignableFrom(parameterType[j])) {

				if (paras[j] == int.class) {
					convert[j] = INT_CONVERT;
				} else if (paras[j] == long.class) {
					convert[j] = LONG_CONVERT;
				} else if (paras[j] == double.class) {
					convert[j] = DOUBLE_CONVERT;
				} else if (paras[j] == float.class) {
					convert[j] = FLOAT_CONVERT;
				} else if (paras[j] == short.class) {
					convert[j] = SHORT_CONVERT;
				}
			} else if (Number.class.isAssignableFrom(paras[j])
					&& BeeNumber.class.isAssignableFrom(parameterType[j])) {
				if (paras[j] == Integer.class) {
					convert[j] = INT_CONVERT;
				} else if (paras[j] == Long.class) {
					convert[j] = LONG_CONVERT;
				} else if (paras[j] == Double.class) {
					convert[j] = DOUBLE_CONVERT;
				} else if (paras[j] == Float.class) {
					convert[j] = FLOAT_CONVERT;
				} else if (paras[j] == Short.class) {
					convert[j] = SHORT_CONVERT;
				}
			}
			else if (paras[j] == Boolean.class) {
				if (parameterType[j] == boolean.class
						|| parameterType[j] == Boolean.class) {
					convert[j] = NO_CONVERT;
				}
			} else if (paras[j] == boolean.class) {
				if (parameterType[j] == boolean.class
						|| parameterType[j] == Boolean.class) {
					convert[j] = NO_CONVERT;
				}
			} else {
				isMatch = false;
			}
		}

		if (isMatch) {

			MethodConf mc = new MethodConf();
			mc.method = method;
			mc.convert = convert;
			for (int c : convert) {
				if (c != 0) {
					mc.isNeedConvert = true;
					break;
				}
			}
			if (parameterType.length != parameterCount) {
				mc.isExactMatch = false;
			}
			return mc;
		} else {
			return null;
		}

	}

	/**
	 * java对象的默认值
	 * 
	 * @param type
	 * @return
	 */
	public static Object getDefaultValueByType(Class type) {
		if (type.equals(String.class)) {
			return "";
		} else if (type.equals(int.class) || type.equals(Integer.class)) {
			return 0;
		} else if (type.equals(long.class) || type.equals(Long.class)) {
			return 0l;
		} else if (type.equals(double.class) || type.equals(Double.class)) {
			return 0.0d;
		} else if (type.equals(float.class) || type.equals(Float.class)) {
			return 0.0f;
		} else if (type.equals(short.class) || type.equals(Short.class)) {
			return 0;
		} else if (type.equals(BigDecimal.class)) {
			return BigDecimal.ZERO;
		} else if (type.equals(BigInteger.class)) {
			return BigInteger.ZERO;
		} else if (type.equals(boolean.class) || type.equals(Boolean.class)) {
			return Boolean.FALSE;
		} else {
			return null;
		}

	}

}

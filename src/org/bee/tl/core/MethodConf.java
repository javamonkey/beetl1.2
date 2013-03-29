package org.bee.tl.core;

import java.lang.reflect.Method;

public class MethodConf
{
	public Method method;
	public int[] convert;
	public boolean isNeedConvert;

	public String toString()
	{
		String str = method.toString() + ",";
		for (int i : convert)
		{
			str = str + i + ",";
		}
		return str;
	}

	public Object invoke(Object o, Object[] parameter)
	{
		return null;
	}

	public String getOutputType(int i)
	{
		switch (convert[i])
		{

			case 1:
			{
				return ".intValue()";
			}
			case 2:
			{
				return ".longValue()";
			}
			case 3:
			{
				return ".doubleValue()";
			}
			case 4:
			{
				return ".floatValue()";
			}
			case 5:
			{
				return ".shortValue()";
			}
			case 11:
			{
				return ".orginalObject()";
			}
			default:
			{
				throw new RuntimeException("not support converty type " + i);
			}

		}
	}

	public Object convert(Object o, int i)
	{
		switch (convert[i])
		{
			case 0:
			{
				return o;
			}
			case 1:
			{
				return ((Number) o).intValue();
			}
			case 2:
			{
				return ((Number) o).longValue();
			}
			case 3:
			{
				return ((Number) o).doubleValue();
			}
			case 4:
			{
				return ((Number) o).floatValue();
			}
			case 5:
			{
				return ((Number) o).shortValue();
			}
			case 11:
			{
				return ((BeeNumber) o).orginalObject();
			}
			default:
			{
				throw new RuntimeException("not support converty type " + i);
			}

		}
	}

}
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

import java.math.BigDecimal;

/**
 * beetl里的数字，保证精度和大数的计算
 * <p>
 * 如999999999999999999999999/23232323
 * 
 * @author joelli
 * 
 */

public class BeeNumber extends Number implements Comparable
{
	BigDecimal thisNumber = null;

	/**
	 * 除法的时候保留的小数位
	 */
	public static int scale = 4;
	/**
	 * 默认是四舍五入
	 */
	public static int roundingMode = BigDecimal.ROUND_HALF_UP;
	private Object orginalObject = null;
	private boolean isPrimitive = false;
	private Class primitiveType = null;

	private BeeNumber()
	{

	}

	public BeeNumber(int i)
	{
		thisNumber = new BigDecimal(String.valueOf(i));
		orginalObject = i;
		isPrimitive = true;
		primitiveType = int.class;
	}

	public BeeNumber(long l)
	{
		thisNumber = new BigDecimal(String.valueOf(l));
		orginalObject = l;
		isPrimitive = true;
		primitiveType = long.class;
	}

	public BeeNumber(double d)
	{
		thisNumber = new BigDecimal(String.valueOf(d));
		orginalObject = d;
		isPrimitive = true;
		primitiveType = double.class;
	}

	public BeeNumber(String str)
	{
		thisNumber = new BigDecimal(str);
		orginalObject = str;
	}

	public BeeNumber(String str, Number o)
	{
		thisNumber = new BigDecimal(str);
		orginalObject = o;
	}

	public BeeNumber(String str, Class primitiveType)
	{
		thisNumber = new BigDecimal(str);
		orginalObject = null;
		this.isPrimitive = true;
		this.primitiveType = primitiveType;
	}

	public BeeNumber(BigDecimal number)
	{
		thisNumber = number;

	}

	public BeeNumber(BeeNumber number)
	{
		thisNumber = number.thisNumber;

	}

	public BeeNumber add(int i)
	{
		BigDecimal other = new BigDecimal(String.valueOf(i));
		return new BeeNumber(thisNumber.add(other));

	}

	public BeeNumber add(long i)
	{
		BigDecimal other = new BigDecimal(String.valueOf(i));
		return new BeeNumber(thisNumber.add(other));
	}

	public BeeNumber add(double d)
	{
		BigDecimal other = new BigDecimal(String.valueOf(d));
		return new BeeNumber(thisNumber.add(other));
	}

	public BeeNumber add(String str)
	{
		BigDecimal other = new BigDecimal(str);
		return new BeeNumber(thisNumber.add(other));
	}

	public BeeNumber add(BeeNumber other)
	{
		return new BeeNumber(thisNumber.add(other.thisNumber));
	}

	public BeeNumber min(int i)
	{
		BigDecimal other = new BigDecimal(String.valueOf(i));
		return new BeeNumber(thisNumber.subtract(other));

	}

	public BeeNumber min(double d)
	{
		BigDecimal other = new BigDecimal(String.valueOf(d));
		return new BeeNumber(thisNumber.subtract(other));
	}

	public BeeNumber min(long l)
	{
		BigDecimal other = new BigDecimal(String.valueOf(l));
		return new BeeNumber(thisNumber.subtract(other));
	}

	public BeeNumber min(String str)
	{
		BigDecimal other = new BigDecimal(String.valueOf(str));
		return new BeeNumber(thisNumber.subtract(other));
	}

	public BeeNumber min(BeeNumber other)
	{
		return new BeeNumber(thisNumber.subtract(other.thisNumber));
	}

	public BeeNumber multiply(double d)
	{
		BigDecimal other = new BigDecimal(String.valueOf(d));
		return new BeeNumber(thisNumber.multiply(other));

	}

	public BeeNumber multiply(int i)
	{
		BigDecimal other = new BigDecimal(String.valueOf(i));
		return new BeeNumber(thisNumber.multiply(other));
	}

	public BeeNumber multiply(long l)
	{
		BigDecimal other = new BigDecimal(String.valueOf(l));
		return new BeeNumber(thisNumber.multiply(other));
	}

	public BeeNumber multiply(String str)
	{
		BigDecimal other = new BigDecimal(str);
		return new BeeNumber(thisNumber.multiply(other));
	}

	public BeeNumber multiply(BeeNumber other)
	{

		return new BeeNumber(thisNumber.multiply(other.thisNumber));
	}

	public BeeNumber divide(double d)
	{
		BigDecimal other = new BigDecimal(String.valueOf(d));
		return new BeeNumber(thisNumber.divide(other, scale, roundingMode));

	}

	public BeeNumber divide(int i)
	{
		BigDecimal other = new BigDecimal(String.valueOf(i));
		return new BeeNumber(thisNumber.divide(other, scale, roundingMode));

	}

	public BeeNumber divide(long l)
	{
		BigDecimal other = new BigDecimal(String.valueOf(l));
		return new BeeNumber(thisNumber.divide(other, scale, roundingMode));

	}

	public BeeNumber divide(String str)
	{
		BigDecimal other = new BigDecimal(str);
		return new BeeNumber(thisNumber.divide(other, scale, roundingMode));

	}

	public BeeNumber divide(BeeNumber other)
	{

		return new BeeNumber(thisNumber.divide(other.thisNumber, scale, roundingMode));

	}

	public Object orginalObject()
	{
		if (this.orginalObject != null)
		{
			return this.orginalObject;
		}
		else
		{
			if (this.isPrimitive)
			{
				if (this.primitiveType == int.class)
				{
					orginalObject = thisNumber.intValue();
				}
				else
				{
					orginalObject = thisNumber.doubleValue();
				}
			}
			return orginalObject;

		}

	}

	public boolean isPrimitive()
	{
		return isPrimitive;
	}

	public BeeNumber clone()
	{
		BeeNumber b = new BeeNumber();
		b.isPrimitive = this.isPrimitive;
		b.orginalObject = this.orginalObject;
		b.primitiveType = this.primitiveType;
		b.thisNumber = this.thisNumber;
		return b;
	}

	public boolean isInt()
	{
		return thisNumber.scale() == 0;
	}

	public String toString()
	{
		//为啥不行呢？忘记了
		// System.out.println(thisNumber.precision());
		// System.out.println(thisNumber.scale());
		// if(thisNumber.scale()>0){
		// return thisNumber.stripTrailingZeros().toString();
		// }else{
		// return thisNumber.toString();
		// }

		String str = thisNumber.toString();
		int index = -1;
		if ((index = str.indexOf('.')) != -1)
		{
			char[] array = str.toCharArray();
			int i = str.length() - 1;
			for (; i > index; i--)
			{
				if (array[i] != '0')
				{
					break;
				}
			}
			if (i == index)
			{
				return new String(array, 0, i);
			}
			else
			{
				return new String(array, 0, i + 1);
			}

		}
		else
		{
			return str;
		}

	}

	public int compareTo(Object o)
	{
		if (o instanceof Number)
		{
			if (o instanceof BeeNumber)
			{
				return thisNumber.compareTo(((BeeNumber) o).thisNumber);
			}
			else if (o instanceof BigDecimal)
			{
				return thisNumber.compareTo(((BigDecimal) o));
			}
			else
			{
				BigDecimal other = new BigDecimal(o.toString());
				return thisNumber.compareTo(other);
			}

		}
		else
		{
			throw new RuntimeException("type mismatch,number can not compare " + o.getClass() + "(" + o.toString()
					+ ")");
		}
	}

	public boolean equals(Object o)
	{
		if (o instanceof Number)
		{
			return this.compareTo(o) == 0;
		}

		else
		{
			return false;
		}
	}

	@Override
	public double doubleValue()
	{
		return thisNumber.doubleValue();
	}

	@Override
	public float floatValue()
	{
		return thisNumber.floatValue();
	}

	@Override
	public int intValue()
	{
		return thisNumber.intValue();
	}

	@Override
	public long longValue()
	{
		return thisNumber.longValue();
	}

	public BeeNumber negate()
	{
		return new BeeNumber(thisNumber.negate());
	}

	public BigDecimal getBigDecimal()
	{
		return this.thisNumber;
	}

	public static void main(String[] args)
	{
		BeeNumber b = new BeeNumber("12", int.class);
		Object o = b.orginalObject();
		System.out.println(o);
	}

}
package org.bee.tl.util;


public class TempResearch
{
	int age = 12;

	public static void main(String[] args) throws Exception
	{
		Object o = TempResearch.get();
		Class c = TempResearch.class.getMethod("get", new Class[0]).getReturnType();
		System.out.println(c.getComponentType());
		System.out.println(c);

	}

	public static int[] get()
	{
		return new int[]{1,2};
	}

}

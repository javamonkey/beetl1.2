package org.bee.tl.core;

import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeetlUtil
{
	/**
	 * 获得模板文件编译成class的包名和类名。如果文件名存在".",则用"_"代替
	 * 如果存在空格，-号，则用"__"代替。
	 * @param key 路径/模板文件
	 * @return
	 */
	public static String[] getPackage2Class(String key)
	{

		char[] cs = key.toCharArray();
		StringBuilder pkg = new StringBuilder();
		for (char c : cs)
		{
			if (c == '\\' || c == '/')
			{
				if (pkg.length() != 0)
				{
					pkg.append(".");
				}

			}
			else if (c == '.')
			{
				pkg.append("_");
			}
			else if (c == ' ')
			{
				pkg.append("__");
			}
			else if (c == '-')
			{
				pkg.append("__");
			}
			else if (c == '-')
			{
				pkg.append("__");
			}
			else
			{
				pkg.append(c);
			}
		}

		int lastPeriodIndex = pkg.lastIndexOf(".");
		if (lastPeriodIndex == -1)
		{
			return new String[]
			{ "", pkg.toString() };
		}
		return new String[]
		{ pkg.substring(0, lastPeriodIndex), pkg.substring(lastPeriodIndex + 1) };

	}

	public static String getClassFullName(String pkg, String name)
	{
		StringBuilder sb = new StringBuilder();
		if (pkg.length() != 0)
		{
			sb.append(pkg).append(".");
		}
		sb.append(name);
		return sb.toString();
	}

	/** 在class直接调用了，判断输入是类成员调用，还是实例的成员调用，
	 * beetl只通过首字母是否是大小写来判断，如：
	 * <pre>	 
	 * ${@user.getName()}
	 * 和	 
	 * ${@User.getName()}
	 * </pre>
	 * 前者beetl会判断为实例调用，后者beetl会认为是一个叫User.class的一个静态方法调用
	 * @param name
	 * @return
	 */
	public static boolean isClassName(String name)
	{

		char c = name.charAt(0);
		if (Character.isUpperCase(c))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	/** 判断指定的类是否在List列表里，用于class调用的安全检查
	 * @param list 黑名单
	 * @param cls 指定的类全称
	 * @return 如果类cls在list里，则返回true，否则false
	 */
	public static boolean contain(List<String> list, String cls)
	{
		for (String str : list)
		{
			if (cls.startsWith(str))
			{
				return true;
			}
		}
		return false;
	}

	public static String getEscapeString(String escapeString)
	{

		char[] cs = escapeString.toCharArray();
		StringBuilder sb = new StringBuilder();
		int length = cs.length - 1;
		for (int i = 1; i < length; i++)
		{
			if (cs[i] != '\\')
			{
				sb.append(cs[i]);
			}
		}
		return sb.toString();
	}

	public static String addEscpage(String str)
	{
		char[] cs = str.toCharArray();
		StringBuilder sb = new StringBuilder("\"");
		int length = cs.length;
		for (int i = 0; i < length; i++)
		{
			if (cs[i] == '\"' || cs[i] == '\t' || cs[i] == '\n')
			{
				sb.append("\\");
			}
			sb.append(cs[i]);
		}
		sb.append("\"");
		return sb.toString();
	}

	public static String getFunctionFullName(BeeCommonNodeTree node)
	{
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < node.getChildCount(); i++)
		{
			sb.append(((BeeCommonNodeTree) node.getChild(i)).getToken().getText());
			sb.append(".");
		}
		sb.setLength(sb.length() - 1);
		return sb.toString();
	}

	public static void main(String[] args)
	{
		String[] str = BeetlUtil.getPackage2Class("/WEB-INF/ccc");
		System.out.println(Arrays.asList(str));

	}

	/**得到对象自己的所有public方法
	 * @param o
	 * @return
	 */
	public static Method[] getSelfMethod(Object o)
	{
		Class c = o.getClass();
		Method[] ms = o.getClass().getMethods();
		List list = new ArrayList();
		for (Method m : ms)
		{
			int mod = m.getModifiers();
			if (m.getDeclaringClass().equals(c) && Modifier.isPublic(mod) && !Modifier.isStatic(mod))
			{
				list.add(m);
			}

		}
		return (Method[]) list.toArray(new Method[0]);
	}

	/** 读出reader里的所有数据
	 * @param reader
	 * @return
	 * @throws IOException
	 */
	public static String getString(Reader reader) throws IOException
	{
		StringBuilder temp = new StringBuilder();
		int bufSzie = 1024;
		char[] cs = new char[bufSzie];
		int len = -1;

		while ((len = reader.read(cs)) != -1)
		{
			temp.append(cs, 0, len);

		}
		return temp.toString();

	}

	/** 检查指定的类是否是Tag
	 * @param tag
	 * @return
	 */
	public static boolean checkTag(Class tag)
	{
		try
		{
			//泛型能解决么？
			if (tag.newInstance() instanceof Tag)
			{
				return true;
			}

		}
		catch (Exception t)
		{

		}
		return false;
	}

}

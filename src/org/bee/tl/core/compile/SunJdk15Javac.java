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

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.exception.PreCompileException;

public class SunJdk15Javac extends JavaCompiler
{
	Class javac = null;
	Method m = null;
	static Logger logger = Logger.getLogger(SunJdk15Javac.class.toString());
	static StringBuilder sb = new StringBuilder();
	static
	{
		ClassLoader loader = Jdk16Javac.class.getClassLoader();
		while (true)
		{
			if (loader == null)
			{
				break;
			}
			if (loader instanceof URLClassLoader)
			{
				File f = null;
				for (URL url : ((URLClassLoader) loader).getURLs())
				{

					if (url.getProtocol().equals("jar"))
					{
						String temp = url.getPath();
						// 去掉最后的！
						f = new File(temp.substring(5, temp.length() - 2));
					}
					else
					{
						f = new File(url.getFile());
					}
					sb.append(f.toString()).append(";");
				}
			}
			loader = loader.getParent();
		}
		if (extraPath != null)
		{
			sb.append(extraPath);
		}
		System.out.println(sb.toString());

	}

	public SunJdk15Javac()
	{

		String javaHome = System.getenv("JAVA_HOME");
		if (javaHome == null)
		{
			logger.severe("优化失败：请设置java_home");
			throw new PreCompileException("优化失败：请设置java_home");
		}
		try
		{
			URL url = new File(javaHome + File.separator + "lib" + File.separator + "tools.jar").toURL();
			URLClassLoader classLoader = new URLClassLoader(new URL[]
			{ url }, this.getClass().getClassLoader());
			javac = classLoader.loadClass("com.sun.tools.javac.Main");
			m = javac.getMethod("compile", new Class[]
			{ String[].class, PrintWriter.class });
		}
		catch (Exception ex)
		{
			logger.severe("优化失败：不能找到com.sun.tools.javac.Main");
			throw new PreCompileException("优化失败：不能找到com.sun.tools.javac.Main");
		}
		this.classPath = sb.toString();

	}

	public int compile()
	{
		Object o;
		try
		{
			o = javac.newInstance();
			StringWriter sw = new StringWriter();
			Object result = m.invoke(o, new Object[]
			{ getOpts(), new PrintWriter(sw) });
			// todo,详细解释哪儿出错了

			int i = ((Integer) result).intValue();
			if (i != 0)
			{
				System.err.println(sw.toString());

			}

			Map optimizeMap = groupTemplate.getOptimizeConfigMap();
			if (optimizeMap != null)
			{
				Object keep = optimizeMap.get(GroupTemplate.OPTIMIZE_KEEP_SOURCE);
				if (keep == null || !((Boolean) keep).booleanValue())
				{
					//					 delete source,jdk support the src can be inputstream,not
					//					 file.i will do it latter
					new File(this.srcPath).delete();
				}

			}
			return i;
		}
		catch (InstantiationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		catch (IllegalArgumentException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		catch (InvocationTargetException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}

	}

	private String[] getOpts()
	{
		List<String> list = new ArrayList<String>();

		if (this.classPath != null)
		{
			list.add("-cp");
			if (groupTemplate.getExtraClassPath() != null)
			{
				StringBuilder sb = new StringBuilder();
				sb.append(this.className).append(";").append(groupTemplate.getExtraClassPath());
				list.add(sb.toString());
			}
			else
			{
				list.add(this.classPath);
			}
			list.add(this.classPath);
		}

		list.add("-sourcepath");
		list.add(this.srcPath);

		list.add("-encoding");
		list.add("UTF-8");
		list.add("-d");
		list.add(this.targetPath);

		list.add(this.srcPath + File.separator + this.className.replace(".", "\\") + ".java");
		return list.toArray(new String[0]);
	}

	public static void main(String[] args) throws Exception
	{
		SunJdk15Javac javac = new SunJdk15Javac();
		javac.setSRCPath("C:\\Documents and Settings\\李bear\\.bee\\beetls\\src");
		javac.setClassName("test.first_html");
		javac.setTargetPath("C:\\Documents and Settings\\李bear\\.bee\\beetls\\classes");
		// javac.setClassPath("E:\\lijz\\javamonkey\\bee\trunk\\workspace\\tl\\bin");
		javac.compile();

	}
}

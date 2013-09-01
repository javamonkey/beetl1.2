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
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

import org.bee.tl.core.GroupTemplate;

/**
 *  编译java文件的实现类，需要实现 {@link #compile}方法(
 * @author joelli
 * @since 1.1
 *
 */
public class JavaCompiler
{
	String srcPath;
	String targetPath;
	String classPath;
	String className;
	String encoding;
	static String BEETL_EXTRA_CLASSPATH = "BEETL_EXTRA_CLASSPATH";

	GroupTemplate groupTemplate = null;

	protected static List<String> extraPathList = null;
	protected static String extraPath = null;
	static
	{
		extraPath = System.getProperty(BEETL_EXTRA_CLASSPATH);
		if (extraPath != null)
		{
			extraPathList = Arrays.asList(extraPath.split(";"));

		}
	}

	/** java文件编码
	 * @return
	 */
	public String getEncoding()
	{
		return encoding;
	}

	/** 设置java文件编码
	 * @param encoding
	 */
	public void setEncoding(String encoding)
	{
		this.encoding = encoding;
	}

	/**设置java文件path
	 * @param srcPath
	 */
	public void setSRCPath(String srcPath)
	{
		this.srcPath = srcPath;
	}

	/** 设置编译后class的存放路径
	 * @param targetPath
	 */
	public void setTargetPath(String targetPath)
	{
		this.targetPath = targetPath;
	}

	/**设置编译需要的classpath
	 * @param classPath
	 */
	public void setClassPath(String classPath)
	{
		this.classPath = classPath;
	}

	/**
	 * 需要编译的类
	 * @param className
	 */
	public void setClassName(String className)
	{
		this.className = className;
	}

	/** 编译，0指示编译成功，其他指示失败
	 * @return
	 */
	public int compile()
	{
		return 0;
	}

	public GroupTemplate getGroupTemplate()
	{
		return groupTemplate;
	}

	public void setGroupTemplate(GroupTemplate groupTemplate)
	{
		this.groupTemplate = groupTemplate;
	}
	
	public static List<File> getClassPath1(ClassLoader loader) {
		List<File> path = new ArrayList<File>();
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

					path.add(f);
				}
			}
			loader = loader.getParent();
		}
		return path;
	}
	
	
	/**
	 * 
	 * suggest by qingsong
	 */
	public static List<File> getClassPath2(ClassLoader cl) {
		List<File> paths = new ArrayList<File>();
		while (cl != null) {
			boolean isUrlClassloader = cl instanceof URLClassLoader;
			if (isUrlClassloader) {
				URLClassLoader urlClassLoader = (URLClassLoader) cl;
				for (URL url : urlClassLoader.getURLs()) {
					paths.add(new File(url.getFile()));
				}
			} else {
				Enumeration<URL> resources = null;
				try {
					resources = cl.getResources("/");
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (resources != null) {
					while (resources.hasMoreElements()) {
						URL resource = resources.nextElement();
						paths.add(new File(resource.getFile()));
					}
				}
			}
			cl = cl.getParent();
		}
		return paths;
	}
	
	


}

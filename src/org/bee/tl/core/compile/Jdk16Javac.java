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
import java.io.StringWriter;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;

import org.bee.tl.core.GroupTemplate;

public class Jdk16Javac extends JavaCompiler
{

	static Logger logger = Logger.getLogger(Jdk16Javac.class.toString());

	static List<File> path = JavaCompiler.getClassPath1(Jdk16Javac.class.getClassLoader());
	
	static{
		
		if (extraPathList != null)
		{
			for (String str : extraPathList)
			{
				path.add(new File(str));
			}
		}

	}

	public Jdk16Javac()
	{

	}

	public int compile()
	{

		try
		{

			File file = new File(this.srcPath + File.separator + this.className.replace(".", File.separator) + ".java");

			File[] files1 = new File[]
			{ file };

			javax.tools.JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
			StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
			if (groupTemplate.getExtraClassPath() != null)
			{
				//需要优化
				String[] paths = groupTemplate.getExtraClassPath().split(";");
				List newPath = new ArrayList(path.size() + paths.length);
				for (String p : paths)
				{
					newPath.add(new File(p));
				}
				newPath.addAll(path);
				fileManager.setLocation(StandardLocation.CLASS_PATH, newPath);
			}
			else
			{
				fileManager.setLocation(StandardLocation.CLASS_PATH, path);
			}

			Iterable<? extends JavaFileObject> compilationUnits1 = fileManager.getJavaFileObjectsFromFiles(Arrays
					.asList(files1));

			StringWriter sw = new StringWriter();
			boolean isSuccess = compiler.getTask(sw, fileManager, null, getOpts(), null, compilationUnits1).call();
			fileManager.close();
			Map optimizeMap = groupTemplate.getOptimizeConfigMap();
			if (optimizeMap != null)
			{
				Object keep = optimizeMap.get(GroupTemplate.OPTIMIZE_KEEP_SOURCE);
				if (keep == null || !((Boolean) keep).booleanValue())
				{
					//					 delete source,jdk support the src can be inputstream,not
					//					 file.i will do it latter
					file.delete();
				}

			}
			else
			{
				file.delete();
			}

			if (!isSuccess)
			{
				System.err.println(sw.toString());
				return -1;
			}

			return 0;
		}
		catch (Exception ex)
		{
			logger.info("System May not support compile!");
			return -1;
		}

	}

	private List<String> getOpts()
	{
		List<String> optionList = new ArrayList<String>();
		// set compiler's classpath to be same as the runtime's
		// optionList.addAll(Arrays.asList("-classpath",this.classPath));

		optionList.addAll(Arrays.asList("-encoding", "UTF-8"));
		optionList.addAll(Arrays.asList("-d", this.targetPath));
		//		optionList.addAll(Arrays.asList("-Xlint:none"));
		//no work
		optionList.addAll(Arrays.asList("-nowarn"));

		return optionList;

	}

	public static void main(String[] args) throws Exception
	{
		// Jdk16Javac javac = new Jdk16Javac();
		// javac.setSRCPath("C:\\Documents and Settings\\李bear\\.bee\\beetls\\src");
		// javac.setClassName("test.first_html");
		// javac.setTargetPath("C:\\Documents and Settings\\李bear\\.bee\\beetls\\classes");
		// //
		// javac.setClassPath("E:\\lijz\\javamonkey\\bee\trunk\\workspace\\tl\\bin");
		// javac.compile();
		String ver = "1.62";
		System.out.println(ver.compareTo("1.60"));
		System.out.println(ver.compareTo("1.5"));
		String str = "objref.objMapref_template_html";
		System.out.println(str.replace(".", File.separator));

		System.out.println(System.getProperties());
	}
}

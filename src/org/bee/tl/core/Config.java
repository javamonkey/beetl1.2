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

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 通过配置文件创建GroupTemplate，主要用于与其他框架集成
 * 默认情况，Config会先读取/org/bee/tl/core/beetl-default.properties，
 * 如果/beetl.properties存在，则用此配置文件覆盖默认情况，也可以通过调用load或者put方法
 * 自己设定属性
 * 
 * @author joelli
 *
 */
public class Config
{

	protected Properties ps = new Properties();
	public static String DELIMITER_PLACEHOLDER_START = "DELIMITER_PLACEHOLDER_START";
	public static String DELIMITER_PLACEHOLDER_END = "DELIMITER_PLACEHOLDER_END";
	public static String DELIMITER_STATEMENT_START = "DELIMITER_STATEMENT_START";
	public static String DELIMITER_STATEMENT_END = "DELIMITER_STATEMENT_END";
	public static String NATIVE_CALL = "NATIVE_CALL";
	public static String COMPILE_CLASS = "COMPILE_CLASS";
	public static String DIRECT_BYTE_OUTPUT = "DIRECT_BYTE_OUTPUT";
	public static String TEMPLATE_ROOT = "TEMPLATE_ROOT";
	public static String TEMPLATE_CHARSET = "TEMPLATE_CHARSET";
	public static String TEMPLATE_CACHE_CHECK_PERIOD = "TEMPLATE_CACHE_CHECK_PERIOD";
	public static String TEMPLATE_CLASS_FOLDER = "TEMPLATE_CLASS_FOLDER";
	public static String ERROR_HANDLER = "ERROR_HANDLER";
	public static String MVC_STRICT = "MVC_STRICT";
	public static String DEBUG = "DEBUG";
	public static String COMPILE_CLASS_KEEP_SOURCE = "COMPILE_CLASS_KEEP_SOURCE";
	public static String BIG_NUMBER_SUPPORT = "BIG_NUMBER_SUPPORT";
	

	public Config() throws IOException
	{

		//beetl默认
		ps.load(Config.class.getResourceAsStream("/org/bee/tl/core/beetl-default.properties"));
		//应用默认
		InputStream ins = Config.class.getResourceAsStream("/beetl.properties");
		if (ins != null)
		{
			ps.load(ins);
		}

	}

	public Config load(File path) throws IOException
	{
		ps.load(new FileReader(path));
		return this;
	}

	public Config load(String path) throws IOException
	{
		ps.load(Config.class.getResourceAsStream(path));
		return this;
	}

	public Config put(String name, String value)
	{
		ps.put(name, value);
		return this;
	}

	public Config put(Map<String, String> map)
	{
		Set<Map.Entry<String, String>> entrys = map.entrySet();
		for (Map.Entry<String, String> entry : entrys)
		{
			ps.put(entry.getKey(), entry.getValue());
		}
		return this;
	}

	public String get(String name)
	{
		return ps.getProperty(name);
	}

	/** 根据配置创建一个GroupTemplate
	 * @return
	 */
	public GroupTemplate createGroupTemplate()
	{
		GroupTemplate gt = null;
		//必须先检测是否是文件模板？
		String templateRoot = ps.getProperty(this.TEMPLATE_ROOT);
		if (isNotEmpty(templateRoot))
		{
			gt = new GroupTemplate(new File(templateRoot));
			//模板文件字符集，如果编译，输出的class到哪个目录

			String classFolder = ps.getProperty(this.TEMPLATE_CLASS_FOLDER);
			if (isNotEmpty(classFolder))
			{
				gt.setTempFolder(classFolder);
			}

			boolean isCompileClass = this.isBoolean(this.COMPILE_CLASS, false);
			if (isCompileClass)
			{

				Map compileConfig = new HashMap();
				boolean keepSource = this.isBoolean(COMPILE_CLASS_KEEP_SOURCE, false);
				if (keepSource)
				{

					compileConfig.put(GroupTemplate.OPTIMIZE_KEEP_SOURCE, true);
					gt.enableOptimize(compileConfig);
				}
				else
				{
					gt.enableOptimize();
				}

			}

			int strSheckPeriod = getInt(TEMPLATE_CACHE_CHECK_PERIOD, 0);
			gt.enableChecker(strSheckPeriod);
		}
		else
		{
			gt = new GroupTemplate();
		}

		if (isBoolean(DIRECT_BYTE_OUTPUT, false))
		{
			gt.enableDirectOutputByte();
		}
		if (isBoolean(NATIVE_CALL, false))
		{
			gt.enableNativeCall();
		}
		if (isBoolean(MVC_STRICT, false))
		{
			gt.enableStrict();
		}
		
		if(isBoolean(BIG_NUMBER_SUPPORT,true)){
			gt.setBigNumberSupport(true);
		}else{
			gt.setBigNumberSupport(false);
		}

		String hanlderClass = ps.getProperty(ERROR_HANDLER);
		try
		{
			if (this.isNotEmpty(hanlderClass))
			{
				gt.setErrorHandler((ErrorHandler) Class.forName(hanlderClass).newInstance());
			}
			else
			{
				//user handle it outside of beetl
				gt.setErrorHandler(null);
			}

		}
		catch (Exception ex)
		{
			throw new IllegalArgumentException(hanlderClass);
		}

		if (isBoolean(DEBUG, false))
		{
			gt.setDebug(true);
		}

		String charset = ps.getProperty(this.TEMPLATE_CHARSET);
		if (charset != null)
		{
			gt.setCharset(charset);
		}

		gt.config(getString(DELIMITER_STATEMENT_START, "<%"), getString(DELIMITER_STATEMENT_END, "%>"),
				getString(DELIMITER_PLACEHOLDER_START, "${"), getString(DELIMITER_PLACEHOLDER_END, "}"));

		return gt;
	}

	public int getInt(String key, int defaultValue)
	{
		String value = (String) ps.get(key);
		if (isNotEmpty(value))
		{
			return Integer.parseInt(value);
		}
		else
		{
			return defaultValue;
		}

	}

	public String getString(String key, String defaultValue)
	{
		return ps.getProperty(key, defaultValue);
	}

	public boolean isNotEmpty(String str)
	{
		return str != null && str.length() != 0;
	}

	private boolean isBoolean(String str, boolean defaultValue)
	{
		String value = ps.getProperty(str);
		if (isNotEmpty(value))
		{
			return Boolean.parseBoolean(value);
		}
		else
		{
			return defaultValue;
		}
	}

	public static void main(String[] args)
	{
		//		Config config = new Config();
		//		GroupTemplate groupTemplate = config.createGroupTemplate();

	}

}

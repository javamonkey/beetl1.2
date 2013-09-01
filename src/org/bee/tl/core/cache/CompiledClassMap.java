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
package org.bee.tl.core.cache;

import java.io.File;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

import org.bee.tl.core.BeetlUtil;
import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.PreCompiledClass;
import org.bee.tl.core.compile.CompileTask;
import org.bee.tl.core.compile.CompiledClass;

/**
 * 存放已经编译好的class
 * 
 * @author jzli
 * @create 2011-11-4
 */
public class CompiledClassMap
{
	Object lock = new Object();
	Map<String, CompiledClass> cahce = new ConcurrentHashMap<String, CompiledClass>();
	Set<String> oldSet = new HashSet<String>();

	Map<String, CompileTask> futureMap = new ConcurrentHashMap<String, CompileTask>();
	GroupTemplate group = null;
	static Logger logger = Logger.getLogger(CompiledClassMap.class.toString());
	private boolean debug = false;

	public CompiledClassMap(GroupTemplate group)
	{
		this.group = group;
		debug = group.isDebug();
	}

	public CompiledClass getClass(String key)
	{

		CompiledClass cls = cahce.get(key);
		if (cls == null)
		{

			// 没有预编译或者正在预编译
			if (group.getFutureComplileExecutor() != null)
			{
				CompileTask future = futureMap.get(key);
				if (future != null)
				{
					if (!future.isDone())
					{
						// 没有编译完成，暂时解释执行
						return future.getPc();
					}
					else
					{
						futureMap.remove(key);
					}

				}
			}

			String[] str = BeetlUtil.getPackage2Class(key);
			File classFile = new File(group.getTempFolder() + File.separator + group.getRootAlias() + File.separator
					+ "classes" + File.separator + str[0].replace(".", File.separator), str[1] + ".class");
			if (classFile.exists() && !group.isDebug())
			{
				try
				{

					Class c = group.getClassLoader().loadClass(BeetlUtil.getClassFullName(str[0], str[1]));

					cls = (CompiledClass) c.newInstance();

					File f = new File(group.getRoot().toString(), key);
					if (cls.getVersion() == f.lastModified() && !debug)
					{
						this.cacheCompiledClass(key, cls);
						return cls;
					}
					else
					{
						return null;
					}

				}
				catch (ClassNotFoundException e)
				{
					// TODO Auto-generated catch block
					logger.warning("发现一错误的class文件 ,指定文件未找到" + group.getRoot().toString() + File.separator + key + ":"
							+ e.getMessage());

					return null;
				}
				catch (InstantiationException e)
				{
					logger.warning("发现一错误的class文件，不能初始化该类 " + group.getRoot().toString() + File.separator + key + ":"
							+ e.getMessage());

					return null;
				}
				catch (UnsupportedClassVersionError e)
				{
					logger.warning("java版本不一致件 " + group.getRoot().toString() + File.separator + key + ":"
							+ e.getMessage());

					return null;
				}
				catch (IllegalAccessException e)
				{
					logger.warning("发现一错误的class文件 " + group.getRoot().toString() + File.separator + key + ":"
							+ e.getMessage());

					return null;

				}
				catch (RuntimeException re)
				{
					//没有注释，忘记什么意思了？
					if (re.getMessage().startsWith("Wrong"))
					{
						this.oldSet.add(key);
						return null;
					}
					else
					{
						throw re;
					}
				}
			}
			else
			{
				return null;
			}

		}
		else
		{
			return cls;

		}

	}

	/**
	 * 检查是否在缓存里已经存在了一个模板类。如果有，则返回true，否则，false。注意，如果缓存里是PreCompiledClass，返回false
	 * 如果存在过，但已经被更新，也返回ture
	 * 
	 * @param key
	 * @return
	 */
	public boolean hasLoaded(String key)
	{
		CompiledClass cls = cahce.get(key);
		if (cls != null && !(cls instanceof PreCompiledClass))
		{
			return true;
		}
		else
		{
			if (oldSet.contains(key))
			{
				// 曾经被classLoader装载过
				return true;
			}
			else
			{
				return false;
			}

		}
	}

	public void cacheCompiledClass(String key, CompiledClass cls)
	{
		cahce.put(key, cls);
	}

	public void removeClass(String key)
	{
		cahce.remove(key);
	}

	/**
	 * 用于后台检测是否已经更新 2012-1-4 jzli
	 */
	public void checkTemplateUpdate()
	{
		if (cahce.size() == 0)
			return;
		Set<Map.Entry<String, CompiledClass>> set = cahce.entrySet();
		List<String> list = new LinkedList<String>();
		String key = null;
		CompiledClass c = null;
		for (Map.Entry<String, CompiledClass> entry : set)
		{
			key = entry.getKey();
			c = entry.getValue();
			File f = new File(group.getRoot(), key);
			if (f.lastModified() != c.getVersion())
			{
				list.add(key);
				// System.out.println("delete " + f + "f.lastModified()=" +
				// f.lastModified() + " but " + c.getVersion());
			}
		}

		for (String file : list)
		{

			cahce.remove(file);
			if (!oldSet.contains(file))
			{
				oldSet.add(file);
			}

		}

	}

	public Map<String, CompileTask> getFutureMap()
	{
		return futureMap;
	}

	public void setFutureMap(Map<String, CompileTask> futureMap)
	{
		this.futureMap = futureMap;
	}

}

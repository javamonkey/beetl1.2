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
package org.bee.tl.ext.cache;

import org.bee.tl.core.ByteSupportTag;

/**
 * cache标签，模板页面可以通过cache标签缓存模板内容<p>
 * <pre>  #： cache(key,timeout,refresh)
 *  模板内容
 *  #：}
 * </pre>
 * beetl将会把key值对应的模板内容放到cacheManger，下次访问时候，如果key值对应的模板内容在，就直接输出，而
 * 不需要再次解析运行模板。如果指定了timeout，则在在timeout秒内，cache都有效，之后cache无效，将再次
 * 解析运行模板<p>
 * 如果指定了refresh，则删除key值对应的模板内容，重新解析运行模板。
 * <p>
 * key值是必须的，timeout，和refresh可选。
 * @author jeolli
 *
 */
public class CacheTag extends ByteSupportTag
{
	public static CacheManager cacheManager = new SimpleCacheManager();
	protected String key = null;
	long refreshPeriod = 0;
	protected Object cahcedObject = null;

	public void setByteInput(byte[] bs)
	{
		super.setByteInput(bs);
		this.cahcedObject = bs;
		cacheManager.setObject(key, bs, refreshPeriod);
	}

	public void setInput(String input)
	{
		super.setInput(input);
		this.cahcedObject = input;
		cacheManager.setObject(key, input, refreshPeriod);
	}

	@Override
	public boolean requriedInput()
	{
		key = (String) this.args[0];
		//转成毫秒
		refreshPeriod = ((Number) this.args[1]).longValue();
		if (refreshPeriod < 0)
		{
			//如果是负数，则表示总是刷新，通常用于测试
			return true;
		}

		if (refreshPeriod == 0)
		{
			cahcedObject = cacheManager.getObject(key);
			if (cahcedObject == null)
			{
				return true;
			}
			else
			{
				return false;
			}
		}

		boolean refreshNow = ((Boolean) this.args[2]).booleanValue();
		if (refreshNow)
		{
			return true;
		}
		else
		{
			cahcedObject = cacheManager.getObject(key);
			if (cahcedObject == null)
			{
				return true;
			}
			else
			{
				return false;
			}

		}

	}

	@Override
	public byte[] getOutputAsByte()
	{
		return (byte[]) this.cahcedObject;
	}

	@Override
	public String getOutput()
	{
		return (String) this.cahcedObject;
	}

	public static void main(String[] args) throws Exception
	{
//		Config config = new Config();
//		GroupTemplate gt = config.createGroupTemplate();
//		gt.registerTag("cache", CacheTag.class);
//		String template = "<%cache('key1',10,false){%> hello,this is cached content" + "<%}%>";
//		for (int i = 0; i < 5; i++)
//		{
//			Template t = gt.getStringTemplate(template);
//			System.out.println(t.getTextAsString());
//		}
//		if (CacheTag.cacheManager.getObject("key1") == null)
//		{
//			//正常业务逻辑
//		}
//		else
//		{
//			//啥都不作，使用cache内容
//		}
		
		SimpleCacheManager sm = new SimpleCacheManager();
		sm.setObject("key", "value", 0);
		System.out.println(sm.getObject("key"));

		CacheTag.cacheManager.clearAll("key1");
		CacheTag.cacheManager.clearAll("key1", "key2");
		CacheTag.cacheManager.clearAll(new String[]
		{ "key1", "key2" });

	}
}

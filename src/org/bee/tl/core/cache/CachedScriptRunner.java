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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.bee.tl.core.CoreScriptRunner;
import org.bee.tl.core.Resource;

public class CachedScriptRunner
{
	//	Map<String, Node> cache = new HashMap<String, Node>();
	Map<String, CachedScriptItem> cache = new ConcurrentHashMap<String, CachedScriptItem>();

	public CachedScriptRunner()
	{

	}

	public CachedScriptItem getCoreScriptRunner(String key)
	{

		CachedScriptItem t = cache.get(key);
		return t;

	}

	public void removeCache(String key)
	{

		CachedScriptItem node = cache.get(key);
		if (node != null)
		{
			cache.remove(key);
		}

	}

	public void updateCache(CoreScriptRunner t, Resource res)
	{
		//		rwl.writeLock().lock();
		try
		{
			CachedScriptItem node = cache.get(res.getKey());
			if (node == null)
			{
				node = new CachedScriptItem();
				node.scriptRunner = t;
				node.res = res;
				cache.put(res.getKey(), node);
			}
			else
			{
				node.scriptRunner = t;
				node.res = res;

			}
		}
		finally
		{
			//			rwl.writeLock().unlock();
		}

	}

	/**
	 * 用于后台检测是否已经更新
	 * 2012-1-4
	 * jzli
	 */
	public void checkTemplateUpdate()
	{
		if (cache.size() == 0)
			return;
		Set<Map.Entry<String, CachedScriptItem>> set = cache.entrySet();
		List<String> list = new LinkedList<String>();
		String key = null;
		CachedScriptItem n = null;
		for (Map.Entry<String, CachedScriptItem> entry : set)
		{
			key = entry.getKey();
			n = entry.getValue();
			if (n.res.expired())
			{
				list.add(key);
			}
		}

		for (String child : list)
		{
			cache.remove(child);
		}

	}

}

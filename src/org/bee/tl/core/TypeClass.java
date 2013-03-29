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

import java.util.HashMap;
import java.util.Map;

/**
 * 节点类型，用于推测变量用
 * @author joelli
 *
 */
public class TypeClass
{

	
	Class rawType = Object.class;
	Map<String, Class> ptypeMap = new HashMap<String, Class>(1);
	Object ref = null;

	public TypeClass()
	{

	}

	public TypeClass(Class rawType)
	{

		this.rawType = rawType;
	}

	public Class getRawType()
	{
		return rawType;
	}

	public void setRawType(Class rawType)
	{
		this.rawType = rawType;
	}

	/**如果节点可能是泛型，返回泛型对应的class
	 * @return
	 */
	public Map<String, Class> getPtypeMap()
	{
		return ptypeMap;
	}

	public void setPtypeMap(Map<String, Class> ptypeMap)
	{
		this.ptypeMap = ptypeMap;
	}

	public boolean isRawType()
	{
		return ptypeMap.size() == 0;
	}

	public Object getRef()
	{
		return ref;
	}

	public void setRef(Object ref)
	{
		this.ref = ref;
	}

	public boolean isPrimitive()
	{
		if (this.rawType.isPrimitive())
		{
			return true;
		}
		if (this.rawType.equals(Integer.class) || rawType.equals(Boolean.class) || rawType.equals(Double.class))
		{
			return true;
		}
		else
		{
			return false;
		}

	}

	public boolean equals(Object o)
	{
		TypeClass other = (TypeClass) o;
		if (this.rawType.equals(other.rawType))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

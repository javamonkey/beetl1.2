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

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.bee.tl.core.exception.PreCompileException;

/**
 * 
 * 
 * eache node could be keep two extra infomation,one is the cached value on runtime,another is 
 * 
 * java class type of this node. beetl awlays suppose one java class type  for one node .
 * 
 * @author joelli
 * @see TypeTable
 * 
 */
public class BeeCommonNodeTree extends CommonTree
{
	private TypeClass typeClass;
	private Object cached = null;

	public BeeCommonNodeTree()
	{
		// TODO Auto-generated constructor stub
	}

	public BeeCommonNodeTree(CommonTree node)
	{
		super(node);
		// TODO Auto-generated constructor stub
	}

	public BeeCommonNodeTree(Token t)
	{
		super(t);
		// TODO Auto-generated constructor stub
	}

	/**get the java class type of this node.
	 * @return
	 */
	public TypeClass getTypeClass()
	{
		if (typeClass == null)
		{
			typeClass = new TypeClass();
		}
		return typeClass;
	}

	/** set the java class type of this node with generic infomation.such as List<User>
	 * @param typeClass
	 */
	public void setTypeClass(TypeClass typeClass)
	{
		this.typeClass = typeClass;
	}

	/** set the java class type of this node without generic ,for example ,StringLiteral node is java.lang.String.
	 * 
	 * @param c
	 */
	public void setExpType(Class c)
	{
		if (c == null)
		{
			throw new PreCompileException("预编译bug，未能判断表达式类型" + this.getToken().getText() + " "
					+ this.getToken().getLine());
		}
		this.typeClass = new TypeClass(c);
	}

	public Class getExpType()
	{
		if (this.typeClass == null)
			return null;
		else
			return this.typeClass.getRawType();
	}

	/** get the cached runtime value  of this node
	 * @return
	 */
	public Object getCached()
	{
		return cached;
	}

	/**set the cached value of this node. a few node can cache the runtime value such as
	 * <p/>TEXT_HOLDER,FUNCTION_FULL_NAME,varRef,etc.
	 * 
	 * @param cached
	 */
	public void setCached(Object cached)
	{
		this.cached = cached;
	}

}

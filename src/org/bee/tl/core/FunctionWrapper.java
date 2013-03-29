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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 用于FunctionPackage，包装一个类的某一个方法成为Function，如果这个方法最后一个参数是
 * Context，则传入，如果没有，则不传入Context
 * @author jeolli
 *
 */
public class FunctionWrapper implements Function{
	Object target;
	Method method;
	boolean isReturnVoid = false ;
	Class[] parameters ;
	boolean requiredContext = false ;
	public FunctionWrapper(Object o,Method m){
		this.target = o;
		this.method = m;
		if(m.getReturnType()==null) isReturnVoid = true;
		parameters = m.getParameterTypes();
		if(parameters.length!=0){
			if(parameters[parameters.length-1].equals(Context.class)){
				requiredContext = true ;
			}
		}
		method.setAccessible(true);
	}
	
	public String getFunctionName(){
		return method.getName();
	}
	
	/* 如果目标方法有ctx参数，则传入，如果没有，则不传入
	 * (non-Javadoc)
	 * @see org.bee.tl.core.Function#call(java.lang.Object[], org.bee.tl.core.Context)
	 */
	public Object call(Object[] paras, Context ctx) {
		
		Object[] args = null;
		if(requiredContext){
			args = new Object[paras.length+1];
			for(int i=0;i<paras.length;i++){
				args[i] = paras[i];
			}
			args[args.length-1] = ctx;
		}else{
			args = paras;
		}
		
		try {
			Object result = method.invoke(target, args);
			return result;
		} catch (IllegalArgumentException e) {
			throw new RuntimeException("参数错误"+e.getMessage());
		} catch (IllegalAccessException e) {
			throw new RuntimeException("非法调用"+e.getMessage());
		} catch (InvocationTargetException e) {
			Throwable t = e.getTargetException();
			throw new RuntimeException(t);
		}
		
	}
	
}

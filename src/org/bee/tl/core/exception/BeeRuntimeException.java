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
package org.bee.tl.core.exception;

import org.antlr.runtime.Token;

/**
 * 解释执行下的异常错误
 * @author joelli
 * @since 1.1
 *
 */
public class BeeRuntimeException extends RuntimeException
{

	public String detailCode;
	public Token token;

	public Throwable getCause()
	{
		return super.getCause();
	}

	/**
	 * 指示beetl现在不支持的功能
	 */
	public static final String DO_NOT_SUPPORT = "DO_NOT_SUPPORT";
	/**
	 * 变量已经定义过了
	 */
	public static final String VAR_ALREADY_DEFINED = "VAR_ALREADY_DEFINED";
	/**
	 * 变量只读，通过template.set()的变量，即用于渲染模板的变量都是只读的，不能在模板中被改写
	 */
	public static final String VAR_READONLY = "VAR_READONLY";

	/**
	 * 模板引用未定义的变量
	 */
	public static final String VAR_NOT_DEFINED = "VAR_NOT_DEFINED";

	/**
	 * 函数未定义错误
	 */
	public static final String FUNCTION_NOT_FOUND = "FUNCTION_NOT_FOUND";
	/**
	 * 标签未定义错误
	 */
	public static final String TAG_NOT_FOUND = "TAG_NOT_FOUND";

	/**
	 * 本地调用错误，如classnotfound等
	 */
	public static final String NATIVE_CALL_INVALID = "NATIVE_CALL_INVALID";
	/**
	 * 被调用的class抛出了异常
	 */
	public static final String NATIVE_CALL_EXCEPTION = "NATIVE_CALL_EXCEPTION";

	/**
	 * 格式化函数不存在错误
	 */
	public static final String FORMAT_NOT_FOUND = "FORMAT_NOT_FOUND";
	public static final String DEFAULT_FORMAT_NOT_FOUND = "DEFAULT_FORMAT_NOT_FOUND";
	
	
	/**
	 * 表达式运行错误
	 */
	public static final String EXPRESSION_INVALID = "EXPRESSION_INVALID";
	/**
	 * 引用属性错误
	 */
	public static final String ATTRIBUTE_INVALID = "ATTRIBUTE_INVALID";
	/**
	 * 模板里使用了[]指示应该是Map或者List，但实际上不是此类型
	 */
	public static final String CAST_LIST_OR_MAP_ERROR = "CAST_LIST_OR_MAP_ERROR";
	public static final String NULL = "NULL";
	/**
	 * 虚拟属性使用错误
	 */
	public static final String VIRTUAL_ATTRIBUTE_NOT_FOUND_EVAL = "VIRTUAL_ATTRIBUTE_NOT_FOUND_EVAL";
	/**
	 * 除0错误
	 */
	public static final String DIV_ZERO_ERROR = "DIV_ZERO_ERROR";
	/**
	 * 数组越界错误
	 */
	public static final String ARRAY_INDEX_ERROR = "ARRAY_INDEX_ERROR";
	/**
	 * 期望表达式返回bool值，但却是其他类型
	 */
	public static final String BOOLEAN_EXPECTED_ERROR = "BOOLEAN_EXPECTED_ERROR";
	/**
	 * 严格MVC错误，模板使用严格MVC，但模板内容含有不允许的语法
	 */
	public static final String STRICK_MVC = "STRICK_MVC";

	//对象的属性get方法出错
	public static final String GET_CALL_ERROR = "GET_CALL_ERROR";

	//断言异常，与assert函数一起使用
	public static final String ASSERT_ERROR = "ASSERT_ERROR";

	public static final String ERROR = "ERROR";

	public BeeRuntimeException(String detailCode, Token token)
	{
		this(detailCode, token, (Exception) null, null);

	}

	public BeeRuntimeException(String detailCode, Token token, String msg)
	{
		this(detailCode, token, (Exception) null, msg);
	}

	public BeeRuntimeException(String detailCode, Token token, Throwable ex)
	{
		this(detailCode, token, ex, null);
	}

	public BeeRuntimeException(String detailCode, Token token, Throwable cause, String msg)
	{

		super(msg, cause);
		this.detailCode = detailCode;
		this.token = token;
	}

	public String getDetailCode()
	{
		return detailCode;
	}

	public void setDetailCode(String detailCode)
	{
		this.detailCode = detailCode;
	}

	public Token getToken()
	{
		return token;
	}

	public void setToken(Token token)
	{
		this.token = token;
	}

	public String getMsg()
	{
		return super.getMessage();
	}

	public String toString()
	{
		return "Error:" + detailCode + "at " + token.getLine() + super.getMessage() != null ? super.getMessage() : "";
	}

}

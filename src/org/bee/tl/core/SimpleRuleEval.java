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

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.text.MessageFormat;

import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.RecognitionException;
import org.bee.tl.core.exception.BeeRuntimeException;
import org.bee.tl.core.exception.SimpleEvalException;
import org.bee.tl.core.exception.WrapperAntlrLexerException;
import org.bee.tl.core.io.ByteWriter_Char;

/*一个简单扩展，只用来衡量表达式*/
public class SimpleRuleEval
{
	protected CoreScriptRunner runner = null;
	protected Context ctx = new Context();
	protected StringWriter console = new StringWriter();
	protected boolean isEvalSuccess = true;
	protected int line = 0;
	protected String tokenName = null;
	protected String input = null;

	public SimpleRuleEval(String input)
	{
		this.input = input;
		runner = new CoreScriptRunner("var litinghong=(" + input + ");");
		runner.enableNativeCall();

	}

	public SimpleRuleEval(String input, String pattern)
	{
		this.input = MessageFormat.format(pattern, new String[]
		{ input });
		runner = new CoreScriptRunner(input);

	}

	public void set(String name, Object value)
	{
		ctx.set(name, value);
	}

	public void registerFunction(String name, Function fn)
	{
		runner.registerFunction(name, fn);
	}

	public Object calc() throws SimpleEvalException
	{

		return calc("litinghong");

	}

	public Object calc(String name) throws SimpleEvalException
	{

		try
		{
			runner.parse();
			runner.runScript(new ByteWriter_Char(console, "UTF-8"), ctx);
			Object o = ctx.getVarWithoutException(name);
			return o;
		}
		catch (IOException ex)
		{
			//could not happen
			throw new SimpleEvalException(ex.getMessage(), ex);
		}
		catch (BeeException e)
		{
			Resource rs = new Resource(this.input);
			e.setResource(rs);
			new DefaultErrorHandler().processExcption(e);
			Throwable ex = e.getCause();
			this.isEvalSuccess = false;
			if (ex instanceof BeeRuntimeException)
			{
				this.line = ((BeeRuntimeException) ex).getToken().getLine();
				this.tokenName = ((BeeRuntimeException) ex).getToken().getText();

			}
			else if (ex instanceof WrapperAntlrLexerException)
			{
				this.handleRecognitionException((RecognitionException) ex.getCause());
			}

			else if (ex instanceof RecognitionException)
			{
				handleRecognitionException((RecognitionException) ex);

			}
			else
			{
				this.tokenName = "未知";
			}
			throw new SimpleEvalException(this.line + "错误,原因是" + this.tokenName, ex);
		}

	}

	public boolean calcBoolean() throws SimpleEvalException
	{
		return (Boolean) calc();
	}

	public int calcInt() throws SimpleEvalException
	{
		return ((BeeNumber) calc()).intValue();
	}

	public long calcLong() throws SimpleEvalException
	{
		return ((BeeNumber) calc()).longValue();
	}

	public double calcDouble() throws SimpleEvalException
	{
		return ((BeeNumber) calc()).doubleValue();
	}

	public double calcFloat() throws SimpleEvalException
	{
		return ((BeeNumber) calc()).floatValue();
	}

	public BigDecimal calcBigDecimal() throws SimpleEvalException
	{
		return ((BeeNumber) calc()).getBigDecimal();
	}

	protected void handleRecognitionException(RecognitionException ex)
	{

		int errorLine = ex.line;
		this.tokenName = ex.token.getText();

		if (ex instanceof MismatchedTokenException)
		{
			MismatchedTokenException misError = (MismatchedTokenException) ex;
			String errorText = null;

			if (misError.expecting != -1)
			{
				this.tokenName = BeeParser.tokenNames[misError.expecting];
			}
			else if (misError.token != null)
			{
				this.tokenName = misError.token.getText();
			}
			else
			{
				this.tokenName = "未知";
			}

		}
		else
		{
			this.tokenName = ex.token != null ? ex.token.getText() : "未知";

		}
	}

	public static void main(String[] args) throws SimpleEvalException
	{
		SimpleRuleEval eval = new SimpleRuleEval("100000/223--*1");
		Object o = eval.calc();
		System.out.println(o);
	}

}

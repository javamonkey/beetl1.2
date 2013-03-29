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
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.RecognitionException;
import org.bee.tl.core.exception.BeeRuntimeException;
import org.bee.tl.core.exception.MVCStrictException;
import org.bee.tl.core.exception.WrapperAntlrLexerException;

/**
 * 简单的打印出哪一行错误，以及上下OFFSET行。bee语法很简单，所以不需要打印出错误原因和位置
 * 而且，现在似乎也很难做到（错误原因），尽管antlr也提供有错误原因，但很容易误导使用者。
 * 
 * @author joelli
 * @since 0.5
 * @see GroupTemplate
 */
public class DefaultErrorHandler extends ErrorHandler
{

	/**
	 * 显示错误行数上下OFFSET行，默认是上下3行
	 */
	public static int OFFSET = 3;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.bee.tl.core.ErrorHandler#processExcption(org.bee.tl.core.BeeException
	 * , java.io.PrintStream)
	 */
	public void processExcption(BeeException beeException, PrintWriter os)
	{
		Throwable ex = beeException.getCause();
		if (ex instanceof BeeRuntimeException)
		{
			runtimeError((BeeRuntimeException) ex, beeException.getResource(), os);
			os.println("=============================================================".intern());
			os.println("错误栈:".intern());

			if (ex.getCause() != null)
			{
				ex.getCause().printStackTrace(os);
			}
			else
			{
				ex.printStackTrace(os);
			}

		}
		else if (ex instanceof WrapperAntlrLexerException)
		{
			handle((RecognitionException) ex.getCause(), beeException.getResource(), os);
			ex.printStackTrace(os);
		}

		else if (ex instanceof RecognitionException)
		{
			handle((RecognitionException) ex, beeException.getResource(), os);
			ex.printStackTrace(os);
		}
		else
		{
			ex.printStackTrace(os);
		}
	}

	protected void runtimeError(BeeRuntimeException ex, Resource resource, PrintWriter os)
	{
		String fileTip = getFileTip(resource);
		try
		{
			os.println("" + ex.detailCode + " ");
			if (ex.getToken().getText().length() != 0)
			{
				os.println(("位于" + ex.token.getLine() + "行，符号 " + ex.token.getText() + fileTip));
			}
			else
			{
				os.println(("位于" + ex.token.getLine() + "行\n"));
			}
			writeLines(ex.token.getLine(), resource, os);

			if (ex.getMsg() != null)
			{
				os.println((ex.getMsg()));
			}

		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void handle(RecognitionException ex, Resource resource, PrintWriter os)
	{

		// ex.printStackTrace();
		String fileTip = getFileTip(resource);
		int errorLine = ex.line;
		try
		{
			if (ex instanceof MVCStrictException)
			{
				os.println((">>严格MVC控制：" + ex.token.getText() + errorLine + " 行" + fileTip));
			}
			else if (ex instanceof MismatchedTokenException)
			{
				MismatchedTokenException misError = (MismatchedTokenException) ex;
				String errorText = null;

				if (misError.expecting != -1)
				{
					errorText = BeeParser.tokenNames[misError.expecting];
				}
				else if (misError.token != null)
				{
					errorText = misError.token.getText();
				}
				else
				{
					errorText = "未知";
				}

				os.println((">>语法错：缺少符号" + errorText + "," + errorLine + " 行" + fileTip));
			}
			else
			{
				String errorText = ex.token != null ? ex.token.getText() : "未知";
				os.println((">>语法错：" + errorText + "," + errorLine + " 行" + fileTip));
			}
			writeLines(errorLine, resource, os);
			os.print(("<<").getBytes());
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void writeLines(int errorLine, Resource resource, PrintWriter os) throws IOException
	{

		int start = errorLine - OFFSET <= 0 ? 1 : (errorLine - OFFSET);
		int end = errorLine + OFFSET;
		String content = resource.getLines(start, end);
		String[] strs = content.split(resource.CR);
		int lineNumber = start;
		for (int i = 0; i < strs.length; i++)
		{
			os.print(("" + lineNumber));
			os.print("|");
			os.println(strs[i]);
			lineNumber++;
		}

	}

	protected String getFileTip(Resource resource)
	{
		// ex.printStackTrace();
		String fileTip = "";
		File file = resource.getFile();
		if (file != null)
		{
			File root = resource.getRoot();
			if (root != null)
			{
				int length = root.toString().length();
				fileTip = file.toString().substring(length);
				fileTip = " 文件 " + fileTip;
			}
			else
			{
				fileTip = file.getName();
				fileTip = " 文件 " + fileTip;
			}

		}
		return fileTip;
	}
}

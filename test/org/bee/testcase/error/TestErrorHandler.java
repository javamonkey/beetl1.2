package org.bee.testcase.error;

import java.io.PrintWriter;

import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.RecognitionException;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.BeeParser;
import org.bee.tl.core.ErrorHandler;
import org.bee.tl.core.exception.BeeRuntimeException;

public class TestErrorHandler extends ErrorHandler
{

	Throwable ex = null;
	int errorLine = 0;
	String token = null;
	//编译版本不定位到token
	public static boolean isCompareToken = true;

	@Override
	public void processExcption(BeeException beeException, PrintWriter os)
	{
		ex = beeException.getCause();
		if (ex instanceof BeeRuntimeException)
		{

		}
		else if (ex instanceof MismatchedTokenException)
		{
			MismatchedTokenException misError = (MismatchedTokenException) ex;
			errorLine = misError.line;
			token = BeeParser.tokenNames[misError.expecting];
		}
		else if (ex instanceof RecognitionException)
		{

			RecognitionException re = (RecognitionException) ex;
			errorLine = re.line;
			token = re.token.getText();
			re.printStackTrace();

		}
		else
		{

		}

	}

	public static TestErrorHandler getExpectedHander(int line, String token, boolean isParserError)
	{
		TestErrorHandler expected = new TestErrorHandler();
		expected.errorLine = line;
		expected.token = token;
		if (isParserError)
		{
			expected.ex = new RecognitionException();
		}
		return expected;

	}

	public boolean equals(Object o)
	{
		TestErrorHandler other = (TestErrorHandler) o;
		if (other.errorLine == errorLine)
		{
			if (isCompareToken)
			{
				return other.token.equals(this.token);
			}
			else
			{
				return true;
			}
		}
		return false;
	}

	public String toString()
	{
		return this.errorLine + ":" + this.token + this.ex;
	}

}

package org.bee.tl.core.exception;

import org.antlr.runtime.RecognitionException;

public class WrapperAntlrLexerException extends RuntimeException
{
	public WrapperAntlrLexerException(RecognitionException ex)
	{
		super(ex);
	}
}

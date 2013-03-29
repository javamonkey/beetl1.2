package org.bee.tl.core.exception;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;

public class MVCStrictException extends RecognitionException {
	
	public MVCStrictException(Token token){
		this.token = token;
		this.line = token.getLine();
	}
	public Token getToken() {
		return token;
	}
	
}

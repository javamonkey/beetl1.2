package org.bee.tl.core.exception;

import org.antlr.runtime.RecognitionException;

public class HTMLTagParserException extends RecognitionException {
	String msg = null;
	public HTMLTagParserException(String message){
		this.msg = message;
		
	}
	public String getHtmlTagErrorMsg(){
		return msg;
	}
}

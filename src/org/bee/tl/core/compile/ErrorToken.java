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
package org.bee.tl.core.compile;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;

/**
 * 出错token以及出错行
 * @author joelli
 * @since 1.1
 */
public class ErrorToken implements Token{
	String tokenName;
	int line;
	public ErrorToken(){
		
	}
	
	public ErrorToken set(String tokenName,int line){
		this.tokenName = tokenName;
		this.line = line ;
		return this ;
	}
	
	
	
	public int getChannel() {
		throw new UnsupportedOperationException();
	}
	public int getCharPositionInLine() {
		throw new UnsupportedOperationException();
	}
	public CharStream getInputStream() {
		throw new UnsupportedOperationException();
	}
	public int getLine() {
		// TODO Auto-generated method stub
		return line;
	}
	public String getText() {
		// TODO Auto-generated method stub
		return tokenName;
	}
	public int getTokenIndex() {
		throw new UnsupportedOperationException();
	}
	public int getType() {
		throw new UnsupportedOperationException();
	}
	public void setChannel(int channel) {
		throw new UnsupportedOperationException();
		
	}
	public void setCharPositionInLine(int pos) {
		throw new UnsupportedOperationException();
		
	}
	public void setInputStream(CharStream input) {
		throw new UnsupportedOperationException();
		
	}
	public void setLine(int line) {
		this.line = line;
		
	}
	public void setText(String text) {
		this.tokenName = text;
		
	}
	public void setTokenIndex(int index) {
		throw new UnsupportedOperationException();
		
	}
	public void setType(int ttype) {
		throw new UnsupportedOperationException();
		
	}

	
}

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

import org.bee.tl.core.io.ByteWriter;

/**
 * 模版变量类型
 * @author joelli
 *
 */
public class SuperVar
{
	ByteWriter writer;
	byte[] bs = null;
	String str = null;

	public SuperVar(ByteWriter writer)
	{
		this.writer = writer;
	}
	
	

	public byte[] toByte()
	{
		if (bs == null)
		{
			try
			{
				writer.flush();
			}
			catch (IOException e)
			{
				// could not happen
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bs = (byte[]) writer.getTempContent();
		}
		return bs;
	}

	public String toString()
	{
		if (str == null)
		{
			try
			{
				writer.flush();
			}
			catch (IOException e)
			{
				// could not happen
				e.printStackTrace();
			}

			str = (String) writer.getTempContent();
		}
		return str;
	}
	
	
}

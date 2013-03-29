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

import java.io.UnsupportedEncodingException;

/** 在Tag基础上，增加了getOutputAsByte方法，便于模版在二进制输出的时候可以直接输出二进制
 * 大部分tag只需要继承Tag实现其getOutput方法就可以了，Beetl内置的include和layout继承了ByteSupportTag
 * 
 * @author lijiazhi
 *
 */
public abstract class ByteSupportTag extends Tag
{
	protected byte[] inputBytes = null;
	protected boolean byteContent = false;
	public static final byte[] NULL_BYTE = new byte[0];

	public void setByteInput(byte[] bs)
	{
		this.inputBytes = bs;
		byteContent = true;
	}

	public String getInput()
	{
		if (input != null)
		{
			return this.input;
		}
		else if (inputBytes != null)
		{
			try
			{
				return new String(inputBytes, group.getCharset());
			}
			catch (UnsupportedEncodingException e)
			{
				throw new RuntimeException(e.getMessage());
			}
		}
		else
		{
			return null;
		}
	}

	public byte[] getInputAsBytes()
	{
		if (inputBytes != null)
		{
			return inputBytes;
		}
		else if (input != null)
		{
			try
			{
				return input.getBytes(group.getCharset());
			}
			catch (UnsupportedEncodingException e)
			{
				throw new RuntimeException(e.getMessage());
			}
		}
		else
		{
			return null;
		}
	}

	public boolean isByteContent()
	{
		return byteContent;
	}

	public void setByteContent(boolean byteContent)
	{
		this.byteContent = byteContent;
	}

	@Override
	public String getOutput()
	{
		try
		{
			return new String(this.getOutputAsByte(), group.getCharset());
		}
		catch (UnsupportedEncodingException e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

	public abstract byte[] getOutputAsByte();
}

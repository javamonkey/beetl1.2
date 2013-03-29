package org.bee.tl.performance;

import java.io.IOException;
import java.io.Writer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class DoNothingWriter extends Writer
{

	Charset cs = null;
	CharsetEncoder en = null;

	public DoNothingWriter(String charsetName)
	{
				cs = Charset.forName(charsetName);
				en = cs.newEncoder();
	}

	public void write(char[] cbuf, int off, int len) throws IOException
	{
				CharBuffer cb = CharBuffer.wrap(cbuf, off, len);
				en.encode(cb);

	}

	public void write(char[] cbuf) throws IOException
	{

				CharBuffer cb = CharBuffer.wrap(cbuf, 0, cbuf.length);
				try
				{
					en.encode(cb);
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}

	}

	public void write(int c) throws IOException
	{

	}

	public void write(long c) throws IOException
	{

	}

	public void write(double c) throws IOException
	{

	}

	public void write(String str) throws IOException
	{
		this.write(str.toCharArray());
	}

	public void write(String str, int off, int len) throws IOException
	{

	}

	public void write(Object o) throws IOException
	{

	}

	public void write(Object o, String funName, String pattern) throws IOException
	{

	}

	public void write(Object o, String funName) throws IOException
	{

	}

	@Override
	public void flush() throws IOException
	{

	}

	@Override
	public void close() throws IOException
	{

	}

}

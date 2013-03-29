package org.bee.tl.core.io;

import java.io.IOException;
import java.io.Writer;

public class NoLockStringWriter extends Writer
{

	StringBuilder buf = new StringBuilder(512);

	@Override
	public void write(char[] cbuf, int off, int len) throws IOException
	{
		buf.append(cbuf, off, len);

	}

	public void write(String str)
	{
		buf.append(str);
	}

	@Override
	public void flush() throws IOException
	{

	}

	@Override
	public void close() throws IOException
	{
		// TODO Auto-generated method stub

	}

	public String toString()
	{
		return buf.toString();
	}

}

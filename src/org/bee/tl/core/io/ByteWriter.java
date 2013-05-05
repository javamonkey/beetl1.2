package org.bee.tl.core.io;

import java.io.IOException;

import org.bee.tl.core.SuperVar;

public abstract class ByteWriter
{

	public abstract void write(char[] cbuf) throws IOException;

	public void write(String str) throws IOException
	{

		if(str!=null)
		this.write(str.toCharArray());
	}

	public abstract void write(byte[] bs) throws IOException;
	
	public abstract void write(SuperVar sv) throws IOException;

	public abstract ByteWriter getTempWriter();

	/*将来也许能优化，避免数组的copy*/
	public abstract Object getTempContent();

	public abstract void flush() throws IOException;

	public abstract ByteWriter getParent();

	public void write(Object o) throws IOException
	{
		if (o != null)
		{
			this.write(o.toString());
		}

	}

	public void write(int c) throws IOException
	{
		this.write(String.valueOf(c));
	}

	public void write(long c) throws IOException
	{
		this.write(String.valueOf(c));
	}

	public void write(double c) throws IOException
	{
		this.write(String.valueOf(c));
	}

	public void write(short c) throws IOException
	{
		this.write(String.valueOf(c));
	}

	public void write(float c) throws IOException
	{
		this.write(String.valueOf(c));
	}

}

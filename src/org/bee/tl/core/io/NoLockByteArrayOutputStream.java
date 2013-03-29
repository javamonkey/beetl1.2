package org.bee.tl.core.io;

import java.io.OutputStream;
import java.util.Arrays;

public class NoLockByteArrayOutputStream extends OutputStream
{

	protected byte buf[];

	protected int count;

	public NoLockByteArrayOutputStream()
	{
		this(32);
	}

	public NoLockByteArrayOutputStream(int size)
	{

		buf = new byte[size];
	}

	public void write(int b)
	{
		int newcount = count + 1;
		if (newcount > buf.length)
		{
			buf = Arrays.copyOf(buf, Math.max(buf.length << 1, newcount));
		}
		buf[count] = (byte) b;
		count = newcount;
	}

	public void write(byte b[], int off, int len)
	{

		int newcount = count + len;
		if (newcount > buf.length)
		{
			buf = Arrays.copyOf(buf, Math.max(buf.length << 1, newcount));
		}
		System.arraycopy(b, off, buf, count, len);
		count = newcount;
	}

	public void reset()
	{
		count = 0;
	}

	public byte toByteArray()[]
	{
		return this.buf;
	}

	public int size()
	{
		return count;
	}

}

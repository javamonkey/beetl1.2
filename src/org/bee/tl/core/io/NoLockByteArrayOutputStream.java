package org.bee.tl.core.io;

import java.io.OutputStream;

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
			buf = copyOf(buf, Math.max(buf.length << 1, newcount));
		}
		buf[count] = (byte) b;
		count = newcount;
	}

	public void write(byte b[], int off, int len)
	{

		int newcount = count + len;
		if (newcount > buf.length)
		{
			buf = copyOf(buf, Math.max(buf.length << 1, newcount));
		}
		System.arraycopy(b, off, buf, count, len);
		count = newcount;
	}
	
	 public static byte[] copyOf(byte[] original, int newLength) {
	        byte[] copy = new byte[newLength];
	        System.arraycopy(original, 0, copy, 0,
	                         Math.min(original.length, newLength));
	        return copy;
	    }

	public void reset()
	{
		count = 0;
	}

	public byte toByteArray()[]
	{
		return copyOf(this.buf,count);
	}

	public int size()
	{
		return count;
	}

}

package org.bee.tl.core.io;

import java.io.IOException;
import java.io.OutputStream;

import org.bee.tl.core.SuperVar;

public class ByteWriter_Byte extends ByteWriter
{

	private OutputStream os;
	private String cs;
	private ByteWriter parent = null;

	public ByteWriter_Byte(OutputStream os, String cs)
	{
		this.os = os;
		this.cs = cs;
	}

	protected ByteWriter_Byte(OutputStream os, String cs, ByteWriter parent)
	{
		this(os, cs);
		this.parent = parent;
	}

	@Override
	public void write(char[] cbuf) throws IOException
	{
		byte[] bs = new String(cbuf).getBytes(cs);
		write(bs);

	}

	@Override
	public void write(byte[] bs) throws IOException
	{
		os.write(bs);

	}

	@Override
	public ByteWriter getTempWriter()
	{
		return new ByteWriter_Byte(new NoLockByteArrayOutputStream(), cs, this);
	}

	@Override
	public Object getTempContent()
	{
		NoLockByteArrayOutputStream bos = (NoLockByteArrayOutputStream) os;
		return bos.buf;
	}

	@Override
	public void flush() throws IOException
	{
		this.os.flush();

	}

	@Override
	public ByteWriter getParent()
	{
		return parent;
	}

	@Override
	public void write(SuperVar sv) throws IOException {
		this.os.write(sv.toByte());
		
	}

}

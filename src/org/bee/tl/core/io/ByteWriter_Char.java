package org.bee.tl.core.io;

import java.io.IOException;
import java.io.Writer;

import org.bee.tl.core.SuperVar;

public class ByteWriter_Char extends ByteWriter
{

	Writer w = null;
	String cs = null;
	ByteWriter parent = null;

	public ByteWriter_Char(Writer w, String cs)
	{
		this.w = w;
		this.cs = cs;
	}

	public ByteWriter_Char(Writer w, String cs, ByteWriter parent)
	{
		this(w, cs);
		this.parent = parent;
	}

	@Override
	public void write(char[] cbuf) throws IOException
	{
		w.write(cbuf);

	}

	@Override
	public void write(byte[] bs) throws IOException
	{
		this.write(new String(bs, cs));

	}

	@Override
	public ByteWriter getTempWriter()
	{
		return new ByteWriter_Char(new NoLockStringWriter(), cs, this);
	}

	@Override
	public Object getTempContent()
	{
		//检查是否是Temp?
		return w.toString();
	}

	@Override
	public void flush() throws IOException
	{
		this.w.flush();

	}

	@Override
	public ByteWriter getParent()
	{
		// TODO Auto-generated method stub
		return parent;
	}

	public String toString()
	{
		return w.toString();
	}

	@Override
	public void write(SuperVar sv) throws IOException {
		this.w.write(sv.toString());
		
	}

}

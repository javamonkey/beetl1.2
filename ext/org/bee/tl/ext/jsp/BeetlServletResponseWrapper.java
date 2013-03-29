package org.bee.tl.ext.jsp;

import java.io.CharArrayWriter;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class BeetlServletResponseWrapper extends HttpServletResponseWrapper
{
	CharArrayWriter cw = null;
	PrintWriter writer = null;

	public BeetlServletResponseWrapper(HttpServletResponse rsp)
	{
		super(rsp);
	}

	public java.io.PrintWriter getWriter()
	{
		if (writer == null)
		{
			cw = new CharArrayWriter();
			writer = new PrintWriter(cw);
		}
		return writer;
	}

	public CharArrayWriter getRealWriter()
	{
		return cw;
	}

}

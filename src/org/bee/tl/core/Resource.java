package org.bee.tl.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

/**
 * 当错误的时候，回读原有文件显示错误。
 * 
 * @author javamonkey
 * @create 2011-9-10
 */
public class Resource
{

	int type = 0;
	String input = null;
	File file = null;
	File root = null;
	String CR = "\n";
	String charset = "GBK";
	Reader resourceReader = null;
	String resourceKey = null;
	long resourceVersion = 0;

	public Resource(String input)
	{
		type = 0;
		this.input = input;
		resourceKey = input;

	}

	public Resource(File file, String charset)
	{
		type = 1;
		this.file = file;
		this.charset = charset;
		this.resourceKey = file.toString();
		this.resourceVersion = file.lastModified();
	}

	public Resource(String child, File root, String charset)
	{
		type = 1;
		this.file = new File(root, child);
		this.charset = charset;
		this.root = root;
		this.resourceKey = child;
		this.resourceVersion = file.lastModified();

	}

	/** 
	 * 设置Resource的回车换行符，用于显示指定错误行数的信息，被Transformator类来设置
	 * @param cr
	 */
	public void setCR(String cr)
	{
		this.CR = cr;
	}

	/**
	 * 得到指定开头行之间的内容，从1行开始
	 * 
	 */
	public String getLines(int start, int end) throws IOException
	{

		char[] cr = this.CR.toCharArray();
		Reader br = getReader();

		int i = 0;
		int line = 1;
		int ch;
		char c;
		boolean hasStart = false;
		StringBuilder sb = new StringBuilder(1024);
		while ((ch = br.read()) != -1)
		{
			c = (char) ch;
			if (!hasStart && line == start)
			{
				hasStart = true;
			}
			if (line == end)
			{

				break;
			}
			if (c == cr[0])
			{
				if (cr.length == 2)
				{
					br.read();
				}
				line++;
				if (hasStart)
					sb.append(CR);
				continue;
			}
			if (hasStart)
			{
				sb.append(c);
			}

		}

		return sb.toString();

	}

	public Reader getReader() throws IOException
	{

		Reader br = null;
		if (type == 0)
		{
			br = new StringReader(this.input);
		}
		else if (type == 1)
		{
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
		}

		return br;
	}

	public File getFile()
	{
		return file;
	}

	public void setFile(File file)
	{
		this.file = file;
	}

	public File getRoot()
	{
		return root;
	}

	public void setRoot(File root)
	{
		this.root = root;
	}

	public String getKey()
	{
		return this.resourceKey;
	}

	public boolean expired()
	{
		if (this.type == 1)
		{
			return this.resourceVersion != this.file.lastModified();
		}
		else
		{
			return false;
		}
	}
}

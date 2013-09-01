package org.bee.tl.core;

import java.io.File;
import java.io.IOException;

import org.bee.tl.core.compile.CompiledClass;
import org.bee.tl.core.io.ByteWriter;

public class WrongCompiledClass extends CompiledClass
{

	long version;
	BeeException parseException;

	public WrongCompiledClass()
	{

	}

	public void init(String child, GroupTemplate group, CoreScriptRunner scriptRunner, Resource resource)
			throws IOException
	{

		File file = new File(group.root, child);
		version = file.lastModified();
		this.scriptRunner = scriptRunner;
		this.resource = resource;

	}

	public void service(ByteWriter out, Context ctx) throws IOException, BeeException
	{
		if (parseException != null)
		{
			throw parseException;
		}
		ctx.set("__pw", out);
		BeeTemplate template = new BeeTemplate(resource, scriptRunner);
		template.setContext(ctx);
		template.getTextByByteWriter(out);
	}

	@Override
	public long getVersion()
	{
		return version;
	}

	public void setVersion(long version)
	{
		this.version = version;
	}

	public BeeException getParseException()
	{
		return parseException;
	}

	public void setParseException(BeeException parseException)
	{
		this.parseException = parseException;
	}

}

package org.bee.testcase.runtime;

import java.io.IOException;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Template;
import org.bee.tl.samples.User;

public class DivdeZeorTestCase extends BasicTestCase
{

	public DivdeZeorTestCase()
	{
		super();

	}

	public void testSimple() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/runtime/divide_template.html");

		String str = t.getTextAsString();

	}

	public void testVarDefined() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/runtime/vardefind_template.html");

		String str = t.getTextAsString();

	}

	public void testVarNotFound() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/runtime/varnotfound_template.html");

		String str = t.getTextAsString();

	}

	public void testNull() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/runtime/null_template.html");
		t.set("user", new User());
		String str = t.getTextAsString();
		//编译

		t = this.gt.getFileTemplate("/runtime/null_template.html");
		t.set("user", new User());
		str = t.getTextAsString();
	}

}

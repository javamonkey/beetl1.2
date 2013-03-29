package org.bee.testcase.directive;

import java.io.IOException;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Template;
import org.bee.tl.samples.User;

public class DirectiveSafeOutputTestCase extends BasicTestCase
{
	public static String DEFAULT_NAME = "测试";

	public DirectiveSafeOutputTestCase()
	{

		super();

	}

	public void testBasic() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/directive/safe_output_template.html");
		User user = new User();
		t.set("user", user);
		String str = t.getTextAsString();
		this.assertEquals(this.getFileContent("/directive/safe_output_expected.html"), str);
		t = this.gt.getFileTemplate("/directive/safe_output_template.html");
		t.set("user", user);
		str = t.getTextAsString();
		this.assertEquals(this.getFileContent("/directive/safe_output_expected.html"), str);
	}

	/*
	public void testBasic2() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/directive/safe_output2_template.html");
		User user = new User();
		t.set("user", user);
		String str = t.getTextAsString();
		this.assertEquals(this.getFileContent("/directive/safe_output2_expected.html"), str);

		t = this.gt.getFileTemplate("/directive/safe_output2_template.html");
		t.set("user", user);
		str = t.getTextAsString();
		this.assertEquals(this.getFileContent("/directive/safe_output2_expected.html"), str);

	}
	*/

}

package org.bee.testcase.exp;

import java.io.IOException;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Context;
import org.bee.tl.core.Format;
import org.bee.tl.core.Function;
import org.bee.tl.core.Template;
import org.bee.tl.samples.User;

public class SafeOutputTestCase extends BasicTestCase
{
	public static String DEFAULT_NAME = "测试";

	public SafeOutputTestCase()
	{

		super();

	}

	public void testBasic() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/exp/safe_output_template.html");
		User user = new User();
		t.set("user", user);
		String str = t.getTextAsString();

		t = this.gt.getFileTemplate("/exp/safe_output_template.html");
		t.set("user", user);
		str = t.getTextAsString();
		this.assertEquals(this.getFileContent("/exp/safe_output_expected.html"), str);
	}

	//
	public void testExist() throws IOException, BeeException
	{
		Template t = this.gt.getFileTemplate("/exp/safe1_output_template.html");
		this.gt.registerFormat("testformat", new Format() {

			public Object format(Object data, String pattern)
			{
				return data;
			}

		});
		this.gt.registerFunction("defaultName", new Function() {

			public String call(Object[] paras, Context ctx)
			{
				return "默认";
			}

		});
		User user = new User();
		t.set("user", user);
		String str = t.getTextAsString();

		t = this.gt.getFileTemplate("/exp/safe1_output_template.html");
		user = new User();
		t.set("user", user);
		str = t.getTextAsString();

		t = this.gt.getFileTemplate("/exp/safe1_output_template.html");
		str = t.getTextAsString();
		this.assertEquals(this.getFileContent("/exp/safe1_output_expected.html"), str);
	}

	//
	public void testVarRef() throws IOException, BeeException
	{
		Template t = this.gt.getFileTemplate("/exp/safe2_output_template.html");

		User user = new User();
		t.set("user", user);
		String str = t.getTextAsString();

		t = this.gt.getFileTemplate("/exp/safe2_output_template.html");
		user = new User();
		t.set("user", user);
		str = t.getTextAsString();

		t = this.gt.getFileTemplate("/exp/safe2_output_template.html");
		str = t.getTextAsString();
		this.assertEquals(this.getFileContent("/exp/safe2_output_expected.html"), str);

	}

	public void testVarRefWrongType() throws IOException, BeeException
	{
		Template t = this.gt.getFileTemplate("/exp/safe_wrongtype_output_template.html");

		User user = new User();
		t.set("user", user);
		String str = t.getTextAsString();

		t = this.gt.getFileTemplate("/exp/safe_wrongtype_output_template.html");
		user = new User();
		t.set("user", user);
		str = t.getTextAsString();

		t = this.gt.getFileTemplate("/exp/safe_wrongtype_output_template.html");
		str = t.getTextAsString();
		this.assertEquals(this.getFileContent("/exp/safe_wrongtype_output_expected.html"), str);

	}

	public void testString() throws IOException, BeeException
	{
		//确保编译
		Template t = this.gt.getFileTemplate("/exp/safe_string_output_template.html");
		t.set("a", "123");
		t.set("b", "123");
		t.set("c", "123");
		String str = t.getTextAsString();

		t = this.gt.getFileTemplate("/exp/safe_string_output_template.html");
		t.set("a", "");
		t.set("b", null);
		//		t.set("c", "123");		
		str = t.getTextAsString();
		this.assertEquals(this.getFileContent("/exp/safe_string_output_expected.html"), str);

		t = this.gt.getFileTemplate("/exp/safe_string_output_template.html");
		t.set("a", "");
		t.set("b", null);
		//		t.set("c", "123");		
		str = t.getTextAsString();
		this.assertEquals(this.getFileContent("/exp/safe_string_output_expected.html"), str);

	}

}

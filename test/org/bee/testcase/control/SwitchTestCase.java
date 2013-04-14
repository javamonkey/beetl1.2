package org.bee.testcase.control;

import java.io.IOException;

import junit.framework.Assert;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Template;
import org.bee.tl.samples.User;

public class SwitchTestCase extends BasicTestCase
{
	public SwitchTestCase()
	{
		super();
		

	}

	public void testSimple() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/control/switch_template.html");
		User user = new User();
		user.setAge(19);
		user.setName("joel");
		t.set("user", user);
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/control/switch_expected.html"), str);
		//第二次预编译
		t = this.gt.getFileTemplate("/control/switch_template.html");
		user = new User();
		user.setAge(19);
		user.setName("joel");
		t.set("user", user);
		str = t.getTextAsString();

		Assert.assertEquals(this.getFileContent("/control/switch_expected.html"), str);
	}

	public void testSimple1() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/control/switch1_template.html");
		User user = new User();
		user.setAge(19);
		user.setName("joel");
		t.set("user", user);
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/control/switch1_expected.html"), str);
		//第二次预编译
		t = this.gt.getFileTemplate("/control/switch1_template.html");
		user = new User();
		user.setAge(19);
		user.setName("joel");
		t.set("user", user);
		str = t.getTextAsString();

		Assert.assertEquals(this.getFileContent("/control/switch1_expected.html"), str);
	}
	
	
	
	public void testSimple2() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/control/switch_default_template.html");
		User user = new User();
		user.setAge(55);
		user.setName("joel");
		t.set("user", user);
		String str = t.getTextAsString();

		//第二次预编译
		t = this.gt.getFileTemplate("/control/switch_default_template.html");
		user = new User();
		user.setAge(55);
		user.setName("joel");
		t.set("user", user);
		str = t.getTextAsString();

		Assert.assertEquals(this.getFileContent("/control/switch_default_expected.html"), str);
	}


}

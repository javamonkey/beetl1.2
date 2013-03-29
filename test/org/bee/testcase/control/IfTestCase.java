package org.bee.testcase.control;

import java.io.IOException;

import junit.framework.Assert;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Template;
import org.bee.tl.samples.User;

public class IfTestCase extends BasicTestCase
{
	public IfTestCase()
	{
		super();
		//		this.gt.setDebug(true);
		//		this.gt.enableOptimize();

	}

	public void testSimple() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/control/if_template.html");
		User user = new User();
		user.setAge(19);
		user.setName("joel");
		t.set("user", user);
		String str = t.getTextAsString();

		//第二次预编译
		t = this.gt.getFileTemplate("/control/if_template.html");
		user = new User();
		user.setAge(19);
		user.setName("joel");
		t.set("user", user);
		str = t.getTextAsString();

		Assert.assertEquals(this.getFileContent("/control/if_expected.html"), str);
	}

	public void testSimple1() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/control/if1_template.html");
		User user = new User();
		user.setAge(19);
		user.setName("joel");
		t.set("user", user);
		String str = t.getTextAsString();

		//第二次预编译
		t = this.gt.getFileTemplate("/control/if1_template.html");
		user = new User();
		user.setAge(19);
		user.setName("joel");
		t.set("user", user);
		str = t.getTextAsString();

		Assert.assertEquals(this.getFileContent("/control/if1_expected.html"), str);
	}

	public void testSimple2() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/control/ifif_template.html");
		User user = new User();
		user.setAge(18);
		user.setName("joel");
		t.set("user", user);
		String str = t.getTextAsString();

		//第二次预编译
		t = this.gt.getFileTemplate("/control/ifif_template.html");
		user = new User();
		user.setAge(18);
		user.setName("joel");
		t.set("user", user);
		str = t.getTextAsString();

		Assert.assertEquals(this.getFileContent("/control/ifif_expected.html"), str);
	}

	public void testNull() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/control/ifnull_template.html");
		t.set("name", "hello");
		String str = t.getTextAsString();
		
		
		t = this.gt.getFileTemplate("/control/ifnull_template.html");
		t.set("name", null);
		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/control/ifnull_expected.html"), str);
		//第二次预编译
		t = this.gt.getFileTemplate("/control/ifnull_template.html");
		t.set("name", null);
		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/control/ifnull_expected.html"), str);

	}

}

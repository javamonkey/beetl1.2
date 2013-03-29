package org.bee.testcase.nat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import junit.framework.Assert;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Template;
import org.bee.tl.samples.User;

public class NativeTestCase2 extends BasicTestCase
{
	List<User> list = new ArrayList<User>();
	Map<Integer, User> map = new TreeMap<Integer, User>();
	User[] users = new User[2];
	User joel = new User();
	User lucy = new User();

	public NativeTestCase2()
	{
		super();

		joel = new User();
		joel.setId(1);
		joel.setAge(19);
		joel.setName("joel");
		joel.setNickName("javamonkey");

		lucy = new User();
		lucy.setAge(17);
		lucy.setName("lucy");
		list.add(lucy);
		joel.setFriend(list);

	}

	public void testSimple() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/nat/user_method_call_template.html");

		t.set("user", joel);
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/nat/user_method_call_expected.html"), str);
		t = this.gt.getFileTemplate("/nat/user_method_call_template.html");

		t.set("user", joel);
		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/nat/user_method_call_expected.html"), str);

	}

	public void testPersion() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/nat/person_method_call_template.html");

		t.set("user1", joel);
		t.set("user2", lucy);
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/nat/person_method_call_expected.html"), str);
		t = this.gt.getFileTemplate("/nat/person_method_call_template.html");

		t.set("user1", joel);
		t.set("user2", lucy);
		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/nat/person_method_call_expected.html"), str);

	}

}

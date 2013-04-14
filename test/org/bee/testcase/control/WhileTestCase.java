package org.bee.testcase.control;

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

public class WhileTestCase extends BasicTestCase
{
	List<User> list = new ArrayList<User>();
	Map<Integer, User> map = new TreeMap<Integer, User>();
	User[] users = new User[2];

	public WhileTestCase()
	{
		super();

		User user = new User();
		user.setId(1);
		user.setAge(19);
		user.setName("joel");
		list.add(user);
		map.put(user.getId(), user);
		users[0] = user;
		user = new User();
		user.setAge(17);
		user.setName("lucy");
		list.add(user);
		users[1] = user;
		map.put(user.getId(), user);

	}

	public void testSimple() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/control/while_template.html");
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/control/while_expected.html"), str);

		//第二次预编译
				t = this.gt.getFileTemplate("/control/while_template.html");
				str = t.getTextAsString();
				Assert.assertEquals(this.getFileContent("/control/while_expected.html"), str);

	}

	
}

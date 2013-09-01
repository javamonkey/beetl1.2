package org.bee.testcase.control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import junit.framework.Assert;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Template;
import org.bee.tl.samples.User;

public class ElseForTestCase extends BasicTestCase
{
	List<User> list = new ArrayList<User>();
	List<User> emptyList = new ArrayList<User>();
	Map<Object, Object> map = new TreeMap<Object, Object>();
	User[] users = new User[2];

	public ElseForTestCase()
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

		Template t = this.gt.getFileTemplate("/control/elsefor_template.html");
		t.set("list", list);
		String str = t.getTextAsString();

		// 第二次预编译
		t = this.gt.getFileTemplate("/control/elsefor_template.html");
		t.set("list", emptyList);
		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/control/elsefor_expected.html"), str);

	}

	public void testSimple1() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/control/elsefor1_template.html");
		t.set("list", list);
		String str = t.getTextAsString();

		// 第二次预编译
		t = this.gt.getFileTemplate("/control/elsefor1_template.html");
		t.set("list", null);
		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/control/elsefor1_expected.html"), str);
	}

	public void testSimple3() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/control/elsefor2_template.html");
		t.set("list", new TestIterable(list));
		String str = t.getTextAsString();
		System.out.println(str);

		// 第二次预编译
		t = this.gt.getFileTemplate("/control/elsefor2_template.html");
		t.set("list", new TestIterable(new ArrayList()));
		str = t.getTextAsString();
		System.out.println(str);
		Assert.assertEquals(this.getFileContent("/control/elsefor2_expected.html"), str);
	}

	public List getUserList()
	{
		return list;
	}

	public Map getUserMap()
	{
		return map;

	}

	static class TestIterable implements Iterable
	{

		Iterator it = null;

		TestIterable(List list)
		{
			it = list.iterator();
		}

		public Iterator iterator()
		{
			return it;
		}

	}

}

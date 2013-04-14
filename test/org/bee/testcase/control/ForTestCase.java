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

public class ForTestCase extends BasicTestCase
{
	List<User> list = new ArrayList<User>();
	Map<Object, Object> map = new TreeMap<Object, Object>();
	User[] users = new User[2];

	public ForTestCase()
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

//	public void testSimple() throws IOException, BeeException
//	{
//
//		Template t = this.gt.getFileTemplate("/control/for_template.html");
//		t.set("list", list);
//		String str = t.getTextAsString();
//
//		// 第二次预编译
//		t = this.gt.getFileTemplate("/control/for_template.html");
//		t.set("list", list);
//		str = t.getTextAsString();
//		Assert.assertEquals(this.getFileContent("/control/for_expected.html"), str);
//
//	}

	public void testSimple1() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/control/for1_template.html");
		t.set("list", list);
		String str = t.getTextAsString();

		// 第二次预编译
		t = this.gt.getFileTemplate("/control/for1_template.html");
		t.set("list", list);
		str = t.getTextAsString();

		Assert.assertEquals(this.getFileContent("/control/for1_expected.html"), str);
	}

	public void testSimple2() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/control/for2_template.html");
		t.set("map", map);
		String str = t.getTextAsString();

		// 第二次预编译
		t = this.gt.getFileTemplate("/control/for2_template.html");
		t.set("map", map);
		str = t.getTextAsString();

		Assert.assertEquals(this.getFileContent("/control/for2_expected.html"), str);
	}

	public void testSimple3() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/control/for3_template.html");
		t.set("array", users);
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/control/for3_expected.html"), str);

		// 第二次预编译
		t = this.gt.getFileTemplate("/control/for3_template.html");
		t.set("array", users);
		str = t.getTextAsString();

		Assert.assertEquals(this.getFileContent("/control/for3_expected.html"), str);
	}

	public void testSimple4() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/control/for4_template.html");
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		t.set("list", list);
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/control/for4_expected.html"), str);

		// 第二次预编译
		t = this.gt.getFileTemplate("/control/for4_template.html");
		t.set("list", list);
		str = t.getTextAsString();

		Assert.assertEquals(this.getFileContent("/control/for4_expected.html"), str);
	}

	public void testSimple5() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/control/for5_template.html");
		t.set("list", new TestIterable(list));
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/control/for1_expected.html"), str);

		// 第二次预编译
		t = this.gt.getFileTemplate("/control/for5_template.html");
		t.set("list", new TestIterable(list));
		str = t.getTextAsString();

		Assert.assertEquals(this.getFileContent("/control/for1_expected.html"), str);
	}

	public void testBreak() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/control/break_template.html");
		t.set("list", list);
		String str = t.getTextAsString();

		// 第二次预编译
		t = this.gt.getFileTemplate("/control/break_template.html");
		t.set("list", list);
		str = t.getTextAsString();

		Assert.assertEquals(this.getFileContent("/control/break_expected.html"), str);
	}

	//
	//
	public void testReturn() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/control/return_template.html");
		t.set("list", list);
		String str = t.getTextAsString();

		// 第二次预编译
		t = this.gt.getFileTemplate("/control/return_template.html");
		t.set("list", list);
		str = t.getTextAsString();

		Assert.assertEquals(this.getFileContent("/control/return_expected.html"), str);
	}

	public void testContinue() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/control/continue_template.html");
		t.set("list", list);
		String str = t.getTextAsString();

		// 第二次预编译
		t = this.gt.getFileTemplate("/control/continue_template.html");
		t.set("list", list);
		str = t.getTextAsString();

		Assert.assertEquals(this.getFileContent("/control/continue_expected.html"), str);
	}

	public void testNull() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/control/fornull_template.html");
		t.set("list", list);
		String str = t.getTextAsString();

		// 第二次预编译
		t = this.gt.getFileTemplate("/control/fornull_template.html");
		t.set("list", null);
		str = t.getTextAsString();

		Assert.assertEquals(this.getFileContent("/control/fornull_expected.html"), str);
	}

	public void testNative() throws IOException, BeeException
	{

		ForTestCase service = new ForTestCase();

		Template t = this.gt.getFileTemplate("/control/fornative2_template.html");
		t.set("service", service);
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/control/fornative2_expected.html"), str);

		// 第二次预编译
		t = this.gt.getFileTemplate("/control/fornative2_template.html");
		t.set("service", service);
		str = t.getTextAsString();

		Assert.assertEquals(this.getFileContent("/control/fornative2_expected.html"), str);
	}

	public void testNative3() throws IOException, BeeException
	{

		ForTestCase service = new ForTestCase();

		Template t = this.gt.getFileTemplate("/control/fornative3_template.html");
		t.set("service", service);
		String str = t.getTextAsString();

		// 第二次预编译
		t = this.gt.getFileTemplate("/control/fornative3_template.html");
		t.set("service", service);
		str = t.getTextAsString();

		Assert.assertEquals(this.getFileContent("/control/fornative3_expected.html"), str);

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

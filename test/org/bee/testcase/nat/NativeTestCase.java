package org.bee.testcase.nat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import junit.framework.Assert;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Template;
import org.bee.tl.samples.User;

public class NativeTestCase extends BasicTestCase
{
	List<User> list = new ArrayList<User>();
	Map<Integer, User> map = new TreeMap<Integer, User>();
	User[] users = new User[2];

	public NativeTestCase()
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

		Template t = this.gt.getFileTemplate("/nat/native_method_call_template.html");
		User user = new User();
		user.setName("joel");
		t.set("user", user);
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/nat/native_method_call_expected.html"), str);
		t = this.gt.getFileTemplate("/nat/native_method_call_template.html");

		t.set("user", user);
		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/nat/native_method_call_expected.html"), str);

	}

	//
	public void testStaticCall() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/nat/static_method_call_template.html");
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/nat/static_method_call_expected.html"), str);
		t = this.gt.getFileTemplate("/nat/static_method_call_template.html");
		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/nat/static_method_call_expected.html"), str);

	}

	//
	public void testStaticCallMap() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/nat/map_method_call_template.html");
		Map<String, String> map = new HashMap<String, String>();
		map.put("key", "value");
		t.set("map", map);
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/nat/map_method_call_expected.html"), str);

		t = this.gt.getFileTemplate("/nat/map_method_call_template.html");
		t.set("map", map);
		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/nat/map_method_call_expected.html"), str);

	}

	public void testStaticCallIntMap() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/nat/mapInt_method_call_template.html");
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(12, "value");
		t.set("map", map);
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/nat/mapInt_method_call_expected.html"), str);
		//预编译
		t = this.gt.getFileTemplate("/nat/mapInt_method_call_template.html");
		t.set("map", map);
		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/nat/mapInt_method_call_expected.html"), str);

	}

	public void testPublicAccess() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/nat/property_access_template.html");
		User user = new User();
		user.id = 15;
		t.set("user", user);
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/nat/property_access_expected.html"), str);

		//预编译
		t = this.gt.getFileTemplate("/nat/property_access_template.html");
		t.set("user", user);
		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/nat/property_access_expected.html"), str);

	}

	public void testStaticPublicAccess() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/nat/property_static_template.html");
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/nat/property_static_expected.html"), str);
		//预编译
		t = this.gt.getFileTemplate("/nat/property_static_template.html");
		Assert.assertEquals(this.getFileContent("/nat/property_static_expected.html"), str);

	}

}

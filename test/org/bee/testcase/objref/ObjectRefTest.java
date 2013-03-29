package org.bee.testcase.objref;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Template;
import org.bee.tl.samples.User;

public class ObjectRefTest extends BasicTestCase
{

	public void testSimple() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/objref/objref_template.html");
		User user = new User();
		t.set("user", user);
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/objref/objref_expected.html"), str);
		//second for compile 

		t = this.gt.getFileTemplate("/objref/objref_template.html");
		t.set("user", user);
		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/objref/objref_expected.html"), str);

	}

	public void testMap() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/objref/objMapref_template.html");
		Map map = new HashMap();
		map.put("user", new User());
		t.setRawValue("map", map);
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/objref/objMapref_expected.html"), str);

		//second for compile 

		t = this.gt.getFileTemplate("/objref/objMapref_template.html");
		t.setRawValue("map", map);
		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/objref/objMapref_expected.html"), str);

	}

	//	public void testVarObject() throws IOException, BeeException
	//	{
	//
	//		Template t = this.gt.getFileTemplate("/objref/objVar_template.html");
	//		User user = new User();
	//		User wife = new User();
	//		wife.setName("lucy");
	//		user.setWife(wife);
	//		Map map = new HashMap();
	//		map.put("user", user);
	//		t.setRawValue ("map", map);
	//		String str = t.getTextAsString();
	//		Assert.assertEquals(this
	//				.getFileContent("/objref/objVar_expected.html"),
	//				str);
	//		
	//
	//		//second for compile 
	//
	//		t = this.gt.getFileTemplate("/objref/objVar_template.html");
	//		t.setRawValue ("map", map);
	//		str = t.getTextAsString();
	//		Assert.assertEquals(this
	//				.getFileContent("/objref/objVar_expected.html"),
	//				str);
	//
	//		
	//	}

}

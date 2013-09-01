package org.bee.testcase.exp;

import java.io.IOException;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Template;

public class VarRefTestCase extends BasicTestCase
{
	public VarRefTestCase()
	{
		super();
		// this.gt.enableOptimize();
	}

	//	public void testVarRef() throws IOException, BeeException
	//	{
	//		Template t = this.gt.getFileTemplate("/exp/ref_template.html");
	//		List<User> list = new ArrayList<User>();
	//		User user = new User();
	//		user.setName("joel");
	//		User friend = new User();
	//		friend.setName("lucy");
	//		user.getFriend().add(friend);
	//		user.getBooks().put("java", "thinking java");
	//		list.add(user);
	//		t.set("list", list);
	//		String str = t.getTextAsString();
	//
	//		t = this.gt.getFileTemplate("/exp/ref_template.html");
	//		t.set("list", list);
	//		str = t.getTextAsString();
	//		this.assertEquals(this.getFileContent("/exp/ref_expected.html"), str);
	//
	//	}
	//
	//	public void testComplex() throws IOException, BeeException
	//	{
	//
	//		Template t = this.gt.getFileTemplate("/exp/exp_complex_template.html");
	//		String str = t.getTextAsString();
	//		this.assertEquals(this.getFileContent("/exp/exp_complex_expected.html"), str);
	//	}
	//
	//	public void testBig() throws IOException, BeeException
	//	{
	//
	//		Template t = this.gt.getFileTemplate("/exp/exp_big_template.html");
	//		String str = t.getTextAsString();
	//		this.assertEquals(this.getFileContent("/exp/exp_big_expected.html"), str);
	//	}
	//
	//	public void testReadOnly() throws IOException, BeeException
	//	{
	//
	//		Template t = this.gt.getFileTemplate("/exp/readonly_template.html");
	//		User user = new User();
	//		t.set("user", user);
	//		String str = t.getTextAsString();
	//		this.assertEquals(this.getFileContent("/exp/readonly_expected.html"), str);
	//
	//		t = this.gt.getFileTemplate("/exp/readonly_template.html");
	//		t.set("user", user);
	//		str = t.getTextAsString();
	//		this.assertEquals(this.getFileContent("/exp/readonly_expected.html"), str);
	//	}
	//
	//	public void testSuperVar() throws IOException, BeeException
	//	{
	//
	//		Template t = this.gt.getFileTemplate("/exp/superVar_template.html");
	//
	//		String str = t.getTextAsString();
	//		this.assertEquals(this.getFileContent("/exp/superVar_expected.html"), str);
	//
	//		t = this.gt.getFileTemplate("/exp/superVar_template.html");
	//
	//		str = t.getTextAsString();
	//		this.assertEquals(this.getFileContent("/exp/superVar_expected.html"), str);
	//	}

	public void testJson() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/exp/json_template.html");

		String str = t.getTextAsString();
		this.assertEquals(this.getFileContent("/exp/json_expected.html"), str);

		t = this.gt.getFileTemplate("/exp/json_template.html");

		str = t.getTextAsString();
		this.assertEquals(this.getFileContent("/exp/json_expected.html"), str);
	}

}

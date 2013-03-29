package org.bee.testcase.exp;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Template;

public class CondtionExpTestCase extends BasicTestCase
{
	public CondtionExpTestCase()
	{

		super();
//		this.gt.setDebug(true);
//		this.gt.enableOptimize();
	}

	public void testBasic() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/exp/condition_template.html");
		t.set("f", 0d);
		t.set("g", 12);
		String str = t.getTextAsString();

		t = this.gt.getFileTemplate("/exp/condition_template.html");
		t.set("f", 0d);
		t.set("g", 12);
		str = t.getTextAsString();
		this.assertEquals(this.getFileContent("/exp/condition_expected.html"), str);
	}
	
	public void testRawBasic() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/exp/conditionObject_template.html");
		Map map = new HashMap();
		map.put("size", 16);
		map.put("id", "34544545");
		t.setRawValue("session", map);
		
		String str = t.getTextAsString();
		this.assertEquals(this.getFileContent("/exp/conditionObject_expected.html"), str);
		
		t = this.gt.getFileTemplate("/exp/conditionObject_template.html");
		t.setRawValue("session", map);
		str = t.getTextAsString();
		this.assertEquals(this.getFileContent("/exp/conditionObject_expected.html"), str);
	}
	
	
	public void testRawArth() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/exp/arthObject_template.html");
		Map map = new HashMap();
		map.put("a", 16);
		map.put("b", 4);
		t.setRawValue("session", map);
		
		String str = t.getTextAsString();
		this.assertEquals(this.getFileContent("/exp/arthObject_expected.html"), str);
		
		t = this.gt.getFileTemplate("/exp/arthObject_template.html");
		t.setRawValue("session", map);
		str = t.getTextAsString();
		this.assertEquals(this.getFileContent("/exp/arthObject_expected.html"), str);
	}
	

}

package org.bee.testcase.strtemplate;

import java.io.IOException;

import junit.framework.Assert;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;

public class StrTemplateTestCase extends BasicTestCase
{
	public void testSimple() throws IOException, BeeException
	{

		//		System.setProperty("BEETL_EXTRA_CLASSPATH", "c:/affd;d:/ddff/xx.jar");
		String input = "${a}";
		GroupTemplate gt = new GroupTemplate();
		gt.enableOptimize();
		Template t = gt.getStringTemplate(input, "aaa");
		t.set("a", 15);
		String result = t.getTextAsString();
		Assert.assertEquals("15", result);

		t = gt.getStringTemplate(input, "aaa");
		t.set("a", 15);
		result = t.getTextAsString();
		Assert.assertEquals("15", result);

		gt.removeTemplateCache("aaa");

		t = gt.getStringTemplate(input, "aaa");
		t.set("a", 15);
		result = t.getTextAsString();
		Assert.assertEquals("15", result);

		t = gt.getStringTemplate(input, "aaa");
		t.set("a", 15);
		result = t.getTextAsString();
		Assert.assertEquals("15", result);

	}
}

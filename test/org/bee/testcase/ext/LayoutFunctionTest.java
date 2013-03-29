package org.bee.testcase.ext;

import java.io.IOException;

import junit.framework.Assert;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.DefaultErrorHandler;
import org.bee.tl.core.Template;

public class LayoutFunctionTest extends BasicTestCase
{
	public LayoutFunctionTest()
	{
		super();

	}

	public void testLayout() throws IOException, BeeException
	{

		this.gt.setErrorHandler(null);
		try
		{
			Template t = this.gt.getFileTemplate("/ext/layout_child_template.html");
			t.set("name", "joel");
			t.set("b", 1);
			String str = t.getTextAsString();

		//	Assert.assertEquals(this.getFileContent("/ext/layout_expected.html"), str);
			// 第二次预编译
			t = this.gt.getFileTemplate("/ext/layout_child_template.html");
			t.set("name", "joel");
			t.set("b", 0);
			str = t.getTextAsString();
		//	Assert.assertEquals(this.getFileContent("/ext/layout_expected.html"), str);
		}
		catch (BeeException ex)
		{
			DefaultErrorHandler h = new DefaultErrorHandler();
			h.processExcption(ex);
		}

	}

	//	public void testComplexLayout() throws IOException, BeeException
	//	{
	//
	//		this.gt.setErrorHandler(null);
	//		try
	//		{
	//			Template t = this.gt.getFileTemplate("/ext/complex_child_layout_template.html");
	//
	//			String str = t.getTextAsString();
	//
	//			Assert.assertEquals(this.getFileContent("/ext/complex_layout_expected.html"), str);
	//			// 第二次预编译
	//			t = this.gt.getFileTemplate("/ext/complex_child_layout_template.html");
	//			t.set("name", "joel");
	//			t.set("b", 0);
	//			str = t.getTextAsString();
	//			Assert.assertEquals(this.getFileContent("/ext/complex_layout_expected.html"), str);
	//		}
	//		catch (BeeException ex)
	//		{
	//			DefaultErrorHandler h = new DefaultErrorHandler();
	//			h.processExcption(ex);
	//		}
	//
	//	}
}
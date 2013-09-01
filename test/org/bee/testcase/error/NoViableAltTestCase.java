package org.bee.testcase.error;

import java.io.IOException;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Template;

public class NoViableAltTestCase extends BasicTestCase
{

	public NoViableAltTestCase()
	{
		super();

		//		this.gt.setDebug(true);
		//		this.gt.enableOptimize();

	}

		public void testMissKey() throws IOException, BeeException
		{
			TestErrorHandler h = new TestErrorHandler();
			this.gt.setErrorHandler(h);
			Template t = this.gt.getFileTemplate("/error/miss/equal_template.html");
			TestErrorHandler expected = TestErrorHandler.getExpectedHander(3, "=", true);
			t.getTextAsString();
//			Assert.assertEquals(expected, h);
		}

	public void testMissChar() throws IOException, BeeException
	{
		//		TestErrorHandler h = new TestErrorHandler();
		//		this.gt.setErrorHandler(h);
		Template t = this.gt.getFileTemplate("/error/miss/quota_template.html");
		TestErrorHandler expected = TestErrorHandler.getExpectedHander(3, "\"", true);
		t.getTextAsString();
		//		Assert.assertEquals(expected, h);
	}

}

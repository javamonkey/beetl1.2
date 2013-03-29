package org.bee.testcase.error;

import java.io.IOException;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Template;

public class InvalidTestCase extends BasicTestCase
{

	public InvalidTestCase()
	{
		super();

		//		this.gt.setDebug(true);
		//		this.gt.enableOptimize();

	}

	public void testSimple() throws IOException, BeeException
	{

		TestErrorHandler h = new TestErrorHandler();
		this.gt.setErrorHandler(h);
		Template t = this.gt.getFileTemplate("/error/invalid/invalid_template.html");
		TestErrorHandler expected = TestErrorHandler.getExpectedHander(2, "k_", true);
		t.getTextAsString();
		//		Assert.assertEquals(expected, h);
	}

}

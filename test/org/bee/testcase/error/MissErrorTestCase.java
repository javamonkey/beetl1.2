package org.bee.testcase.error;

import java.io.IOException;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Template;

public class MissErrorTestCase extends BasicTestCase
{

	public MissErrorTestCase()
	{
		super();

		//		this.gt.setDebug(true);
		//		this.gt.enableOptimize();

	}

	public void testSimple() throws IOException, BeeException
	{

		//		TestErrorHandler h = new TestErrorHandler();
		//		this.gt.setErrorHandler(h);
		Template t = this.gt.getFileTemplate("/error/miss/var_template.html");
		TestErrorHandler expected = TestErrorHandler.getExpectedHander(5, "';'", true);
		t.getTextAsString();
		//		Assert.assertEquals(expected, h);
	}

	public void testBlock() throws IOException, BeeException
	{
		//		TestErrorHandler h = new TestErrorHandler();
		//		this.gt.setErrorHandler(h);
		Template t = this.gt.getFileTemplate("/error/miss/block_template.html");
		TestErrorHandler expected = TestErrorHandler.getExpectedHander(3, "')'", true);
		t.getTextAsString();
		//		Assert.assertEquals(expected, h);

	}
}

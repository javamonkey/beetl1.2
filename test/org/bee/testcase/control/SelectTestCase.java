package org.bee.testcase.control;

import java.io.IOException;

import junit.framework.Assert;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Template;

public class SelectTestCase extends BasicTestCase {
	public SelectTestCase() {
		super();

	}

	// public void testSimple() throws IOException, BeeException
	// {
	//
	// Template t = this.gt.getFileTemplate("/control/select_template.html");
	// String str = t.getTextAsString();
	// Assert.assertEquals(this.getFileContent("/control/select_expected.html"),
	// str);
	// //第二次编译
	// t = this.gt.getFileTemplate("/control/select_template.html");
	// str = t.getTextAsString();
	// Assert.assertEquals(this.getFileContent("/control/select_expected.html"),
	// str);
	// }

	public void testSimple2() throws IOException, BeeException {

		Template t = this.gt.getFileTemplate("/control/select2_template.html");
		String str = t.getTextAsString();
		Assert.assertEquals(
				this.getFileContent("/control/select2_expected.html"), str);
		// 第二次编译
		t = this.gt.getFileTemplate("/control/select2_template.html");
		str = t.getTextAsString();
		Assert.assertEquals(
				this.getFileContent("/control/select2_expected.html"), str);
	}

}

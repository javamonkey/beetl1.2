package org.bee.testcase.ext;

import java.io.IOException;

import junit.framework.Assert;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Template;

public class IncludeFunctionTest extends BasicTestCase {
	public IncludeFunctionTest() {
		super();

	}

	public void testIncludeFile() throws IOException, BeeException {

		Template t = this.gt.getFileTemplate("/ext/master_template.html");
		t.set("name", "joel");
		String str = t.getTextAsString();

		// Assert.assertEquals(this.getFileContent("/ext/master_expected.html"),
		// str);
		// 第二次预编译
		t = this.gt.getFileTemplate("/ext/master_template.html");
		t.set("name", "joel");
		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/ext/master_expected.html"),
				str);
	}
}
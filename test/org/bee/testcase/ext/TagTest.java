package org.bee.testcase.ext;

import java.io.IOException;

import junit.framework.Assert;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Template;
import org.bee.tl.ext.DeleteTag;

public class TagTest extends BasicTestCase
{
	public TagTest()
	{
		super();
	

	}

	public void testDeleteTag() throws IOException, BeeException
	{
		this.gt.registerTag("test.delTag", DeleteTag.class);
		Template t = this.gt.getFileTemplate("/ext/tag_template.html");
		String str = t.getTextAsString();
		int i = 0;
		Assert.assertEquals(this.getFileContent("/ext/tag_expected.html"), str);
		
	}
}
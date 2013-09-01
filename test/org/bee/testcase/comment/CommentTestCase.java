package org.bee.testcase.comment;

import java.io.IOException;

import junit.framework.Assert;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Template;

public class CommentTestCase extends BasicTestCase
{

	public CommentTestCase()
	{

	}

	public void testSimple() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/comment/comment1_template.html");
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/comment/comment1_expected.html"), str);
		//第二次预编译
		t = this.gt.getFileTemplate("/comment/comment1_template.html");

		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/comment/comment1_expected.html"), str);

	}

//	public void testSimple2() throws IOException, BeeException
//	{
//
//		Template t = this.gt.getFileTemplate("/comment/comment2_template.html");
//		String str = t.getTextAsString();
//		Assert.assertEquals(this.getFileContent("/comment/comment2_expected.html"), str);
//		//第二次预编译
//		t = this.gt.getFileTemplate("/comment/comment2_template.html");
//
//		str = t.getTextAsString();
//		Assert.assertEquals(this.getFileContent("/comment/comment2_expected.html"), str);
//
//	}
//
//	public void testSimple3() throws IOException, BeeException
//	{
//
//		Template t = this.gt.getFileTemplate("/comment/comment3_template.html");
//		String str = t.getTextAsString();
//		Assert.assertEquals(this.getFileContent("/comment/comment3_expected.html"), str);
//		//第二次预编译
//		t = this.gt.getFileTemplate("/comment/comment3_template.html");
//
//		str = t.getTextAsString();
//		Assert.assertEquals(this.getFileContent("/comment/comment3_expected.html"), str);
//
//	}

}

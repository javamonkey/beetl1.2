package org.bee.testcase.html;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import junit.framework.Assert;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.ByteSupportTag;
import org.bee.tl.core.Template;

public class HtmlTagTestCase extends BasicTestCase
{

	public HtmlTagTestCase()
	{
		
	}

	public void testSimple() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/htmltag/simpletag_template.html");
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/htmltag/simpletag_expected.html"), str);
		//第二次预编译
		t = this.gt.getFileTemplate("/htmltag/simpletag_template.html");

		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/htmltag/simpletag_expected.html"), str);

	}

	
//	public void testNested() throws IOException, BeeException
//	{
//
//		Template t = this.gt.getFileTemplate("/htmltag/nestedtag_template.html");
//		String str = t.getTextAsString();
//		Assert.assertEquals(this.getFileContent("/htmltag/nestedtag_expected.html"), str);
//		//第二次预编译
//		t = this.gt.getFileTemplate("/htmltag/nestedtag_template.html");
//
//		str = t.getTextAsString();
//		Assert.assertEquals(this.getFileContent("/htmltag/nestedtag_expected.html"), str);
//
//	}
//	
//	public void testUnformat() throws IOException, BeeException
//	{
//
//		Template t = this.gt.getFileTemplate("/htmltag/unformated_template.html");
//		String str = t.getTextAsString();
//		Assert.assertEquals(this.getFileContent("/htmltag/unformated_expected.html"), str);
//		//第二次预编译
//		t = this.gt.getFileTemplate("/htmltag/unformated_template.html");
//
//		str = t.getTextAsString();
//		Assert.assertEquals(this.getFileContent("/htmltag/unformated_expected.html"), str);
//
//	}
//	
//	public void testTagFunction() throws IOException, BeeException
//	{
//
//		this.gt.registerTag("html.comment", CommentTag.class);
//		Template t = this.gt.getFileTemplate("/htmltag/tagfunction_template.html");
//		String str = t.getTextAsString();
//		Assert.assertEquals(this.getFileContent("/htmltag/tagfunction_expected.html"), str);
//		//第二次预编译
//		t = this.gt.getFileTemplate("/htmltag/tagfunction_template.html");
//
//		str = t.getTextAsString();
//		Assert.assertEquals(this.getFileContent("/htmltag/tagfunction_expected.html"), str);
//
//	}
//	
	
	public static class CommentTag extends ByteSupportTag {

		@Override
		public byte[] getOutputAsByte() {
		 ByteArrayOutputStream bo = new ByteArrayOutputStream();
		 try {
			bo.write("//".getBytes());
			bo.write(this.inputBytes);
			 return bo.toByteArray();
		} catch (IOException e) {
			return new byte[0];
		}
		 
		
		}

			

			
	 }
	
	
	
	
	


}

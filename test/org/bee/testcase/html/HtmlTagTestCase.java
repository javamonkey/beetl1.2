package org.bee.testcase.html;

import java.io.IOException;

import junit.framework.Assert;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.GeneralBeetlTag;
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

	
	public void testNested() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/htmltag/nestedtag_template.html");
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/htmltag/nestedtag_expected.html"), str);
		//第二次预编译
		t = this.gt.getFileTemplate("/htmltag/nestedtag_template.html");

		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/htmltag/nestedtag_expected.html"), str);

	}
	
	public void testUnformat() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/htmltag/unformated_template.html");
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/htmltag/unformated_expected.html"), str);
		//第二次预编译
		t = this.gt.getFileTemplate("/htmltag/unformated_template.html");

		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/htmltag/unformated_expected.html"), str);

	}
	
	public void testTagFunction() throws IOException, BeeException
	{

		this.gt.registerTag("html.comment", CommentTag.class);
		Template t = this.gt.getFileTemplate("/htmltag/tagfunction_template.html");
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/htmltag/tagfunction_expected.html"), str);
		//第二次预编译
		t = this.gt.getFileTemplate("/htmltag/tagfunction_template.html");

		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/htmltag/tagfunction_expected.html"), str);

	}
	
	
	public static class CommentTag extends GeneralBeetlTag {

		@Override
		protected void makeOutput() {
			try{
				this.writer.write("//");
				if(this.isByteContent())this.writer.write(this.inputBytes);
				else this.writer.write(this.input);
			}catch(Exception ex){
				throw new RuntimeException(ex);
			}
			
			
		}

	
		 
		
	}

			

	
	
	


}

package org.bee.testcase.ext;

import java.io.IOException;

import junit.framework.Assert;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Format;
import org.bee.tl.core.Template;

public class FormatTest extends BasicTestCase
{
	public FormatTest()
	{
		super();
		
		this.gt.registerFormat("date.short", new Format(){

			public String format(Object data, String pattern){
				return "2012-1-1";
			}

		

		});
		
		
		
		

	}


	public void testFormat() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/ext/format_template.html");		
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/ext/format_expected.html"), str);
		//第二次预编译
		t = this.gt.getFileTemplate("/ext/format_template.html");		
		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/ext/format_expected.html"), str);
	}
	
	
	public void testDefaultFormat() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/ext/defaultformat_template.html");		
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/ext/defaultformat_expected.html"), str);
		//第二次预编译
		t = this.gt.getFileTemplate("/ext/defaultformat_template.html");		
		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/ext/defaultformat_expected.html"), str);
	}


	
}
package org.bee.testcase.exp;

import java.io.IOException;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Template;

public class ExpComplexTestCase extends BasicTestCase {
	public ExpComplexTestCase() {
		super();
	}
	
	public void testVarAdd()throws IOException, BeeException {
		Template t = this.gt.getFileTemplate("/exp/var_add_template.html");
		t.set("j", 3);
		String str = t.getTextAsString();
//		//for infer
		t = this.gt.getFileTemplate("/exp/var_add_template.html");
		t.set("j", 3);
		str = t.getTextAsString();
		
		this.assertEquals(this
				.getFileContent("/exp/var_add_expected.html"), str);
		
		
		

	}
	
//	public void testComplex() throws IOException, BeeException {
//
//		Template t = this.gt.getFileTemplate("/exp/exp_complex_template.html");
//		String str = t.getTextAsString();
//		this.assertEquals(this.getFileContent("/exp/exp_complex_expected.html"),
//				str);
//	}
//	
//	public void testBig() throws IOException, BeeException {
//
//		Template t = this.gt.getFileTemplate("/exp/exp_big_template.html");
//		String str = t.getTextAsString();
//		this.assertEquals(this.getFileContent("/exp/exp_big_expected.html"),
//				str);
//	}

	

}

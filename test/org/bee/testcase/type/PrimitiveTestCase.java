package org.bee.testcase.type;

import java.io.IOException;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Template;

public class PrimitiveTestCase extends BasicTestCase {
	public PrimitiveTestCase() {
		super();
	}

	public void testString() throws IOException, BeeException {

		Template t = this.gt.getFileTemplate("/type/string_template.html");
		String str = t.getTextAsString();

		this.assertEquals(this.getFileContent("/type/string_expected.html"),
				str);
	}

	public void testBoolean() throws IOException, BeeException {

		Template t = this.gt.getFileTemplate("/type/boolean_template.html");
		String str = t.getTextAsString();
		this.assertEquals(this.getFileContent("/type/boolean_expected.html"),
				str);
	}

	public void testInt() throws IOException, BeeException {
		Template t = this.gt.getFileTemplate("/type/int_template.html");
		String str = t.getTextAsString();
		// BigDecimal test = new BigDecimal("1");
		// System .out.println(test);
		// BeeNumber i=new BeeNumber("1");
		// BeeNumber j=new BeeNumber("-1");
		// BeeNumber c=(i.add(j));
		// System .out.println(i);
		this.assertEquals(this.getFileContent("/type/int_expected.html"), str);
	}

	public void testDouble() throws IOException, BeeException {

		Template t = this.gt.getFileTemplate("/type/double_template.html");
		String str = t.getTextAsString();
		// System.out.println(str);
		this.assertEquals(this.getFileContent("/type/double_expected.html"),
				str);
	}

	//
	//
	//

	//
	public void testDate() throws IOException, BeeException {

		Template t = this.gt.getFileTemplate("/type/date_template.html");
		String str = t.getTextAsString();
		// System.out.println(str);
		this.assertEquals(this.getFileContent("/type/date_expected.html"), str);
	}

	public void testChar() throws IOException, BeeException {

		Template t = this.gt.getFileTemplate("/type/char_template.html");
		t.set("c", 'c');
		t.set("b", 'b');
		String str = t.getTextAsString();
		this.assertEquals(this.getFileContent("/type/char_expected.html"), str);
		t = this.gt.getFileTemplate("/type/char_template.html");
		t.set("c", 'c');
		t.set("b", 'b');
		str = t.getTextAsString();
		// System.out.println(str);
		this.assertEquals(this.getFileContent("/type/char_expected.html"), str);
	}

}

package org.bee.testcase.exp;

import java.io.IOException;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Context;
import org.bee.tl.core.Function;
import org.bee.tl.core.Template;
import org.bee.tl.samples.User;

public class BasicExpTestCase extends BasicTestCase
{
	public BasicExpTestCase()
	{
		super();
	}
	
	

//	public void testMod() throws IOException, BeeException
//	{
//
//		Template t = this.gt.getFileTemplate("/exp/mod_template.html");
//		String str = t.getTextAsString();
//		this.assertEquals(this.getFileContent("/exp/mod_expected.html"), str);
//	}
//
	public void testDoubleAdd() throws IOException, BeeException
	{
		//		 double i=1.112;
		//         double j=-1.01;
		//         BeeNumber c=(new BeeNumber(i).add(j));
		//         System.out.println(c);
		Template t = this.gt.getFileTemplate("/exp/double_add_template.html");
		String str = t.getTextAsString();
		this.assertEquals(this.getFileContent("/exp/double_add_expected.html"), str);
	}

	public void testDoubleMinus() throws IOException, BeeException
	{
		Template t = this.gt.getFileTemplate("/exp/double_minus_template.html");
		String str = t.getTextAsString();
		this.assertEquals(this.getFileContent("/exp/double_minus_expected.html"), str);
	}

	public void testDoubleMutilply() throws IOException, BeeException
	{
		Template t = this.gt.getFileTemplate("/exp/double_mutiple_template.html");
		String str = t.getTextAsString();
		this.assertEquals(this.getFileContent("/exp/double_mutiple_expected.html"), str);
	}

	public void testDouble2Mutilply() throws IOException, BeeException
	{
		Template t = this.gt.getFileTemplate("/exp/double2_mutiple_template.html");
		t.set("j", 0.1d);
		User user = new User();
		user.setAge(15);
		t.set("user", user);
		String str = t.getTextAsString();

		//second for compile 

		t = this.gt.getFileTemplate("/exp/double2_mutiple_template.html");
		t.set("j", 0.1d);
		t.set("user", user);
		str = t.getTextAsString();

		this.assertEquals(this.getFileContent("/exp/double2_mutiple_expected.html"), str);
	}

	public void testDoubleFunMutilply() throws IOException, BeeException
	{
		Template t = this.gt.getFileTemplate("/exp/double_fun_mutiple_template.html");
		this.gt.registerFunction("getDouble", new Function() {

			public Double call(Object[] paras,Context ctx)
			{
				// TODO Auto-generated method stub
				return 0.1;
			}

		});

		String str = t.getTextAsString();

		//		//second for compile 
		//
		//		t = this.gt.getFileTemplate("/exp/double2_mutiple_template.html");
		//		t.set("j", 0.1d);
		//		str = t.getTextAsString();

		this.assertEquals(this.getFileContent("/exp/double_fun_mutiple_expected.html"), str);
	}

	public void testDoubleDiv() throws IOException, BeeException
	{
		Template t = this.gt.getFileTemplate("/exp/double_div_template.html");
		String str = t.getTextAsString();
		this.assertEquals(this.getFileContent("/exp/double_div_expected.html"), str);

	}

	public void testStringAdd() throws IOException, BeeException
	{
		Template t = this.gt.getFileTemplate("/exp/string_add_template.html");
		String str = t.getTextAsString();
		this.assertEquals(this.getFileContent("/exp/string_add_expected.html"), str);

	}

	public void testIntDiv() throws IOException, BeeException
	{
		// BigDecimal thisNumber = new BigDecimal(String.valueOf(12.1));
		// BigDecimal other = new BigDecimal(String.valueOf(2.1));
		// thisNumber = thisNumber.divide(other);
		//		
		// System.out.println(thisNumber);
		//		
		// System.out.println(new BigDecimal("3.2").multiply(new
		// BigDecimal("1.4")).doubleValue());
		//		//		
		//		double d = 1.7122343;
		//		System.out.println(d);
		//		 BeeNumber a = new BeeNumber(d).add(0.78);
		//		 System.out.println(a);
		//		//		
		// BigDecimal c=(new BigDecimal(12).divide(new
		// BigDecimal(2.0),5,BigDecimal.ROUND_HALF_UP)).stripTrailingZeros();
		// System.out.println(c);

		Template t = this.gt.getFileTemplate("/exp/int_div_template.html");
		String str = t.getTextAsString();
		this.assertEquals(this.getFileContent("/exp/int_div_expected.html"), str);
	}

}

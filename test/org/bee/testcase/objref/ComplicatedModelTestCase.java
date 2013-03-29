package org.bee.testcase.objref;

import java.io.IOException;

import junit.framework.Assert;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Template;

public class ComplicatedModelTestCase extends BasicTestCase
{

	public void testSimple() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/objref/order_template.html");
		Order order = new Order();
		t.set("order", order);
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/objref/order_expected.html"), str);

		VipOrder vipOrder = new VipOrder();
		t = this.gt.getFileTemplate("/objref/order_template.html");
		t.set("order", vipOrder);
		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/objref/vipOrder_expected.html"), str);

		CommonOrder commonOrder = new CommonOrder();
		t = this.gt.getFileTemplate("/objref/order_template.html");
		t.set("order", commonOrder);
		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/objref/commonOrder_expected.html"), str);

	}

	public void testSimple1() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/objref/order_template.html");
		VipOrder vipOrder = new VipOrder();
		t.set("order", vipOrder);
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/objref/vipOrder_expected.html"), str);

		t = this.gt.getFileTemplate("/objref/order_template.html");
		Order order = new Order();
		t.set("order", order);
		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/objref/order_expected.html"), str);

		CommonOrder commonOrder = new CommonOrder();
		t.set("order", commonOrder);
		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/objref/commonOrder_expected.html"), str);

		//		//second for compile 
		//
		//		t = this.gt.getFileTemplate("/objref/order_template.html");
		//		t.setRawValue("map", map);
		//		str = t.getTextAsString();
		//		Assert.assertEquals(this.getFileContent("/objref/order_expected.html"), str);
	}

	//
	public void testSimple2() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/objref/order_template.html");
		CommonOrder commonOrder = new CommonOrder();
		t.set("order", commonOrder);
		String str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/objref/commonOrder_expected.html"), str);

		t = this.gt.getFileTemplate("/objref/order_template.html");
		VipOrder vipOrder = new VipOrder();
		t.set("order", vipOrder);
		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/objref/vipOrder_expected.html"), str);

		t = this.gt.getFileTemplate("/objref/order_template.html");
		Order order = new Order();
		t.set("order", order);
		str = t.getTextAsString();
		Assert.assertEquals(this.getFileContent("/objref/order_expected.html"), str);

		//		//second for compile 
		//
		//		t = this.gt.getFileTemplate("/objref/order_template.html");
		//		t.setRawValue("map", map);
		//		str = t.getTextAsString();
		//		Assert.assertEquals(this.getFileContent("/objref/order_expected.html"), str);
	}

	public static interface IOrder
	{
		String getOrderId();
	}

	public static class Order implements IOrder
	{
		protected String orderId = "123";

		public String getOrderId()
		{
			return orderId;
		}

		public void setOrderId(String orderId)
		{
			this.orderId = orderId;
		}

	}

	public static class VipOrder implements IOrder
	{
		public String getOrderId()
		{
			return "456";
		}
	}

	public static class CommonOrder extends Order
	{
		public String getOrderId()
		{
			return "890";
		}
	}

}

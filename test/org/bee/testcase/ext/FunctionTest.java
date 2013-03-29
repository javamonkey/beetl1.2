package org.bee.testcase.ext;

import java.io.IOException;

import junit.framework.Assert;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Context;
import org.bee.tl.core.Function;
import org.bee.tl.core.Template;
import org.bee.tl.samples.User;

public class FunctionTest extends BasicTestCase
{
	public FunctionTest()
	{
		super();

		this.gt.registerFunction("test.returnNumber", new Function() {

			public Integer call(Object[] paras, Context ctx)
			{
				return 12;
			}

		});

	}

	public void testFunction1() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/ext/fun_template.html");
		User user = new User();
		user.setAge(19);
		user.setName("joel");
		t.set("user", user);
		String str = t.getTextAsString();

		//第二次预编译
		t = this.gt.getFileTemplate("/ext/fun_template.html");
		user = new User();
		user.setAge(19);
		user.setName("joel");
		t.set("user", user);
		str = t.getTextAsString();

		Assert.assertEquals(this.getFileContent("/ext/fun_expected.html"), str);
	}

	public void testNVL() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/ext/nvl_template.html");
		User user = new User();

		t.set("user", user);
		t.set("b", "好");
		String str = t.getTextAsString();

		//第二次预编译
		t = this.gt.getFileTemplate("/ext/nvl_template.html");
		t.set("user", user);
		t.set("b", "好");
		str = t.getTextAsString();
		System.out.println(this.getFileContent("/ext/nvl_expected.html"));
		Assert.assertEquals(this.getFileContent("/ext/nvl_expected.html"), str);
	}

	public void testSplit() throws IOException, BeeException
	{

		this.gt.registerFunction("split", new SplitFunction());
		Template t = this.gt.getFileTemplate("/ext/split_template.html");

		t.set("b", "hello,this is joel,nice to see you");
		String str = t.getTextAsString();

		//第二次预编译
		t = this.gt.getFileTemplate("/ext/split_template.html");
		t.set("b", "hello,this is joel,nice to see you");
		str = t.getTextAsString();

		Assert.assertEquals(this.getFileContent("/ext/split_expected.html"), str);

	}

	class SplitFunction implements Function
	{

		
		public String[] call(Object[] paras, Context ctx)
		{

			if (paras.length != 2)
			{
				throw new RuntimeException("请输入要分割的字符串和字符！");
			}
			else
			{
				if (paras.length == 2)
				{
					String[] list = paras[0].toString().split(paras[1].toString());
					return list;
				}

				throw new RuntimeException("Parse split Error,Args String,String ");
			}
		}

	}
}
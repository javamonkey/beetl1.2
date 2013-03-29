package org.bee.testcase.runtime;

import java.io.IOException;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Context;
import org.bee.tl.core.Function;
import org.bee.tl.core.Tag;
import org.bee.tl.core.Template;

public class JavaErrorTestCase extends BasicTestCase
{

	public JavaErrorTestCase()
	{
		super();

	}

	public void testSimple() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/runtime/format_notfound_template.html");

		String str = t.getTextAsString();

	}

	public void testFunctionError() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/runtime/function_error_template.html");
		this.gt.registerFunction("errorFunction", new Function() {

			public Object call(Object[] paras, Context ctx)
			{
				throw new RuntimeException("error");
			}

		});

		String str = t.getTextAsString();

	}

	public void testTagError() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/runtime/tag_error_template.html");
		this.gt.registerTag("errorTag", ErrorTag.class);

		String str = t.getTextAsString();

	}

	//	public void testVirtualAttribute() throws IOException, BeeException
	//	{
	//
	//		Template t = this.gt.getFileTemplate("/runtime/virtual_error_template.html");
	//		this.gt.registerVirtualAttributeEval(new VirtualAttributeEval() {
	//
	//			public boolean isSuppoert(Class c, String attributeName)
	//			{
	//				// TODO Auto-generated method stub
	//				return true;
	//			}
	//
	//			public Object eval(Object o, String attributeName, Context ctx)
	//			{
	//				throw new RuntimeException("error");
	//			}
	//		});
	//
	//		String str = t.getTextAsString();
	//
	//	}

	public void testNativeError() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/runtime/native_error_template.html");

		t.set("test", new TestClass(false));
		String str = t.getTextAsString();
		t = this.gt.getFileTemplate("/runtime/native_error_template.html");
		t.set("test", new TestClass(false));
		str = t.getTextAsString();
		t = this.gt.getFileTemplate("/runtime/native_error_template.html");
		t.set("test", new TestClass(true));
		str = t.getTextAsString();
	}

	public static class ErrorTag extends Tag
	{

		public ErrorTag()
		{

		}

		@Override
		public String getOutput()
		{
			throw new RuntimeException("error");
		}

	}

	public static class TestClass
	{

		boolean error = false;

		public TestClass(boolean error)
		{
			this.error = error;
		}

		public String getName()
		{
			if (error)
				throw new RuntimeException("ok");
			else
				return "hello";
		}

	}

}

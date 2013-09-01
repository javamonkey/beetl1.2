package org.bee.tl.performance.fn;

import org.bee.tl.core.Context;
import org.bee.tl.core.Function;
import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;
import org.bee.tl.performance.BeetlConfig;
import org.bee.tl.performance.DoNothingOutputSteam;
import org.bee.tl.performance.Employee;
import org.bee.tl.util.Log;

public class FunctionRun4Beetl
{
	public static void main(String[] args) throws Exception
	{
		GroupTemplate group = BeetlConfig.base;
		group.registerFunction("getSysdate", new DateFunction());
		Employee emp = new Employee();
		int loopCount = 50000;

		String child = "\\beetl\\BeetlFunction.txt";
		Template t = group.getFileTemplate(child);

		DoNothingOutputSteam byteStream = new DoNothingOutputSteam();
		t.getText(byteStream);
		byteStream.close();

		t = group.getFileTemplate(child);

		byteStream = new DoNothingOutputSteam();
		t.getText(byteStream);
		byteStream.close();

		long start = System.currentTimeMillis();

		Log.startAll();
		for (int i = 0; i < loopCount; i++)
		{

			t = group.getFileTemplate(child);

			byteStream = new DoNothingOutputSteam();
			t.getText(byteStream);
			byteStream.close();

		}
		long end = System.currentTimeMillis();

		Log.endAll();
		Log.display();
		System.out.println("time:" + (end - start));

	}

	static class DateFunction implements Function
	{

		
		public String call(Object[] paras, Context ctx)
		{
			return (String) paras[0];

		}

	}
}

package org.bee.tl.performance.attr;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;
import org.bee.tl.performance.BeetlConfig;
import org.bee.tl.performance.DoNothingOutputSteam;
import org.bee.tl.performance.Employee;
import org.bee.tl.util.Log;

public class SimpleAttribute4Beetl
{
	public static void main(String[] args) throws Exception
	{
		GroupTemplate group = BeetlConfig.base;
		Employee emp = new Employee();
		int loopCount = 50000;

		String child = "\\beetl\\SimpleAttribute.txt";
		Template t = group.getFileTemplate(child);
		t.set("emp", emp);
		DoNothingOutputSteam byteStream = new DoNothingOutputSteam();
		t.getText(byteStream);
		byteStream.close();
		long start = System.currentTimeMillis();

		Log.startAll();
		for (int i = 0; i < loopCount; i++)
		{

			t = group.getFileTemplate(child);
			t.set("emp", emp);
			byteStream = new DoNothingOutputSteam();
			t.getText(byteStream);
			byteStream.close();

		}
		long end = System.currentTimeMillis();

		Log.endAll();
		Log.display();
		System.out.println("time:" + (end - start));

	}
}

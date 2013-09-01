package org.bee.tl.performance.include;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;
import org.bee.tl.performance.BeetlConfig;
import org.bee.tl.performance.DoNothingWriter;
import org.bee.tl.performance.Employee;
import org.bee.tl.util.Log;

public class Include4beetl
{
	public static void main(String[] args) throws Exception
	{
		GroupTemplate group = BeetlConfig.base;
		group.disableDirectOutputByte();
		Employee emp = new Employee();
		int loopCount = 500000;

		String child = "\\beetl\\parent.txt";
		Template t = group.getFileTemplate(child);
		t.set("emp", emp);
		DoNothingWriter writer = new DoNothingWriter("UTF-8");
		t.getText(writer);
		writer.close();
		long start = System.currentTimeMillis();

		Log.startAll();
		for (int i = 0; i < loopCount; i++)
		{

			t = group.getFileTemplate(child);
			t.set("emp", emp);
			writer = new DoNothingWriter("UTF-8");
			t.getText(writer);
			writer.close();

		}
		long end = System.currentTimeMillis();

		Log.endAll();
		Log.display();
		System.out.println("time:" + (end - start));

	}
}

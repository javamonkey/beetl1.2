package org.bee.tl.performance.loop;

import java.util.ArrayList;
import java.util.List;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;
import org.bee.tl.performance.BeetlConfig;
import org.bee.tl.performance.DoNothingOutputSteam;
import org.bee.tl.util.Log;

public class Loop4Beetl
{
	public static void main(String[] args) throws Exception
	{
		GroupTemplate group = BeetlConfig.base;
		List list = new ArrayList();
		list.add("hello");
		list.add("joel");

		int loopCount = 50000;

		String child = "\\beetl\\loop.txt";
		Template t = group.getFileTemplate(child);
		t.set("users", list);
		DoNothingOutputSteam byteStream = new DoNothingOutputSteam();
		t.getText(byteStream);
		byteStream.close();
		long start = System.currentTimeMillis();

		Log.startAll();
		for (int i = 0; i < loopCount; i++)
		{

			t = group.getFileTemplate(child);
			t.set("users", list);
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

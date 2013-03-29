package org.bee.tl.performance.txt;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;
import org.bee.tl.performance.BeetlConfig;
import org.bee.tl.performance.DoNothingOutputSteam;
import org.bee.tl.util.Log;

public class Only6kText4Beetl
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
		GroupTemplate group = BeetlConfig.base;

		int loopCount = 50000;

		String child = "\\beetl\\Only6KText.txt";
		Template t = group.getFileTemplate(child);
		t.set("a", "bbbbb");
		DoNothingOutputSteam byteStream = new DoNothingOutputSteam();
		t.getText(byteStream);
		byteStream.close();
		long start = System.currentTimeMillis();

		Log.startAll();
		for (int i = 0; i < loopCount; i++)
		{

			t = group.getFileTemplate(child);
			t.set("a", "bbbbb");
			byteStream = new DoNothingOutputSteam();
			t.getText(byteStream);

		}
		long end = System.currentTimeMillis();

		Log.endAll();
		Log.display();
		System.out.println("time:" + (end - start));

	}
}

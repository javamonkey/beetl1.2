package org.bee.tl.performance.nat;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;
import org.bee.tl.performance.BeetlConfig;
import org.bee.tl.performance.DoNothingOutputSteam;
import org.bee.tl.util.Log;

public class NativeStaticCall4Beetl
{
	public static void main(String[] args) throws Exception
	{
		GroupTemplate group = BeetlConfig.base;

		int loopCount = 50000;

		String child = "\\beetl\\nativeStaticCall.txt";
		Template t = group.getFileTemplate(child);

		DoNothingOutputSteam byteStream = new DoNothingOutputSteam();
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

	public static String getText(String str, int a)
	{
		return str + a;
	}
}

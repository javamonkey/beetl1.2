package org.bee.tl.performance.general;

import java.util.List;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;
import org.bee.tl.performance.BeetlConfig;
import org.bee.tl.performance.DoNothingOutputSteam;
import org.bee.tl.performance.DoNothingWriter;
import org.bee.tl.util.Log;

public class Stock4Beetl
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{

		GroupTemplate group = BeetlConfig.base;

		int loopCount = 10000;
		List<Stock> items = Stock.dummyItems();
		String child = "\\beetl\\stocks.beetl.html";
		Template t = group.getFileTemplate(child);
		t.set("items", items);

		DoNothingOutputSteam os = new DoNothingOutputSteam();
		t.getText(os);

		long start = System.currentTimeMillis();

		Log.startAll();
		for (int i = 0; i < loopCount; i++)
		{

			t = group.getFileTemplate(child);
			t.set("items", items);
//			writer = new DoNothingWriter("UTF-8");
//			t.getText(writer);
			os = new DoNothingOutputSteam();
			t.getText(os);
			//			byteStream = new DoNothingOutputSteam();
			//			t.getText(byteStream);

			//			byteStream.close();

		}
		long end = System.currentTimeMillis();

		Log.endAll();
		Log.display();
		System.out.println("time:" + (end - start));

	}

}

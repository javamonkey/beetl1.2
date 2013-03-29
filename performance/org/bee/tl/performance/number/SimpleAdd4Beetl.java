package org.bee.tl.performance.number;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;
import org.bee.tl.core.io.OutputStreamByteWriter;
import org.bee.tl.performance.BeetlConfig;
import org.bee.tl.performance.DoNothingOutputSteam;
import org.bee.tl.util.Log;

public class SimpleAdd4Beetl
{
	public static void main(String[] args) throws Exception
	{
		OutputStreamByteWriter.DEFAULT_BYTE_BUFFER_SIZE = 512;
		GroupTemplate group = BeetlConfig.base;		
		int loopCount = 50000;
		String child = "\\beetl\\numberAdd.txt";
		Template t = group.getFileTemplate(child);
		String str = t.getTextAsString();
		System.out.println(str);
		
		DoNothingOutputSteam byteStream = new DoNothingOutputSteam();
//		t.getText(byteStream);
//		byteStream.close();
//		System.out.println(byteStream);
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
}

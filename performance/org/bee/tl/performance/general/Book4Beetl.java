package org.bee.tl.performance.general;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;
import org.bee.tl.core.io.OutputStreamByteWriter;
import org.bee.tl.performance.BeetlConfig;
import org.bee.tl.performance.DoNothingOutputSteam;
import org.bee.tl.performance.DoNothingWriter;
import org.bee.tl.util.Log;

public class Book4Beetl
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{

		OutputStreamByteWriter.DEFAULT_BYTE_BUFFER_SIZE = 1024;
		List list = new ArrayList();
		Book book = new Book();
		book.author = "lijz";
		book.discount = 0.8;
		book.publication = new Date();
		book.price = 43.1;
		book.title = "Beetl";
		book.publisher = "joel";

		Book book1 = new Book();
		book1.author = "lijz";
		book1.discount = 0.8;
		book1.publication = new Date();
		book1.price = 43.1;
		book1.title = "Beetl";
		book1.publisher = "joel";

		list.add(book);
		list.add(book1);

		User user = new User();

		GroupTemplate group = BeetlConfig.base;

		int loopCount = 100000;

		String child = "\\beetl\\book.txt";
		Template t = group.getFileTemplate(child);
		t.set("user", user);
		t.set("books", list);
		DoNothingOutputSteam byteStream = new DoNothingOutputSteam();
		DoNothingWriter writer = new DoNothingWriter("UTF-8");
		//		t.getText(byteStream);
		t.getText(writer);
		byteStream.close();
		long start = System.currentTimeMillis();

		Log.startAll();
		for (int i = 0; i < loopCount; i++)
		{

			t = group.getFileTemplate(child);
			t.set("user", user);
			t.set("books", list);
			writer = new DoNothingWriter("UTF-8");
			t.getText(writer);
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

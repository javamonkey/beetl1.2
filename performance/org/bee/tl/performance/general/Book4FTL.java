package org.bee.tl.performance.general;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bee.tl.performance.DoNothingWriter;
import org.bee.tl.performance.FTLConfig;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class Book4FTL
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
		Configuration cfg = FTLConfig.cfg;
		String child = "\\freemarker\\ftl_book.txt";
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

		Template template = cfg.getTemplate(child);

		Map root = new HashMap();
		root.put("user", user);
		root.put("books", list);

		DoNothingWriter writer = new DoNothingWriter("UTF-8");
		template.process(root, writer);
		int loopCount = 100000;
		long start = System.currentTimeMillis();
		for (int i = 0; i < loopCount; i++)
		{

			template = cfg.getTemplate(child);
			root = new HashMap();
			root.put("user", user);
			root.put("books", list);
			writer = new DoNothingWriter("UTF-8");
			template.process(root, writer);
			writer.close();

		}
		long end = System.currentTimeMillis();
		System.out.println("time:" + (end - start));

	}
}

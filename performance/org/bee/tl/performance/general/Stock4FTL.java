package org.bee.tl.performance.general;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bee.tl.performance.DoNothingWriter;
import org.bee.tl.performance.FTLConfig;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class Stock4FTL
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
		Configuration cfg = FTLConfig.cfg;
		String child = "\\freemarker\\stocks.ftl.html";
		int loopCount = 10000;
		List<Stock> items = Stock.dummyItems();

		Template template = cfg.getTemplate(child);

		Map root = new HashMap();
		root.put("items", items);

		DoNothingWriter writer = new DoNothingWriter("UTF-8");
		template.process(root, writer);

		long start = System.currentTimeMillis();
		for (int i = 0; i < loopCount; i++)
		{

			root = new HashMap();
			root.put("items", items);

			writer = new DoNothingWriter("UTF-8");
			template.process(root, writer);

		}
		long end = System.currentTimeMillis();
		System.out.println("time:" + (end - start));

	}
}

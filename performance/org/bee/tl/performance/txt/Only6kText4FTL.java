package org.bee.tl.performance.txt;

import java.util.HashMap;
import java.util.Map;

import org.bee.tl.performance.DoNothingWriter;
import org.bee.tl.performance.FTLConfig;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class Only6kText4FTL
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
		Configuration cfg = FTLConfig.cfg;
		String child = "\\beetl\\Only6KText.txt";
		Template template = cfg.getTemplate(child);
		Map root = new HashMap();
		root.put("a", "hello");
		DoNothingWriter writer = new DoNothingWriter("UTF-8");
		template.process(root, writer);
		int loopCount = 50000;
		long start = System.currentTimeMillis();
		for (int i = 0; i < loopCount; i++)
		{

			template = cfg.getTemplate(child);
			root = new HashMap();
			root.put("a", "hello");
			writer = new DoNothingWriter("UTF-8");
			template.process(root, writer);
			writer.close();

		}
		long end = System.currentTimeMillis();
		System.out.println("time:" + (end - start));

	}
}

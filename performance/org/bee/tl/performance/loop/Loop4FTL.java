package org.bee.tl.performance.loop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bee.tl.performance.DoNothingWriter;
import org.bee.tl.performance.Employee;
import org.bee.tl.performance.FTLConfig;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class Loop4FTL
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
		Configuration cfg = FTLConfig.cfg;
		String child = "\\freemarker\\ftl_loop.txt";
		Template template = cfg.getTemplate(child);
		Employee emp = new Employee();
		Map root = new HashMap();
		List list = new ArrayList();
		list.add("hello");
		list.add("joel");
		root.put("users", list);
		DoNothingWriter writer = new DoNothingWriter("UTF-8");
		template.process(root, writer);
		int loopCount = 50000;
		long start = System.currentTimeMillis();
		for (int i = 0; i < loopCount; i++)
		{

			template = cfg.getTemplate(child);
			root = new HashMap();
			root.put("users", list);
			writer = new DoNothingWriter("UTF-8");
			template.process(root, writer);
			writer.close();

		}
		long end = System.currentTimeMillis();
		System.out.println("time:" + (end - start));

	}
}

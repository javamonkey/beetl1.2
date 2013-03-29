package org.bee.tl.performance.include;

import java.util.HashMap;
import java.util.Map;

import org.bee.tl.performance.DoNothingWriter;
import org.bee.tl.performance.Employee;
import org.bee.tl.performance.FTLConfig;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class Include4FTL
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
		Configuration cfg = FTLConfig.cfg;
		String child = "\\freemarker\\ftl_parent.txt";
		Template template = cfg.getTemplate(child);
		Employee emp = new Employee();
		Map root = new HashMap();
		root.put("emp", emp);
		DoNothingWriter writer = new DoNothingWriter("UTF-8");
		template.process(root, writer);
		int loopCount = 500000;
		long start = System.currentTimeMillis();
		for (int i = 0; i < loopCount; i++)
		{

			template = cfg.getTemplate(child);
			root = new HashMap();
			root.put("emp", emp);
			writer = new DoNothingWriter("UTF-8");
			template.process(root, writer);
			writer.close();

		}
		long end = System.currentTimeMillis();
		System.out.println("time:" + (end - start));

	}
}

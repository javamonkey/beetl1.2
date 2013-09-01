package org.bee.tl.performance.nat;

import java.util.HashMap;
import java.util.Map;

import org.bee.tl.performance.DoNothingWriter;
import org.bee.tl.performance.FTLConfig;

import freemarker.ext.beans.BeansWrapper;
import freemarker.template.Configuration;
import freemarker.template.Template;

public class NativeCall4FTL
{
	public static void main(String[] args) throws Exception
	{
		Configuration cfg = FTLConfig.cfg;
		String child = "\\freemarker\\ftl_native-call.txt";
		Template template = cfg.getTemplate(child);
		Map root = new HashMap();
		BeansWrapper wrapper = BeansWrapper.getDefaultInstance();

		NativeCall4FTL test = new NativeCall4FTL();
		root.put("test", test);

		DoNothingWriter writer = new DoNothingWriter("UTF-8");
		template.process(root, writer);
		int loopCount = 50000;
		long start = System.currentTimeMillis();
		for (int i = 0; i < loopCount; i++)
		{

			template = cfg.getTemplate(child);
			root = new HashMap();
			root.put("test", test);
			writer = new DoNothingWriter("UTF-8");
			template.process(root, writer);
			writer.close();

		}
		long end = System.currentTimeMillis();
		System.out.println("time:" + (end - start));

	}

	public String getText(String str, int a)
	{
		return str + a;
	}

	public String getText()
	{
		return "";
	}
}

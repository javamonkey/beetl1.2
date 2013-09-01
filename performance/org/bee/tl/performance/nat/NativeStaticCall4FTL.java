package org.bee.tl.performance.nat;

import java.util.HashMap;
import java.util.Map;

import org.bee.tl.performance.DoNothingWriter;
import org.bee.tl.performance.FTLConfig;

import freemarker.ext.beans.BeansWrapper;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateHashModel;

public class NativeStaticCall4FTL
{
	public static void main(String[] args) throws Exception
	{
		Configuration cfg = FTLConfig.cfg;
		String child = "\\freemarker\\ftl_native-static-call.txt";
		Template template = cfg.getTemplate(child);
		Map root = new HashMap();
		BeansWrapper wrapper = BeansWrapper.getDefaultInstance();

		TemplateHashModel staticModels = wrapper.getStaticModels();
		TemplateHashModel nativeStatics = (TemplateHashModel) staticModels
				.get("org.bee.tl.performance.nat.NativeStaticCall4FTL");
		root.put("NativeStaticCall4FTL", nativeStatics);

		DoNothingWriter writer = new DoNothingWriter("UTF-8");
		template.process(root, writer);
		int loopCount = 50000;
		long start = System.currentTimeMillis();
		for (int i = 0; i < loopCount; i++)
		{

			template = cfg.getTemplate(child);
			root = new HashMap();
			root.put("NativeStaticCall4FTL", nativeStatics);
			writer = new DoNothingWriter("UTF-8");
			template.process(root, writer);
			writer.close();

		}
		long end = System.currentTimeMillis();
		System.out.println("time:" + (end - start));

	}

	public static String getText(String str, int a)
	{
		return str + a;
	}
}

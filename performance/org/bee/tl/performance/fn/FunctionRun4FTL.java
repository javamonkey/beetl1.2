package org.bee.tl.performance.fn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bee.tl.performance.DoNothingWriter;
import org.bee.tl.performance.Employee;
import org.bee.tl.performance.FTLConfig;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateMethodModel;
import freemarker.template.TemplateModelException;

public class FunctionRun4FTL
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
		Configuration cfg = FTLConfig.cfg;
		String child = "\\freemarker\\ftl_function.txt";
		Template template = cfg.getTemplate(child);
		Employee emp = new Employee();
		Map root = new HashMap();

		root.put("getSysdate", new SqlGetSysdateMethod());
		DoNothingWriter writer = new DoNothingWriter("UTF-8");
		template.process(root, writer);
		int loopCount = 50000;
		long start = System.currentTimeMillis();
		for (int i = 0; i < loopCount; i++)
		{

			template = cfg.getTemplate(child);
			root = new HashMap();
			root.put("getSysdate", new SqlGetSysdateMethod());
			writer = new DoNothingWriter("UTF-8");
			template.process(root, writer);
			writer.close();

		}
		long end = System.currentTimeMillis();
		System.out.println("time:" + (end - start));
	}

	static class SqlGetSysdateMethod implements TemplateMethodModel
	{

		public Object exec(List args) throws TemplateModelException
		{
			//得到函数第一个参数,得到的字符串两头会有引号,所以replace
			String datePattern = (args.get(0).toString()).replace("'", "");
			return datePattern;
		}

	}

}

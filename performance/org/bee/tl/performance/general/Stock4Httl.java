package org.bee.tl.performance.general;

import httl.Engine;
import httl.Template;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.bee.tl.performance.DoNothingOutputSteam;
import org.bee.tl.util.Log;

public class Stock4Httl
{
	public static void main(String[] args) throws Exception
	{
		String home = System.getProperty("user.dir") + File.separator + "performance" + File.separator;
		Engine engine = null;
		String templateFile = "/httl/stocks.httl.html";
		Properties prop = new Properties();
		prop.setProperty("import.packages", "org.bee.tl.performance.general,java.util");
		prop.setProperty("filter", "null");
		prop.setProperty("logger", "null");
		engine = Engine.getEngine(prop);
		List<Stock> items = Stock.dummyItems();
		Map<String, Object> params = new HashMap();
		params.put("items", items);
		//        params.put("items", items);
		Template template = engine.getTemplate(templateFile);

		DoNothingOutputSteam byteStream = new DoNothingOutputSteam();
		template.render(params, byteStream);
		int loopCount = 10000;
		long start = System.currentTimeMillis();

		Log.startAll();
		for (int i = 0; i < loopCount; i++)
		{

			template = engine.getTemplate(templateFile);
			params = new HashMap();
			params.put("items", items);
			byteStream = new DoNothingOutputSteam();
			template.render(params, byteStream);

		}
		long end = System.currentTimeMillis();

		Log.endAll();
		Log.display();
		System.out.println("time:" + (end - start));

	}
}

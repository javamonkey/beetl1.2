package org.bee.tl.performance.txt;

import httl.Engine;
import httl.Template;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.bee.tl.performance.DoNothingOutputSteam;
import org.bee.tl.util.Log;

public class Only6k4Httl
{
	public static void main(String[] args) throws Exception
	{
		String home = System.getProperty("user.dir") + File.separator + "performance" + File.separator;
		Engine engine = null;
		String templateFile = "/httl/Only6KText.txt";
		Properties prop = new Properties();

		prop.setProperty("filter", "null");
		prop.setProperty("logger", "null");
		engine = Engine.getEngine(prop);
		Map<String, Object> params = new HashMap();
		params.put("a", "bbbbb");
		//        params.put("items", items);
		Template template = engine.getTemplate(templateFile);

		DoNothingOutputSteam byteStream = new DoNothingOutputSteam();
		template.render(params, byteStream);
		int loopCount = 50000;
		long start = System.currentTimeMillis();

		Log.startAll();
		for (int i = 0; i < loopCount; i++)
		{

			template = engine.getTemplate(templateFile);
			params = new HashMap();
			params.put("a", "bbbbb");
			byteStream = new DoNothingOutputSteam();
			template.render(params, byteStream);

		}
		long end = System.currentTimeMillis();

		Log.endAll();
		Log.display();
		System.out.println("time:" + (end - start));

	}
}

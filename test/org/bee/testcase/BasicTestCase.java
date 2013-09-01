package org.bee.testcase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import junit.framework.TestCase;

import org.bee.testcase.error.TestErrorHandler;
import org.bee.tl.core.Config;
import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.number.NumberFactory;

public class BasicTestCase extends TestCase
{
	static String home = null;
	public static boolean enableOptimize = true;
	static GroupTemplate base = null;
	static
	{

		try
		{
			Config config = new Config();
			config.load("/beetl-test.properties");
			home = System.getProperty("user.dir") + File.separator + "template" + File.separator;
			config.put(Config.TEMPLATE_ROOT, home);
			base = config.createGroupTemplate();
		}
		catch (IOException e)
		{
			throw new RuntimeException(e.getMessage());
		}

		// for simple test ,not not changed it
		NumberFactory.scale = 4;
	}

	protected GroupTemplate gt = BasicTestCase.base;

	public BasicTestCase()
	{

	}

	protected String getFileContent(String path) throws IOException
	{
		InputStreamReader fr = new InputStreamReader(new FileInputStream(home + File.separator + path), "GBK");

		StringBuilder temp = new StringBuilder();
		int bufSzie = 1024;
		char[] cs = new char[bufSzie];
		int len = -1;

		while ((len = fr.read(cs)) != -1)
		{
			temp.append(cs, 0, len);

		}
		return temp.toString();
	}

	protected TestErrorHandler getErrorHandler()
	{
		return new TestErrorHandler();
	}
}

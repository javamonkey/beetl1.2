package org.bee.tl.performance;

import java.io.File;
import java.io.IOException;

import org.bee.tl.core.Config;
import org.bee.tl.core.GroupTemplate;

public class BeetlConfig
{
	static String home = null;

	public static GroupTemplate base = null;
	static
	{
		try
		{
			Config config = new Config();
			config.load("/beetl-performace.properties");
			home = System.getProperty("user.dir") + File.separator + "performance" + File.separator;
			config.put(Config.TEMPLATE_ROOT, home);
			base = config.createGroupTemplate();
		}
		catch (IOException e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

}

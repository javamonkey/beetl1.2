package org.bee.tl.performance;

import java.io.File;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;

public class FTLConfig
{
	public static Configuration cfg = new Configuration();
	static String home = null;
	static
	{
		try
		{
			home = System.getProperty("user.dir") + File.separator + "performance" + File.separator;
			cfg.setDirectoryForTemplateLoading(new File(home));
			cfg.setObjectWrapper(new DefaultObjectWrapper());
		}
		catch (Exception ex)
		{
			throw new RuntimeException(ex.getMessage());
		}
	}

}

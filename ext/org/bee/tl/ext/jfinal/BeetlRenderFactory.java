package org.bee.tl.ext.jfinal;

import java.io.IOException;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.ext.WebConfig;
import org.bee.tl.ext.WebPathKit;

import com.jfinal.render.IMainRenderFactory;
import com.jfinal.render.Render;

public class BeetlRenderFactory implements IMainRenderFactory
{
	public static WebConfig config = null;
	public static String viewExtension = ".html";
	public static GroupTemplate groupTemplate = null;

	static
	{
		try
		{
			config = new WebConfig();
			config.updateRootPath(WebPathKit.getWebRootPath()); //更新模版路径
			groupTemplate = config.createGroupTemplate();
		}
		catch (IOException e)
		{
			throw new RuntimeException("Can notload properties for beetl");
		}
	}

	public Render getRender(String view)
	{
		return new BeetlRender(groupTemplate, view);
	}

	
	public String getViewExtension()
	{
		return viewExtension;
	}

}

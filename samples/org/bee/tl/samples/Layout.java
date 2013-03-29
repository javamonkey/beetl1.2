package org.bee.tl.samples;

import java.io.File;
import java.util.HashMap;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;
import org.bee.tl.ext.LayoutTag;

public class Layout {
	public static void main(String[] args) throws Exception
	{

		String home = System.getProperty("user.dir") + File.separator + "samples" + File.separator;
		
		GroupTemplate group  = new GroupTemplate(new File(home));
		group.registerTag("layout", LayoutTag.class);
		group.config("<!--:", "-->", "~", "~");
		group.setCharset("UTF-8");	
		group.enableNativeCall();
//		group.enableOptimize();
		Template template = group.getFileTemplate("/org/bee/tl/samples/content.html");	
		template.set("para1","para1");
		template.set("para2","para2");
		template.setRawValue("map", new HashMap());
		
		String output =template.getTextAsString();	
//		output =template.getTextAsString();	
		System.out.println(output);
	}	
}

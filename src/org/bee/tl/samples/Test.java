package org.bee.tl.samples;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;

public class Test
{

	public int i = 12;

	public static void main(String[] args) throws Exception
	{

		 		String home = System.getProperty("user.dir") + File.separator + "template" + File.separator;
		 		GroupTemplate group = new GroupTemplate(new File(home));
		 		group.setCharset("GBK");
		 		group.config("<%", "%>", "${", "}");
		 		group.setDebug(true);
		 		group.enableNativeCall();
		 		Map compileConfig = new HashMap();
		 		compileConfig.put(GroupTemplate.OPTIMIZE_KEEP_SOURCE, true);
		 		group.enableOptimize(compileConfig);
		 		 //		group.enableOptimize();
		 		  group.enableDirectOutputByte();
		 		 
		 		Template template = group.getFileTemplate("/helloworld.html");
		 
		 	
		 		template.set("post",new Person());
		 		template.set("user",new Person());
		 	
		 
		 		System.out.println(template.getTextAsString());
		 		
		 		template = group.getFileTemplate("/helloworld.html");
		 		template.set("post",new Person());
		 		//template.set("user",new Person());
		 		System.out.println(template.getTextAsString());
		 		

		
	
	}

	public static boolean isTrue(int a, int b, int c)
	{
		return true;
	}
}

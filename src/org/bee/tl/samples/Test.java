package org.bee.tl.samples;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;

public class Test
{

	public static int i = 12;
	public static int j = 1 ;
	static public User[] users = new User[]{new User(),new User()};

	public static void main(String[] args) throws Exception
	{

		 		String home = System.getProperty("user.dir") + File.separator + "template" + File.separator;
		 		GroupTemplate group = new GroupTemplate(new File(home));
		 		group.setCharset("GBK");
		 		group.config("<%", "%>", "${", "}");
		 		//group.config("<!--[", "]-->", "<!--[=", "]-->");	 		
		 		 
		 		
		 		group.setDebug(true);
		 		group.enableNativeCall();
		 		//group.enableDirectOutputByte();
		 		Map compileConfig = new HashMap();
	 		    compileConfig.put(GroupTemplate.OPTIMIZE_KEEP_SOURCE, true);
	 		   // group.enableOptimize(compileConfig);
//		 		 	group.enableOptimize();
//		 		  group.enableDirectOutputByte();
		 		 
		 		 Template template = group.getFileTemplate("/helloworld.html");
		 		String[] aa = new String[]{"tt","123"};		 		
		 		template.set("t", new Test());
		 		//template.set("b", 4);
		 		template.set("aa", null);
		 		
		 		int c = i==12?j==1?3:4:2;
		 		System.out.println(template.getTextAsString());
		 		
//	 		template = group.getFileTemplate("/helloworld.html");
//	 		template.set("t", new Test());
//	 		template.set("b", 4);
//	 		template.set("aa", null);
//	 		System.out.println(template.getTextAsString());
//		 		

		
	
	}
	
	public static User getUser(){
		return new User();
	}
	
	public Test getTest(){
		return this;
	}

	public static boolean isTrue(int a, int b, int c)
	{
		return true;
	}

}

package org.bee.tl.samples2;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;
import org.bee.tl.samples.User;

public class MyTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
		String home = System.getProperty("user.dir") + File.separator + "samples" + File.separator;
		GroupTemplate group = new GroupTemplate(new File(home));
		group.setCharset("UTF-8");
		group.setDebug(true);

		group.enableNativeCall();
		Map config = new HashMap();
		config.put(GroupTemplate.OPTIMIZE_KEEP_SOURCE, true);
		group.enableOptimize(config);
		////		group.enableOptimize();
		//		group.registerTag("mytest.include", IncludeFileTemplateTag.class);

		Template template = group.getFileTemplate("/org/bee/tl/samples2/template1.txt");
		template.set("aa", "helloz中国");
		template.setRawValue("b", 4);
		template.set("user", new User());

		//		FileOutputStream fos = new FileOutputStream(new File("d:/Text.txt"));
		System.out.println(template.getTextAsString());

		template = group.getFileTemplate("/org/bee/tl/samples2/template1.txt");
		template.set("aa", "helloz中国");
		template.setRawValue("b", 4);
		template.set("user", new User());
		//		FileOutputStream fos = new FileOutputStream(new File("d:/Text.txt"));
		System.out.println(template.getTextAsString());
		//		
		//		String output = template.getTextAsString();
		//		template = group.getFileTemplate("/org/bee/tl/samples2/template1.txt");
		//	    output =template.getTextAsString();	
		//		System.out.println(output);

	}

}

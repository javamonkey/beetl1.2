package org.bee.tl.performance;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;

public class PermTest {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String home = System.getProperty("user.dir") + File.separator + "template" + File.separator;
 		GroupTemplate group = new GroupTemplate();
 		group.setCharset("GBK");
 		group.config("<%", "%>", "${", "}");
// 		group.setDebug(true);
 		group.enableNativeCall();
 		Map compileConfig = new HashMap();
// 		compileConfig.put(GroupTemplate.OPTIMIZE_KEEP_SOURCE, true);
// 		group.enableOptimize(compileConfig);
 		group.enableOptimize();
 		  group.enableDirectOutputByte();
 		 int max = 10000000;
 		for(int i=0;i<max;i++){
 			group.removeTemplateCache("key"+(i-1));
 			Template template = group.getStringTemplate("hello,${a}","key"+i);
 			template.set("a", "perm");
 			template.getTextAsString();
 			template = group.getStringTemplate("hello,${a}","key"+i);
 			template.set("a", "perm");
 			template.getTextAsString();
 			
 			System.out.println(i);
 		}
 		
	}

}

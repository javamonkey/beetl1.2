package org.bee.tl.samples;

import java.util.Arrays;
import java.util.Date;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;

public class If {
	public static void main(String[] args) throws Exception
	{

		String input = 	"<%if(cat.name=='huahua'){%>\n"
						+"It's huahua\n"
						+"<%}else{%>\n"
						+"It's ${cat.name}\n"
						+"<%}%>";
		
		GroupTemplate group  = new GroupTemplate();	
		group.config("<%", "%>", "${", "}");		
		Template template = group.getStringTemplate(input);	
		Cat cat1 = new Cat("huahua",new Date(),null);		
		template.set("cat", cat1);
		String output =template.getTextAsString();		
		System.out.println(output);
	}
}

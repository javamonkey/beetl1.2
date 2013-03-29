package org.bee.tl.samples;

import java.util.Arrays;
import java.util.Date;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;

public class Loop {
	public static void main(String[] args) throws Exception
	{

		String input = 	"<%for(cat in catList){%>\n"
						+"Cat ${cat.name}\n"
						+"<%}%>";
		
		GroupTemplate group  = new GroupTemplate();	
		group.config("<%", "%>", "${", "}");		
		Template template = group.getStringTemplate(input);	
		Cat cat1 = new Cat("huahua",new Date(),null);
		Cat cat2 = new Cat("lvlv",new Date(),cat1);
		template.set("catList", Arrays.asList(new Cat[]{cat1,cat2}));
		String output =template.getTextAsString();		
		System.out.println(output);
	}
}

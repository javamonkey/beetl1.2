package org.bee.tl.samples;

import java.util.Arrays;
import java.util.Date;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;

public class ErrorDisplay {
	public static void main(String[] args) throws Exception
	{

		String input = 	"<%for(cat in catList){%>\n"
						+"Cat ${cat.name}\n"
						+"<%}%>";
		
		GroupTemplate group  = new GroupTemplate();	
		group.config("<%", "%>", "${", "}");		
		Template template = group.getStringTemplate(input);	
		Cat cat1 = new Cat("huahua",new Date(),null);
		
		template.set("catList", Arrays.asList(new Cat[]{cat1,null}));
		String output =template.getTextAsString();		
		System.out.println(output);
	}
}

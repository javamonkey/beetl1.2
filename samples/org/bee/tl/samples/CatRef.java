package org.bee.tl.samples;

import java.util.Date;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;

public class CatRef {
	public static void main(String[] args) throws Exception
	{

		String input = 	"${cat.name},birthday is ${cat.bir,dateFormat='yyyy-MM-dd'}";
		GroupTemplate group  = new GroupTemplate();	
		group.config("<%", "%>", "${", "}");		
		Template template = group.getStringTemplate(input);	
		Cat cat = new Cat("huahua",new Date(),null);
		template.set("cat", cat);
		String output =template.getTextAsString();		
		System.out.println(output);
	}	
}


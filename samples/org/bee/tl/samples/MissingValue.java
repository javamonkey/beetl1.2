package org.bee.tl.samples;

import java.util.Arrays;
import java.util.Date;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;

public class MissingValue {
	public static void main(String[] args) throws Exception
	{

		String input = 	"${!(cat.parent,name)}" ;					
		
		GroupTemplate group  = new GroupTemplate();	
		group.config("<%", "%>", "${", "}");		
		Template template = group.getStringTemplate(input);	
		Cat cat1 = new Cat("huahua",new Date(),null);		
		template.set("cat", cat1);
		String output =template.getTextAsString();		
		System.out.println(output);
	}
}

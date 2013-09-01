package org.bee.tl.samples;

import java.io.File;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;

public class Exp {
	public static void main(String[] args) throws Exception
	{

		String input = 	"<% var k=1,j=2;%>\n"
						+"sum is ${k+j}";
		GroupTemplate group  = new GroupTemplate();	
		group.config("<%", "%>", "${", "}");		
		Template template = group.getStringTemplate(input);	
		String output =template.getTextAsString();		
		System.out.println(output);
	}	
}

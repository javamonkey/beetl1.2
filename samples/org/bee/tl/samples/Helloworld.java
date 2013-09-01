package org.bee.tl.samples;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;

public class Helloworld
{
	public static void main(String[] args) throws Exception
	{

		String input = "hello,${name}!";
		GroupTemplate group = new GroupTemplate();
		Template template = group.getStringTemplate(input);
		template.set("name", "beetl");
		String output = template.getTextAsString();
		System.out.println(output);
	}
}

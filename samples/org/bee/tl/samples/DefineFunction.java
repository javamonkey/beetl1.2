package org.bee.tl.samples;

import org.bee.tl.core.Context;
import org.bee.tl.core.Function;
import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;

public class DefineFunction
{
	public static void main(String[] args) throws Exception
	{

		String input = "get${str.Upcase(property)}";
		GroupTemplate group = new GroupTemplate();
		group.config("<%", "%>", "${", "}");
		group.registerFunction("str.Upcase", new Function() {

			public String call(Object[] paras, Context ctx)
			{
				String str = (String) paras[0];
				return str.toUpperCase();
			}

		});
		Template template = group.getStringTemplate(input);
		template.set("property", "name");
		String output = template.getTextAsString();
		System.out.println(output);
	}
}

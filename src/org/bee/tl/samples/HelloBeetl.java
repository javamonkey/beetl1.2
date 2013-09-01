package org.bee.tl.samples;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.bee.tl.core.BeeException;
import org.bee.tl.core.Context;
import org.bee.tl.core.DefaultErrorHandler;
import org.bee.tl.core.ErrorHandler;
import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;
import org.bee.tl.core.VirtualAttributeEval;

public class HelloBeetl {

	public static void main(String[] args) throws Exception {
		{
			try {

				long start = System.currentTimeMillis();
				GroupTemplate group = getGroupTemplate();

				User user = new User();
				user.setName("lijz");
				user.setBir(new java.util.Date());
				User wife = new User();
				wife.setName("lucy");
				List list = new ArrayList();
				list.add(user);
				list.add(wife);

				Template t = group.getFileTemplate("\\test\\first.html");
				t.set("users", list);
				System.out.println(t.getTextAsString());
				System.out.println("runtime time:"
						+ (System.currentTimeMillis() - start));
				start = System.currentTimeMillis();
				// 第二次，预编译了
				t = group.getFileTemplate("\\test\\first.html");
				t.set("users", list);
				System.out.println(t.getTextAsString());
				System.out.println("compile time:"
						+ (System.currentTimeMillis() - start));

				start = System.currentTimeMillis();
				t = group.getFileTemplate("\\test\\first.html");
				t.set("users", list);
				System.out.println(t.getTextAsString());
				System.out.println("last time:"
						+ (System.currentTimeMillis() - start));
			} catch (BeeException ex) {
				ErrorHandler handler = new DefaultErrorHandler();
				handler.processExcption(ex);
			}

		}

	}
	
	public static GroupTemplate getGroupTemplate(){
		GroupTemplate group = new GroupTemplate(
				new File(
						"e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\tl\\beetls"),
				"beetls");
		group.enableOptimize();
		group.setStatementStart("<%");
		group.setStatementEnd("%>");
		group.registerVirtualAttributeEval(new VirtualAttributeEval() {
			public String eval(Object o, String attributeName, Context ctx)
			{
				if (attributeName.equals("display"))
				{
					return "2008-01-03";
				}
				else
				{
					throw new IllegalArgumentException();
				}

			}

			public boolean isSuppoert(Class c, String attributeName)
			{
				if (c.isAssignableFrom(java.util.Date.class)&&attributeName.equals("display"))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
		});

		return group;
	}
}

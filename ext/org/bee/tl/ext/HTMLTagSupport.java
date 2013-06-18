package org.bee.tl.ext;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import org.bee.tl.core.BeeException;
import org.bee.tl.core.Template;

public class HTMLTagSupport extends IncludeFileTemplateTag {
	@Override
	public boolean requriedInput()
	{
		return true;
	}
	
	protected void makeOutput()
	{

		if (args.length == 0 || args.length > 2)
		{
			throw new RuntimeException("参数错误，期望child,Map .....");
		}
		String child = (String) args[0];
		child = "/htmltag/"+child+".tag";
		
		
		Template t = null;
		try
		{
			t = group.getFileTemplate(child);
		}
		catch (IOException e1)
		{
			throw new RuntimeException(e1);
		}

		if (args.length == 2)
		{
			Map<String, Object> map = (Map<String, Object>) args[1];
			for (Entry<String, Object> entry : map.entrySet())
			{
				t.set(entry.getKey(), entry.getValue());
			}
		}
		//只复制这些serlvet变量
		t.set("servlet", ctx.getVarWithoutException("servlet"));
		t.set("ctxPath", ctx.getVarWithoutException("ctxPath"));
		t.setRawValue("session", ctx.getVarWithoutException("session"));
		try
		{
			//			t.getText(writer);
			t.getTextByByteWriter(writer);

		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
		catch (BeeException e)
		{
			throw new RuntimeException(e);
		}
	}
}

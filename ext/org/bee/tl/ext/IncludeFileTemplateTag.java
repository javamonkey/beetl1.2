package org.bee.tl.ext;

/*
 [The "BSD license"]
 Copyright (c) 2011-2013 Joel Li (李家智)
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
 notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
 notice, this list of conditions and the following disclaimer in the
 documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
 derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import org.bee.tl.core.BeeException;
import org.bee.tl.core.ByteSupportTag;
import org.bee.tl.core.Template;

/**
 * include一个模板，如
 * <p>
 * <%includeFileTemplate("/header.html"){%>
 * <p>
 * 其他内容
 * <p>
 * <%}%>
 * <p>
 * 如果向子文件传入参数，则可以使用这种格式
 * <p/>
 * includeFileTemplate(path,{paraName1:value1,paraName2：value2})
 * <p>
 * beetl1.2也可以使用include,跟inlcudeFileTemplate一样
 * @author joello
 * @since 1.2
 * 
 */
public class IncludeFileTemplateTag extends ByteSupportTag
{

	@Override
	public boolean requriedInput()
	{
		return false;
	}

	private void makeOutput()
	{

		if (args.length == 0 || args.length > 2)
		{
			throw new RuntimeException("参数错误，期望child,Map .....");
		}
		String child = (String) args[0];

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

		String key = null;
		for (Entry<String, Object> entry : ctx.getRootVars().entrySet())
		{
			key = entry.getKey();

			if (ctx.getRawList() != null && ctx.getRawList().contains(key))
			{
				t.setRawValue(key, entry.getValue());
			}
			else
			{
				t.set(entry.getKey(), entry.getValue());
			}

		}

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

	@Override
	public String getOutput()
	{
		makeOutput();
		return null;
	}

	@Override
	public byte[] getOutputAsByte()
	{
		makeOutput();

		return NULL_BYTE;
	}

}

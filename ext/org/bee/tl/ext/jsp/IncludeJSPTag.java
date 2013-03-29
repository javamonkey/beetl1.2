package org.bee.tl.ext.jsp;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bee.tl.core.Tag;
import org.bee.tl.ext.spring.WebVariable;

public class IncludeJSPTag extends Tag
{

	@Override
	public boolean requriedInput()
	{
		return false;
	}

	@Override
	public String getOutput()
	{
		//		if (args.length == 0 || args.length > 2)
		//		{
		//			throw new RuntimeException("参数错误，期望child,Map .....");
		//		}
		String child = (String) args[0];

		try
		{
			Map map = ctx.getRootVars();
			WebVariable wv = (WebVariable) map.get("servlet");
			if (wv == null)
			{
				throw new RuntimeException("不支持JSP");
			}
			HttpServletRequest request = wv.getRequest();

			HttpServletResponse response = wv.getResponse();
			if (args.length == 2)
			{
				Map<String, Object> paras = (Map<String, Object>) args[1];
				if (paras.size() != 0)
				{
					BeetlServletRequestWrapper requestWrapper = null;
					Map requestPara = request.getParameterMap();
					for (Entry<String, Object> entry : paras.entrySet())
					{
						requestPara.put(entry.getKey(), entry.getValue());
					}
					requestWrapper = new BeetlServletRequestWrapper(request, requestPara);
					request = requestWrapper;
				}

			}

			BeetlServletResponseWrapper rspWrapper = new BeetlServletResponseWrapper(response);
			request.getRequestDispatcher(child).forward(request, rspWrapper);
			return rspWrapper.getRealWriter().toString();

		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}

	}

}

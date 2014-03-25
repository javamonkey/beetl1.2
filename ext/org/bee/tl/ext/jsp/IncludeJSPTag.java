package org.bee.tl.ext.jsp;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bee.tl.core.BeetlUtil;
import org.bee.tl.core.Context;
import org.bee.tl.core.Tag;
import org.bee.tl.ext.WebPathKit;
import org.bee.tl.ext.spring.WebVariable;

public class IncludeJSPTag extends Tag
{

	String prefix ;

	@Override
	public boolean requriedInput()
	{
		return false;
	}

	@Override
	public String getOutput()
	{
		
		String child = (String) args[0];
		if(BeetlUtil.isOutsideOfRoot(child)){
			throw new RuntimeException("includeJSP 文件非法，不在根目录里:"+child);
		}
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
					
						Map newRequestParas = new HashMap();
						newRequestParas.putAll(requestPara);
						for (Entry<String, Object> entry : paras.entrySet())
						{
							newRequestParas.put(entry.getKey(), entry.getValue());
						}
						requestWrapper = new BeetlServletRequestWrapper(request, newRequestParas);
						request = requestWrapper;
						
					
					
				}

			}
		
			
			BeetlServletResponseWrapper rspWrapper = new BeetlServletResponseWrapper(response);
			String realJspPath = getJSPPath(child);
			request.getRequestDispatcher(realJspPath).include(request, rspWrapper);
			return rspWrapper.getRealWriter().toString();

		}
		catch (IOException e)
		{
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}

	}
	
	protected String getJSPPath(String child){
		if(child.startsWith("/")){
			return prefix+child;
		}else{
			return prefix+"/"+child;
		}
		
		
	}
	
	public void setContext(Context ctx)
	{

		super.setContext(ctx);
		File file = this.group.getRoot();
		File root = new File(WebPathKit.getWebRootPath());
		if(file.equals(root)){
			prefix="";
		}else{
			int len = root.getAbsolutePath().length();
			 prefix = file.getAbsolutePath().substring(len);
			
		}

	}
}

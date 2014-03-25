package org.bee.tl.ext.nutz;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;
import org.bee.tl.ext.WebConfig;
import org.bee.tl.ext.spring.SessionWrapper;
import org.bee.tl.ext.spring.WebVariable;
import org.nutz.ioc.Ioc;
import org.nutz.lang.Lang;
import org.nutz.mvc.Mvcs;
import org.nutz.mvc.View;
import org.nutz.mvc.ViewMaker;
import org.nutz.mvc.view.AbstractPathView;

/**
 * Beelt for Nutz
 * 
 * @author wendal,joelli
 * 
 */
public class BeetlViewMaker implements ViewMaker {
	private WebConfig webConfig;
	public GroupTemplate groupTemplate;
	private boolean inited;

	public void init() {
		if (inited)
			return;
		// 初始化beetl所必须的参数
		try {
			webConfig = new WebConfig();
		} catch (IOException e) {
			throw Lang.wrapThrow(e);
		}
		webConfig.updateRootPath(Mvcs.getServletContext().getRealPath("/"));
		groupTemplate = webConfig.createGroupTemplate();
//		groupTemplate.enableNativeCall();
//		groupTemplate.enableChecker(10);
//		groupTemplate.enableOptimize();
//		groupTemplate.enableDirectOutputByte();
		inited = true;
	}

	public void depose() {
		if (groupTemplate != null)
			groupTemplate.close();
	}

	
	
	public View make(Ioc ioc, String type, String value) {
		if (!inited)
			init();
		if ("beetl".equals(type))
			return new AbstractPathView(value) {
				@SuppressWarnings("unchecked")
				public void render(HttpServletRequest req,
						HttpServletResponse resp, Object obj) throws Throwable {
					// 根据路径获取一个模板
					// TODO 实现ForwardView式的带参数,有默认值的路径设置
					// TODO 空值检测
					Template template = groupTemplate.getFileTemplate(evalPath(
							req, obj));
					Enumeration attrs = req.getAttributeNames();
					while (attrs.hasMoreElements()) {
						String attrName = (String)attrs.nextElement();
						template.set(attrName, req.getAttribute(attrName));
					}
					WebVariable webVariable = new WebVariable();
					webVariable.setRequest(req);
					webVariable.setResponse(resp);
					webVariable.setSession(Mvcs.getHttpSession());
					template.set("servlet", webVariable);
					template.set("request", req);
					template.set("ctxPath", req.getContextPath());
					template.setRawValue("session", new SessionWrapper( Mvcs.getHttpSession()));
					if(groupTemplate.isDirectByteOutput()){
						template.getText(resp.getOutputStream()); // TODO做成可配置?
					}else{
						template.getText(resp.getWriter());
					}
					
				}
			};
		return null;
	}
}
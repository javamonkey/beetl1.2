package org.bee.tl.ext.spring;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;
import org.springframework.web.servlet.view.AbstractTemplateView;

public class BeetlSpringView extends AbstractTemplateView {

	
	protected void renderMergedTemplateModel(Map model,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		BeetlGroupUtilConfiguration config = (BeetlGroupUtilConfiguration) this
				.getApplicationContext().getBean("beetlConfig");
		GroupTemplate group = config.getGroupTemplate();

		Template t = group.getFileTemplate(getUrl() + config.getSuffix());
		Iterator<Entry<String, Object>> it = model.entrySet().iterator();
		Entry<String, Object> entry = null;
		while (it.hasNext()) {
			entry = it.next();
			t.set(entry.getKey(), entry.getValue());
		}
		WebVariable webVariable = new WebVariable();
		webVariable.setRequest(request);
		webVariable.setResponse(response);
		webVariable.setSession(request.getSession());

		t.set("servlet", webVariable);
		t.set("ctxPath", request.getContextPath());
		t.setRawValue("session", new SessionWrapper(request.getSession()));
		t.getText(response.getWriter());

	}

}
package org.bee.tl.ext;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bee.tl.core.GroupTemplate;
import org.bee.tl.core.Template;
import org.bee.tl.ext.spring.SessionWrapper;
import org.bee.tl.ext.spring.WebVariable;

/**
 * @author joelli
 * 
 */
public class ServletGroupTemplate
{
	protected GroupTemplate group;
	protected String root = "/";
	protected String webPath = null;
	protected String tempFolder = null;
	protected boolean optimize = true;
	protected boolean keepSource = false;
	protected boolean nativeCall = true;
	protected String statementStart = "<%";
	protected String statementEnd = "%>";
	protected String placeholderStart = "${";
	protected String placeholderEnd = "}";
	protected String charset = "GBK";
	protected boolean directByte = false;
	Logger logger = Logger.getLogger(ServletGroupTemplate.class.toString());
	// 每2秒检测一次,用于开发
	int check = 2;

	static ServletGroupTemplate instance = new ServletGroupTemplate();

	private ServletGroupTemplate()
	{

	}

	/**
	 * 返回GroupTemplate，由于方法命名失误，所以请使用instance()
	 * 
	 * @return
	 */
	@Deprecated
	public static ServletGroupTemplate intance()
	{
		return instance;
	}

	/**
	 * 原来的方法名错误了,请使用此
	 * 
	 * @return
	 */
	public static ServletGroupTemplate instance()
	{
		return instance;
	}

	public GroupTemplate getGroup()
	{
		return this.group;
	}

	public void init(ServletContext sc)
	{

		this.root = getString(sc, "GroupTemplate.Root", "/");
		// 可能为null
		webPath = sc.getRealPath("/");
		this.root = webPath + File.separator + this.root;
		this.tempFolder = getString(sc, "GroupTemplate.TempFolder", null);
		this.optimize = Boolean.parseBoolean(getString(sc, "GroupTemplate.Optimize", "true"));
		this.keepSource = Boolean.parseBoolean(getString(sc, "GroupTemplate.KeepSource", "false"));
		this.nativeCall = Boolean.parseBoolean(getString(sc, "GroupTemplate.NativeCall", "true"));

		this.statementStart = getString(sc, "GroupTemplate.StatementStart", "<%");
		this.statementEnd = getString(sc, "GroupTemplate.StatementEnd", "%>");
		this.placeholderStart = getString(sc, "GroupTemplate.PlaceholderStart", "${");
		this.placeholderEnd = getString(sc, "GroupTemplate.PlaceholderEnd", "}");
		this.charset = getString(sc, "GroupTemplate.Charset", "GBK");
		this.check = Integer.parseInt(getString(sc, "GroupTemplate.Check", "2"));
		this.directByte = Boolean.parseBoolean(getString(sc, "GroupTemplate.DirectByteOutput", "false"));
		initGroup();

	}

	/**
	 * 获取一个模板，并将seesion，ctxPath作为变量放到template里,将request中的所有变量放到模板里
	 * 
	 * @param child
	 *            模板路径
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 */
	public Template getTemplate(String child, HttpServletRequest request, HttpServletResponse response)
			throws IOException
	{
		Template t = group.getFileTemplate(child);
		Enumeration en = request.getAttributeNames();
		while (en.hasMoreElements())
		{
			String key = (String) en.nextElement();
			t.set(key, request.getAttribute(key));
		}

		WebVariable webVariable = new WebVariable();
		webVariable.setRequest(request);
		webVariable.setResponse(response);
		webVariable.setSession(request.getSession());

		t.set("servlet", webVariable);
		t.set("request", request);
		t.set("ctxPath", request.getContextPath());
		t.setRawValue("session", new SessionWrapper(request.getSession()));
		return t;

	}

	private String getString(ServletContext sc, String name, String defaultValue)
	{
		String temp = sc.getInitParameter(name);
		if (temp != null)
		{
			return temp;
		}
		else
		{
			return defaultValue;
		}
	}

	private void initGroup()
	{

		group = new GroupTemplate(new File(root));
		group.config(statementStart, statementEnd, placeholderStart, placeholderEnd);
		if (tempFolder != null)
		{
			group.setTempFolder(tempFolder);
		}
		else
		{
			if (webPath == null || webPath.length() == 0)
			{
				// 可能采用war部署方式
				String tempRoot = System.getProperty("user.dir") + File.separator + ".bee" + File.separator
						+ tempFolder;
				File target = new File(tempRoot);
				target.mkdirs();
				group.setTempFolder(target.toString());
				logger.warning("war包运行方式不能得到正确的绝对路径" + webPath + "，请显式的设置tempFolder的绝对路径,目前target位于用户主目录下:" + target);
			}
			else
			{
				File target = new File(webPath + File.separator + "WEB-INF", ".temp");
				target.mkdirs();
				tempFolder = target.toString();
				group.setTempFolder(target.toString());
			}

		}

		if (nativeCall)
			group.enableNativeCall();
		if (optimize)
		{
			if (this.keepSource)
			{
				Map optimizeConfigMap = new HashMap();
				optimizeConfigMap.put(GroupTemplate.OPTIMIZE_KEEP_SOURCE, true);
				group.enableOptimize(optimizeConfigMap);
			}
			else
			{
				group.enableOptimize();
			}

			logger.info("Beetl允许优化，位于:" + tempFolder);
		}
		if (check != 0)
			group.enableChecker(check);
		group.setCharset(charset);

		if (this.directByte)
		{
			group.enableDirectOutputByte();
		}

	}

	public String getRoot()
	{
		return root;
	}

	public void setRoot(String root)
	{
		this.root = root;
	}

	public String getTempFolder()
	{
		return tempFolder;
	}

	public void setTempFolder(String tempFolder)
	{
		this.tempFolder = tempFolder;
	}

	public boolean isOptimize()
	{
		return optimize;
	}

	public void setOptimize(boolean optimize)
	{
		this.optimize = optimize;
	}

	public boolean isNativeCall()
	{
		return nativeCall;
	}

	public void setNativeCall(boolean nativeCall)
	{
		this.nativeCall = nativeCall;
	}

	public String getStatementStart()
	{
		return statementStart;
	}

	public void setStatementStart(String statementStart)
	{
		this.statementStart = statementStart;
	}

	public String getStatementEnd()
	{
		return statementEnd;
	}

	public void setStatementEnd(String statementEnd)
	{
		this.statementEnd = statementEnd;
	}

	public String getPlaceholderStart()
	{
		return placeholderStart;
	}

	public void setPlaceholderStart(String placeholderStart)
	{
		this.placeholderStart = placeholderStart;
	}

	public String getPlaceholderEnd()
	{
		return placeholderEnd;
	}

	public void setPlaceholderEnd(String placeholderEnd)
	{
		this.placeholderEnd = placeholderEnd;
	}

	public String getCharset()
	{
		return charset;
	}

	public void setCharset(String charset)
	{
		this.charset = charset;
	}

	public Logger getLogger()
	{
		return logger;
	}

	public void setLogger(Logger logger)
	{
		this.logger = logger;
	}

	public int getCheck()
	{
		return check;
	}

	public void setCheck(int check)
	{
		this.check = check;
	}

	public void setGroup(GroupTemplate group)
	{
		this.group = group;
	}

}

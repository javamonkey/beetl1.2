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
package org.bee.tl.core;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.bee.tl.core.cache.CachedScriptItem;
import org.bee.tl.core.cache.CachedScriptRunner;
import org.bee.tl.core.cache.CompiledClassMap;
import org.bee.tl.core.compile.CompileFactory;

/**
 *  系统的主要类，通过此类可以完成所有的模版渲染工作，分别说明说下：
 *  <p>
 *  
 *  可以通过模版内容作为参数获得接口类Template，模版内容可以是字符串，也可以是文件
 *  （在此情况下，需要通过GroupTemplate.setCharset(String cs)设定文件字符集)，还可以是Reader
 *  </p>
 *  <p>
 *  模版的渲染结果可以作为String输出，也可以作为Writer，以及OutputStream流输出
 *  </p>
 *  <p>
 *  模版有俩种运行引擎，
 *  <ul>
 *  <li>一种是解释执行引擎，这可以用于 代码生成或者开发阶段使用，
 *  另外一种是编译模版引擎，此可以用Web开发以及对性能有较高的要求应用能够场景，
 *  默认情况下，使用解释执行引擎CoreScriptRunner，
 *  </li>
 *  <li>如果GroupTemplate.enableOptimize,
 *  则GroupTemplate会尝试编译模版为java Class，如果编译成功，则直接调用Class来渲染模版，
 *  如果暂时不具备编译情况则以解释方式执行（如某些全局变量类型未确定），
 *  如果检查无法编译为Class，则此模版按照解释方式执行
 *  </li>
 *  </ul>
 *  
 *  GroupTemplate默认情况下不需要做任何设置就能运行，但仍然能允许根据应用场景来设置模版渲染的策略，使用者依据自己的情况做出如下选择
 *  <ul>
 *  <li>
 *  高性能：采用编译引擎groupTemplate.enableOptimize().，并允许二进制输出groupTemplate.enableDirectOutputByte()
 *  输出必须使用Template.getText(OutputStream os)
 *  </li>
 *  <li>
 *  允许直接调用class的方法或者属性，groupTemplate.enableNativeCall(),默认情况下，java.lang下的所有类都不允许在模版里调用
 *  以避免出现安全问题，可以调用setNativeCallFilter来设置自己的黑名单，如：
 *  <pre>
 *     String[] black = new String[]{"java.lang","com.xx.service"};
 *     groupTemplate.setNativeCallFilter(Collections.asList(black));
 *  </pre>
 *  </li>
 *  <li>
 *  使用最严厉的MVC策略，模版里只能有渲染逻辑，严禁模版里出现任何业务逻辑,详情参考<code>enableStrict</code>方法
 *  </li>
 *  <li>
 *  设置模版占位符，默认情况是流行的${ 和 } , 设置控制语句分界符，默认是&lt;% %&gt;, beetl支持分解结束符为回车，只要设置
 *  其结束符为null即可，如GroupTemplte.config("#:",null,"${","}"),则可以解析如下模版
 *  <blockquote><pre>
 *  #:for(user in userList){
 *  hello,${user.name}!
 *  其他模版内容......
 *  #:}
 *  </pre></blockquote>
 *  </li>
 *  <li>
 *  设置异常处理方法，如果模版语法解析或者运行过程出出异常，默认情况下，通过<code>DefaultErrorHandler</code>
 *  来处理，即在控制台错误行数，上下3行的内容，错误符号（仅仅解释方式可以），错误原因，和错误异常栈。如果你需要自己处理异常
 *  可以调用方法<code>setErrorHandler</code>，如果传入null，则Template渲染模版失败会直接抛出异常，你需要Catch并自己处理，如下代码
 *  <blockquote><pre>
 *  groupTemplate.setErrorHandler(null);
 *  try{
 *     //模版执行代码 
 *  }catch(BeeException bee){
 *   
 *  	DefaultErrorHandler h = new DefaultErrorHandler();
 *  	h.processExcption(e);
 *      throw new YourAppException("模版执行错误")
 *  }
 *  
 *  </pre></blockquote>
 *  </li>
 *  <li>
 *  如果使用模版文件作为输入，默认情况下，回俩秒检测一次模版文件是否更新，如果更新则重新加载模版，此方式适合开发，如果在生产环境
 *  不需要检测模版文件是否更新，则调用<code>enableChecker(0)</code> 即可
 *  </li>
 *  </ul>
 *  
 *  除了以上设置外，Beetl支持通过GroupTemplate来扩展，允许
 *  <ul>
 *  <li>
 *  自定义方法，请参考<code>Function</code>,内置的有date,print,println,exist,nvl,decode等
 *  </li>
 *  <li>
 *  自定义格式化函数，请参考<code>Format</code>,内置的有dateFormat，numberFormat等
 *  </li>
 *  <li>
 *  自定义标签，请参考<code>Tag</code>，内置有include,layout等
 *  </li>
 *  <li>
 *  自定义虚拟属性,请参考<code>VirtualAttributeEval</code>，内置有为集合，数组定义的虚拟属性size
 *  </li>
 *  </ul>
 * 
 *  
 * 
 * </ul>
 * 
 * 可以通过Config类读取配置文件来创建GroupTemplate，详情请参考<code>GroupTemplate</code>
 * @author joelli
 * 
 */
public class GroupTemplate
{

	public static GroupTemplate defaultGroup = new GroupTemplate();

	String placeholderStart = "${";
	String placeholderEnd = "}";
	String statementStart = "<%";
	String statementEnd = "%>";
	//文件模板根目录
	File root = null;
	//根目录别名
	String rootAlias;
	ScriptGlobal scriptGlobal = ScriptGlobal.createScriptGlobal();

	static Logger logger = Logger.getLogger(GroupTemplate.class.toString());
	//编译成class的输出目录
	String tempFolder = null;

	CachedScriptRunner cachedRuntime = new CachedScriptRunner();
	//存储输入是string，或者reader的预编译模板文件
	List<String> stringTemplateList = Collections.synchronizedList(new LinkedList<String>());
	CompiledClassMap classMap = null;
	ThreadPoolExecutor futureComplileExecutor = null;

	// 允许编译成class 以提高运行效率
	private boolean optimize = false;
	// 开发用，用于输出更多信息，以及忽略cache
	private boolean debug = false;
	boolean nativeCall = false;
	boolean checkTemplateUpdate = true;
	boolean directByteOutput = false;
	boolean isStrict = false;
	boolean isBigNumberSupport = true ;
	// 每隔5秒检测一次
	int checkTemplatePeriod = 5;
	//检测线程
	Thread thread = null;

	URLClassLoader classLoader;

	String targetClassPath;
	String targetSrcPath;
	String extraClassPath;
	String charset = "GBK";

	// boolean useByte = false ; /*对模板离得文本以二进制方式存储和输出*/
	ErrorHandler errorHandler = new DefaultErrorHandler();

	protected Map<String, Object> optimizeConfigMap = new HashMap<String, Object>();
	public static String OPTIMIZE_KEEP_SOURCE = "OPTIMIZE_KEEP_SOURCE";
	public static String OPTIMIZE_COMPILE_LATTER = "OPTIMIZE_COMPILE_LATTER";
	public static String OPTIMIZE_COMPILE_WORKER_NUM = "OPTIMIZE_COMPILE_WORKER_NUM";

	/**
	 * 得到错误处理类
	 * 
	 * @return
	 */
	public ErrorHandler getErrorHandler()
	{
		return errorHandler;
	}

	/**
	 * 设置错误处理类，如果errorHandler为null，groupTemplate不处理错误，交给开发者处理
	 * 
	 * @param errorHandler
	 */
	public void setErrorHandler(ErrorHandler errorHandler)
	{
		this.errorHandler = errorHandler;
	}

	public GroupTemplate()
	{

		init();
	}

	/**
	 * 初始化GroupTemplate，模板文件位于root目录
	 * 
	 * @param root
	 */
	public GroupTemplate(File root)
	{
		this();
		this.root = root;

		this.rootAlias = root.getName();

	}

	/**
	 * 初始化GroupTemplate，模板文件位于root目录，同时，预编译的时候，存放在alias所指示的别名目录下
	 * 
	 * @param root
	 * @param alias
	 */
	public GroupTemplate(File root, String alias)
	{
		this();
		this.root = root;

		this.rootAlias = alias;
	}

	/**
	 * 得到一个以解释方式运行的模板，输入是字符串。如果需要缓存模版，需要调用
	 * <code>getStringTemplate(String input, String key)</code>
	 * 
	 * @param input
	 * @return
	 */
	public Template getStringTemplate(String input)
	{

		BeeTemplate template = new BeeTemplate(input);
		this.setConfig(template);

		return template;

	}

	/** 得到一个模版，输入是input，模版用key作为缓存，可以通过调用<code>removeTemplateCache</code>
	 * 来手工删除模版缓存。
	 * @param input
	 * @param key 因为beetl将会将此输入存入到临时目录，且文件名为key，请保证key值得合法性
	 * 如果使用了enableOptimize方法，此key将为class类名
	 * @return
	 * @throws IOException
	 */
	public Template getStringTemplate(String input, String key) throws IOException
	{

		return this.getReaderTemplate(new StringReader(input), key);

	}

	private void setConfig(BeeTemplate template)
	{
		template.scriptRunner.global = this.scriptGlobal;
		template.setGroupTemplate(this);

		if (this.directByteOutput)
		{
			template.scriptRunner.enableDirectOutputByte();
		}
		if (isStrict)
		{
			template.scriptRunner.enableStrict();
		}
		if (nativeCall)
		{
			template.scriptRunner.enableNativeCall();
		}
		template.scriptRunner.setBigNumberSupport(this.isBigNumberSupport);
		
		template.config(this.statementStart, this.statementEnd, this.placeholderStart, this.placeholderEnd);

	}

	/**
	 * 得到一个模板，输入是一个Reader，如果需要缓存模版，需要调用
	 * <code>getReaderTemplate(Reader reader, String key) </code>
	 * 
	 * @param reader
	 * @return
	 * @throws IOException
	 */
	public Template getReaderTemplate(Reader reader) throws IOException
	{
		BeeTemplate template = new BeeTemplate(reader);
		setConfig(template);
		return template;
	}

	/**得到一个字符串模板，且缓存，键值为Key
	 * @param reader
	 * @param key 因为beetl将会将此输入存入到临时目录，且文件名为key，请保证key值得合法性
	 * 如果使用了enableOptimize方法，此key将为class类名
	 * @return
	 * @throws IOException
	 */
	public Template getReaderTemplate(Reader reader, String key) throws IOException
	{

		if (this.root == null)
		{

			if (this.optimize)
			{
				this.root = new File(this.tempFolder);
			}
			else
			{
				if (tempFolder == null)
				{

					tempFolder = System.getProperty("BEE_GENERATED_CLASS_PATH");
					if (tempFolder == null)
					{
						tempFolder = System.getProperty("user.home") + File.separator + ".bee";
					}
				}
				this.root = new File(this.tempFolder);
			}
			if (!this.root.exists())
				this.root.mkdirs();

		}

		if (!this.containTempStringFile(key))
		{
			this.saveTempStringFile(key, reader);
		}
		if (!stringTemplateList.contains(key))
		{
			stringTemplateList.add(key);
		}

		return this.getFileTemplate("/strtemp/" + key + ".txt");

	}

	/**删除模板缓存。参考 <code>getReaderTemplate(Reader reader, String key)</code> 和 
	 *<code>getReaderTemplate(String input, String key)</code>
	 * @param key
	 */
	public void removeTemplateCache(String key)
	{

		if (this.optimize)
		{
			this.classMap.removeClass(key);
			if (stringTemplateList.contains(key))
			{

				File file = new File(this.tempFolder + File.separator + "strtemp" + File.separator + key + ".txt");
				if (!file.delete())
				{
					logger.info("删除String模板失败");
				}

			}
			//@todo：有问题，对于字符串模板，需要删除文件

		}
		else
		{

			this.cachedRuntime.removeCache(key);

		}
	}

	/**
	 * 得到一个文件模板,调用此方法，必须首先以模版root目录为参数构造GroupTemplate
	 * 
	 * @param child
	 *            模板文件相对于root目录的位置，譬如/error/404.html
	 * @return
	 * @throws IOException
	 */
	public Template getFileTemplate(String child) throws IOException
	{

		if (root == null)
		{
			throw new IllegalArgumentException("Must set Root,like this:GroupTemplate group = new GroupTemplate(root);");
		}
		if (this.optimize)
		{
			CompiledBeeTemplate template = new CompiledBeeTemplate(child, this);

			return template;

		}
		else
		{

			BeeTemplate template = null;

			CachedScriptItem cachedItem = cachedRuntime.getCoreScriptRunner(child);

			if (cachedItem == null)
			{
				Transformator tf = new Transformator(placeholderStart, placeholderEnd, this.statementStart,
						this.statementEnd);
				Resource resource = new Resource(child, root, this.charset);
				Reader textReader = resource.getReader();
				Reader scriptReader = tf.transform(textReader);
				CoreScriptRunner scriptRunner = new CoreScriptRunner();
				scriptRunner.setScriptInputReader(scriptReader);

				if (this.directByteOutput)
				{
					// 直接二进制输出
					Map<String, String> texts = tf.getTextMap();
					Map<String, byte[]> byteMap = new HashMap<String, byte[]>(texts.size());
					for (Map.Entry<String, String> entry : texts.entrySet())
					{
						byteMap.put(entry.getKey(), entry.getValue().getBytes(this.charset));
					}

					scriptRunner.textVar = byteMap;
					scriptRunner.enableDirectOutputByte();
				}
				else
				{

					scriptRunner.textVar = tf.getTextMap();
				}
				resource.setCR(tf.lineSeparator);
				scriptRunner.setCharset(this.charset);
				scriptRunner.setCR(tf.lineSeparator);

				if (this.isStrict)
				{
					scriptRunner.enableStrict();
				}

				if (this.nativeCall)
				{
					scriptRunner.enableNativeCall();
				}
				scriptRunner.setBigNumberSupport(this.isBigNumberSupport);				
				scriptRunner.setGlobal(this.scriptGlobal);
				scriptRunner.parse();
				tf.clear();
				cachedRuntime.updateCache(scriptRunner, resource);
				template = new BeeTemplate(resource, scriptRunner);
				template.setGroupTemplate(this);

			}
			else
			{

				CoreScriptRunner scriptRunner = cachedItem.scriptRunner;
				template = new BeeTemplate(cachedItem.res, scriptRunner);
				template.setGroupTemplate(this);
			}

			return template;
		}
	}

	private void init()
	{

	}

	/**
	 * 配置模板
	 * 
	 * @param statementStart
	 * @param statementEnd
	 * @param holderStart
	 * @param holderEnd
	 */
	public void config(String statementStart, String statementEnd, String holderStart, String holderEnd)
	{
		this.setStatementStart(statementStart);
		this.setStatementEnd(statementEnd);
		this.setPlaceholderStart(holderStart);
		this.setPlaceholderEnd(holderEnd);
	}

	/**
	 * @param statementStart
	 * @param statementEnd
	 * @param holderStart
	 * @param holderEnd
	 * @param optimize
	 *            是否优化，即运行时刻 编译成class
	 */
	public void config(String statementStart, String statementEnd, String holderStart, String holderEnd,
			boolean optimize)
	{
		this.setStatementStart(statementStart);
		this.setStatementEnd(statementEnd);
		this.setPlaceholderStart(holderStart);
		this.setPlaceholderEnd(holderEnd);
		if (optimize)
			this.enableOptimize();
	}

	/**
	 * @param statementStart
	 * @param statementEnd
	 * @param holderStart
	 * @param holderEnd
	 * @param optimize
	 *            是否优化，即运行时刻 编译成class
	 * @param nativeCall
	 *            是否运行模板里直接调用java类属性或者方法
	 */
	public void config(String statementStart, String statementEnd, String holderStart, String holderEnd,
			boolean optimize, boolean nativeCall)
	{
		this.setStatementStart(statementStart);
		this.setStatementEnd(statementEnd);
		this.setPlaceholderStart(holderStart);
		this.setPlaceholderEnd(holderEnd);
		if (optimize)
			this.enableOptimize();
		if (nativeCall)
			this.enableNativeCall();
	}

	/**
	 * 设置严格MVC模式，变量定义，算式表达式，复杂的逻辑表达式，方法调用等都将不被允许。这有助于模板视图分离 下列例子在此严格MVC摸下都将报错
	 * <p>
	 * 
	 * <pre>
	 * &lt;%var x = 1 ;%&gt;
	 * ${x+y}
	 * &lt;%if(x&gt;1){%&gt;
	 * ${callFunction()}
	 * </pre>
	 * 
	 */
	public void enableStrict()
	{
		// 设置模板语言是否是严格的MVC，即不运行表达式，临时变量等
		this.isStrict = true;
	}

	/**
	 * 允许将模板里的文本以byte方式直接输出，这样会省略字符集编码，提高20%性能以及CPU消耗，此方式是用还必须配合
	 * getText(OutputStream os)是用，否则使用无效 默认不开启
	 * 
	 * 
	 */
	public void enableDirectOutputByte()
	{
		this.directByteOutput = true;
	}

	public void disableDirectOutputByte()
	{
		this.directByteOutput = false;
	}

	/**
	 * 允许本地调用, 可以调用instance的public方法和属性，也可以调用静态类的属性和方法 ,需要加一个@指示此调用是直接调用class
	 * <p>
	 * 
	 * <pre>
	 * 
	 * 
	 * 	$@user.getMaxFriend(“lucy”)$
	 * 	$@user.maxFriend$
	 * 	$@com.xxxx.constants.Order.getMaxNum()$
	 * 	$@com.xxxx.constants.Order.MAX_NUM$
	 * </pre>
	 */
	public void enableNativeCall()
	{
		this.nativeCall = true;
	}

	/**
	 * 注册一个虚拟属性,虚拟属性为java对象添加额外的显示属性而不需要重写java类
	 * 
	 * @param e
	 */
	public void registerVirtualAttributeEval(VirtualAttributeEval e)
	{
		scriptGlobal.registerVirtualAttributeEval(e);

	}

	/**
	 * 注册一个自定义函数,参考{@link org.bee.tl.ext.DateFunction} 注意，不能定义一个同名标签
	 * 
	 * @param name
	 * @param fn
	 */
	public void registerFunction(String name, Function fn)
	{
		scriptGlobal.registerFunction(name, fn);
	}

	/**
	 * 注册一个function包，包名由packageName指定，方法名是对象o里的所有方法
	 * 如果方法定义为void，则方法返回null，如果方法参数最后一个Context，则传入一个Context
	 * 
	 * @param packageName
	 * @param o
	 */
	public void registerFunctionPackage(String packageName, Object o)
	{
		
		this.scriptGlobal.registerFunctionPackage(packageName, o);

	}

	/**
	 * 注册一个自定义标签，参考{@link org.bee.tl.ext.IncludeFileTemplate} 注意，不能定义一个同名函数
	 * 
	 * @param name
	 * @param tag
	 */
	public void registerTag(String name, Class tag)
	{
		scriptGlobal.registerTag(name, tag);
	}

	/**
	 * 注册一个自定义格式化函数，参考{@link org.bee.tl.ext.DateFormat}
	 * 
	 * @param name
	 * @param format
	 */
	public void registerFormat(String name, Format format)
	{

		scriptGlobal.registerFormat(name, format);
	}
	
	
	public void registerDefaultFormat(Class type,Format format){
			this.scriptGlobal.registerDefaultFormat(type, format);
	}
	
	
	
	/**
	 * 添加一个共享变量，这样，所有模板都能读取到共享变量
	 * 
	 * @param name
	 * @param value
	 */
	public void addSharedVarible(String name, Object value){
		this.scriptGlobal.addSharedVarible(name, value);
	}
	
	public Object getSharedVarible(String name){
		return this.scriptGlobal.getSharedVarible(name);
	}
	

	protected VirtualAttributeEval getVirtualAttributeEval(Class c, String attributeName)
	{
		return scriptGlobal.getVirtualAttributeEval(c, attributeName);
	}

	protected Tag getTag(String name)
	{
		return scriptGlobal.getTag(name);

	}

	public Function getFunction(String name)
	{
		return scriptGlobal.getFunction(name);
	}

	public Format getFormat(String name)
	{
		return scriptGlobal.getFormat(name);
	}

	public boolean containFunction(String name)
	{
		return scriptGlobal.containFunction(name);
	}

	public boolean containTag(String name)
	{
		return scriptGlobal.containTag(name);
	}

	public boolean containFormat(String name)
	{
		return scriptGlobal.containFormat(name);
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

	/**
	 * 运行groupTemplate优化模板，即编译成class运行,class位于tempFolder目录下，如果未通过
	 * {@link #setTempFolder(int, int) setTempFolder} 设置，则class存放在用户主目录下的.bee目录下
	 */
	public boolean enableOptimize()
	{

		if (!checkCompileEnv())
		{
			return false;
		}

		this.optimize = true;
		this.classMap = new CompiledClassMap(this);
		if (tempFolder == null)
		{

			tempFolder = System.getProperty("BEE_GENERATED_CLASS_PATH");
			if (tempFolder == null)
			{
				tempFolder = System.getProperty("user.home") + File.separator + ".bee";
			}
		}
		targetClassPath = tempFolder + File.separator + this.getRootAlias() + File.separator + "classes";
		targetSrcPath = targetClassPath;

		if (optimizeConfigMap != null)
		{
			Object keep = optimizeConfigMap.get(GroupTemplate.OPTIMIZE_KEEP_SOURCE);
			if (keep != null && ((Boolean) keep).booleanValue())
			{
				// 如果需要保持生成的原有文件,将原程序生成到单独一个目录
				targetSrcPath = tempFolder + File.separator + this.getRootAlias() + File.separator + "src";
			}

		}

		new File(targetClassPath).mkdirs();
		new File(targetSrcPath).mkdirs();
		newLoader();
		return true;

	}

	public void enableOptimize(Map optimizeConfigMap)
	{
		this.optimizeConfigMap = optimizeConfigMap;
		Boolean compileAsAnotherThread = (Boolean) optimizeConfigMap.get(this.OPTIMIZE_COMPILE_LATTER);
		if (compileAsAnotherThread != null && compileAsAnotherThread.booleanValue())
		{
			// 异步编译，避免web启动的时候大量访问阻塞在beetl优化的时候
			Integer numInteger = (Integer) optimizeConfigMap.get(this.OPTIMIZE_COMPILE_WORKER_NUM);
			int workerNum = 1;
			if (numInteger != null)
			{
				workerNum = numInteger.intValue();
			}
			this.futureComplileExecutor = new ThreadPoolExecutor(workerNum, workerNum, 100, TimeUnit.SECONDS,
					new LinkedBlockingQueue());
		}

		enableOptimize();
	}

	protected URLClassLoader getTemplateClassLoader()
	{
		return classLoader;
	}

	/**
	 * 如果模板文件更新，beetl将重新编译此模板，并通过新的classloader使用新编译模板文件
	 */
	protected synchronized void newLoader()
	{
		try
		{
			URL url = new File(targetClassPath).toURI().toURL();
			if (this.extraClassPath != null)
			{
				String[] urls = this.extraClassPath.split(";");
				URL[] classUrl = new URL[urls.length + 1];
				int i = 0;
				for (String u : urls)
				{
					classUrl[i++] = new File(u).toURL();
				}
				classUrl[i] = url;
				classLoader = new URLClassLoader(classUrl, this.getClass().getClassLoader());

			}
			else
			{
				classLoader = new URLClassLoader(new URL[]
				{ url }, this.getClass().getClassLoader());
			}

		}
		catch (MalformedURLException e)
		{
			//不可能发生
			e.printStackTrace();
		}
	}

	public String getTargetClassPath()
	{
		return targetClassPath;
	}

	public String getTargetSrcPath()
	{
		return targetSrcPath;
	}

	public String getRootAlias()
	{
		if (rootAlias == null)
		{
			return "tempoutput";
		}
		else
		{
			return rootAlias;
		}
	}

	public boolean isDebug()
	{
		return debug;
	}

	/**
	 * 开发使用，用于取消缓存，以及输出更为详细的调试信息
	 * 
	 * @param debug
	 */
	public void setDebug(boolean debug)
	{
		this.debug = debug;
	}

	public boolean isCheckTemplateUpdate()
	{
		return checkTemplateUpdate;
	}

	public int getCheckTemplatePeriod()
	{
		return checkTemplatePeriod;
	}

	public String getTempFolder()
	{
		return tempFolder;
	}

	public void setTempFolder(String tempFolder)
	{
		this.tempFolder = tempFolder;
	}

	public String getExtraClassPath()
	{
		return extraClassPath;
	}

	/**
	 * 设置预编译功能需要额外的classpath，一般用不到
	 * 
	 * @param extraClassPath
	 */
	public void setExtraClassPath(String extraClassPath)
	{
		this.extraClassPath = extraClassPath;
	}

	/**
	 * 检查模板文件是否变动，单位是秒，在开发模式下，设置1秒，2秒都可以，在产品模式下，设置为0，将不检查模板更新
	 * 
	 * @param period
	 */
	public void enableChecker(final int period)
	{
		if (period == 0)
			return;
		if (thread != null)
			return;

		thread = new Thread(new Runnable() {

			public void run()
			{
				while (true)
				{

					try
					{
						if (GroupTemplate.this.cachedRuntime != null)
							GroupTemplate.this.cachedRuntime.checkTemplateUpdate();
						if (GroupTemplate.this.classMap != null)
							GroupTemplate.this.classMap.checkTemplateUpdate();
						Thread.sleep(1000 * period);
					}
					catch (InterruptedException e)
					{

						return;
					}
				}

			}

		}, "Beetl-Scanner");
		thread.setDaemon(true);
		thread.start();
	}

	public String getCharset()
	{
		return charset;
	}

	/**
	 * 如果使用模板文件，此方法设置文件的编码格式
	 * 
	 * @param charSet
	 */
	public void setCharset(String charSet)
	{
		this.charset = charSet;

	}

	/**
	 * 关闭GroupTemplate，清除一些使用资源
	 */
	public void close()
	{
		if (thread != null)
			thread.interrupt();
		thread = null;
	}

	public Map<String, Object> getOptimizeConfigMap()
	{
		return optimizeConfigMap;
	}

	public boolean isDirectByteOutput()
	{
		return directByteOutput;
	}
	
	public void setBigNumberSupport(boolean support){
		this.isBigNumberSupport = support;
	}
	
	public boolean isBigNumberSupport(){
		return this.isBigNumberSupport;
	}

	public List<String> getNativeCallFilter()
	{
		return this.scriptGlobal.illegaleNativeCall;
	}

	public void setNativeCallFilter(List<String> nativeCallFilter)
	{
		scriptGlobal.illegaleNativeCall = nativeCallFilter;

	}

	private boolean containTempStringFile(String fileName)
	{
		File file = new File(this.tempFolder + File.separator + "strtemp" + File.separator + fileName + ".txt");
		return file.exists();
	}

	private File saveTempStringFile(String fileName, Reader rs) throws IOException
	{

		File parent = new File(this.tempFolder + File.separator + "strtemp");
		parent.mkdirs();
		File file = new File(this.tempFolder + File.separator + "strtemp" + File.separator + fileName + ".txt");

		BufferedWriter fw = new BufferedWriter(new FileWriter(file));
		char[] cs = new char[1024];
		int len = 0;
		while ((len = rs.read(cs)) != -1)
		{
			fw.write(cs, 0, len);
		}
		fw.close();
		return file;
	}

	/**
	 * Test the current evn support javac
	 */
	private boolean checkCompileEnv()
	{
		return CompileFactory.compileSupport(this);
	}

	public File getRoot()
	{
		return root;
	}

	public ThreadPoolExecutor getFutureComplileExecutor()
	{
		return futureComplileExecutor;
	}

	public URLClassLoader getClassLoader()
	{
		return classLoader;
	}

	public void setClassLoader(URLClassLoader classLoader)
	{
		this.classLoader = classLoader;
	}

}

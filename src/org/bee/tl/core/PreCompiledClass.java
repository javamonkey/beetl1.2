/*
 [The "BSD license"]
 Copimport java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;
import java.util.Map;

import org.bee.tl.core.compile.BeetlCodeGenerator;
import org.bee.tl.core.compile.CompileFactory;
import org.bee.tl.core.compile.CompiledClass;
import org.bee.tl.core.compile.CompiledClassMap;
import org.bee.tl.core.compile.JavaCompiler;
import org.bee.tl.core.compile.PreCompileException;
claimer in the
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

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.bee.tl.core.compile.BeetlCodeGenerator;
import org.bee.tl.core.compile.CompileFactory;
import org.bee.tl.core.compile.CompileTask;
import org.bee.tl.core.compile.CompiledClass;
import org.bee.tl.core.compile.JavaCompiler;
import org.bee.tl.core.exception.PreCompileException;
import org.bee.tl.core.exception.VaribaleCastException;
import org.bee.tl.core.io.ByteWriter;

public class PreCompiledClass extends CompiledClass
{

	File root;
	String child;

	// 写，并发问题
	TypeTable typeTable = null;

	File file = null;
	long lastModified = 0;
	boolean isCompiling = false;
	static Logger logger = Logger.getLogger(PreCompiledClass.class.toString());
	GroupTemplate group = null;

	public void init(String child, GroupTemplate group, CoreScriptRunner scriptRunner, Resource resource)
			throws IOException
	{
		this.group = group;
		this.root = group.root;
		this.child = child;
		this.scriptRunner = scriptRunner;
		this.resource = resource;
		file = new File(this.root.toString(), child);
		lastModified = file.lastModified();
		if (!scriptRunner.isParseSuccess)
		{
			this.compileError = true;
			return;
		}
		typeTable = new TypeTable(scriptRunner);

		/**
		 * 为了预编译，必须确定模板里的变量类型（对应的java class），因此首先 分析模板里有哪些变量需要知道其类型，如下模板 var
		 * wife = user.wife ; print(wife.name)
		 * 
		 * 此模板里，只需要知道user的类型，也就知道了wife类型，因此，user类型是必须知道的，analyseFirst方法用来确定
		 * 哪些变量是必须要知道类型的
		 * 
		 */
		typeTable.analyseFirst((BeeCommonNodeTree) scriptRunner.tree);

	}

	@Override
	public long getVersion()
	{
		return lastModified;
	}

	/**
	 * 预编译发生错误，或者正在预编译的时候调用此方法。 2011-10-27
	 * 
	 */
	private void runAsRuntimeTemplate(ByteWriter out, Context ctx) throws IOException, BeeException
	{

		BeeTemplate newTemplate = new BeeTemplate(this.resource, scriptRunner);
		newTemplate.setGroupTemplate(this.group);
		newTemplate.setContext(ctx);
		newTemplate.getTextByByteWriter(out);
	}

	/* 
	 */
	public void service(final ByteWriter out, final Context ctx) throws IOException, BeeException
	{

		ctx.set("__pw", out);

		if (isCompiling || this.isCompileError())
		{
			// 解释执行
			runAsRuntimeTemplate(out, ctx);
			return;
		}
		if (typeTable.mustInfer())
		{
			// 变量表中仍然有变量未确定类型
			collectAllVariableFromContext(ctx);
			// 解释执行
			runAsRuntimeTemplate(out, ctx);
			return;
		}

		// 如果需要的类型都已经确定，类型推测
		Context typeContext = new Context();
		for (String varName : typeTable.allType())
		{
			// 设置已知到类型
			typeContext.set(varName, typeTable.getTypeClass(varName));
		}

		try
		{

			// 推测未知类型
			if ((BeeCommonNodeTree) scriptRunner.tree != null)
			{
				typeTable.infer((BeeCommonNodeTree) scriptRunner.tree, typeContext);
			}

		}
		catch (PreCompileException ex)
		{
			// 如果推测失败，譬如json数据格式无法编译成class
			ex.printStackTrace();
			logger.info("优化失败:" + this.child + ",原因是" + ex.getMessage() + ",此模板" + resource.file.getName()
					+ "将按照解释方式执行");
			this.setCompileError(true);
			runAsRuntimeTemplate(out, ctx);
			return;

		}
		if (group.futureComplileExecutor == null)
		{
			// comile and run right now
			compileNow(out, ctx, true);
		}
		else
		{

			CompileTask task = new CompileTask() {
				public void run()
				{
					try
					{
						isCompiling = true;
						this.setPc(PreCompiledClass.this);
						compileNow(out, ctx, false);
						this.setDone(true);
						isCompiling = false;
					}
					catch (IOException e)
					{
						logger.warning(e.getMessage());
						PreCompiledClass.this.setCompileError(true);

					}
					catch (BeeException e)
					{
						// in fact ,never throw this exception since run is
						// false;
						logger.warning(e.getMessage());
						PreCompiledClass.this.setCompileError(true);
					}
					catch (PreCompileException e)
					{
						logger.warning(e.getMessage());
						PreCompiledClass.this.setCompileError(true);
					}
					catch (Exception e)
					{
						logger.warning(e.getMessage());
						PreCompiledClass.this.setCompileError(true);

					}
				}
			};

			group.futureComplileExecutor.execute(task);
			group.classMap.getFutureMap().put(child, task);
			runAsRuntimeTemplate(out, ctx);

		}

	}

	public void compileNow(ByteWriter out, Context ctx, boolean run) throws IOException, BeeException
	{

		// 既然类型都已经知道，生成代码，目前类型推测功能很弱，不能推测父类.
		// 假设已经推测出来，typeTable正确
		boolean newLoaderRequired = false;
		BeetlCodeGenerator cg = new BeetlCodeGenerator(group.getTargetSrcPath(), group.charset, group.root.toString(),
				scriptRunner, typeTable, scriptRunner.textVar, (BeeCommonNodeTree) scriptRunner.tree, child,
				file.lastModified());
		cg.CR = scriptRunner.CR;

		if (group.classMap.hasLoaded(child))
		{
			// class已经存在，需要重新加载，所以新生成一个classloader
			newLoaderRequired = true;
		}

		cg.make();
		/* 开始编译 */
		JavaCompiler compiler = CompileFactory.getCompiler();
		compiler.setGroupTemplate(group);
		compiler.setClassName(BeetlUtil.getClassFullName(cg.getPkg(), cg.getClsName()));
		compiler.setSRCPath(cg.getSrcRoot());
		if (group.getExtraClassPath() != null)
		{
			compiler.setClassPath(group.getExtraClassPath());
		}

		String tempFolder = group.tempFolder;
		String groupName = group.getRootAlias();

		compiler.setTargetPath(group.targetClassPath);
		compiler.setEncoding(group.charset);
		int result = compiler.compile();
		if (result != 0)
		{
			// 编译失败
			this.setCompileError(true);
			if (run)
				this.runAsRuntimeTemplate(out, ctx);
			return;
		}

		CompiledClass real = null;
		try
		{
		
			if (newLoaderRequired)
			{
				// class已经存在，需要重新加载，所以新生成一个classloader
				group.newLoader();
			}

			Class c = group.getTemplateClassLoader()
					.loadClass(BeetlUtil.getClassFullName(cg.getPkg(), cg.getClsName()));

			real = (CompiledClass) c.newInstance();

			real.setScriptRunner(scriptRunner);

			group.classMap.cacheCompiledClass(child, real);
			// System.out.println("version:" + real.getVersion());
			// 编译，运行成功
			this.scriptRunner.clearAST();
			typeTable = null;
		}
		catch (InstantiationException e)
		{
			this.setCompileError(true);
			this.runAsRuntimeTemplate(out, ctx);
			return;
		}
		catch (IllegalAccessException e)
		{
			this.setCompileError(true);
			this.runAsRuntimeTemplate(out, ctx);
			return;
		}
		catch (ClassNotFoundException e)
		{
			this.setCompileError(true);
			this.runAsRuntimeTemplate(out, ctx);
			return;
		}
		/* 开始运行 */
		if (run)
		{
			try
			{
				real.service(out, ctx);
			}
			catch (VaribaleCastException pe)
			{
				// cast 异常的时候
				this.setCompileError(true);
				this.runAsRuntimeTemplate(out, ctx);
				return;
			}

		}

	}

	private void collectAllVariableFromContext(Context ctx)
	{

		for (String varName : typeTable.allType())
		{

			if (ctx.getVarWithoutException(varName) == null)
			{
				// 从context中未找到想要推测的变量，下次再搜集
				continue;
			}
			else
			{
				Object o = ctx.getVar(varName);
				if (o instanceof List)
				{
					/*
					 * 如果是List，则要搜集list包含的时什么对象,beetl总是假设list包含的变量类型是一样的，
					 * 除非在rawList中说明
					 */
					List listObject = (List) o;
					if (ctx.getRawList() == null || !ctx.getRawList().contains(varName))
					{

						if (listObject.size() != 0)
						{
							Object value = listObject.get(0);
							TypeClass tc = new TypeClass();
							tc.setRawType(List.class);
							tc.getPtypeMap().put("E", value.getClass());
							typeTable.setTypeClass(varName, tc);

						}
						else
						{
							// 需要继续搜集，仍然使用runtime方式先运行
						}
					}
					else
					{
						// 不需要搜集，既然context已经说明该list包含对象非具体类
						typeTable.setTypeClass(varName, new TypeClass(o.getClass()));
					}

				}
				else if (o instanceof Iterable)
				{
					/**
					 * 暂时不知道如何预测Iterator里的对象类型，除非是ListIterator，这个以后再考虑
					 */
					typeTable.setTypeClass(varName, new TypeClass(Iterable.class));
					//					Iterator it = (Iterator) o;
					//					if (ctx.getRawList() == null || !ctx.getRawList().contains(varName))
					//					{
					//
					//						TypeClass tc = new TypeClass();
					//						tc.setRawType(Iterator.class);
					//						tc.getPtypeMap().put("E", Object.class);
					//						typeTable.setTypeClass(varName, tc);
					//					}
					//					else
					//					{
					//						// 不需要搜集，既然context已经说明该list包含对象非具体类
					//					typeTable.setTypeClass(varName, new TypeClass(o.getClass()));
					//						
					//					}

				}
				else if (o instanceof Map)
				{
					/*
					 * 如果是map，则要搜集Map包含的时什么对象,beetl总是假设map包含的key-value 类型是一样的，
					 * 除非在rawList中说明
					 */
					Map mapObject = (Map) o;
					if (ctx.getRawList() == null || !ctx.getRawList().contains(varName))
					{
						if (mapObject.size() != 0)
						{
							Map.Entry value = (Map.Entry) mapObject.entrySet().iterator().next();
							TypeClass tc = new TypeClass();
							tc.setRawType(o.getClass());
							tc.getPtypeMap().put("K", value.getKey().getClass());
							tc.getPtypeMap().put("V", value.getValue().getClass());
							typeTable.setTypeClass(varName, tc);

						}
						else
						{
							// 需要继续搜集，仍然使用runtime方式先运行
						}
					}
					else
					{
						// 不需要搜集，既然context已经说明该list包含对象非具体类
						typeTable.setTypeClass(varName, new TypeClass(o.getClass()));
					}

				}

				else
				{

					// 普通对象
					typeTable.setTypeClass(varName, new TypeClass(o.getClass()));

					// if(o!=null){
					// typeTable.setTypeClass(varName, new
					// TypeClass(o.getClass()));
					// }else{
					// //需要继续搜集
					// return ;
					// }

				}

			}
		}

		return;
	}

}

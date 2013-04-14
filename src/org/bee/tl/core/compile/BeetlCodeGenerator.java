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
package org.bee.tl.core.compile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.tree.CommonTree;
import org.bee.tl.core.BeeCommonNodeTree;
import org.bee.tl.core.BeeNumber;
import org.bee.tl.core.BeeParser;
import org.bee.tl.core.BeetlUtil;
import org.bee.tl.core.ByteSupportTag;
import org.bee.tl.core.CoreScriptRunner;
import org.bee.tl.core.Derective;
import org.bee.tl.core.Function;
import org.bee.tl.core.MapEntry;
import org.bee.tl.core.MethodConf;
import org.bee.tl.core.PropertyUtil;
import org.bee.tl.core.Tag;
import org.bee.tl.core.TypeClass;
import org.bee.tl.core.TypeTable;
import org.bee.tl.core.exception.PreCompileException;

/**
 * 根据语法树以及类型表，生成java代码
 * 
 * @author joelli
 * @version 1.1
 * 
 */
public class BeetlCodeGenerator
{

	String key;
	//	GroupTemplate group;
	TypeTable tb;
	BeeCommonNodeTree root;
	Map<String, Object> textMap = null;
	CoreScriptRunner scriptRunner = null;
	public final static int SPACE = 4;
	private long cachedId;
	protected Map<Integer, Integer> lineMap = new HashMap<Integer, Integer>();
	private String charset;
	// 下面代码用于检测外部class是否已经改变，下一个版本完成
	// protected Map<String,Class> funRetrunMap = new HashMap<String,Class>();

	private static char space[] = new char[80];
	static
	{
		for (int i = 0; i < 80; i++)
		{
			space[i] = ' ';
		}
	}

	// private static Map<String, String> primitiveMap = new HashMap<String,
	// String>();
	// static
	// {
	// primitiveMap.put("Long", "long");
	// primitiveMap.put("Integer", "int");
	// primitiveMap.put("Double", "double");
	// primitiveMap.put("Boolean", "boolean");
	//
	// }

	private static Map<Integer, String> operatorMap = new HashMap<Integer, String>();
	static
	{
		operatorMap.put(BeeParser.ADD, "+");
		operatorMap.put(BeeParser.MINUS, "-");
		operatorMap.put(BeeParser.MULTIP, "*");
		operatorMap.put(BeeParser.DIV, "/");
		operatorMap.put(BeeParser.MOD, "%");

	}

	private static Map<Integer, String> operatorBigDecimalMap = new HashMap<Integer, String>();
	static
	{
		operatorBigDecimalMap.put(BeeParser.ADD, "add");
		operatorBigDecimalMap.put(BeeParser.MINUS, "min");
		operatorBigDecimalMap.put(BeeParser.MULTIP, "multiply");
		operatorBigDecimalMap.put(BeeParser.DIV, "divide");

	}

	private static Map<Integer, String> compareMap = new HashMap<Integer, String>();
	static
	{
		compareMap.put(BeeParser.NOT_EQUAL, "!=");
		compareMap.put(BeeParser.EQUAL, "==");
		compareMap.put(BeeParser.LARGE, ">");
		compareMap.put(BeeParser.LARGE_EQUAL, ">=");
		compareMap.put(BeeParser.LESS, "<");
		compareMap.put(BeeParser.LESS_EQUAL, "%");

	}

	private static Map<Integer, String> compareObjectMap = new HashMap<Integer, String>();
	static
	{
		compareObjectMap.put(BeeParser.NOT_EQUAL, "!=0");
		compareObjectMap.put(BeeParser.EQUAL, "==0");
		compareObjectMap.put(BeeParser.LARGE, ">0");
		compareObjectMap.put(BeeParser.LARGE_EQUAL, ">=0");
		compareObjectMap.put(BeeParser.LESS, "<0");
		compareObjectMap.put(BeeParser.LESS_EQUAL, "<=0");

	}

	private static Map<Integer, String> operatorObjectMap = new HashMap<Integer, String>();
	static
	{
		operatorObjectMap.put(BeeParser.ADD, "add");
		operatorObjectMap.put(BeeParser.MINUS, "minus");
		operatorObjectMap.put(BeeParser.MULTIP, "multip");
		operatorObjectMap.put(BeeParser.DIV, "div");
		operatorObjectMap.put(BeeParser.MOD, "mod");

	}
	public String CR = "\n";
	private int currentLine = 1;
	private int indent = 0;
	Writer fw = null;
	String pkg;
	String clsName;
	String srcRoot = null;
	String pkgPath = null;
	String templateRootPath = null;
	Derective derective = new Derective();

	public String getClsName()
	{
		return clsName;
	}

	public void setClsName(String clsName)
	{
		this.clsName = clsName;
	}

	public String getSrcRoot()
	{
		return srcRoot;
	}

	public void setSrcRoot(String srcRoot)
	{
		this.srcRoot = srcRoot;
	}

	public BeetlCodeGenerator(String scrRoot, String charset, String templateRootPath, CoreScriptRunner template,
			TypeTable tb, Map<String, Object> textMap, BeeCommonNodeTree root, String key, long cachedId)
	{
		this.textMap = textMap;

		this.scriptRunner = template;
		this.tb = tb;
		this.root = root;
		this.key = key;
		this.cachedId = cachedId;
		this.srcRoot = scrRoot;
		this.templateRootPath = templateRootPath;
		this.charset = charset;
		String[] pkg2class = BeetlUtil.getPackage2Class(key);
		pkg = pkg2class[0];
		pkgPath = pkg.replace('.', File.separatorChar);
		clsName = pkg2class[1];
		File path = new File(srcRoot + File.separator + pkgPath);
		if (!path.exists())
		{
			path.mkdirs();
		}
	}

	public BeetlCodeGenerator()
	{

	}

	public void make() throws IOException
	{

		// 生成的源代码放到此目录下

		// fw = new FileWriter(new File(srcRoot + File.separator + pkgPath
		// + File.separator + clsName + ".java"));
		File f = new File(srcRoot + File.separator + pkgPath + File.separator + clsName + ".java");
		fw = new OutputStreamWriter(new FileOutputStream(f), "utf-8");
		writePackage();
		writeImport();
		writeClass();
		fw.close();

	}

	public String getPkg()
	{
		return pkg;
	}

	public void setPkg(String pkg)
	{
		this.pkg = pkg;
	}

	private void writeClass() throws IOException
	{
		println("/* " + key + " is generated by beetl on "
				+ new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()) + " */");
		println("public class " + clsName + " extends CompiledClass{");

		writeService();
		if (this.scriptRunner.isDirectByteOutput())
		{
			writeConstantByte();
		}
		else
		{
			writeConstantText();
		}
		writeConstruct();
		writeVersion();
		writeLineMap();
		println("}");

	}

	private void writeConstruct() throws IOException
	{
		addIndent();
		println("public " + clsName + "(){");
		addIndent();

		println("this.scriptRunner = new CoreScriptRunner();");
		if (scriptRunner.isDirectByteOutput())
		{
			println("scriptRunner.enableDirectOutputByte();");
		}
		if (scriptRunner.isNativeCall())
		{

			println("this.scriptRunner.enableNativeCall();");
		}

		if (scriptRunner.isStrict())
		{
			println("this.scriptRunner.enableStrict();");
		}
		
		if(scriptRunner.isBigNumberSupport()){
			println("this.scriptRunner.setBigNumberSupport(true);");
			println("this.nf = NumberFactory.big;");
		}else{
			println("this.scriptRunner.setBigNumberSupport(false);");			
			println("this.nf = NumberFactory.general;");
		}

		String temproot = this.templateRootPath.replace("\\", "\\\\");
		String child = this.key.replace("\\", "\\\\");
		println("this.resource = new Resource(\"" + child + "\",new File(\"" + temproot + "\"),\"" + charset + "\");");
		println("if(" + CompiledClass.version + "!=CompiledClass.version)  throw new "
				+ "RuntimeException(\"Wrong Beetl Class version,Expected\"+CompiledClass.version+\"  but was \"+"
				+ CompiledClass.version + ");");

		this.decIndent();
		println("}");
		// println("if(group")

		decIndent();
	}

	private void writeVersion() throws IOException
	{
		addIndent();
		println("/* 原模板Cached标示*/");
		println("public long getVersion(){");
		addIndent();
		println("return " + this.cachedId + "l;");

		this.decIndent();
		println("}");
		this.decIndent();

	}

	private void writeLineMap() throws IOException
	{
		addIndent();
		println("/* 行映射*/");
		printStart("protected String lineMap = \"-");
		Map.Entry<Integer, Integer> entry = null;
		Iterator<Map.Entry<Integer, Integer>> it = lineMap.entrySet().iterator();
		while (it.hasNext())
		{
			entry = it.next();
			print(entry.getKey() + "=" + entry.getValue() + "-");
		}

		print("\";");
		printCR();

		this.decIndent();
	}

	private void writeConstantText() throws IOException
	{

		String text = (String) textMap.get("__VCR");
		StringBuilder crs = new StringBuilder();
		if (text != null)
		{
			char[] cs = text.toCharArray();

			for (char c : cs)
			{
				if (c == '\n')
				{
					crs.append("\\n");
				}
				else if (c == '\r')
				{
					crs.append("\\r");
				}
			}
		}
		else
		{
			crs.append("");
		}

		addIndent();
		println("/* 原模板中的所有字符串定义到这儿*/");
		println("private static char[] __VCR = \"" + crs + "\".toCharArray();");
		Iterator<String> it = this.textMap.keySet().iterator();
		String key = null;
		while (it.hasNext())
		{
			key = it.next();
			if (key.equals("__VCR"))
			{
				continue;
			}
			text = (String) textMap.get(key);
			println("private static final char[] " + key + " = \"" + addEscape(text) + "\".toCharArray();");
		}

		this.decIndent();

	}

	private void writeConstantByte() throws IOException
	{

		addIndent();

		Iterator<String> it = this.textMap.keySet().iterator();
		String key = null;
		while (it.hasNext())
		{
			key = it.next();
			byte[] text = (byte[]) textMap.get(key);
			println("private static final byte[] " + key + " = new byte[]{" + this.toByteArray(text) + "};");
		}

		this.decIndent();

	}

	private static String toByteArray(byte[] bs)
	{
		StringBuilder sb = new StringBuilder();
		for (byte b : bs)
		{
			sb.append("0x");
			sb.append(Integer.toHexString(b));
			sb.append(",");
		}
		sb.setLength(sb.length() - 1);

		return sb.toString();
	}

	private String addEscape(String text)
	{
		StringBuilder sb = new StringBuilder();
		char[] cs = text.toCharArray();
		for (char c : cs)
		{
			if (c == '\\' || c == '"')
			{
				sb.append('\\');
				sb.append(c);
			}
			else if (c == '\n')
			{
				sb.append("\\n");
				;
			}
			else if (c == '\r')
			{
				sb.append("\\r");
				;
			}
			else
			{
				sb.append(c);
			}

		}
		return sb.toString();
	}

	private void writeService() throws IOException
	{
		addIndent();
		println("public void service(ByteWriter writer,Context ctx) throws IOException,BeeException{");

		Map<String, TypeClass> initMember = tb.getTypeClass();
		Iterator<String> it = initMember.keySet().iterator();
		String varName = null;
		String className = null;
		TypeClass cls = null;
		addIndent();
		//		Map<String, Class> funMap = tb.getFunMap();
		//		for (Entry<String, Class> entry : funMap.entrySet())
		//		{
		//			String funName = entry.getKey().replace(".", "_");
		//			Class funClassName = entry.getValue();
		//			println(funClassName.getName() + " " + funName + " = new " + funClassName.getName() + "()");
		//
		//		}
		println("ByteWriter out = writer ;");
		println("ctx.set(\"__pw\",out);");
		// 申明变量
		while (it.hasNext())
		{
			varName = it.next();
			cls = initMember.get(varName);
			if (List.class.isAssignableFrom(cls.getRawType()))
			{
				if (cls.isRawType())
				{
					className = getClassName(cls.getRawType());
					println("final " + className + " " + varName + ";");
				}
				else
				{
					Class key = cls.getPtypeMap().get("E");
					className = getClassName(cls.getRawType());
					println("final " + className + "<" + key.getSimpleName() + "> " + varName + ";");
				}

			}
			else if (Map.class.isAssignableFrom(cls.getRawType()))
			{
				if (cls.isRawType())
				{
					className = getClassName(cls.getRawType());
					println("final " + className + " " + varName + ";");
				}
				else
				{
					Class key = cls.getPtypeMap().get("K");
					Class value = cls.getPtypeMap().get("V");
					className = getClassName(cls.getRawType());
					println("final " + className + "<" + key.getSimpleName() + "," + value.getSimpleName() + "> "
							+ varName + ";");
				}

			}
			else
			{
				className = getClassName(cls.getRawType());
				println("final " + className + " " + varName + ";");
			}

		}
		if (!initMember.isEmpty())
		{
			println("try{");
			addIndent();
			it = initMember.keySet().iterator();
			while (it.hasNext())
			{
				varName = it.next();
				cls = initMember.get(varName);
				if (List.class.isAssignableFrom(cls.getRawType()))
				{
					className = cls.getRawType().getSimpleName();
					if (cls.isRawType())
					{
						println(varName + " = (" + className + ")ctx.getVarWithoutException(\"" + varName + "\");");
					}
					else
					{
						Class key = cls.getPtypeMap().get("E");
						println(varName + " = (" + className + "<" + key.getSimpleName()
								+ ">)ctx.getVarWithoutException(\"" + varName + "\");");
					}
				}
				else if (Map.class.isAssignableFrom(cls.getRawType()))
				{
					className = cls.getRawType().getSimpleName();
					if (cls.isRawType())
					{
						println(varName + " = (" + className + ")ctx.getVarWithoutException(\"" + varName + "\");");
					}
					else
					{
						Class key = cls.getPtypeMap().get("K");
						Class value = cls.getPtypeMap().get("V");
						println(varName + " = (" + className + "<" + key.getSimpleName() + "," + value.getSimpleName()
								+ ">)ctx.getVarWithoutException(\"" + varName + "\");");
					}
				}

				else
				{
					className = initMember.get(varName).getRawType().getSimpleName();
					println(varName + " = (" + className + ")ctx.getVarWithoutException(\"" + varName + "\");");
				}
				lineMap.put(this.currentLine - 1, 0);
			}
			decIndent();
			println("}catch(ClassCastException ex){");
			addIndent();
			println("//转入解释模式执行");
			println("throw new VaribaleCastException(ex);");
			decIndent();
			println("}");
		}
		println("try{");
		this.addIndent();
		if (root != null)
		{
			writeTree(root);
		}

		this.decIndent();
		println("}catch(Exception ex){");
		this.addIndent();
		// this.println("if(group.isDebug())ex.printStackTrace();");
		println("throw getException(ex,lineMap);");
		this.decIndent();
		println("}finally{");
		this.addIndent();
		println("out.flush();");
		this.decIndent();
		println("}");
		decIndent();
		println("}");
		decIndent();

	}

	private void writeTree(BeeCommonNodeTree t) throws IOException
	{
		if (t.getToken() == null)
		{
			for (int i = 0; i < t.getChildCount(); i++)
			{
				writeTree((BeeCommonNodeTree) t.getChild(i));

			}
		}
		else
		{
			int tokeType = t.getToken().getType();
			switch (tokeType)
			{

				case BeeParser.DIRECTIVE:
				{

					String text = t.getChild(0).getText();
					if (text.equals("SAFE_OUTPUT_OPEN"))
					{
						derective.safeOutput = true;
					}
					else if (text.equals("SAFE_OUTPUT_CLOSE"))
					{
						derective.safeOutput = false;
					}
					//其他暂时不支持
					break;

				}
				case BeeParser.HOLDER:
				{

					List list = t.getChildren();
					// 安全输出!()
					if (list.size() == 2)
					{
						this.println("try{");
						this.addIndent();

					}
					BeeCommonNodeTree textVarNode = (BeeCommonNodeTree) list.get(0);
					BeeCommonNodeTree expNode = (BeeCommonNodeTree) textVarNode.getChild(0);
					// String expName =
					// "__exp"+this.currentLine+"__"+expNode.getToken().getCharPositionInLine();

					if (textVarNode.getChildren().size() == 1)
					{
						printStart("out.write(");
						this.writeTree(expNode);
						print(");");
					}
					else
					{
						String[] formatsArg = getFormat(textVarNode);
						printStart("out.write(format(\"" + formatsArg[0] + "\",");
						this.writeTree(expNode);
						if (formatsArg[1] == null)
						{
							print(",null ));");
						}
						else
						{
							print(",\"" + formatsArg[1] + "\"));");
						}

					}

					if (list.size() == 2)
					{
						// safe output
						printCR();
						this.decIndent();
						this.println("}catch(Exception ex){");
						this.println("}");
					}
					else
					{
						printCR();
					}

					break;
				}

				case BeeParser.TEXT_HOLDER:
				{

					String id = t.getChild(0).getText();
					println("out.write(" + id + ");");

					break;
				}

				case BeeParser.TEXT_VAR_REFER:
				{
					BeeCommonNodeTree identifyNode = (BeeCommonNodeTree) t.getChild(0);
					String varName = identifyNode.getToken().getText();
					print(varName);
					break;
				}
				case BeeParser.VAR_REFER:
				{

					if (t.getChild(t.getChildCount() - 1).getType() == BeeParser.SAFE_OUTPUT)
					{
						BeeCommonNodeTree safeNode = (BeeCommonNodeTree) t.getChild(t.getChildCount() - 1);
						int count = t.getChildCount() - 1;
						boolean safeValueIsNull = false ;
						//没有指定安全输出，则为null
						if(safeNode.getChildCount()==0){
							safeValueIsNull = true;
						}
						print("(");
						if (count == 1)
						{
							
							if(!safeValueIsNull){
								print(t.getChild(0).getText() + "==null?");
								writeTree(safeNode);
								print(":");
								print(t.getChild(0).getText());
							}else{
								print(t.getChild(0).getText());
							}
							

						}
						else
						{
							int loopSize = count;
							if(!safeValueIsNull){
								loopSize++;
							}
							for (int i = 1; i < loopSize; i++)
							{
								writeVarRef(t, i);
								print("==null?");
								writeTree(safeNode);
								print(":");

							}
							writeVarRef(t, count);

						}
						print(")");

						this.lineMap.put(this.currentLine, t.getToken().getLine());

					}
					else if (this.derective.safeOutput)
					{
						int count = t.getChildCount();
						
						
						print("(");

						for (int i = 1; i <count; i++)
						{
							writeVarRef(t, i);
							print("==null?null");
							print(":");

						}
						writeVarRef(t, count);
						print(")");
						this.lineMap.put(this.currentLine, t.getToken().getLine());

					}
					else
					{
						writeVarRef(t, -1);
						this.lineMap.put(this.currentLine, t.getToken().getLine());
					}
					break;

				}
				case BeeParser.JSONARRAY:
				{
					int count = t.getChildCount();
					print("createListFromJson(");

					BeeCommonNodeTree child = null;
					for (int i = 0; i < count; i++)
					{
						child = (BeeCommonNodeTree) t.getChild(i);
						writeTree(child);
						if (i != count - 1)
							print(",");
					}
					print(")");
					break;

				}
				case BeeParser.JSONMAP:
				{
					int count = t.getChildCount();
					print("createMapFromJson(");

					BeeCommonNodeTree child = null;
					BeeCommonNodeTree key = null;
					BeeCommonNodeTree value = null;
					String textKey = null;
					for (int i = 0; i < count; i++)
					{
						// jsonkeyvalue
						child = (BeeCommonNodeTree) t.getChild(i);
						key = (BeeCommonNodeTree) child.getChild(0);
						value = (BeeCommonNodeTree) child.getChild(1);
						textKey = key.getText();
						if (key.getType() == BeeParser.StringLiteral)
						{
							textKey = "\"" + textKey.substring(1, textKey.length() - 1) + "\"";
						}
						else
						{
							//也有可能是Identifier
							textKey = "\"" + textKey + "\"";
						}
						// todo：性能优化，修改bee.语法文件

						print(textKey + ",");
						writeTree(value);
						if (i != count - 1)
							print(",");
					}
					print(")");
					break;
				}

				case BeeParser.NOT_EQUAL:
				case BeeParser.EQUAL:
				case BeeParser.LARGE:
				case BeeParser.LARGE_EQUAL:
				case BeeParser.LESS:
				case BeeParser.LESS_EQUAL:
				{
					// 需要重构
					BeeCommonNodeTree left = (BeeCommonNodeTree) t.getChild(0);
					BeeCommonNodeTree right = (BeeCommonNodeTree) t.getChild(1);
					if (left.getTypeClass().isPrimitive() && right.getTypeClass().isPrimitive())
					{
						print("(");
						writeTree(left);
						print(this.compareMap.get(tokeType));
						writeTree(right);
						print(")");
					}
					else
					{

						if (tokeType == BeeParser.EQUAL || tokeType == BeeParser.NOT_EQUAL)
						{

							String equal = ".equals(";
							if (left.getTypeClass().getRawType().equals(NullClass.class)
									|| right.getTypeClass().getRawType().equals(NullClass.class))
							{
								equal = "==(";
							}

							if (tokeType == BeeParser.NOT_EQUAL)
							{
								print("!(");
							}
							if (left.getTypeClass().isPrimitive())
							{
								print("nf.y(");
								writeTree(left);
								print(")");
							}
							else
							{
								writeTree(left);
							}

							print(equal);

							if (right.getTypeClass().isPrimitive())
							{
								print("nf.y(");
								writeTree(right);
								print(")");
							}
							else
							{
								writeTree(right);
							}
							if (tokeType == BeeParser.NOT_EQUAL)
							{
								print(")");
							}
							print(")");

						}

						else
						{
							/**
							 * 如果俩边含有Object.class,则进入runtime运行方式 *
							 * 如果都是的number对象，则按照beenumber比较 *
							 * 其他情况，判断是否是compare接口，并采用compare方法比较 如果不是，则不能预编译
							 */

							print("(");
							if (left.getTypeClass().getRawType().equals(Object.class)
									|| right.getTypeClass().getRawType().equals(Object.class))
							{
								print("objectCompare(");
								writeTree(left);
								print(",");
								writeTree(right);
								print(")");
								print(this.compareObjectMap.get(tokeType));

							}
							else if (Number.class.isAssignableFrom(left.getTypeClass().getRawType())
									&& Number.class.isAssignableFrom(right.getTypeClass().getRawType()))
							{
								if (left.getTypeClass().getRawType().equals(BeeNumber.class))
								{
									writeTree(left);
								}
								else
								{
									print("nf.y(");
									writeTree(left);
									print(")");
								}
								print(".compareTo(");
								if (right.getTypeClass().getRawType().equals(BeeNumber.class))
								{
									writeTree(right);
								}
								else
								{
									print("nf.y(");
									writeTree(right);
									print(")");
								}
								print(")");
								print(this.compareObjectMap.get(tokeType));

							}
							else if (Comparable.class.isAssignableFrom(left.getTypeClass().getRawType())
									&& Comparable.class.isAssignableFrom(right.getTypeClass().getRawType()))
							{

								writeTree(left);
								print(".compareTo(");
								writeTree(right);
								print(")");
								print(this.compareObjectMap.get(tokeType));

							}
							else
							{
								throw new PreCompileException("不能预编译，因为" + compareMap.get(tokeType) + "俩边不能比较"
										+ left.getToken().getLine());
							}
							print(")");

						}

					}
					break;
				}

				case BeeParser.BREAK:
				{
					println("break;");
					break;
				}
				case BeeParser.CONTINUE:
				{
					println("continue;");
					break;
				}
				case BeeParser.RETURN:
				{
					println("return;");
					break;
				}
				case BeeParser.NEGATOM:
				{

					writeTree((BeeCommonNodeTree) t.getChild(0));
					print(".negate()");
					break;
				}

				case BeeParser.NOT:
				{
					BeeCommonNodeTree condition = (BeeCommonNodeTree) t.getChild(0);
					print("!");
					writeTree(condition);
					break;
				}
				case BeeParser.NULL:
				{
					print("null");
					break;
				}

				case BeeParser.FUNCTION:
				{
					BeeCommonNodeTree fnNameNode = ((BeeCommonNodeTree) t.getChild(0));
					Function fn = (Function) fnNameNode.getCached();
					String fnName = BeetlUtil.getFunctionFullName(fnNameNode);

					if (fn == null)
					{
						fnName = BeetlUtil.getFunctionFullName(fnNameNode);
						fn = this.scriptRunner.getFunction(fnName);
						if (fn == null)
						{
							throw new PreCompileException("Function not exist:" + fnName);
						}
						fnNameNode.setCached(fn);
					}

					if (t.getParent() != null && t.getParent().getType() == BeeParser.DIRECT_CALL)
					{
						printStart("");
					}
					else
					{
						print("(" + this.getShowType(t.getTypeClass().getRawType()) + ")");
					}

					// this.funRetrunMap.put(fnName, t.getTypeClass().getRawType());
					print("callFunction(\"");
					print(fnName);
					print("\"," + fnNameNode.getToken().getLine());
					print(",ctx");

					for (int i = 1; i < t.getChildCount(); i++)
					{
						print(",");
						writeTree((BeeCommonNodeTree) t.getChild(i));

					}
					if (t.getParent() != null && t.getParent().getType() == BeeParser.DIRECT_CALL)
					{
						print(");");
						printCR();
					}
					else
					{
						print(")");
					}

					this.lineMap.put(this.currentLine, t.getToken().getLine());
					break;
				}

				case BeeParser.TEXT_PROCESS:
				{
					BeeCommonNodeTree processNode = (BeeCommonNodeTree) t.getChild(0);
					String processName = (String) processNode.getCached();
					if (processName == null)
					{
						processName = BeetlUtil.getFunctionFullName(processNode);
						processNode.setCached(processName);
					}

					String processVarName = processName.replaceAll("\\.", "_") + "_" + this.currentLine + "_"
							+ t.getToken().getCharPositionInLine();
					Tag fun = this.scriptRunner.getTag(processName);
					boolean byteSupport = fun instanceof ByteSupportTag;
					if (byteSupport)
					{
						println("ByteSupportTag " + processVarName + " = (ByteSupportTag)this.getTag(\"" + processName
								+ "\");");
					}
					else
					{
						println("Tag " + processVarName + " = this.getTag(\"" + processName + "\");");
					}

					printStart(processVarName + ".setParas(new Object[]{");
					this.lineMap.put(this.currentLine, processNode.getToken().getLine());

					this.lineMap.put(this.currentLine, processNode.getToken().getLine());
					BeeCommonNodeTree blockNode = (BeeCommonNodeTree) t.getChild(1);
					int size = t.getChildCount();
					Object[] paras = new Object[size - 2];
					BeeCommonNodeTree paraNode = null;
					for (int i = 2; i < size; i++)
					{
						paraNode = (BeeCommonNodeTree) t.getChild(i);
						writeTree(paraNode);
						if (i != (size - 1))
						{
							print(",");
						}

					}
					this.print("});");
					this.printCR();
					println(processVarName + ".setContext(ctx);");
					this.lineMap.put(this.currentLine, processNode.getToken().getLine());
					printStart("if(" + processVarName + ".requriedInput()){");
					printCR();
					this.addIndent();
					println("out= out.getTempWriter();");
					println("ctx.replace(\"__pw\",out);");
					printStart("");
					writeTree(blockNode);
					println("//还原输出流");
					if (scriptRunner.isDirectByteOutput() && byteSupport)
					{
						println(processVarName + ".setByteInput((byte[])out.getTempContent());");
					}
					else
					{
						println(processVarName + ".setInput((String)out.getTempContent());");
					}

					println("out = out.getParent();");
					println("ctx.replace(\"__pw\",out);");
					this.decIndent();
					println("}");

					this.lineMap.put(this.currentLine, processNode.getToken().getLine());
					if (scriptRunner.isDirectByteOutput() && byteSupport)
					{
						println("out.write(" + processVarName + ".getOutputAsByte());");
					}
					else
					{
						println("out.write(" + processVarName + ".getOutput());");
					}

					break;
				}

				case BeeParser.CLASS_FUNCTION:
				{
					BeeCommonNodeTree exp = (BeeCommonNodeTree) t;

					this.lineMap.put(this.currentLine, t.getToken().getLine());
					if (((CommonTree) exp.getChild(exp.getChildCount() - 1)).getToken().getType() == BeeParser.CLASS_METHOD)
					{

						if (t.getParent() != null && t.getParent().getType() == BeeParser.DIRECT_CALL)
						{
							printStart("");
						}
						if (exp.getExpType().equals(BeeNumber.class))
						{
							print("nf.y(");
						}
						StringBuilder sb = new StringBuilder();

						for (int i = 0; i < exp.getChildCount() - 1; i++)
						{
							sb.append(exp.getChild(i).getText()).append(".");
						}
						sb.setLength(sb.length() - 1);

						if (scriptRunner.containIllegalNativeCall(sb.toString()))
						{
							throw new PreCompileException("不允许调用:" + sb.toString());
						}
						print(sb.toString() + ".");

						String methodName = null;

						BeeCommonNodeTree classMethodNode = (BeeCommonNodeTree) exp.getChild(exp.getChildCount() - 1);
						methodName = ((CommonTree) classMethodNode.getChild(0)).getToken().getText();
						print(methodName);
						print("(");

						Object[] args = new Object[classMethodNode.getChildCount() - 1];
						MethodConf mc = (MethodConf) exp.getCached();
						for (int j = 1; j < classMethodNode.getChildCount(); j++)
						{
							BeeCommonNodeTree para = (BeeCommonNodeTree) classMethodNode.getChild(j);
							this.writeTree(para);
							if (para.getTypeClass().getRawType().equals(BeeNumber.class))
							{
								this.print(mc.getOutputType(j - 1));
							}
							if (j != classMethodNode.getChildCount() - 1)
								this.print(",");
						}

						if (exp.getExpType().equals(BeeNumber.class))
						{
							print(")");
						}

						if (t.getParent() != null && t.getParent().getType() == BeeParser.DIRECT_CALL)
						{
							print(");");
							printCR();
						}
						else
						{
							print(")");
						}

					}
					else
					{

						StringBuilder sb = new StringBuilder();
						if (t.getParent() != null && t.getParent().getType() == BeeParser.DIRECT_CALL)
						{
							// 无意义，忽略此代码
							break;
						}
						if (exp.getExpType().equals(BeeNumber.class))
						{
							print("nf.y(");
						}
						Object o;
						for (int i = 0; i < exp.getChildCount() - 1; i++)
						{
							sb.append(exp.getChild(i).getText()).append(".");
						}
						sb.setLength(sb.length() - 1);
						print(sb.toString() + ".");

						String propertyName = null;

						CommonTree propertyNode = (CommonTree) exp.getChild(exp.getChildCount() - 1);
						propertyName = propertyNode.getToken().getText();
						print(propertyName);
						if (exp.getExpType().equals(BeeNumber.class))
						{
							print(")");
						}

					}
					break;
				}

				case BeeParser.VAR_DEFINE:
				{
					Class c = t.getExpType();
					BeeCommonNodeTree assignNode = (BeeCommonNodeTree) t.getChild(0);
					BeeCommonNodeTree identifyNode = (BeeCommonNodeTree) assignNode.getChild(0);

					BeeCommonNodeTree expNode = (BeeCommonNodeTree) assignNode.getChild(1);
					if (!expNode.getTypeClass().getRawType().equals(NullClass.class))
					{
						if (expNode.getType() == BeeParser.SLIST)
						{
							String varName = identifyNode.getToken().getText();
							printStart("SuperVar ");
							print(varName);
							print(" = null;");
							print("{");
							printCR();
							this.addIndent();
							println("out= out.getTempWriter();");
							println("ctx.replace(\"__pw\",out);");
							printStart("");
							writeTree(expNode);
							println("//还原输出流");
							println(varName + " = new SuperVar(out);");
							println("out = out.getParent();");
							println("ctx.replace(\"__pw\",out);");
							this.decIndent();
							println("}");

						}
						else
						{
							printStart(getShowType(c) + " " + identifyNode.getToken().getText());
							print("=");
							writeTree(expNode);
						}

					}
					else
					{
						printStart("Object  " + identifyNode.getToken().getText());
						print(" = null");
					}

					print(";");
					this.lineMap.put(this.currentLine, t.getToken().getLine());
					printCR();
					break;
				}
				case BeeParser.ASSIGNMENT:
				{

					BeeCommonNodeTree expNode = (BeeCommonNodeTree) t.getChild(1);
					if (expNode.getType() == BeeParser.SLIST)
					{
						String varName = t.getToken().getText();
						printStart("SuperVar ");
						print(varName);
						print(" = null;");
						print("{");
						printCR();
						this.addIndent();
						println("out= out.getTempWriter();");
						println("ctx.replace(\"__pw\",out);");
						printStart("");
						writeTree(expNode);
						println("//还原输出流");
						println(varName + " = new SuperVar(out);");
						println("out = out.getParent();");
						println("ctx.replace(\"__pw\",out);");
						this.decIndent();
						println("}");
					}
					else
					{
						printStart(t.getToken().getText());
						print("=");
						writeTree(expNode);
						print(";");
						printCR();
					}

					break;
				}
				case BeeParser.MINUS:
				case BeeParser.DIV:
				case BeeParser.MULTIP:
				case BeeParser.ADD:
				{
					print("(");
					BeeCommonNodeTree left = (BeeCommonNodeTree) t.getChild(0);
					BeeCommonNodeTree right = (BeeCommonNodeTree) t.getChild(1);
					if (left.getExpType().equals(Object.class) || right.getExpType().equals(Object.class))
					{
						//
						// throw new PreCompileException("当前版本暂时不支持Object "
						// + left.getToken().getText() + ", 位于"
						// + left.getLine());
						print("arithmetic_" + operatorBigDecimalMap.get(tokeType) + "(");
						writeTree(left);
						print(",");
						writeTree(right);
						print("))");

					}
					else
					{

						if (left.getTypeClass().getRawType().equals(String.class)
								|| right.getTypeClass().getRawType().equals(String.class))
						{
							if (left.getType() == BeeParser.StringLiteral)
							{
								writeTree(left);
							}
							else
							{
								print("stringValue(");
								writeTree(left);
								print(")");
							}

							print(operatorMap.get(tokeType));

							if (right.getType() == BeeParser.StringLiteral)
							{
								writeTree(right);
							}
							else
							{
								print("stringValue(");
								writeTree(right);
								print(")");
							}

						}
						else if (left.getTypeClass().getRawType().equals(BeeNumber.class))
						{
							// double类型，以及除法，在beetl中总是精度计算:new
							// BigDecimal(aValue.toString()).subtract(new
							// BigDecimal(bValue.toString()))

							writeTree(left);
							print(".");
							print(operatorBigDecimalMap.get(tokeType));
							print("(");
							writeTree(right);
							print(")");

						}
						else if (left.getTypeClass().getRawType().equals(Character.class)
								|| right.getTypeClass().getRawType().equals(Character.class))
						{
							print("(\"\"+");
							writeTree(left);
							print(")");
							print(operatorMap.get(tokeType));
							writeTree(right);

						}
						else if (right.getTypeClass().getRawType().equals(BeeNumber.class))
						{
							print("nf.y(");
							writeTree(left);
							print(").");
							print(operatorBigDecimalMap.get(tokeType));
							print("(");
							writeTree(right);
							print(")");
						}
						else
						{
							print("nf.y(");
							writeTree(left);
							print(").");
							print(operatorBigDecimalMap.get(tokeType));
							print("(");
							writeTree(right);
							print(")");

						}
						print(")");

					}
					this.lineMap.put(this.currentLine, left.getToken().getLine());

					break;
				}

				case BeeParser.MOD:
				{
					print("(");
					BeeCommonNodeTree left = (BeeCommonNodeTree) t.getChild(0);
					BeeCommonNodeTree right = (BeeCommonNodeTree) t.getChild(1);
					if (left.getExpType().equals(Object.class) || right.getExpType().equals(Object.class))
					{

						throw new PreCompileException("当前版本暂时不支持Object " + left.getToken().getText() + ", 位于"
								+ left.getLine());

					}
					else
					{
						print("nf.y(");
						if (left.getTypeClass().getRawType().equals(Integer.class)
								|| left.getTypeClass().getRawType().equals(Long.class))
						{
							writeTree(left);
						}
						else if (left.getTypeClass().getRawType().equals(BeeNumber.class))
						{
							writeTree(left);
							print(".longValue()");
						}
						else
						{
							throw new PreCompileException("操作符应该为整形或者BeeNumber" + left.getToken());
						}

						print("%");

						if (right.getTypeClass().getRawType().equals(Integer.class)
								|| right.getTypeClass().getRawType().equals(Long.class))
						{
							writeTree(right);
						}
						else if (right.getTypeClass().getRawType().equals(BeeNumber.class))
						{
							writeTree(right);
							print(".longValue()");
						}
						else
						{
							throw new PreCompileException("操作符应该为整形或者BeeNumber" + left.getToken().getText());
						}
						print(")");

						print(")");

					}
					this.lineMap.put(this.currentLine, left.getToken().getLine());

					break;
				}
				case BeeParser.INT:
				{
					String text = t.getToken().getText();
					print("nf.y(" + text + ")");
					break;
				}
				case BeeParser.DOUBLE:
				{
					String text = t.getToken().getText();
					print("nf.y(\"" + text + "\")");
					break;
				}
				case BeeParser.BOOLEAN:
				{
					String text = t.getToken().getText();
					print(text);
					break;
				}

				case BeeParser.StringLiteral:
				{
					String text = t.getToken().getText();
					print(BeetlUtil.addEscpage(text));
					break;
				}

				case BeeParser.SWITCH:
				{
					BeeCommonNodeTree exp = (BeeCommonNodeTree) t.getChild(0);
					boolean hasDefault = false;
					boolean isMatch = false;
					int caseCount = t.getChildCount() - 1;
					if (t.getChild(t.getChildCount() - 1).getType() == BeeParser.DEFAULT)
					{
						caseCount = caseCount - 1;
						hasDefault = true;
					}
					BeeCommonNodeTree caseTree = null;
					BeeCommonNodeTree comparedTree = null;
					Object comparedObject = null;
					BeeCommonNodeTree caseExpTree = null;

					String listName = "_caseList" + this.currentLine + "_" + t.getToken().getCharPositionInLine();

					this.printStart("List " + listName + " = new ArrayList();");
					for (int i = 0; i < caseCount; i++)
					{
						caseTree = (BeeCommonNodeTree) t.getChild(i + 1);
						comparedTree = (BeeCommonNodeTree) caseTree.getChild(0);
						print(listName + ".add(");
						writeTree(comparedTree);
						print(");");

					}
					this.lineMap.put(this.currentLine, t.getLine());
					printCR();
					printStart("switch(" + listName + ".indexOf(");
					writeTree(exp);
					print(")){");
					printCR();

					for (int i = 0; i < caseCount; i++)
					{

						caseTree = (BeeCommonNodeTree) t.getChild(i + 1);

						println("case " + i + ":");
						this.addIndent();
						for (int j = 1; j < caseTree.getChildCount(); j++)
						{
							caseExpTree = (BeeCommonNodeTree) caseTree.getChild(j);

							writeTree(caseExpTree);
						}
						this.decIndent();

					}

					if (hasDefault)
					{

						println("default:");
						BeeCommonNodeTree defaultTree = (BeeCommonNodeTree) t.getChild(t.getChildCount() - 1);
						this.addIndent();
						BeeCommonNodeTree expTree = null;
						for (int i = 0; i < defaultTree.getChildCount(); i++)
						{
							expTree = (BeeCommonNodeTree) defaultTree.getChild(i);
							writeTree(expTree);
						}
						this.decIndent();

					}
					printCR();
					println("}");
					// if (!isMatch && hasDefault)
					// {
					// CommonTree defaultTree = (CommonTree)
					// t.getChild(t.getChildCount() - 1);
					// this.print((CommonTree) defaultTree.getChild(0), localCtx);
					//
					// }
					break;

				}
				case BeeParser.WHILE:
				{
					BeeCommonNodeTree condNode = (BeeCommonNodeTree) t.getChild(0);
					BeeCommonNodeTree blockNode = (BeeCommonNodeTree) t.getChild(1);
					printStart("while(");
					writeTree(condNode);
					print(")");
					writeBlock(blockNode, "", "");
					break;
				}
				case BeeParser.FOR:
				{
					println("{");
					this.addIndent();
					BeeCommonNodeTree idNode = (BeeCommonNodeTree) t.getChild(0);
					BeeCommonNodeTree varRef = (BeeCommonNodeTree) t.getChild(1);
					boolean hasElseFor = t.getChildCount() == 4;
					boolean hasSafeOutput = varRef.getChild(varRef.getChildCount() - 1).getType() == BeeParser.SAFE_OUTPUT;
					String loopName = "inLoop_" + this.currentLine;
					if (hasSafeOutput)
					{
						// 安全输出
						if (hasElseFor)
						{
							printStart("boolean " + loopName + "  = false;");
							printCR();
						}
						printStart("if(");
						writeTree(varRef);
						print("!=null){");
						printCR();
						this.addIndent();
					}
					println("int " + idNode.getToken().getText() + "_index = 0;");
					Class type = varRef.getTypeClass().getRawType();

					if (Collection.class.isAssignableFrom(type) || Map.class.isAssignableFrom(type))
					{
						printStart("int " + idNode.getToken().getText() + "_size = ");

						writeTree(varRef);
						print(".size();");
						if (hasElseFor && !hasSafeOutput)
						{
							printCR();
							println("if(" + idNode.getToken().getText() + "_size !=0){ ");
							this.addIndent();
							if (hasSafeOutput)
							{
								printStart(loopName + " = true;");
							}

						}
					}
					//数组
					else if (!Iterable.class.isAssignableFrom(type))
					{
						printStart("int " + idNode.getToken().getText() + "_size = ");
						writeTree(varRef);
						print(".length;");
						if (hasElseFor)
						{

							printCR();
							println("if(" + idNode.getToken().getText() + "_size !=0){ ");
							this.addIndent();
							if (hasSafeOutput)
							{
								printStart(loopName + " = true;");
							}
						}
					}
					else
					{
						// Iterable 
						if (hasElseFor && !hasSafeOutput)
						{
							printStart("boolean " + loopName + "  = false;");
						}

					}

					printCR();

					printStart("for(");
					if (idNode.getTypeClass().getRawType().equals(MapEntry.class))
					{

						if (idNode.getTypeClass().getPtypeMap().get("K").equals(Object.class)
								&& idNode.getTypeClass().getPtypeMap().get("V").equals(Object.class))
						{
							print("Object ");
						}
						else
						{
							print("Entry<");
							print(idNode.getTypeClass().getPtypeMap().get("K").getSimpleName());
							print(",");
							print(idNode.getTypeClass().getPtypeMap().get("V").getSimpleName());
							print(">");
						}

					}
					else
					{
						print(idNode.getTypeClass().getRawType().getSimpleName());
					}

					print(" " + idNode.getToken().getText());
					print(" : ");
					writeTree(varRef);
					if (Map.class.isAssignableFrom(varRef.getTypeClass().getRawType()))
					{
						print(".entrySet() ");
					}
					print(")");
					//for循环主体
					if (Collection.class.isAssignableFrom(type) || Map.class.isAssignableFrom(type)
							|| !Iterable.class.isAssignableFrom(type))
					{

						writeBlock((BeeCommonNodeTree) t.getChild(2), "", idNode.getToken().getText() + "_index++;");
					}
					else
					{
						//iterate
						if (hasElseFor)
						{
							writeBlock((BeeCommonNodeTree) t.getChild(2), loopName + " = true;", idNode.getToken()
									.getText() + "_index++;");
						}
						else
						{
							writeBlock((BeeCommonNodeTree) t.getChild(2), "", idNode.getToken().getText() + "_index++;");
						}

					}
					//for主体结束
					if (hasElseFor && !hasSafeOutput)
					{

						if (Collection.class.isAssignableFrom(type) || Map.class.isAssignableFrom(type)
								|| !Iterable.class.isAssignableFrom(type))
						{

							this.decIndent();
							printStart("} else");
						}
						else
						{
							//iterate情况
							printStart("if(!" + loopName + ")");
						}

						writeBlock((BeeCommonNodeTree) t.getChild(3), "", "");

					}
					else if (hasSafeOutput)
					{
						// 安全输出

						if (!hasElseFor)
						{
							this.decIndent();
							println("}");
						}
						else
						{

							if (Iterable.class.isAssignableFrom(type))
							{
								this.decIndent();
								println("}");
								printStart("if(!" + loopName + ")");
								writeBlock((BeeCommonNodeTree) t.getChild(3), "", "");
							}
							else
							{
								this.decIndent();
								println("}");
								this.decIndent();
								println("}");
								printStart("if(!" + loopName + ")");
								writeBlock((BeeCommonNodeTree) t.getChild(3), "", "");
							}

						}

					}

					this.decIndent();
					println("}");

					break;

				}
				case BeeParser.IF:
				{
					List<BeeCommonNodeTree> list = t.getChildren();
					BeeCommonNodeTree conditionNode = (BeeCommonNodeTree) list.get(0);
					printStart("if(");
					writeTree(conditionNode);
					print(")");
					BeeCommonNodeTree block = (BeeCommonNodeTree) list.get(1);
					writeTree(block);

					if (list.size() == 3)
					{
						printStart("else");
						BeeCommonNodeTree elseBlock = (BeeCommonNodeTree) list.get(2);
						writeTree(elseBlock);
					}

					break;
				}
				case BeeParser.AND:
				case BeeParser.OR:
				{

					BeeCommonNodeTree left = (BeeCommonNodeTree) t.getChild(0);
					BeeCommonNodeTree right = (BeeCommonNodeTree) t.getChild(1);
					writeTree(left);
					if (tokeType == BeeParser.AND)
					{
						print("&&");
					}
					else
					{
						print("||");
					}
					writeTree(right);

					break;
				}

				case BeeParser.SLIST:
				{
					writeBlock(t, "", "");
					break;
				}
				case BeeParser.SAFE_OUTPUT:
				{
					if (t.getChildCount() == 0)
					{
						print("null");
					}
					else
					{
						writeTree((BeeCommonNodeTree) t.getChild(0));
					}
					break;
				}
				default:
				{
					for (int i = 0; i < t.getChildCount(); i++)
					{

						writeTree((BeeCommonNodeTree) t.getChild(i));

					}
				}

			}
		}

	}

	private boolean isClassName(CommonTree node)
	{
		String name = node.getToken().getText();
		char c = name.charAt(0);
		if (Character.isUpperCase(c))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	private void writeBlock(BeeCommonNodeTree t, String before, String after) throws IOException
	{
		print("{");
		printCR();
		this.addIndent();
		if (before.length() != 0)
		{
			println(before);
		}
		List<BeeCommonNodeTree> list = t.getChildren();
		if (list == null)
		{
			println("}");
			this.decIndent();
			return;
		}
		int size = list.size();
		BeeCommonNodeTree node = null;
		for (int i = 0; i < size; i++)
		{
			node = (BeeCommonNodeTree) list.get(i);
			writeTree(node);
		}
		if (after.length() != 0)
		{
			println(after);
		}
		this.decIndent();
		println("}");
	}

	private String[] getFormat(BeeCommonNodeTree textVarNode) throws IOException
	{
		List fmList = textVarNode.getChildren().subList(1, textVarNode.getChildCount());
		String fmFunction = null;
		String pattern = null;
		for (int i = 0; i < fmList.size(); i++)
		{
			BeeCommonNodeTree fmNode = (BeeCommonNodeTree) fmList.get(i);

			BeeCommonNodeTree fmNameNode = (BeeCommonNodeTree) fmNode.getChild(0);
			fmFunction = (String) fmNameNode.getCached();
			if (fmFunction == null)
			{
				fmFunction = BeetlUtil.getFunctionFullName(fmNameNode);
				fmNameNode.setCached(fmFunction);
			}

			if (fmNode.getChildCount() == 2)
			{
				pattern = ((CommonTree) fmNode.getChild(1)).getToken().getText();
				pattern = pattern.substring(1, pattern.length() - 1);

			}
			//目前支持一个
			break;

		}
		return new String[]
		{ fmFunction, pattern };
	}

	private void writeObjectRef(BeeCommonNodeTree t, int to) throws IOException
	{
		Writer orginalWriter = this.fw;
		this.fw = new StringWriter();
		int count = 0;
		if (to == -1)
		{
			count = t.getChildCount();
		}
		else
		{
			count = to;
		}
		BeeCommonNodeTree identifyNode = (BeeCommonNodeTree) t.getChild(0);
		String varName = identifyNode.getToken().getText();
		TypeClass type = identifyNode.getTypeClass();
		print(varName);
		if (t.getChildCount() > 1)
		{

			for (int i = 1; i < count; i++)
			{

				if (type.getRawType().equals(Object.class))
				{
					// 目前版本暂时不支持
					throw new PreCompileException("当前版本暂时不支持Object " + identifyNode.getToken().getText() + ", 位于行"
							+ identifyNode.getLine());
				}
				BeeCommonNodeTree attrNode = (BeeCommonNodeTree) t.getChild(i);
				if (attrNode.getToken().getType() == BeeParser.ATTR_NAME)
				{
					// 普通属性,找出get方法
					String attrName = ((BeeCommonNodeTree) attrNode.getChild(0)).getToken().getText();
					try
					{

						if (type.getRawType().equals(Map.Entry.class))
						{
							// Map.entry is not javabean,can not use
							// PropertyDescriptor
							print(".get" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1) + "()");
						}
						else
						{

							Method getMethod = PropertyUtil.getReadMethod(type.getRawType(), attrName);
							if (getMethod == null)
							{
								throw new PreCompileException("未找到get方法  " + identifyNode.getToken().getText()
										+ ", 位于行" + identifyNode.getLine());
							}
							if (getMethod.getParameterTypes().length == 0)
							{
								print("." + getMethod.getName() + "()");
							}
							else
							{
								print(".get(\"" + attrName + "\")");
							}

						}

						type = attrNode.getTypeClass();

					}
					catch (Exception ex)
					{
						// could not happen
						ex.printStackTrace();
					}

				}
				else if (attrNode.getToken().getType() == BeeParser.MAP_LIST_INDEX)
				{

					if (type.getRawType().isArray())
					{
						print("[");
						writeTree((BeeCommonNodeTree) attrNode.getChild(0));
						print(".intValue()");
						print("]");
					}
					else if (List.class.isAssignableFrom(type.getRawType()))
					{
						print(".get(");
						writeTree((BeeCommonNodeTree) attrNode.getChild(0));
						print(".intValue()");
						print(")");
					}
					else if (Map.class.isAssignableFrom(type.getRawType()))
					{
						print(".get(");
						writeTree((BeeCommonNodeTree) attrNode.getChild(0));
						print(")");
					}
					else
					{
						// generic get
						Method m = (Method) ((BeeCommonNodeTree) attrNode).getCached();
						if (m.getParameterTypes().length == 1)
						{
							print(".get(");
							writeTree((BeeCommonNodeTree) attrNode.getChild(0));
							print(")");
						}
						else
						{
							print(".");
							print(m.getName());
							print("()");
						}

					}
					type = attrNode.getTypeClass();

				}
				else if (attrNode.getToken().getType() == BeeParser.VIRTUAL_ATTR_NAME)
				{
					String attrName = ((BeeCommonNodeTree) attrNode.getChild(0)).getToken().getText();
					String varRefStr = ((StringWriter) this.fw).toString();
					String evalExp = null;
					if (attrNode.getTypeClass().getRawType().equals(Object.class))
					{
						evalExp = "evalVirtualAttribute(" + varRefStr + ",\"" + attrName + "\",ctx)";
					}
					else
					{
						evalExp = "(" + this.getClassName(attrNode.getTypeClass().getRawType())
								+ ")evalVirtualAttribute(" + varRefStr + ",\"" + attrName + "\",ctx)";
					}

					this.fw = new StringWriter();
					this.fw.write(evalExp.toCharArray());

				}
			}
		}

		String finalExp = this.fw.toString();
		// 转成BeeNumber类型
		if (t.getChildCount() > 1 && type.getRawType().equals(BeeNumber.class))
		{
			finalExp = "nf.y(" + this.fw.toString() + ")";
		}

		this.fw = orginalWriter;
		this.print(finalExp);
	}

	private void writeObjectRef2(BeeCommonNodeTree t, int to) throws IOException
	{

		int count = 0;
		if (to == -1)
		{
			count = t.getChildCount();
		}
		else
		{
			count = to;
		}
		BeeCommonNodeTree identifyNode = (BeeCommonNodeTree) t.getChild(0);
		String varName = identifyNode.getToken().getText();
		String lastEval = varName;
		TypeClass type = identifyNode.getTypeClass();

		if (t.getChildCount() > 1)
		{

			for (int i = 1; i < count; i++)
			{

				BeeCommonNodeTree attrNode = (BeeCommonNodeTree) t.getChild(i);
				if (attrNode.getToken().getType() == BeeParser.ATTR_NAME)
				{
					// 普通属性,
					String attrName = ((BeeCommonNodeTree) attrNode.getChild(0)).getToken().getText();

					if (type.getRawType().equals(Map.Entry.class))
					{
						// Map.entry is not javabean,can not use
						// PropertyDescriptor
						print(".get" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1) + "()");
					}
					else
					{
						lastEval = "evalObjectAttribute(" + lastEval + ",\"" + attrName + "\")";

					}

					type = attrNode.getTypeClass();

				}
				else if (attrNode.getToken().getType() == BeeParser.MAP_LIST_INDEX)
				{

					Writer orginalWriter = this.fw;
					this.fw = new StringWriter();
					writeTree((BeeCommonNodeTree) attrNode.getChild(0));
					String exp = fw.toString();
					this.fw = orginalWriter;
					lastEval = "evalKey(" + lastEval + "," + exp + ")";

				}
				else if (attrNode.getToken().getType() == BeeParser.VIRTUAL_ATTR_NAME)
				{

					String attrName = ((BeeCommonNodeTree) attrNode.getChild(0)).getToken().getText();
					lastEval = "evalVirtualAttribute(" + lastEval + ",\"" + attrName + "\",ctx)";

				}
			}
		}

		this.print(lastEval);

	}

	private void writeVarRef(BeeCommonNodeTree t, int to) throws IOException
	{

		if (t.getTypeClass().getRawType().equals(Object.class))
		{
			this.writeObjectRef2(t, to);
		}
		else
		{
			writeObjectRef(t, to);
		}

	}

	private void writePackage() throws IOException
	{
		if (pkg.length() != 0)
		{
			println("package " + pkg + ";");
		}

	}

	private void writeImport() throws IOException
	{
		Collection<TypeClass> importVarClasses = tb.getTypeClass().values();
		for (TypeClass impClass : importVarClasses)
		{

			String className = null;

			if (impClass.getRawType().isArray())
			{
				Class real = impClass.getRawType().getComponentType();
				className = real.getName();
			}
			else
			{
				className = impClass.getRawType().getName();
			}

			className = className.replace('$', '.');
			if (className.equals("byte") || className.equals("char"))
			{
				continue;
			}
			if (!(className.startsWith("java.lang") || className.startsWith("java.util")))
			{
				println("import " + className + ";");
			}
			if (impClass.getPtypeMap().size() != 0)
			{
				Iterator<Class> it = impClass.getPtypeMap().values().iterator();
				Class c = null;
				while (it.hasNext())
				{
					c = it.next();
					if (c.isArray())
					{
						Class real = c.getComponentType();
						className = real.getName();
					}
					else
					{
						className = c.getName();
					}
					if (!(className.startsWith("java.lang") || className.startsWith("java.util")))
					{
						println("import " + className + ";");
					}
				}
			}

		}
		println("import java.util.*;");
		println("import java.util.Map.Entry;");
		println("import java.math.*;");

		println("import java.io.*;");
		println("import org.bee.tl.core.*;");
		println("import org.bee.tl.core.io.*;");
		println("import org.bee.tl.core.compile.*;");
		println("import org.bee.tl.core.exception.*;");
		println("import org.bee.tl.core.number.*;");
		

	}

	private void println(String content) throws IOException
	{
		fw.write(space, 0, indent * SPACE);
		fw.write(content);
		fw.write(CR);
		currentLine++;

	}

	private void printCR() throws IOException
	{
		fw.write(CR);
		currentLine++;
	}

	private void printStart(String content) throws IOException
	{
		fw.write(space, 0, indent * SPACE);
		fw.write(content);
	}

	private void print(String content) throws IOException
	{
		fw.write(content);

	}

	private void addIndent()
	{
		this.indent++;
	}

	private void decIndent()
	{
		//代码生成器调试
		if (this.indent == 0)
		{
			throw new RuntimeException("代码写错了，有bug");
		}
		this.indent--;
	}

	private String getShowType(Class c)
	{
		String className = c.getSimpleName();
		// if (primitiveMap.containsKey(className))
		// {
		// return this.primitiveMap.get(className);
		// }
		// else
		// {
		// return className;
		// }
		return className;

	}

	private String getClassName(Class c)
	{
		if (Number.class.isAssignableFrom(c))
		{
			return "BeeNumber";
		}
		else
		{
			String simpleName = c.getSimpleName();
			// if (primitiveMap.containsKey(simpleName))
			// {
			// return primitiveMap.get(simpleName);
			// }
			// else
			// {
			// return simpleName;
			// }
			return simpleName;
		}

	}

	public static void main(String[] args)
	{
		{
			// BeetlCodeGenerator cg = new BeetlCodeGenerator();
			// cg.key = "/listPayMent.html";
			// String[] strs = BeetlUtil.getPackage2Class(cg.key);
			// String classFile = strs[0].replace('.', File.pathSeparatorChar)
			// + File.separator + strs[1];
			// System.out.println(classFile);
			//			String str = "abc";
			//			byte[] bs = str.getBytes();
			//
			//			String result = toByteArray(bs);
			//			System.out.println(result);
			String t = "\\a\\b";
			t = t.replace("\\", "\\\\");

			System.out.println(t);

		}

	}

}

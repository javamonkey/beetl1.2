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

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.bee.tl.core.exception.HTMLTagParserException;
import org.bee.tl.core.io.ByteWriter;
import org.bee.tl.core.io.ByteWriter_Char;
import org.bee.tl.core.number.NumberFactory;

public class BeeTemplate extends AbstractTemplate {

	String placeholderStart = "${";
	String placeholderEnd = "}";
	String statementStart = "<%";
	String statementEnd = "%>";

	String htmlTagStart = "<#";
	String htmlTagEnd = "</#";
	boolean isHtmlTagSupport = false;

	public BeeTemplate(String input) {

		this.resource = new Resource(input);
		scriptRunner = new CoreScriptRunner();

	}

	public BeeTemplate(File file) throws IOException {
		resource = new Resource(file, "UTF-8");
		scriptRunner = new CoreScriptRunner();

	}

	public BeeTemplate(File file, String charset) throws IOException {
		this.resource = new Resource(file, charset);
		scriptRunner = new CoreScriptRunner();

	}

	public BeeTemplate(Reader reader) throws IOException {

		this.resource = new Resource(BeetlUtil.getString(reader));
		scriptRunner = new CoreScriptRunner();

	}

	//
	// public BeeTemplate(File file, Context ctx) throws IOException
	// {
	// this.reader = new FileReader(file);
	// this.context = ctx;
	// resource = new Resource(file, group.charset);
	// scriptRunner = new CoreScriptRunner();
	//
	// }

	// public BeeTemplate(String input, Context ctx) throws IOException
	// {
	// resource = new Resource(input);
	// this.reader = resource.getReader();
	// this.context = ctx;
	// scriptRunner = new CoreScriptRunner();
	//
	// }

	public BeeTemplate(Resource res, CoreScriptRunner scriptRunner)

	{
		this.resource = res;
		this.scriptRunner = scriptRunner;

	}

	public String getContent(int start, int end) throws IOException {
		return resource.getLines(start, end);
	}

	protected void initScriptRunner() throws IOException {

		Transformator tf = new Transformator(placeholderStart, placeholderEnd,
				this.statementStart, this.statementEnd);
		if (this.isHtmlTagSupport) {
			tf.enableHtmlTagSupport(this.htmlTagStart, this.htmlTagEnd);
		}
		Reader textReader = this.resource.getReader();
		Reader scriptReader = null;

		try {
			scriptReader = tf.transform(textReader);
		} catch (HTMLTagParserException e) {
			// 返回一个错误的模板
			scriptRunner.lasetRe = e;
			scriptRunner.isParseSuccess = false;
			tf.clear();
			return;
		}
		scriptRunner.setScriptInputReader(scriptReader);

		if (scriptRunner.directByteOutput) {
			// 直接二进制输出
			Map<String, String> texts = tf.getTextMap();
			Map<String, byte[]> byteMap = new HashMap<String, byte[]>(
					texts.size());
			for (Map.Entry<String, String> entry : texts.entrySet()) {
				byteMap.put(entry.getKey(),
						entry.getValue().getBytes(group.getCharset()));
			}

			scriptRunner.textVar = byteMap;
		} else {

			scriptRunner.textVar = tf.getTextMap();
		}
		resource.setCR(tf.lineSeparator);
		scriptRunner.setCharset(this.resource.charset);
		scriptRunner.setCR(tf.lineSeparator);
		scriptRunner.parse();
		tf.clear();

	}

	public void config(String statementStart, String statementEnd,
			String holderStart, String holderEnd) {
		this.setStatementStart(statementStart);
		this.setStatementEnd(statementEnd);
		this.setPlaceholderStart(holderStart);
		this.setPlaceholderEnd(holderEnd);
	}

	public void config(String statementStart, String statementEnd,
			String holderStart, String holderEnd, boolean nativeCall) {
		this.setStatementStart(statementStart);
		this.setStatementEnd(statementEnd);
		this.setPlaceholderStart(holderStart);
		this.setPlaceholderEnd(holderEnd);
		if (nativeCall)
			this.enableNativeCall();
	}

	public void getTextByByteWriter(ByteWriter pw) throws IOException,
			BeeException {
		if (!scriptRunner.hasParsed) {
			initScriptRunner();
		}
		try {
			this.context.text = this.scriptRunner.textVar;
			this.context.set("__group", this.group);
			if (this.scriptRunner.isBigNumberSupport()) {
				this.context.nf = NumberFactory.big;
			} else {
				this.context.nf = NumberFactory.general;
			}

			this.scriptRunner.runScript(pw, new Context(context));
			pw.flush();

		} catch (BeeException ex) {

			if (ex.getResource() == null)
				ex.setResource(this.resource);
			if (group == null) {
				new DefaultErrorHandler().processExcption(ex);
			} else if (group.getErrorHandler() != null) {
				group.getErrorHandler().processExcption(ex);
				return;
			} else {
				throw ex;
			}

		} catch (Exception ex) {
			// todo,如何处理，不应该发生
			ex.printStackTrace();

		}

	}

	public void getText(Writer pw) throws IOException, BeeException {

		ByteWriter_Char bw = new ByteWriter_Char(pw, group.getCharset());

		this.getTextByByteWriter(bw);

	}

	public static void main(String[] args) throws Exception {

		{
			DefaultErrorHandler.OFFSET = 10;
			String input = "<%var c=[a,b,'hello',{'key1':'value1','key2':'value2'}];%>${c[3]['key1']}";
			BeeTemplate t = new BeeTemplate(input);

			t.set("a", 3);
			t.set("b", -1);

			String actual = t.getTextAsString();
			System.out.println(actual);

		}

		// {
		// BeeTemplate t = new BeeTemplate("@{'/'+namespace}");
		// t.config("<%", "%>", "@{", "}");
		// t.set("namespace", "system");
		// String result = t.getTextAsString();
		// System.out.println(result);
		// }

	}

	public String getCR() {
		return this.resource.CR;
	}

	@Override
	public Context getContext() {
		return this.context;
	}

	public String getPlaceholderStart() {
		return placeholderStart;
	}

	public void setPlaceholderStart(String placeholderStart)

	{
		if (scriptRunner == null || !scriptRunner.hasParsed) {
			this.placeholderStart = placeholderStart;
		} else {
			throw new IllegalStateException("设置不允许，因为CoreScriptRunner已经初始化完毕");
		}

	}

	public String getPlaceholderEnd() {
		return placeholderEnd;
	}

	public void setPlaceholderEnd(String placeholderEnd) {

		if (scriptRunner == null || !scriptRunner.hasParsed) {
			this.placeholderEnd = placeholderEnd;
		} else {
			throw new IllegalStateException("设置不允许，因为CoreScriptRunner已经初始化完毕");
		}

	}

	public String getStatementStart() {
		return statementStart;
	}

	public void setStatementStart(String statementStart) {

		if (scriptRunner == null || !scriptRunner.hasParsed) {
			this.statementStart = statementStart;
		} else {
			throw new IllegalStateException("设置不允许，因为CoreScriptRunner已经初始化完毕");
		}

	}

	public String getStatementEnd() {
		return statementEnd;
	}

	public void setStatementEnd(String statementEnd) {
		if (scriptRunner == null || !scriptRunner.hasParsed) {
			this.statementEnd = statementEnd;
		} else {
			throw new IllegalStateException("设置不允许，因为CoreScriptRunner已经初始化完毕");
		}

	}

	public void enableHtmlTagSupport(String tagFlag) {
		this.isHtmlTagSupport = true;
		this.htmlTagEnd = "<" + tagFlag;
		this.htmlTagStart = "</" + tagFlag;
	}

}

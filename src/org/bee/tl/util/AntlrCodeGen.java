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
package org.bee.tl.util;

import org.antlr.Tool;

/**
 * 开发辅助用，用于根据bee.g语法文件生成解析代码
 * 
 * @author joelli
 * @sinace 0.5
 * 
 * 
 */
public class AntlrCodeGen
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{

		String root = "E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\";
		//		{
		//			// String tree = root+"CMinusWalker.g";
		//			// String parser = root+"CMinus.g";
		//			// String dest = root;
		//			// Tool parserGen = new Tool(new String[]{"-o",dest, parser});
		//			// parserGen.process();
		//			//
		//			// Tool treeGen = new Tool(new String[]{"-o",dest,"-debug", tree});
		//			// // Tool treeGen = new Tool(new String[]{"-o",dest, tree});
		//			// treeGen.process();
		//		}
		//
		//		// String tree = root + "BeeWalker.g";
		String parser = root + "Bee.g";
		String dest = root;
		Tool parserGen = new Tool(new String[]
		{ "-o", dest, parser });
		parserGen.process();
		System.out.println("success! don't forget to refresh project :)");
		//
		// Tool treeGen = new Tool(new String[]{"-o",dest, tree});
		// // Tool treeGen = new Tool(new String[]{"-o",dest, tree});
		// treeGen.process();

	}

}

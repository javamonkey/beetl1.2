package org.bee.tl.ext;
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
import org.bee.tl.core.Context;
import org.bee.tl.core.Function;

/**
 * ${qmark(score>60,"及格","不及格")}
 * @author 一颗草
 * @create 2013-6-29
 */
public class QuestionMark implements Function {

	public Object call(Object[] paras, Context ctx) {

		if (paras.length != 3) {
			throw new RuntimeException(
					"请输入问号表达式格式： qmark(a==\"a\",\"yes\",\"no\")");
		} else {
			if (paras.length == 3) {
				if ((Boolean) paras[0]) {
					return paras[1];
				} else {
					return paras[2];
				}
			}

			throw new RuntimeException(
					"Parse split Error,Args Object,Object,Object ");
		}
	}

}

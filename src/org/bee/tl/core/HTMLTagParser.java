package org.bee.tl.core;

import java.util.HashMap;
import java.util.Map;

/**
 * 用于解析htmltag，转化成宏调用
 * @author joelli
 * @create 2013-6-12
 */
public class HTMLTagParser {

	int index = 0;
	char[] cs = null;
	boolean isStart;
	String tagName = null;
	boolean isEmptyTag = false;
	Map<String, String> expMap = new HashMap<String, String>();

	public HTMLTagParser(char[] cs, int index, boolean isStart) {
		this.cs = cs;
		this.index = index;
		this.isStart = isStart;
	}

	public void parser() {
		if(!findTagName()) return ;
		while (isStart && next())
			;
	}

	private boolean findTagName() {
		int start = index;
		boolean hasLetter = false ;
		while (start++ < cs.length) {
			if(isStart){
				if (hasLetter) {
					if(cs[start]==' '||cs[start]=='>'){
						this.tagName = new String(cs, index, start - index);
						index = start+1;
						return false ;
					}else if(cs[start]=='/'&&cs[start+1]=='>'){
						this.tagName = new String(cs, index, start - index);
						index = start+2;
						return false;
					}
					
				}else if(cs[start]!=' '){
					hasLetter = true ;
				}
			}else{
				//</@input>
				if (hasLetter&&cs[start] == '>') {
					this.tagName = new String(cs, index, start - index).trim();
					index = start+1;
					return false;
				}else if(cs[start]!=' '){
					hasLetter = true ;
				}
			}
			
		}
		throw new RuntimeException("ERROR");
	}

	public boolean isEmptyTag() {
		return this.isEmptyTag;
	}

	private boolean next() {
		StringBuilder keySb = new StringBuilder();
		StringBuilder expSb = new StringBuilder();
		String key = null;
		String exp = null;
		int status = 0;
		char quot = '\'';

		while (index < cs.length) {
			char ch = cs[index];
			index++;
			switch (status) {
			case 0: {
				if(ch=='>'){					
					return false;
				}else if (ch != '=') {
					keySb.append(ch);
					continue;
				} else {
					key = keySb.toString().trim();
					status = 1;
					continue;
				}

			}
			case 1: {
				if (ch== '\'') {
					quot = '\'';
					status = 2;

				} else if (ch == '\"') {
					quot = '\"';
					status = 2;
				}
				continue;
			}
			case 2: {
				if (ch == quot) {
					if (cs[index - 1] != '\\') {
						// 结束
						exp = expSb.toString().trim();
						status = 3;
						continue;

					} else {
						// escape
						expSb.append(ch);
						continue;
					}
				} else {
					expSb.append(ch);
					continue;
				}
			}

			case 3: {
				this.expMap.put(key, exp);
				// 继续往前，如果碰到了'>'或者'/>'者表示结束，如果碰到其他分空字符，则是下一个属性
				if (ch == '>') {
					return false;
				} else if (ch == '/' && cs[index + 1] == '>') {
					this.isEmptyTag = true;
					index = index+2;
					return false;

				} else if (ch != ' ') {
					index--;
					return true;
				}

			}

			}
		}
		return false;
	}

	public int getIndex() {
		return index;
	}


	public String getTagName() {
		return tagName;
	}

	
	public Map<String, String> getExpMap() {
		return expMap;
	}

	public void setExpMap(Map<String, String> expMap) {
		this.expMap = expMap;
	}

	

	public static void main(String[] args) {
		String input = "</@input>";
		HTMLTagParser htmltag = new HTMLTagParser(input.toCharArray(),3,false);
		htmltag.parser();
		System.out.println(htmltag.getTagName());
		System.out.println(htmltag.getExpMap());
		System.out.println(htmltag.isEmptyTag());
		

	}

}

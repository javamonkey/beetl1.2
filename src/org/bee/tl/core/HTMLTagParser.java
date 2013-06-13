package org.bee.tl.core;

import java.util.HashMap;
import java.util.Map;

/**
 * 
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
		findTagName();
		while (!isStart && next())
			;
	}

	private void findTagName() {
		int start = index;
		boolean hasLetter = false ;
		while (start++ < cs.length) {
			if(isStart){
				if (hasLetter&&cs[start] == ' ') {
					this.tagName = new String(cs, index, start - index);
					index = start;
					return;
				}else if(cs[start]!=' '){
					hasLetter = true ;
				}
			}else{
				if (hasLetter&&cs[start] == '/'&&cs[start+1]=='>') {
					this.tagName = new String(cs, index, start - index);
					index = start;
					return;
				}else if(cs[start]!=' '){
					hasLetter = true ;
				}
			}
			
		}
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

		while (index++ < cs.length) {
			switch (status) {
			case 0: {
				if (cs[index] != '=') {
					keySb.append(cs[index]);
					continue;
				} else {
					key = keySb.toString().trim();
					status = 1;
					continue;
				}

			}
			case 1: {
				if (cs[index] == '\'') {
					quot = '\'';
					status = 2;

				} else if (cs[index] == '\"') {
					quot = '\"';
					status = 2;
				}
				continue;
			}
			case 2: {
				if (cs[index] == quot) {
					if (cs[index - 1] != '\\') {
						// 结束
						exp = expSb.toString().trim();
						status = 3;
						continue;

					} else {
						// escape
						expSb.append(cs[index]);
						continue;
					}
				} else {
					expSb.append(cs[index]);
					continue;
				}
			}

			case 3: {
				this.expMap.put(key, exp);
				// 继续往前，如果碰到了'>'或者'/>'者表示结束，如果碰到其他分空字符，则是下一个属性
				if (cs[index] == '>') {
					return false;
				} else if (cs[index] == '/' && cs[index + 1] == '>') {
					this.isEmptyTag = true;
					return false;

				} else if (cs[index] != ' ') {
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
		// TODO Auto-generated method stub

	}

}

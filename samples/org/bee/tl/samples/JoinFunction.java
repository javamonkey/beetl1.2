package org.bee.tl.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import org.bee.tl.core.Context;
import org.bee.tl.core.Function;

/**
 * 一个自定义join集合的方法
 * @author joelli
 *
 */
public class JoinFunction implements Function {
	
	static String str = getHugeString();
	static byte[] bs = new byte[1024*1024*100];
	
	public Object call(Object[] arg, Context arg1) {
		
		Object target = arg[0];
		if(target==null) return "";		
		String token = (String)arg[1];
		Collection list = null ;
		if(target.getClass().isArray()){
			list = Arrays.asList((Object[])target);
		}else if(Collection.class.isAssignableFrom(target.getClass())){
			list = (Collection)target;
		}else{
			list = new ArrayList(1);
			list.add(target);
		}
		StringBuilder sb = new StringBuilder();
		Iterator it = list.iterator();
		for(int i=0;i<list.size();i++){
			Object o = it.next();
			if(o!=null){
				sb.append(o.toString());
			}
			if(i!=list.size()-1){
				sb.append(token);
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args){
		System.out.println(str.length());
	}
	
	public static String getHugeString(){
		String str = "aaaaaaaaaa";
		//about 50M
		int max = 100*1000*20;
//		int max = 1;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<max;i++){
			sb.append(str);
		}
		return sb.toString();
		
	}
	
	

}

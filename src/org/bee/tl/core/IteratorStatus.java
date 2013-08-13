package org.bee.tl.core;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class IteratorStatus {
	
	Iterator it ;
	int size = -1;
	int index = 0;
	boolean hasData = false ;
	
	public static IteratorStatus getIteratorStatus(Object o){
		if(o instanceof Collection ){
			return new IteratorStatus((Collection)o);
			
		}else if(o instanceof Map){
			return new IteratorStatus((Map)o);
		}else if(o instanceof Iterable){
			return new IteratorStatus((Iterable)o);
		}else if (o.getClass().isArray()){
			return new IteratorStatus((Object[])o);
		}else {
			//throw new RuntimeException("Object:"+o.getClass()+" 不能使用在For循环里");
			return null;
		}
	}
	
	public IteratorStatus(Iterator it){
		this.it = it;
		
	}
	
	public IteratorStatus(Collection collection){
		this.it = collection.iterator();
		this.size = collection.size();
		
	}
	
	public IteratorStatus(Map map){
		it = map.entrySet().iterator();
		this.size = map.size();
	}
	
	public IteratorStatus(Object[] array){
		it = new ArrayIterator(array);
		size = array.length;
		
	}
	
	public IteratorStatus(Iterable i){
		this.it = i.iterator();
		
	}
	
	public boolean hasNext(){
		return this.it.hasNext();
	}
	
	public Object next(){
		index++;
		if(!hasData)hasData = true ;
		return this.it.next();
	}
	
	
	public int getIndex(){
		return this.index;
	}
	
	public boolean isFirst(){
		return index==0;
	}
	
	public boolean isLast(){
		return index==(size-1);
	}
	
	
	public int getSize(){
		if(size!=-1){
			return size;
		}else{
			throw new RuntimeException("集合长度未知,请勿使用size");
		}
	}
	
	public boolean hasData(){
		return hasData;
	}
	
	
	
	static class ArrayIterator implements Iterator{
		Object[] array = null;
		int i = 0;
		ArrayIterator(Object[] array){
			this.array = array ;
		}
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return array.length>i+1;
		}

		public Object next() {
			return array[i++];
		}

		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}
}

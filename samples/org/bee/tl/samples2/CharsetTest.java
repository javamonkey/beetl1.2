package org.bee.tl.samples2;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

public class CharsetTest {

	/**
	 * 2012-6-9
	 * 李bear
	 */
	static ByteArrayOutputStream bos = new ByteArrayOutputStream();
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String str = "中国0";
		byte[] strByte = str.getBytes("GBK");
		Charset cs = Charset.forName("GBK");
		ByteBuffer  bb = ByteBuffer.allocate(4);
		CharBuffer cb = CharBuffer.wrap(str);
		CharsetEncoder en = cs.newEncoder();
		while(cb.hasRemaining()){
			CoderResult cr = en.encode(cb, bb, true);			
			if(cr.isUnderflow()){
//				  bb.put(strByte);
				continue ;
				
			}else if(cr.isOverflow()){
				writeByte(bb);
			}else{
				cr.throwException();
			}
			
		}
		
		writeByte(bb);
		System.out.println("ok");
	}
	
	public static void writeByte(ByteBuffer bb){
		    bb.flip();
	        int lim = bb.limit();
	        int pos = bb.position();
	        assert (pos <= lim);
	        int rem = (pos <= lim ? lim - pos : 0);
	        int startIndex =  bb.arrayOffset() + pos ;
	        int size = rem ;		      
	        byte[] allByte = bb.array();
	        bos.write(allByte, startIndex, size);
	        bb.clear();
	}

}

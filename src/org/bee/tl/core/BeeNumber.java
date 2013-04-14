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

import java.math.BigDecimal;



/**
 * beetl里的数字，保证精度和大数的计算
 * <p>
 * 如999999999999999999999999/23232323
 * 
 * @author joelli
 * 
 */

public  abstract class BeeNumber extends Number implements Comparable
{
	
	
	
	public abstract BeeNumber add(Number i);
	public abstract BeeNumber min(Number i);
		
	public abstract BeeNumber multiply(Number d);

	public abstract BeeNumber divide(Number d);
	
	public abstract Number orginalObject();

	public abstract BeeNumber negate();
	public abstract Number get();
	public abstract BigDecimal getBigDecimal();
////	public String numToString(Number num){
////		return num.toString();
//////		try{
//////			Log.key1Start();
//////			if(num instanceof Integer|| num instanceof Long || num instanceof Short ||num instanceof BigInteger){
//////				return num.toString();
//////			}else if(num instanceof BigDecimal){
//////				String str = num.toString();
//////				int index = -1;
//////				//5.120000
//////				if ((index = str.indexOf('.')) != -1)
//////				{
//////					char[] array = str.toCharArray();
//////					int i = str.length() - 1;
//////					for (; i > index; i--)
//////					{
//////						if (array[i] != '0')
//////						{
//////							break;
//////						}
//////					}
//////					if (i == index)
//////					{
//////						return new String(array, 0, i);
//////					}
//////					else
//////					{
//////						return new String(array, 0, i + 1);
//////					}
//////
//////				}
//////				else
//////				{
//////					String  st = num.toString();
//////					return str;
//////					
//////					
//////				}
//////
//////			}
//////			//double float
//////			else{
//////				
////////				
////////				
//////				
//////				return s;			
//////				
//////			}
//////		}finally{
//////			Log.key1End();
//////		}
////		
//		
//	}
	
	
		

}
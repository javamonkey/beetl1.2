package org.bee.tl.performance.number;

import java.util.regex.Pattern;

public class Perforamce {

	/**
	 * 2013-4-13 miaojun
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for(int i=0;i<2;i++){
		// NumberFactory nf = new NumberFactory(i==0);
		// int max = 100000;
		// long start = System.currentTimeMillis();
		// Number result = null;
		// for(int j=0;j<max;j++){
		// result = nf.y(23.000000);
		// }
		// long end = System.currentTimeMillis();
		//
		//
		// System.out.println("time "+(end-start+" value="+result.toString()));
		//
		// }
		int max = 1000000;
		
		{
			long start = System.currentTimeMillis();
			

			for (int i = 0; i < max; i++) {
				String s = "12.00300";
				s = s.replaceAll("0+?$", "");// 去掉多余的0
				s = s.replaceAll("[.]$", "");// 如最后一位是.则去掉
			}
			long end = System.currentTimeMillis();
			System.out.println("time " + (end - start) + " value=" );
		}
		{
			long start = System.currentTimeMillis();
			
			Pattern p = Pattern.compile("0+?$");
			Pattern p2 = Pattern.compile("[.]$");

			for (int i = 0; i < max; i++) {
				String s = "12.00300";
				s = p.matcher(s).replaceAll("");// 去掉多余的0
				s = p2.matcher(s).replaceAll("");// 如最后一位是.则去掉
			}
			long end = System.currentTimeMillis();
			System.out.println("time2 " + (end - start) + " value=");
		}
		
		{
			long start = System.currentTimeMillis();
			
			Pattern p = Pattern.compile("0+?$");
			Pattern p2 = Pattern.compile("[.]$");

			for (int i = 0; i < max; i++) {
				String s = "12.00300";
				s = trim(s);// 如最后一位是.则去掉
			}
			long end = System.currentTimeMillis();
			
			System.out.println("time3 " + (end - start) + " value="+trim("12.00300"));
			
		}

	}
	
	public static String trim(String str){
		
		int index = -1;
		if ((index = str.indexOf('.')) != -1)
		{
			char[] array = str.toCharArray();
			int i = str.length() - 1;
			for (; i > index; i--)
			{
				if (array[i] != '0')
				{
					break;
				}
			}
			if (i == index)
			{
				return new String(array, 0, i);
			}
			else
			{
				return new String(array, 0, i + 1);
			}

		}
		else
		{
			return str;
		}
	}

}

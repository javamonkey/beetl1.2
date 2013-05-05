package org.bee.tl.core.number;

import java.math.BigDecimal;

import org.bee.tl.core.BeeNumber;

/**
 * 长精度类型，当要计算的时候才初始化才精度类型，否则，保持原有类型
 * @author joelli
 * @create 2013-4-4
 */
public class BigDecimalNumber  extends GeneralNumber{
	
	
	//设置为public方法是往后兼容，请使用NumberFactory来设置
	/**
	 * 除法的时候保留的小数位
	 */
	public static int scale = NumberFactory.scale;
	/**
	 * 默认是四舍五入
	 */
	public static int roundingMode = NumberFactory.roundingMode;
	
	BigDecimal bigNum = null;
	
	public BigDecimalNumber(Number i)
	{
		super(i);
		
	}
	
	public BigDecimalNumber(BigDecimal i){
		super();
		this.bigNum = i;
	}
	
	
	private void make(){
		if(this.bigNum==null){
			
			this.bigNum = make(this.num);
		}
	}
	
	private BigDecimal make(Number n){
		if(n instanceof BigDecimal){
			return (BigDecimal)n;
		}else{
			//todo，高性能构造BigDecmal，用String构造慢
			return new BigDecimal(n.toString());
		}
		
	}
	public BigDecimalNumber add(Number n) {
		
		make();
		if(n instanceof BigDecimalNumber){
			BigDecimalNumber a1 = (BigDecimalNumber)n;
			return new BigDecimalNumber(this.bigNum.add(a1.get()));
		}else {
			BigDecimal a1 = make(n);
			return new BigDecimalNumber(this.bigNum.add(a1)) ;
		}
		
	}
	public String toString() {
		
		if(this.bigNum==null){
			return this.num.toString();
		}else{
			return trim(this.bigNum.toString());
		}
//		String s = this.bigNum==null?this.num.toString():this.bigNum.toString();	
////		if(s.indexOf(".") > 0){
////			s = s.replaceAll("0+?$", "");//去掉多余的0
////			s = s.replaceAll("[.]$", "");//如最后一位是.则去掉
////		}
//		return s;
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
	
	public BigDecimal get(){
		make();
		return this.bigNum;
	}

	public boolean equals(Object o) {
		make();
		if(o instanceof BigDecimalNumber){
			BigDecimalNumber otherBigNumber = (BigDecimalNumber)o;
			BigDecimal n1 = otherBigNumber.get();
			return this.bigNum.compareTo(n1)==0;
			
		}else if(o instanceof Number){
			BigDecimal n1 = make((Number)o);
			return this.bigNum.compareTo(n1)==0;
			
		}else{
			return false ;
		}
		
		

		
	}
	
	public static void main(String[] args){
		BeeNumber gn = new GeneralNumber(12);
		BeeNumber  result = gn.add(35.0);
		System.out.println(result);
		
		
	}

	public int compareTo(Object o) {
		make();
		if(o instanceof BigDecimalNumber){
			BigDecimalNumber otherBigNumber = (BigDecimalNumber)o;
			BigDecimal n1 = otherBigNumber.get();
			return this.bigNum.compareTo(n1);
			
		}else if(o instanceof Number){
			BigDecimal n1 = make((Number)o);
			return this.bigNum.compareTo(n1);
			
		}else{
			throw new RuntimeException("不是数字类型，不能比较");
		}
		
	}

	@Override
	public BigDecimalNumber min(Number n) {
		make();
		if(n instanceof BigDecimalNumber){
			BigDecimalNumber a1 = (BigDecimalNumber)n;
			return new BigDecimalNumber(this.bigNum.subtract(a1.get()));
		}else {
			BigDecimal a1 = make(n);
			return new BigDecimalNumber(this.bigNum.subtract(a1)) ;
		}
		
	}

	@Override
	public BeeNumber multiply(Number n) {
		make();
		if(n instanceof BigDecimalNumber){
			BigDecimalNumber a1 = (BigDecimalNumber)n;
			return new BigDecimalNumber(this.bigNum.multiply(a1.get()));
		}else {
			BigDecimal a1 = make(n);
			return new BigDecimalNumber(this.bigNum.multiply(a1)) ;
		}
	
	}

	@Override
	public BeeNumber divide(Number n) {
		make();
		if(n instanceof BigDecimalNumber){
			BigDecimalNumber a1 = (BigDecimalNumber)n;
			return new BigDecimalNumber(this.bigNum.divide(a1.get(),scale, roundingMode));
		}else {
			BigDecimal a1 = make(n);
			return new BigDecimalNumber(this.bigNum.divide(a1,scale, roundingMode)) ;
		}
	
	}

	@Override
	public Number orginalObject() {
		// TODO Auto-generated method stub
		if(num!=null) return num;
		else return this.bigNum;
	}

	@Override
	public BeeNumber negate() {
		make();
		return new GeneralNumber(this.bigNum.negate());
	}

	@Override
	public BigDecimal getBigDecimal() {
		make();
		return this.bigNum;
	}

	@Override
	public int intValue() {
		if(num!=null){
			return this.num.intValue();
		}else{
			return this.bigNum.intValue();
		}
		
	}

	@Override
	public long longValue() {
		return num!=null?num.longValue():bigNum.longValue();
	}

	@Override
	public float floatValue() {
		return num!=null?num.floatValue():bigNum.floatValue();
	}

	@Override
	public double doubleValue() {
		
		return num!=null? num.doubleValue():bigNum.doubleValue();
	}

	


	
}

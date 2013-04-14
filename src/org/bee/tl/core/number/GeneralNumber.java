package org.bee.tl.core.number;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import org.bee.tl.core.BeeNumber;

public class GeneralNumber extends BeeNumber {
	protected Number num ;
	protected GeneralNumber(){
		
	}
	public GeneralNumber(Number n) {
		this.num = n;
		
	}

	public GeneralNumber add(Number n) {
		
		return new GeneralNumber(trim(num.doubleValue()+n.doubleValue(),num,n));
	}
	
	

	private Number trim(double d,Number a1,Number a2){
		
		Number n1 = null;
		Number n2 = null;
		if(a1 instanceof BeeNumber){
			n1 = ((BeeNumber)a1).get();
		}else{
			n1 = a1;
		}
		if(a2 instanceof BeeNumber ){
			n2 = ((BeeNumber)a2).get();
		}else{
			n2 = a2;
		}
		
		
		if(a1 instanceof BigDecimal|| a2 instanceof BigDecimal){
			return  d;
		} else 	if(n1 instanceof Double || n2 instanceof Double){
			return d ;
		}else if(n1 instanceof Float || n2 instanceof Float){
			return (float) d;
		}
		else if(n1 instanceof Long || n2 instanceof Long){
			if(d!=(long)d){
				return d;
			}else{
				return (long)d;
			}
			
		}else if(n1 instanceof Integer || n2 instanceof Integer){
			if(d!=(int)d){
				return d;
			}else{
				return (int)d;
			}
		}else{
			if(d!=(short)d){
				return d;
			}else{
				return (short)d;
			}
		}
	}
	


	public String toString() {
		return this.num.toString();
//		return this.numToString(this.num);
	}

	public boolean equals(Object o) {
		double d = 0;
		if (o instanceof Number) {
			d = ((Number) o).doubleValue();
			return d==num.doubleValue();
		}else{
			return false ;
		}

		
	}
	
	
	
	public static void main(String[] args){
		DecimalFormat df = new DecimalFormat("#0.0000");
		String s = df.format(0.509001);
		if(s.indexOf(".") > 0){
			s = s.replaceAll("0+?$", "");//去掉多余的0
			s = s.replaceAll("[.]$", "");//如最后一位是.则去掉
		}
		System.out.println(s);
		
		
	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if( o instanceof Number){
			Number n = (Number)o;
			double d1 = this.doubleValue();
			double d2 = n.doubleValue();
			if(d1>d2) return 1 ;
			else if(d1==d2) return 0;
			return -1;
		}else{
			throw new RuntimeException("number!");
		}
		
	}

	@Override
	public BeeNumber min(Number i) {
		return new GeneralNumber(this.trim(num.doubleValue()-i.doubleValue(), num, i));
	}

	@Override
	public BeeNumber multiply(Number d) {
		// TODO Auto-generated method stub
		return new GeneralNumber(this.trim(num.doubleValue()*d.doubleValue(), num, d));
	}

	@Override
	public BeeNumber divide(Number d) {
		return new GeneralNumber(this.trim(num.doubleValue()/d.doubleValue(), num, d));
	}

	@Override
	public Number orginalObject() {
		// TODO Auto-generated method stub
		return num;
	}

	@Override
	public BeeNumber negate() {
		if(num instanceof Double|| num instanceof Float){
			return new GeneralNumber(-num.doubleValue());
			
		}else if(num instanceof BigDecimal){
			return new GeneralNumber(((BigDecimal)num).negate());
		}else{
			return new GeneralNumber(-num.longValue());
		}
		
	}

	@Override
	public BigDecimal getBigDecimal() {
		if(num instanceof BigDecimal){
			return (BigDecimal) num;
		}
		return new BigDecimal(num.toString());
	}

	@Override
	public int intValue() {
		return this.num.intValue();
	}

	@Override
	public long longValue() {
		return num.longValue();
	}

	@Override
	public float floatValue() {
		return num.floatValue();
	}

	@Override
	public double doubleValue() {
		return num.doubleValue();
	}
	@Override
	public Number get() {
		return this.num;
	}
	
	
}

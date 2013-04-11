package org.bee.tl.core.number;

import java.math.BigDecimal;

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
	
	
	private Number trim(double d,Number n1,Number n2){
		if(n1 instanceof Double || n2 instanceof Double){
			return d ;
		}else if(n1 instanceof Float || n2 instanceof Float){
			return (float) d;
		}
		else if(n1 instanceof Long || n2 instanceof Long){
			return (long)d;
		}else if(n1 instanceof Integer || n2 instanceof Integer){
			return (int)d;
		}else{
			return (short)d;
		}
	}
	


	public String toString() {
		return num.toString();
	}

	public boolean equal(Object o) {
		double d = 0;
		if (o instanceof Number) {
			d = ((Number) o).doubleValue();
			return d==num.doubleValue();
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
		// TODO Auto-generated method stub
		if( o instanceof Number){
			Number n = (Number)o;
			double d1 = this.doubleValue();
			double d2 = this.doubleValue();
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
}

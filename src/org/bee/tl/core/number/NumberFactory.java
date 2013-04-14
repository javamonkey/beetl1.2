package org.bee.tl.core.number;

import java.math.BigDecimal;

import org.bee.tl.core.BeeNumber;

public class NumberFactory {

	public static NumberFactory big = new NumberFactory(true);
	public static NumberFactory general = new NumberFactory(false);

	boolean isBig = true;
	/**
	 * 除法的时候保留的小数位
	 */
	public static int scale = 4;
	/**
	 * 默认是四舍五入
	 */
	public static int roundingMode = BigDecimal.ROUND_HALF_UP;
	
	
	

	public NumberFactory(boolean isBig) {
		this.isBig = isBig;
	}

	public BeeNumber y(int i) {
		return isBig ? new BigDecimalNumber(i) : new GeneralNumber(i);
	}

	public BeeNumber y(long i) {
		return isBig ? new BigDecimalNumber(i) : new GeneralNumber(i);
	}

	public BeeNumber y(double i) {
		return isBig ? new BigDecimalNumber(i) : new GeneralNumber(i);
	}

	public BeeNumber y(String d) {
		return isBig ? new BigDecimalNumber(new BigDecimal(d))
				: new GeneralNumber(Double.parseDouble(d));

	}

	public BeeNumber y(Number o) {
		if (isBig) {
			if (o instanceof BigDecimalNumber) {
				return (BigDecimalNumber) o;
			} else {
				return new BigDecimalNumber(o);
			}
		} else {
			if (o instanceof GeneralNumber) {
				return (GeneralNumber) o;
			} else {
				return new GeneralNumber(o);
			}
		}

	}

	public BeeNumber y(BigDecimal number) {

		if (isBig) {

			return new BigDecimalNumber(number);

		} else {
			return new GeneralNumber(number);
		}

	}

	public boolean isBig() {
		return isBig;
	}

	public void setBig(boolean isBig) {
		this.isBig = isBig;
	}

}

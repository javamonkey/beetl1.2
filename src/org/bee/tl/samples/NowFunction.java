package org.bee.tl.samples;

import java.util.Date;

import org.bee.tl.core.Context;
import org.bee.tl.core.Function;

public class NowFunction implements Function {

	public Date call(Object[] paras,Context ctx) {
		return new java.util.Date();
	}

}

package org.bee.tl.ext;

import org.bee.tl.core.Context;
import org.bee.tl.core.Function;

public class IntegerParser implements Function {

	public IntegerParser() {
		// TODO Auto-generated constructor stub
	}

	public Object call(Object[] paras, Context ctx) {
		return Integer.parseInt(paras[0].toString());
	}


}

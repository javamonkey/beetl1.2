package org.bee.tl.samples;

import java.util.Date;

import org.bee.tl.core.Context;

public class NowFunction  {

	public Date call(Context ctx) {
		return new java.util.Date();
	}
	
	
	public Date call(String date,Context ctx) {
		return new java.util.Date();
	}

}

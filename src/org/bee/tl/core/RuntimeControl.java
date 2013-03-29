package org.bee.tl.core;

public class RuntimeControl
{
	// 0 reset 1 continue 2 break;
	int jump = 0;
	static final int FOR_RESET = 0;
	static final int FOR_CONTINUE = 1;
	static final int FOR_BREAK = 2;
	static final int RETURN = 4;
	Derective derective = new Derective();
}

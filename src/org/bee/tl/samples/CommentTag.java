package org.bee.tl.samples;

import org.bee.tl.core.Tag;

public class CommentTag extends Tag {

	@Override
	public String getOutput() {
		return "<!--  comment by comment Tag \n" + this.input + "-->";
	}

	/**
	 * 2013-6-23 Administrator
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

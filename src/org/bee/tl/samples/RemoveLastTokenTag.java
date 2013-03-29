package org.bee.tl.samples;

import org.bee.tl.core.Tag;

public class RemoveLastTokenTag extends Tag {

	@Override
	public String getOutput() {
		String token = (String) this.args[0];
		int index = this.input.lastIndexOf(token);
		if (index != -1) {
			return this.input;
		} else {
			int len = token.length();
			StringBuilder sb = new StringBuilder();
			sb.append(input.substring(0, index)).append(
					input.substring(index + len));
			return sb.toString();
		}

	}

}

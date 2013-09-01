package org.bee.tl.samples;
import org.bee.tl.core.GroupTemplate;
public class GroupTemplateUtil {

	static GroupTemplate group = new GroupTemplate();
	static {
		group.setPlaceholderStart("<%");
		group.setPlaceholderEnd("%>");
		group.setStatementStart("${");
		group.setStatementEnd("}");
		group.enableOptimize();
		group.enableNativeCall();
		group.enableChecker(10);
		addCommonFunction();
		addCommonFormat();
		
		
	}
	public static GroupTemplate getGroup (){
		return group;
	}
	public static void addCommonFunction(){
		
	}
	
	public static void addCommonFormat(){
		
	}
	
}

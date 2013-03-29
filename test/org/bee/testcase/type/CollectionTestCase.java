package org.bee.testcase.type;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.bee.testcase.BasicTestCase;
import org.bee.tl.core.BeeException;
import org.bee.tl.core.Template;

public class CollectionTestCase extends BasicTestCase
{
	public CollectionTestCase()
	{
		super();
//		this.gt.setDebug(true);
//		this.gt.enableOptimize();
		
	}
	
	
	public void testList() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/type/list_template.html");
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("joel");
		t.set("list", list);
		String str = t.getTextAsString();	
		
		t = this.gt.getFileTemplate("/type/list_template.html");
		list = new ArrayList<String>();
		list.add("hello");
		list.add("joel");
		t.set("list", list);
		str = t.getTextAsString();
		
		Assert.assertEquals(this.getFileContent("/type/list_expected.html"), str);
	}
	
	public void testList1() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/type/list1_template.html");
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		t.set("list", list);
		String str = t.getTextAsString();
		
		t = this.gt.getFileTemplate("/type/list1_template.html");
		list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		t.set("list", list);
		str = t.getTextAsString();
		
		this.assertEquals(this.getFileContent("/type/list1_expected.html"), str);
	}
	
	public void testArray() throws IOException, BeeException
	{

		Template t = this.gt.getFileTemplate("/type/array_template.html");
		String[] array = new String[]{"array0","array1"};	
		t.set("array", array);
		String str = t.getTextAsString();	
		
		
		t = this.gt.getFileTemplate("/type/array_template.html");
		array = new String[]{"array0","array1"};	
		t.set("array", array);
		str = t.getTextAsString();	
		
		this.assertEquals(this.getFileContent("/type/array_expected.html"), str);
	}
	


}

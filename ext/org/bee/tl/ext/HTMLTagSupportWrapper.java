package org.bee.tl.ext;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import org.bee.tl.core.BeeException;
import org.bee.tl.core.Tag;
import org.bee.tl.core.Template;

public class HTMLTagSupportWrapper extends Tag {
	@Override
	public boolean requriedInput()
	{
		return true;
	}
	
	/**
	 * 得到Tag的内容，string方式
	 * @return
	 */
	public  String getOutput(){
		
		if (args.length == 0 || args.length > 2)
		{
			throw new RuntimeException("参数错误，期望child,Map .....");
		}
		String child = (String) args[0];
		// 首先查找 已经注册的Tag
		Tag realTag = null; 
		String functionTagName = child.replace(':','.');
		realTag = this.group.getScriptGlobal().getTag(functionTagName);
		if(realTag==null){
			String path = child.replace(':', File.separatorChar);
			path =  "/htmltag/"+path+".tag";
			return callHtmlTag(path);
			
		}else{
			return callTag(realTag);
		}
		
	}
	
	protected String callHtmlTag(String file) {
		Template t = null;
		try
		{
			t = group.getFileTemplate(file);
		}
		catch (IOException e1)
		{
			throw new RuntimeException(e1);
		}

		if (args.length == 2)
		{
			Map<String, Object> map = (Map<String, Object>) args[1];
			for (Entry<String, Object> entry : map.entrySet())
			{
				t.set(entry.getKey(), entry.getValue());
			}
		}
		//只复制这些serlvet变量
		t.set("servlet", ctx.getVarWithoutException("servlet"));
		t.set("ctxPath", ctx.getVarWithoutException("ctxPath"));
		t.setRawValue("session", ctx.getVarWithoutException("session"));
		t.set("tagBody",this.input );
		try
		{
			//			t.getText(writer);
			t.getTextByByteWriter(writer);
			return "";

		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
		catch (BeeException e)
		{
			throw new RuntimeException(e);
		}
	}
	
	protected String callTag(Tag tag){
		tag.setContext(ctx);
		tag.setInput(input);
		if(args.length==1){
			tag.setParas(new Object[]{});
		}else{
			tag.setParas(new Object[]{args[1]});
		}
		
		return tag.getOutput();
		
	}
	
	
	
	
	protected void makeOutput()
	{

		if (args.length == 0 || args.length > 2)
		{
			throw new RuntimeException("参数错误，期望child,Map .....");
		}
		String child = (String) args[0];
		// 首先查找 已经注册的Tag
		Tag realTag = null; 
		String functionTagName = child.replace(':','.');
		realTag = this.group.getScriptGlobal().getTag(functionTagName);
		if(realTag==null){
			String path = child.replace(':', File.separatorChar);
			path =  "/htmltag/"+path+".tag";
			
			
		}
		
		
		
		
		
		Template t = null;
		try
		{
			t = group.getFileTemplate(child);
		}
		catch (IOException e1)
		{
			throw new RuntimeException(e1);
		}

		if (args.length == 2)
		{
			Map<String, Object> map = (Map<String, Object>) args[1];
			for (Entry<String, Object> entry : map.entrySet())
			{
				t.set(entry.getKey(), entry.getValue());
			}
		}
		//只复制这些serlvet变量
		t.set("servlet", ctx.getVarWithoutException("servlet"));
		t.set("ctxPath", ctx.getVarWithoutException("ctxPath"));
		t.setRawValue("session", ctx.getVarWithoutException("session"));
		try
		{
			//			t.getText(writer);
			t.getTextByByteWriter(writer);

		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
		catch (BeeException e)
		{
			throw new RuntimeException(e);
		}
	}
}

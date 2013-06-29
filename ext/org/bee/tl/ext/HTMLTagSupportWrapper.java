package org.bee.tl.ext;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.Map.Entry;

import org.bee.tl.core.BeeException;
import org.bee.tl.core.ByteSupportTag;
import org.bee.tl.core.GeneralBeetlTag;
import org.bee.tl.core.Tag;
import org.bee.tl.core.Template;

public class HTMLTagSupportWrapper  extends GeneralBeetlTag {
	
	public boolean requriedInput()
	{
		return true;
	}
	

	
	protected void callHtmlTag(String file,boolean isByte) {
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
		if(isByte){
			t.set("tagBody",this.inputBytes );
			
		}else{
			t.set("tagBody",this.input );
		}
		
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
	
	protected  void callTag(Tag tag,boolean isByte) {
		
		try{
			tag.setContext(ctx);
			if(isByte){
				if(ByteSupportTag.class.isAssignableFrom(tag.getClass())){
					((ByteSupportTag)tag).setByteInput(this.inputBytes);
				}else{
					try {
						tag.setInput(new String(this.inputBytes,group.getCharset()));
					} catch (UnsupportedEncodingException e) {
						//不可能发生
						throw new RuntimeException(e.getMessage());
					}
				}
			}else{
				tag.setInput(this.input);
			}
			
			
			if(args.length==1){
				tag.setParas(new Object[]{});
			}else{
				tag.setParas(new Object[]{args[1]});
			}
			
			
			if(!isByte){
				String output =   tag.getOutput();
				if(output!=null){					
					this.writer.write(output);
				}
				
			}else{
				
				if(ByteSupportTag.class.isAssignableFrom(tag.getClass())){
					byte[] result = ((ByteSupportTag)tag).getOutputAsByte();
					if(result.length!=0){
						this.writer.write(result);
					}
				}else{
					String output =   tag.getOutput();
					if(output!=null){					
						this.writer.write(output);
					}
				}
				
			}
		}catch(IOException ioe){
			throw new RuntimeException(ioe);
		}
		
	 
		
	}
	
	
	
	
	protected void makeOutput()
	{

		boolean isByte = this.byteContent ;
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
			callHtmlTag(path,isByte);
			
		}else{
			
			callTag(realTag,isByte);
		}
	}

	


}

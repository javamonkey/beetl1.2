package org.bee.tl.ext;

import java.io.IOException;
import java.io.StringWriter;

import org.bee.tl.core.BeeException;
import org.bee.tl.core.Context;
import org.bee.tl.core.CoreScriptRunner;
import org.bee.tl.core.Function;
import org.bee.tl.core.io.ByteWriter_Char;

public class String2Json implements Function {

	public Object call(Object[] paras, Context ctx) {
		try{
			String str = (String)paras[0];
			String json = "var a=".concat(str).concat(";");			
			
			CoreScriptRunner scriptRunner = new CoreScriptRunner(json);
			ctx = new Context();
			try
			{
				scriptRunner.parse();
				scriptRunner.runScript(new ByteWriter_Char(new StringWriter(), "UTF-8"), ctx);

			}
			catch (IOException e)
			{
				throw new RuntimeException(e.getMessage());
			}
			catch (BeeException e)
			{
				throw new RuntimeException("json parse error");
			}
			
			Object jsonData = ctx.getVars().get("a");
			return jsonData;
		}catch(Exception ex){
			ex.printStackTrace();
			throw new RuntimeException("json parse error");
		}
		
	}

}

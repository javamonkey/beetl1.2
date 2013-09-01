package org.bee.tl.core.compile;

import org.bee.tl.core.PreCompiledClass;


public class CompileTask implements Runnable {
	PreCompiledClass pc ;
	boolean isDone = false ;
	
	public CompileTask(){
		
	}
	
	
	
	public void run() {
		
	
	}
	
	
	public PreCompiledClass getPc() {
		return pc;
	}

	public void setPc(PreCompiledClass pc) {
		this.pc = pc;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	
	
	
	

}

package org.bee.tl.core;

public class BeeException extends Exception {
	
	
	private Resource resource = null;
//	public BeeException(String message, Throwable cause) {
//		super(message, cause);
//	}
	
	public BeeException(Throwable cause) {
		super(cause);
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}
	public String toString(){
		return this.getCause().toString();
	}
	
	
	
	
}

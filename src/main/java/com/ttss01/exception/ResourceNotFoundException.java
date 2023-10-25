package com.ttss01.exception;

public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException() {
		super ("Training not found !!");
	}
	
	public ResourceNotFoundException(String message) {
		super (message);
	} 
	
}

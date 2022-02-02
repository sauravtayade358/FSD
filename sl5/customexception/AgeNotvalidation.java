package com.sl.customexception;

public class AgeNotvalidation extends Exception{

	private String msg;
	
	public AgeNotvalidation(String msg) {
		
		this.msg=msg;
	}

	@Override
	public String toString() {
		return "AgeNotValidException [message=" + msg + "]";
	}
	

}

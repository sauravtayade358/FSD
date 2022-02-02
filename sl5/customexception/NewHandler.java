package com.sl.customexception;

public class NewHandler {

	static void check(int age) throws AgeNotvalidation
	{
		if(age<18)
			throw new AgeNotvalidation("User can not vote before 18");
		else
			System.out.println("can Vote");
	}
	
	public static void main(String[] args) {
		
		try {
			check(16);
			
		} catch (AgeNotvalidation e) {
			
			System.out.println(e);
		}
	}
}
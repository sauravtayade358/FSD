package com.sl.exceptionhandling;

public class handling4 {
	static void waitFor()
	{
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		waitFor();
	}
}

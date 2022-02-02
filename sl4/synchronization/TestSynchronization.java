package com.sl.synchronization;

public class TestSynchronization {
	
	public static void main(String[] args) {
		
	
	Sender sender= new Sender();
	
	User t1=new User("Virat", "Hello Peter...", sender);
	User t2=new User("ROhit", "I am Captain now...", sender);
    User t3=new User("Dhoni", "Wait for me", sender);
    
			t1.start();
			t2.start();
			t3.start();
	}			
			
}

package com.sl.synchronization;

public class Sender {
	
	void send (String msg) {
		 System.out.println("Sending message"+ msg);
		 try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Error ehile sending msg");
			
		}
		 System.out.println("MEssage sent succesfully");
		
		
	}


}

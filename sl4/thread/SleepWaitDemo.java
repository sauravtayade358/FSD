package com.sl.thread;

public class SleepWaitDemo {

	private static Object LOCK=new Object();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " is a woke up after"+"1 second of sleep");
			
			synchronized (LOCK) {
				LOCK.wait(2000);
				System.out.println("Object is woke up 2 seconds");
				
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Error occured"+e);
		}

	}

}

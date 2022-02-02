package com.sl.thread;

public class Mainthread implements Runnable {

	public static int count=0;
	
	public void run()
	{
		while (Mainthread.count<=10)
		{
			try {
				System.out.println("My Thread"+(++Mainthread.count));
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("eRROR OCCURED"+e);
			}
		}
	}
	
	public static void main(String[] args) {
		Mainthread ins=new Mainthread();
		Thread mythread =new Thread(ins);
		mythread.start();
		
		while (Mainthread.count<=10)
		{
			try {
				System.out.println("MAIN Thread"+(++Mainthread.count));
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("eRROR OCCURED"+e);
			}
		}
		System.out.println("THREAD COMPL.");
	}
	
	
	
}

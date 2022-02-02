package com.sl.thread;

public class ThreadDemo2 implements Runnable {

	@Override
	public void run() {
		

		for(int i=1;i<=5;i++)
		{
			System.out.println(i+ " "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
		
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		
	}
public static void main(String[] args) {
		//created 2 target of runnable interface
		ThreadDemo2 ins1=new ThreadDemo2();
		ThreadDemo2 ins2=new ThreadDemo2();
		
		//created 2 thread by passing 2 target
		Thread t1=new Thread(ins1);
		Thread t2=new Thread(ins2);
		
		t1.setName(" FIRST");
		t2.setName("SECOND");
		t1.start();
		t2.start();
		
	}
	

	
}

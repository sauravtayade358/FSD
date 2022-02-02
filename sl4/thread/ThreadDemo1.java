package com.sl.thread;

public class ThreadDemo1 extends Thread {
	
	public void run()
	{
	//System.out.println(Thread.currentThread().getName()+"Thread Started");
		
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
		
		ThreadDemo1 t1=new ThreadDemo1();
		ThreadDemo1 t2=new ThreadDemo1();
		t1.setName(" FIRST");
		t2.setName("SECOND");
		t1.start();
		t2.start();
	}

}

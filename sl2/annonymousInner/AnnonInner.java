package com.sl.annonymousInner;

public class AnnonInner {
	
	public static void main(String[] args) {
		Car bmw = new Car()
		{
			public void start()
			{
				System.out.println("START");
			}
			
			public void stop()
			{
				System.out.println("STop");
			}
		};
		bmw.start();
		bmw.stop();
	}

}

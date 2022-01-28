package com.sl.methods;

public class loop {
	
	 public void natural() {
		 
		 int i;
		 for(i=1;i<=100;i++) {
				
			System.out.println("Natural no:"+i);
		}
	 }
	 
	 public void odd() {
		 int i;
		 for(i=1;i<100;i++)
			{   
				if(i%2==1)
					System.out.println("Odd no::"+i);
			}
		}
	 
	
	 public static void main(String[] args) {
		
		loop obj=new loop();
		obj.natural();
		obj.odd();
		
	}
}
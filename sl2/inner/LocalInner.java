package com.sl.inner;

public class LocalInner {

	public void dis()
	{
		class Inner{
			int a=10;
			
			public void disp(){
				System.out.println("Method of inner");
				System.out.println("Value of a"+a);
				
			}
		}
		Inner inner=new Inner();
		inner.disp();
		
	}
	public static void main(String[] args) {
		LocalInner outer=new LocalInner();
		outer.dis();
	}
	
}

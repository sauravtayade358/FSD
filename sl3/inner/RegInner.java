package com.sl.inner;

public class RegInner {
	public int a=35;
	private String b="WELCOME";
	
	class Inner{
		
		public void dis(){
			System.out.println("Value of a"+a);
			
		}
	}
    public static void main(String[] args) {
		RegInner outer= new RegInner();
		RegInner.Inner inner=outer.new Inner();
		inner.dis();
		
	}
}

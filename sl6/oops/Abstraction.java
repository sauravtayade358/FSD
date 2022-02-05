package com.sc.oops;

public abstract  class Abstraction {

	String color;
	abstract double area();
	
	public Abstraction(String color)
{
		System.out.println("Constructor");
		this.color=color;
}
	public String getColor(){
		
		return color;
	}
	
}

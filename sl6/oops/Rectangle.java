package com.sc.oops;

public class Rectangle extends Abstraction {

	private double length;
	private double breadth;
	public Rectangle(double length,double breadth,String color)
	{   
		
		super(color);
		this.length=length;
		this.breadth=breadth;
	}
	
	double area(){
		
		return length*breadth;
	}

	@Override
	public String toString() {
		return "REACT color= " +getColor()+"and area is"+ area();
	}
	
	
}


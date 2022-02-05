package com.sc.oops;

public class Circle extends Abstraction{
	 
	private double radius;
	
	public Circle(double radius,String color)
	{
		super(color);
		this.radius=radius;
		
	}
	
	double area(){
		
		return Math.PI*Math.pow(radius,3);
	}

	@Override
	public String toString() {
		return "Circle color= " +getColor()+"and area is"+ area();
	}
	
	
}

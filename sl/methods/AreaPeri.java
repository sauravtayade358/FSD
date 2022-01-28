package com.sl.methods;

import java.util.Scanner;

public class AreaPeri {
	Scanner sc= new Scanner(System.in);
	int l,b;
	
	public void rectangle() {

		System.out.println("Enter length::");
		l=sc.nextInt();
		
		System.out.println("Enter a Breadth");
		b=sc.nextInt();
		
		System.out.println("Area of Rectangle::"+(l*b));
		System.out.println("Perimeter of Rectangle::"+((2*l)+(2*b)));
		
	}
	
	public void square() {
		
		System.out.println("Area of Square::"+(l*l));
		System.out.println("Perimeter of Square::"+((4*l)));
		}
	
	public void circle() {
	
		System.out.println("Area of Circle::"+(3.14*l*l));
		System.out.println("Circumference of Rectangle::"+(2*3.14*l));
		
		
	}
	
public static void main(String[] args) {
	
         AreaPeri obj=new AreaPeri();
         obj.rectangle();
         obj.square();
         obj.circle();
	
}
}

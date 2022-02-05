package com.org.c;

import java.util.Scanner;

public class AreaPeri {
public static void main(String[] args) {
	
	int l,b;
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter length::");
	l=sc.nextInt();
	
	System.out.println("Enter a Breadth");
	b=sc.nextInt();
	
	System.out.println("Area of Rectangle::"+(l*b));
	System.out.println("Perimeter of Rectangle::"+((2*l)+(2*b)));
	
	System.out.println("Area of Square::"+(l*l));
	System.out.println("Perimeter of Square::"+((4*l)));
	
	System.out.println("Area of Circle::"+(3.14*l*l));
	System.out.println("Circumference of Rectangle::"+(2*3.14*l));
}
}

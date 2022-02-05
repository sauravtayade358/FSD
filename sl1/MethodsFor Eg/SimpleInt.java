package com.org.c;

import java.util.Scanner;

public class SimpleInt {
  public static void main(String[] args) {
	double P, N , R;
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter amount of Priciple::");
	P=sc.nextDouble();
	
	System.out.println("Enter Number of Years ::");
	N=sc.nextDouble();
	
	System.out.println("Enter Rate of INTEREST::");
	R=sc.nextDouble();
	double si=(P*N*R)/100;
	
	System.out.println("Simple Interest::"+((P*N*R)/100)+" "+si);
	
	
}
}

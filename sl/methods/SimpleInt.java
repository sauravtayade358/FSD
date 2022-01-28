package com.sl.methods;

import java.util.Scanner;

public class SimpleInt {
	 public void simpleint(){ 
		 double P, N , R;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter amount of Priciple::");
		P=sc.nextDouble();
		
		System.out.println("Enter Number of Years ::");
		N=sc.nextDouble();
		
		System.out.println("Enter Rate of INTEREST::");
		R=sc.nextDouble();
		
		double si=(P*N*R)/100;
		System.out.println("Simple Interest::"+si);
		 
		 }
   public static void main(String[] args) {
	
	  SimpleInt obj= new SimpleInt();
	  obj.simpleint();
	
		
}
}


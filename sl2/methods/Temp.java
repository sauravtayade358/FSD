package com.sl.methods;

import java.util.Scanner;


public class Temp {
	Scanner sc= new Scanner(System.in);
	public void cel()
	{
		System.out.println("Enter fer temp::");
		double i;
		i=sc.nextInt();
		
		double c=(i-32)*5/9;
		System.out.println("Cel::"+c);
		
	}
	public static void main(String[] args) {
		
		 Temp t=new Temp();
		 t.cel();
			}
}

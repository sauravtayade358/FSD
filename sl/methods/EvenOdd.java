package com.sl.methods;

import java.util.Scanner;

public class EvenOdd {
	
	public void evenodd() {
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No ::");
		
		i=sc.nextInt();
		if(i%2==0)
			System.out.println("Enterd No is Even::"+i);
		else
			System.out.println("No is ODD:"+i);
		}
	
	public static void main(String[] args) {
		
		EvenOdd obj= new EvenOdd();
		obj.evenodd();
				
	}

}

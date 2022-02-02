package com.sl.methods;

import java.util.Scanner;

public class divisiblefive {
	
	public void divisible5() {
		Scanner sc=new Scanner(System.in);
		
		int num;
		System.out.println("Enter a no:");
		num=sc.nextInt();
		
		if(num%5==0)
			System.out.println("Enter no is divisible 5");
		else
			System.out.println("Enter no is not divisible ");
		 }
	
public static void main(String[] args) {
	
	   divisiblefive obj=new divisiblefive();
	   obj.divisible5();

}
}

package com.sc.uncheckedexception;

import java.util.Scanner;
//runtime: Arithmatic Exception
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 no");
        int num1=sc.nextInt();
        int num=sc.nextInt();
        
        int div=num1/num;
        
        System.out.println("divi"+div);
        System.out.println("END");    
	
	}

}

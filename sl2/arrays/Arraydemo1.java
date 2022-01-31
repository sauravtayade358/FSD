package com.sl.arrays;

import java.util.Scanner;

public class Arraydemo1 {
public static void main(String[] args) {
	
	int array[]=new int[5];
	int temp;
	System.out.println("Dynamic::");
	Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<array.length;i++)
	{
		System.out.println("Enter any number");
		array[i]=sc.nextInt();
		
	}
	
	
	System.out.println("Print::");
	for(int a:array)
	{
		System.out.println(a);
		
	}
	for(int i = 0; i<array.length; i++ ){
        for(int j = i+1; j<array.length; j++){
           if(array[i]>array[j]){
              temp = array[i];
              array[i] = array[j];
              array[j] = temp;
           }
        }
	}
           System.out.println(" largest element is:: "+array[array.length-1]);
}
}



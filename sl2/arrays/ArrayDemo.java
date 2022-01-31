package com.sl.arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int array[]= {11,12,1,55,89,90};
		System.out.println("Element at 2"+array[4]);
		
	System.out.println("Length of array::"+array.length);
	
	for(int i=0;i<array.length;i++)
	{
		System.out.println(array[i]);
	}
	
	System.out.println();
	
	for(int a:array)
	{
		System.out.print(a+" ,");
		
	}
	
	
	}
	
	

}

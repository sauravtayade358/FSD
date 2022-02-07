package com.sl.subseq;

import java.util.Arrays;
import java.util.Scanner;

public class Lisubseq {
	static int lis(int arr[])
{   
	        
	        if (arr == null || arr.length == 0) {
	            return 0;
	        }
	        
	       
	        int[] L = new int[arr.length];
	 
	        // the longest increasing subsequence ending at `arr[0]` has length 1
	        L[0] = 1;
	 
	        // start from the second array element
	        for (int i = 1; i < arr.length; i++)
	        {
	            // do for each element in subarray arr[0…i-1]`
	            for (int j = 0; j < i; j++)
	            {
	                // find the longest increasing subsequence that ends with   arr[j]
	                // where arr[j] is less than the current element arr[i]
	                if (arr[j] < arr[i] && L[j] > L[i]) {
	                    L[i] = L[j];
	                    
	                }
	            }
	            // include `arr[i]`
	            L[i]++;
	           
	        }
	        
	    
	        // return longest increasing subsequence (having maximum length)
	        return Arrays.stream(L).max().getAsInt();
	    }
	 
	    public static void main(String[] args)
	    {   Scanner sc=new Scanner(System.in);
	         int n;
	         System.out.print("Enter no. of elements you want in array:");
	         n = sc.nextInt();
	         int arr[] = new int[n];
	         System.out.println("Enter all the elements:");
	         for(int i = 0; i < n; i++)
	         {
	             arr[i] = sc.nextInt();
	            
	         }
	        //int[] arr = { 2,4,5,6,99,1 };
	        
	        System.out.print("The length of the LIS is " + lis(arr));
	    }
	    
}
/*
Enter no. of elements you want in array:4
Enter all the elements:
2
3
5
6
The length of the LIS is 4

Enter no. of elements you want in array:5
Enter all the elements:
11
5
75
66
99
The length of the LIS is 3


Enter no. of elements you want in array:5
Enter all the elements:
1
2
45
46
3
The length of the LIS is 4




*/





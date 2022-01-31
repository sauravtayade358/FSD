package com.sl.arrays;

import java.util.Scanner;

public class MultiDimArray{  
public static void main(String args[]){  
//creating two matrices    
    
     int a[][]= new int[3][3];
     int b[][]= new int[3][3];
     int c[][]= new int[3][3];
     
     
     System.out.println("Store element in matrix");
	 Scanner sc=new Scanner(System.in);
	 
	 //1st Matrix
	 for(int row=0;row<3;row++)
	  {
		for(int col=0;col<3;col++)
		{	
			System.out.println("Enter  number For 1st Matrix:");
			a[row][col]= sc.nextInt();
		}
	}
	 
	 System.out.println("Print 1st matrix");
		for(int row=0;row<3;row++)
		{
			for(int col=0;col<3;col++)
			{
				System.out.print(a[row][col]+"\t");
			}
			System.out.println();
		}
		
		//2nd matrix
		
		 for(int row=0;row<3;row++)
		  {
			for(int col=0;col<3;col++)
			{	
				System.out.println("Enter 2nd Matrix number:");
				b[row][col]= sc.nextInt();
			}
		}
		 System.out.println("Print 2nd matrix");
			for(int row=0;row<3;row++)
			{
				for(int col=0;col<3;col++)
				{
					System.out.print(b[row][col]+"\t");
				}
				System.out.println();
			}
		
		
 
             //adding and printing addition of 2 matrices    
            for(int i=0;i<3;i++){    
              for(int j=0;j<3;j++){    
                  c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
                    System.out.print(c[i][j]+" ");    
                      }    
            System.out.println();//new line    
          }    
}

}  
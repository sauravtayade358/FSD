package com.sl.arrays;

public class MultiDiamArray {
	public static void main(String[] args) {
		int array[][]= {{1,2,3},{9,8,4},{3,3,5}};
		
		System.out.println("Access row 2nd element"+array[0][1]);
		
		for(int row=0;row<3;row++)
		{
			for(int col=0;col<3;col++)
			{
				System.out.print(array[row][col]+"\t");
			}
			System.out.println();
		}
	}

}

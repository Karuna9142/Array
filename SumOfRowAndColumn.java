package com.matrix;

public class SumOfRowAndColumn {

	public static void main(String[] args) {
		
		int a[][] = {{4, 1, 3},{3, 5, 7},{8, 2, 6}}; 
		
		int rows = a.length;
		int cols = a[0].length;
			
		System.out.println("Original Matrix:- ");
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<a.length; j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		
		for(int i = 0; i<rows; i++)
		{
			int sumRow = 0;
			for(int j = 0; j<cols; j++)
			{
				sumRow = sumRow +a[i][j];
			}
			System.out.println("Sum of " +(i+1)+ " row is:- "+sumRow);
		}
		for(int i = 0; i<cols; i++)
		{
			int sumCol = 0;
			for(int j = 0; j<rows; j++)
			{
				sumCol = sumCol +a[i][j];
			}
			System.out.println("Sum of " +(i+1)+ " col is:- "+sumCol);
		}
		

	}

}

package com.matrix;

public class EqualMatrix {

	public static void main(String[] args) {
		
		int a[][] = {{3,5,6},{8,9,4},{3,8,8}};
		int b[][] = {{1,1,1},{2,3,1},{3,4,5}};
		
		boolean flag = true;
		
		System.out.println("First matrix:- ");
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<a.length; j++)
			{
				System.out.print(" " +a[i][j]);
			}
			System.out.println();
			
		}
		System.out.println("Second matrix:- ");
		for(int i = 0; i<b.length; i++)
		{
			for(int j = 0; j<b.length; j++)
			{
				System.out.print(" " +b[i][j]);
			}
			System.out.println();
			
		}
		
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<b.length; j++)
			{
				if(a[i][j]==b[i][j])
				{
					flag = false;
					break;
				}
			}
		}
		
		if(flag)
		{
			System.out.println("Matrix are equal");
		}
		else
		{
			System.out.println("Matrix are not equal");
		}

	}

}

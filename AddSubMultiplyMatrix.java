package com.matrix;

public class AddSubMultiplyMatrix {
	
	public static void addMatrix(int a[][],int b[][],int c[][])
	{
		System.out.println("Sum of matrix:- ");
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<b.length; j++)
			{
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(" "+c[i][j]);
			}
			System.out.println();
		}
	}
	public static void subMatrix(int a[][],int b[][],int c[][])
	{
		System.out.println("Subtraction of matrix:- ");
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<b.length; j++)
			{
				c[i][j] = a[i][j] - b[i][j];
				System.out.print(" "+c[i][j]);
			}
			System.out.println();
		}
	}
	public static void multiply_Matrix(int a[][],int b[][],int c[][])
	{
		System.out.println("Multiplication of matrix:- ");
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j<b.length; j++)
			{
				c[i][j] = a[i][j] * b[i][j];
				System.out.print(" "+c[i][j]);
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {

   
		int a[][] = {{3,5,6},{8,9,4},{3,8,8}};
		int b[][] = {{1,1,1},{2,3,1},{3,4,5}};
		
		int c[][] = new int[3][3];
		
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
		AddSubMultiplyMatrix a1 = new AddSubMultiplyMatrix();
		a1.addMatrix(a, b, c);
		a1.subMatrix(a, b, c);
		a1.multiply_Matrix(a, b, c);
		
	}

}

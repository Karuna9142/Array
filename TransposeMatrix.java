package com.matrix;

public class TransposeMatrix {

	public static void main(String[] args) {
		
		int arr[][] = {
				{1,2,3},
				{4,5,6},
				{2,3,4}
				};
		
		int row = arr.length;
		int col = arr[0].length;
		
		int t[][] = new int[col][row];
		
		for(int i = 0; i<col; i++)
		{
			for(int j = 0; j<row; j++)
			{
				t[i][j] = arr[j][i];
			}
		}
		
		System.out.println("Transpose of a matrix:- ");
		for(int i = 0; i<col; i++)
		{
			for(int j = 0; j<row; j++)
			{
				System.out.print(t[i][j]+ " ");
			}
			System.out.println();
		}

	}

}

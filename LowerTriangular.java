package com.matrix;

public class LowerTriangular {

	public static void main(String[] args) {


		int arr[][] = {{1,2,3},
				       {3,4,5},
				       {1,1,1}
				       };
		
		int rows = arr.length;
		int cols = arr[0].length;
		
		if(rows!=cols)
		{
			System.out.println("Matrix should be equal");
		}
		else
		{
			System.out.println("Lower traingular matrix");
			for(int i = 0; i<rows; i++)
			{
				for(int j = 0; j<cols; j++)
				{
					if(i<j)
					{
						System.out.print("0 ");
					}
					else
					{
						System.out.print(arr[i][j]+ " ");
					}
					
				}
				System.out.println();
				
			}
		}
	}

}

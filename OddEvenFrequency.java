package com.matrix;

public class OddEvenFrequency {

	public static void main(String[] args) {
		
		int a[][] = {{4, 1, 3},{3, 5, 7},{8, 2, 6}}; 
		
		int rows = a.length;
		int cols = a[0].length;
		
		int countEven = 0;
		int countOdd = 0;
		
		for(int i = 0; i<rows; i++)
		{
			for(int j = 0; j<cols; j++)
			{
				if(a[i][j]%2==0)
				{
					countEven++;
				}
				else
				{
					countOdd++;
				}
			}
		}
		
		System.out.println("Frequency of Even number:- "+countEven);
		System.out.println("Frequency of Odd number:- "+countOdd);

	}

}

package com.array;

public class MinArray {
	public static int min_arr(int arr[])
	{
		int min = arr[0];
		
		System.out.println("Maximum element of array is:- ");
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int arr[] = {2,33,4,5,21,67};
	    
	    int result = min_arr(arr);
	    System.out.println(result);


	}

}

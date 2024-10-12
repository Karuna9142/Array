package com.array;

public class MaxArray {
	
	public static int max_arr(int arr[])
	{
		int max = arr[0];
		
		System.out.println("Maximum element of array is:- ");
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		
    int arr[] = {2,33,4,5,21,67};
    
    int result = max_arr(arr);
    System.out.println(result);

	}

}

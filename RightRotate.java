package com.array;

public class RightRotate {

	public static void main(String[] args) {
		
        int arr[] = {2,3,4,5,6,7};
		
		//no. of times rotated
		int n = 2;
		
		System.out.println("Original array");
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		for(int i = 0; i<n; i++)
		{
			int j;
			//stores the first element of the array
			int last = arr[arr.length-1];
			for( j = arr.length-1; j>0; j--)
			{
				//Shift element of array by one
				arr[j] = arr[j-1];
			}
			//first element of array will be added to the end
			arr[j] = last;
						
		}
		System.out.println();
		System.out.println("Array after Right Rotation:");
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]+ " ");
		}

	}

}

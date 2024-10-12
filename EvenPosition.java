package com.array;

public class EvenPosition {

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,5,6,7,8};
		
		System.out.println("original array is");
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Element at Even position:- ");
		for(int i = 0; i<arr.length; i++)
		{
			if(i%2==0)
			{
				System.out.println("Element at " +i+ " is:- " +arr[i]);
			}
		}

	}

}

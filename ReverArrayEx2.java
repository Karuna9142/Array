package com.array;

import java.util.Scanner;

public class ReverArrayEx2 {
	
	static void swapArray(int[]arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static void rev_arr(int arr[])
	{
		int i=0 , j = arr.length-1;
		while(i<j)
		{
			swapArray(arr, i, j);
			i++;
			j--;
			
		}
		//System.out.println(arr[i]);
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:- ");
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the element of the array");
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		// System.out.print(rev_arr(arr));
		

	}

}

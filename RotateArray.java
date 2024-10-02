package com.array;
import java.util.Scanner;

public class RotateArray {
	
	public  static void printArr(int arr[])
	{
		System.out.println("Original array:- ");
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]+ " ");
		}
	}
	static void rotate_arr(int arr[], int k)
	{
		int n = arr.length;
		k = k%n;
		int j = 0;
		
		int[] ans = new int[n];
		
		for(int i = n-k; i<n; i++)
		{
			arr[j++] = arr[i];
		}
		for(int i = 0; i<n-k; i++)
		{
			arr[j++] = arr[i];
		}
		System.out.println("Array after rotation:- ");
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]+ " ");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the size of the array:- ");
		
		int arr[] = {4,5,6,7,8,9};
		System.out.println("Enter k:- ");
		int k = sc.nextInt();
		
		printArr(arr);
		rotate_arr(arr,k);
		
	}

}

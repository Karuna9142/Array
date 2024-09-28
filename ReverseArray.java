package com.array;

import java.util.Scanner;

public class ReverseArray {
	
	static void rev_arr(int arr[])
	{
		int i = arr.length-1;
		
		while(i>=0)
		{
			System.out.println(arr[i]);
			i--;
		}
		/*
		for(int i = arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]);
		}
		*/
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
		rev_arr(arr);

	}

}

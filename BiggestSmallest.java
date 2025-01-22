package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class BiggestSmallest {
	
	public static void findMax(int arr[])
	{
		Arrays.sort(arr);
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println("Largest number is:- "+(arr[i]-1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		for(int i = 0;i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		findMax(arr);
	}

}

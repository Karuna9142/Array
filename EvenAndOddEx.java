package com.array;

import java.util.Scanner;

public class EvenAndOddEx {
	
	public static void printArray(int arr[])
	{
		System.out.println("Original array:- ");
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void printEven(int arr[])
	{
		System.out.println("Even number:- ");
		for(int i = 0; i<arr.length; i++)
		{
			if(i%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}
	public static void printOdd(int arr[])
	{
		System.out.println("Odd number:- ");
		for(int i = 0; i<arr.length; i++)
		{
			if(i%2!=0)
			{
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size:- ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the element:- ");
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		EvenAndOddEx e1 = new EvenAndOddEx();
		e1.printArray(arr);
		e1.printEven(arr);
		e1.printOdd(arr);
		
		
	}

}

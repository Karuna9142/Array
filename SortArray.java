package com.array;
import java.util.Scanner;

public class SortArray {
	
	public static void printArray(int arr[])
	{
		System.out.println("Original array:- ");
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void sortArray(int arr[])
	{
	    int temp;
	    
	    System.out.println("array after sorting");
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
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
		SortArray s1 = new SortArray();
		s1.printArray(arr);
		
		s1.sortArray(arr);

	}

}

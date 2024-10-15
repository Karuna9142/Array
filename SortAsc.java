package com.array;
import java.util.Scanner;

public class SortAsc {
	
	public static int[] print_arr(int arr[])
	{
		System.out.println("Original array:- ");
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		return arr;
	}
	
	public static void sort_asc(int arr[])
	{
		int temp;
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					temp  = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After sorting in ascending order:- ");
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void sort_dessc(int arr[])
	{
		int temp;
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					temp  = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("After sorting in ascending order:- ");
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		System.out.println("Enter the element of array");
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
	   
		SortAsc s1 = new SortAsc();
		s1.print_arr(arr);
		s1.sort_asc(arr);
		s1.sort_dessc(arr);
		
	}

}

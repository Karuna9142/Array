package com.array;

import java.util.Scanner;

public class ThirdLargestElement {

	public static void thirdLargest(int arr[])
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
		System.out.println("Largest element is:-"+arr[arr.length-1]);
		System.out.print("Third Largset element is:- :" +arr[arr.length-3]);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		
		System.out.print("Enter the element of array:- ");
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
	   
		ThirdLargestElement s1 = new ThirdLargestElement();
		s1.thirdLargest(arr);

	}

}

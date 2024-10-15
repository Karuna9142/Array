package com.array;

import java.util.Scanner;

public class SmallestElement {

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
		System.out.println("Smallest element is:-"+arr[0]);
		System.out.print("Third Smallest element is:- :" +arr[2]);
	}		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		
		System.out.print("Enter the element of array:- ");
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
	   
		SmallestElement s1 = new SmallestElement();
		s1.thirdLargest(arr);

	}

}

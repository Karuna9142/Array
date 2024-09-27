package com.array;

import java.util.Scanner;

public class UniqueElement {
	
	static void unique_arr(int arr[])
	{
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					arr[i] = -1;
					arr[j] = -1;
				}
			}
		}
		int ans = -1;
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]>0)
			{
				ans = arr[i];
			}
		}
		System.out.println("Unique element is:- "+ans);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elemnt of array:- ");
		
		int arr[] = new int[7];
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		unique_arr(arr);

	}

}

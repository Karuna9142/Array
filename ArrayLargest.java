package com.array;

import java.util.Scanner;

public class ArrayLargest {

	static int find_arr(int arr[])
	{
		int mx = Integer.MIN_VALUE;
	
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]>mx)
			{
				mx = arr[i];
			}
		}
		return mx;
	}
		
		static int find_secmax(int arr[])
		{
			int mx = find_arr(arr);
			for(int i = 0; i<arr.length; i++ )
			{
				if(arr[i]==mx)
				{
					arr[i] = Integer.MIN_VALUE;
				}
					
			}
			int secondmax = find_arr(arr);
			return secondmax;
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:-");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Second Maximum element :- "+find_secmax(arr));
	}

}

package com.array;

import java.util.Scanner;

public class RepeatingNumber {
	
	static int findRepeat_Num(int arr[])
	{
		int ans = -1;
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					return arr[i];
				}
			}
		}
		return ans;
		
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
		
		System.out.println("Repeating element is:- "+findRepeat_Num(arr));

	}

}

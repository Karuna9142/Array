package com.array;

import java.util.Scanner;

public class DuplicatesArray {
	
	public static void find_duplicates(int arr[])
	{
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {2,3,4,2,5,1,3};
	    System.out.println("Duplicates of array:- ");
	    find_duplicates(arr);
	}

}

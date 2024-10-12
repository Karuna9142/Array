package com.array;

import java.util.Scanner;

public class LeftRotateArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = {2,3,4,5,6,7};
		
		int n = 4;
		
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		//left rotate
		for(int i = 0; i<n; i++)
		{
			int j;
			int first = arr[0];
			for( j = 0; j<arr.length-1; j++)
			{
				arr[j] = arr[j+1];
			}
			arr[j] = first;
						
		}
		System.out.println();
		System.out.println("Array after left Rotation:");
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]+ " ");
		}
	}

}

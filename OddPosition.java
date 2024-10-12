package com.array;

import java.util.Scanner;

public class OddPosition {

	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size:- ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("original array is");
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Element at Odd position:- ");
		for(int i = 0; i<arr.length; i++)
		{
			if(i%2!=0)
			{
				System.out.println("Element at " +i+ " is:- " +arr[i]);
			}
		}


	}

}

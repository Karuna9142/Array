package com.array;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the element of the array");
		for(int i = 0; i<arr.length; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("Element of the array are");
		//for(int i = 0; i<arr.length; i++)
			//System.out.println(arr[i]);
		
		for(int i:arr)
			System.out.println(i);
	}

}

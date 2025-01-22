package com.array;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		int sum = 0;
		System.out.println("Enter the element of the array");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		    sum = sum + arr[i];
		}
		for(int i:arr)
			System.out.println(i);
		System.out.println("sum of array is:- "+sum);
	}

}

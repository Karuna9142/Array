package com.array;
import java.util.Scanner;

public class SumOfElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:-");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		int sum = 0;
		
		System.out.println("Enter the element of array");
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i<arr.length; i++)
		{
			sum = sum+arr[i];
		}
		System.out.println("Sum of element is:- "+sum);

	}

}

package com.array;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the element of the array:- ");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
				
		}
		System.out.println("enter element to search");
		int n = sc.nextInt();
		
		boolean isfound = false;
		for(int i = 0; i<arr.length; i++)
		{
			if(n==arr[i])
			{
				System.out.println("Element is found at "+i);
				break;
			}
				
		}
//		if(isfound==true)
//		{
//			System.out.println("Element is found");
//		}
//		else
//		{
//			System.out.println("Not found");
//		}
		
		
		
        
        
        
	}

}

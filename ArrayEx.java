package com.array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		//array of primitives
		int arr[] = new int[5];
		
		System.out.println("Enter the element");
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		///for each loop
		/*
		for(int num:arr)
		{
			System.out.println(num); //here num represent the element of the array
		}
       
		System.out.println("Elemet of the array are");
		System.out.println(Arrays.toString(arr));//other way of printing the element
		*/
		System.out.println("Enter the element of the array");
		String arr[] = new String[5];
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = sc.nextLine();
		}
		System.out.println(Arrays.toString(arr));
		arr[2] = "Karuna";
		arr[3] = "Abhishek";
		
		System.out.println(Arrays.toString(arr));
		
	}

}

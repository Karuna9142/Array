package com.array;

import java.util.Scanner;

public class ReverseArray {
	
	public static void rev_arr(int arr[])
	{
		System.out.println("Reversed array is:-  ");
		for(int i = arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the element");
        
        int arr[] = new int[5];
        
        for(int i = 0; i<arr.length; i++)
        {
        	arr[i] = sc.nextInt();
        }
        
        rev_arr(arr);
        
        
        
        
	}

}

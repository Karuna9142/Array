package com.array;

import java.util.Arrays;

public class ArrayEx1 {
	
	static void fun_arr(int arr[])
	{
		arr[0] = 101;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,5,6,7,2,3,9};

		System.out.println("Element of the array:- ");
		System.out.println(Arrays.toString(arr));
		
		fun_arr(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}

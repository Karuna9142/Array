package com.array;

import java.util.Scanner;

public class SwapWithoutThirdVar {
	
	public static void swap_arr(int a, int b)
	{
		System.out.println("Original value before swapping a is:- " +a+ " and b -  "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		
		System.out.println("after swapping a is:- "+a+ "and b is:- "+b);
	}
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:- ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		swap_arr(a,b);

	}

}

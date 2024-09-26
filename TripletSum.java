package com.array;
import java.util.Scanner;

public class TripletSum {
	
	static void arr_sum(int arr[], int target)
	{
		int ans = 0;
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				for(int k = j+1; k<arr.length; k++)
				{
					if(arr[i]+arr[j]+arr[k]==target)
					{
						ans++;
					}
				}
				
			}
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit to target:- ");
		int target = sc.nextInt();
		
		int arr[] = {1,4,5,6,3};
		arr_sum(arr,target);

	}

}

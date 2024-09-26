package com.array;

public class ArrayDoubletEx {
	static void arr_sum(int arr[], int target)
	{
		int ans = 0;
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]+arr[j]==target)
				{
					ans++;
				}
			}
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,3,5,6,8,2};
		int target = 7;
		arr_sum(arr, target);

	}

}


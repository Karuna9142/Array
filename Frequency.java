package com.array;

public class Frequency {
	
	public static void find_freq(int arr[])
	{
		int fr[] = new int[arr.length];
		int visited = -1;
		
		for(int i = 0; i<arr.length; i++)
		{
			int count = 1;
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					fr[j] = visited;
				}
			}
			if(fr[i]!=visited)
			{
				fr[i] = count;
			}
		}
		
		System.out.println("Frequency of element");
		for(int i = 0; i<fr.length; i++)
		{
			if(fr[i]!=visited)
			{
				System.out.println(arr[i]+ " "+fr[i]);
			}
		}
	}

	public static void main(String[] args) 
	{
		int arr[] = {2,3,4,5,2,1,3,4,5};
		find_freq(arr);
		
	}
}
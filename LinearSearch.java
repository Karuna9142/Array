package com.searching;

public class LinearSearch 
{
	public static void linearSearch(int arr[], int key)
	{
     for(int i = 0; i<arr.length; i++)
     {
    	 if(arr[i]==key)
    	 {
    		 System.out.println(key+ " is found at index "+i);
    	 }
    	 
     }
     
		
	}

	public static void main(String[] args) 
	{
		int arr[] = {4,5,6,7,8,2,33,11,45};
		int key  = 4;
		
		LinearSearch l1 = new LinearSearch();
		l1.linearSearch(arr, key);
		//System.out.println(key+ " is found at index " +res);

	}

}

package com.array;

public class ArrayExam1 {
	
	 public static void print_arr(String arr[])
	{
		 //for each loop
		 for(String num:arr)
		 {
			System.out.println(num); 
		 }
		 /*
		 for(int i = 0; i<arr.length; i++)
		 {
			 System.out.println(arr[i]);
		 }
		 /*
		arr = new String[3];
		
		arr[0] = "Karuna";
		arr[1] = "Mishra";
		arr[2] = "Smriti";
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		*/
	}

	public static void main(String[] args)
	{
      String[]arr = {"abc","vbn","tyu"};
      
      print_arr(arr);


	}

}

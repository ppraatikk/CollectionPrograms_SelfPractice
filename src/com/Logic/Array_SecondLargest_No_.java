package com.Logic;

public class Array_SecondLargest_No_ {
	
	public void secondMax(int arr[])
	{
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		int max2=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<max && arr[i]>max2) 
			{  
				max2=arr[i]; 
			}
		}
		
		System.out.println(max2);
		
	}

	public static void main(String[] args) {
		
		
		int arr[]= {1,7,8,9,10,11,6};
		
		Array_SecondLargest_No_ x= new Array_SecondLargest_No_();
		
		x.secondMax(arr);
		
		
	}

}

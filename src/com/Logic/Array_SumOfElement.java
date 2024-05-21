package com.Logic;

public class Array_SumOfElement {
	
	
	public static void sum(int arr[])
	{
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println("Sum Of Array Element :"+sum);
		
	}

	public static void main(String[] args) {
		
		
		Array_SumOfElement x= new Array_SumOfElement();
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		x.sum(arr);
		
	}

}

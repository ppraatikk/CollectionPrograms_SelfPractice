package com.Logic;

import java.util.Arrays;

public class Array_Sorting_byAscending {
	
	public void sortArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	
	public void sortt(int arr1[])
	{
		Arrays.sort(arr1);
		
		System.out.println(Arrays.toString(arr1));
	}

	public static void main(String[] args) {
		
		Array_Sorting_byAscending x= new Array_Sorting_byAscending();
		
		int arr[]= {2,3,1,7,6,4,5};
		int arr1[]= {87,99,45,34,78};
		
		x.sortArray(arr);
		x.sortt(arr1);
		

	}

}

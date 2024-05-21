package com.Logic;

import java.util.Arrays;

public class Array_Sorting_byDescending {
	
	
	
	public void sortByDesc(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
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
		
	
		
		Array_Sorting_byDescending x = new Array_Sorting_byDescending();
		
		
		int arr[]= {1,4,5,2,6,3};
		int arr1[]= {109,111,110,108,112};
		
		 x.sortByDesc(arr);
		 x.sortt(arr1); 

	}

}

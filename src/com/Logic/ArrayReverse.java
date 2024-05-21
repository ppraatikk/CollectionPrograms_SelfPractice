package com.Logic;

import java.util.Arrays;

public class ArrayReverse {
	
	public void reverseArray(int arr[])
	{
		int j=arr.length-1;
		for(int i=0;i<arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public void reverseArray1(int arr[])
	{
		int arr1[]=new int[arr.length];
		int index=0;
		
		for(int i=arr.length-1;i>=0;i--)
		{
			arr1[index]=arr[i];
			index++;
		}
		
		System.out.println(Arrays.toString(arr1));
	}
	

	public static void main(String[] args) {
		
		
		int arr[]={1,2,3,4,5,6};
		int arr1[]={101,102,103,104,105};
		
		ArrayReverse x=new ArrayReverse();
		x.reverseArray(arr);
		x.reverseArray1(arr1);

	}

}

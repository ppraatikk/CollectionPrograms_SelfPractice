package com.Logic;

import java.util.Arrays;

public class LeftShiftArray {
	
	public void shifting(int arr[])
	{
		
		int firstElement=arr[0];
		
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		
		arr[arr.length-1]=firstElement;
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		
		LeftShiftArray x=new LeftShiftArray();
		
		
		int arr[]= {1,2,3,4,5};
		
		x.shifting(arr);
		

	}

}

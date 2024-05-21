package com.Logic;

import java.util.Arrays;

public class ArrayRightShift {
	
	public void shift(int arr[])
	{
		int lastElement=arr[arr.length-1];
		
		for(int i=arr.length-1;i>=1;i--)
		{
			arr[i]=arr[i-1];
			
		}
		
		arr[0]=lastElement;
		System.out.println(Arrays.toString(arr));
		
		
	}

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4,5};
		
		
		ArrayRightShift x=new ArrayRightShift();
		x.shift(arr);

	}

}

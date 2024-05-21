package com.Logic;

public class Second_MinimunNumber_inArray {
	
	public void minNumber(int arr[]) 
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		int min2=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min2 && arr[i]>min)
			{
				min2=arr[i];
			}
		}
		System.out.println(min2);
	}

	public static void main(String[] args) {
		
		Second_MinimunNumber_inArray x=new Second_MinimunNumber_inArray();
		
		int arr[]= {4,5,1,6,9,7};
		
		x.minNumber(arr);
		
	}

}

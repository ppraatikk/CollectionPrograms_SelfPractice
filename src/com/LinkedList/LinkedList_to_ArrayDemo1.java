package com.LinkedList;
import java.util.*;


public class LinkedList_to_ArrayDemo1 {

	public static void main(String[] args) {
		

		LinkedList<Integer>list1=new LinkedList<>();
		
		list1.add(11);
		list1.add(13);
		list1.add(12);
		System.out.println(list1);
		
		
		
		int arr1[]=new int[list1.size()];
		for(int i=0;i<list1.size();i++)
		{
			 arr1[i]=list1.get(i);
		}
		System.out.println(Arrays.toString(arr1));
		
		
		
		
		
		Integer arr2[]=list1.toArray(new Integer[list1.size()]);
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
		Object arr[]=list1.toArray();
		for(Object o:arr)
		{
			System.out.println(o);
		}
		
		
		
	}

}

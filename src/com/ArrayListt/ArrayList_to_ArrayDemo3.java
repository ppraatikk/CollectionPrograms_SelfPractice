package com.ArrayListt;
import java.util.*;


public class ArrayList_to_ArrayDemo3 {

	public static void main(String[] args) {
		
		
		
		
		ArrayList<Integer>a1=new ArrayList<>();
		
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		
		
		int arr1[]=new int[a1.size()];
		for(int i=0;i<a1.size();i++)
		{
			arr1[i]=a1.get(i);
		}
		System.out.println(Arrays.toString(arr1));
		
		
		
		Object arr2[]=a1.toArray();
		for(Object o:arr2)
		{
			System.out.println(o);
		}
		
		
		
		Integer arr3[]=a1.toArray(new Integer[a1.size()]);
		System.out.println(Arrays.toString(arr3));

	}

}

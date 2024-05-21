package com.ArrayListt;
import java.util.*;



public class ArrayList_to_ArrayDemo2 {

	public static void main(String[] args) {
		
		ArrayList<Integer>list=new ArrayList<>();
		
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		
		
		Integer arr[]=list.toArray(new Integer[list.size()]);
		System.out.println(Arrays.toString(arr));
		
		
		
		Object ar[]=list.toArray();
		for(Object o : ar)
		{
			System.out.println(o);
		}
		
		
		int a[]=new int[list.size()];
		for(int i=0;i<list.size();i++)
		{
			a[i]=list.get(i);
		}
		System.out.println(Arrays.toString(a));
		
		
		
		
		
		
		

	}

}

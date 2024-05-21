package com.ArrayListt;
import java.util.*;



public class Array_to_ArrayListDemo1 {

	public static void main(String[] args) {
		
		
		
		int arr[]= {1,2,3,4,5};
		
		Integer[] ar = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		                   
		
		
		
		 Integer a[]=new Integer[arr.length];
		 int index=0;
		 for(int x:arr)
		 {
			  a[index]=Integer.valueOf(x);
			  index++;
		 }
		
		
		
		
		
		
		ArrayList<Integer>list=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			list.add(arr[i]);
		}
		System.out.println(list);
		
		
		
		ArrayList<Integer>list1=new ArrayList<>(Arrays.asList(a));
		System.out.println(list1);
		
		
		ArrayList<Integer>list2=new ArrayList<>();
		Collections.addAll(list2,a);
		System.out.println(list2);

	}


}

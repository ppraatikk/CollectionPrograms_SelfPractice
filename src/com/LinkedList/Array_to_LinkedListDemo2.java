package com.LinkedList;

import java.util.*;



public class Array_to_LinkedListDemo2 {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3};
		
		
		
		
		LinkedList<Integer>a1=new LinkedList<>();
		for(int i=0;i<arr.length;i++)
		{
			a1.add(arr[i]);
		}
		System.out.println(a1);
		
		Integer ar[]=new Integer[arr.length];
		int ind=0;
		for(int x:arr)
		{
			ar[ind]=x;
			ind++;
		}
		
		LinkedList<Integer>a2=new LinkedList<>(Arrays.asList(ar));
		System.out.println(a2);
		
		
		
		LinkedList<Integer>a3=new LinkedList<>();
		Collections.addAll(a3,ar);
		System.out.println(a3);
		
		
	}

}

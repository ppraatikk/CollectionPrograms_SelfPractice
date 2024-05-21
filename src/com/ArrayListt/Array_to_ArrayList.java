package com.ArrayListt;
import java.util.*;



public class Array_to_ArrayList {

	public static void main(String[] args) {
		
		String str[]= {"hello","hii"};
		
		int arr1[]=new int[4];
		arr1[0]=1;
		arr1[1]=2;
		arr1[2]=3;
		arr1[3]=4;
		
		
		ArrayList<Integer>a1=new ArrayList<>();
		for(int i=0;i<arr1.length;i++)
		{
			a1.add(arr1[i]);
		}
		System.out.println(a1);
		
		
		Integer i1[]=new Integer[arr1.length];
		int index=0;
		for(int x:arr1)
		{
			i1[index]=Integer.valueOf(x);
			index++;
		}
		ArrayList<Integer>a2=new ArrayList<>(Arrays.asList(i1));
		System.out.println(a2);
		
		
		ArrayList<Integer>a3=new ArrayList<>();
		Collections.addAll(a3,i1);
		System.out.println(a3);
		
		
		
		int arr2[]=new int[i1.length];
		int ind=0;
		for(Integer x:i1)
		{
			arr2[ind]=x;
			ind++;		
		}
		System.out.println(Arrays.toString(arr2));
				
				
		
		
		
		
		
		
		

	}

}

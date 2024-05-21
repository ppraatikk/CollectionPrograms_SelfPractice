package com.ArrayListt;
import java.util.*;

public class ArrayList_to_ArrayDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer>list=new ArrayList<>();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Number");
			list.add(sc.nextInt());
		}
		
		int arr[]=new int[list.size()];
		 for(int i=0;i<list.size();i++)
		 {
			 arr[i]=list.get(i);
		 }
		

		 System.out.println(Arrays.toString(arr));
		 
	}

}

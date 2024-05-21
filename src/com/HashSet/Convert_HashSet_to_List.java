package com.HashSet;
import java.util.*;



public class Convert_HashSet_to_List {

	public static void main(String[] args) {
		
		HashSet<Integer>hs=new HashSet<>();
		
		
		hs.add(11);
		hs.add(12);
		hs.add(13);
		
		ArrayList<Integer>list1=new ArrayList<>(hs);
		ArrayList<Integer>list2=new ArrayList<>();
		
		list2.addAll(hs);
		
		System.out.println(list1);
		System.out.println(list2);
		
		

	}

}

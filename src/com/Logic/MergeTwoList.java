package com.Logic;
import java.util.*;


public class MergeTwoList {

	public static void main(String[] args) {
		
		
		ArrayList<Integer>list1=new ArrayList<>();
		list1.add(12);
		
		ArrayList<Integer>list2=new ArrayList<>();
		list2.add(21);
		
		ArrayList<Integer>Mergedlist=new ArrayList<>(list1);
		Mergedlist.addAll(list2);
		
		System.out.println(Mergedlist);
		
		

	}

}

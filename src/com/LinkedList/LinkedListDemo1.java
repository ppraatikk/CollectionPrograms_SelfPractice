package com.LinkedList;
import java.util.*;


public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		LinkedList<Integer>list = new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(3);
		
		
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);

	}

}

package com.Stack;
import java.util.*;



public class Declaration_Print {

	public static void main(String[] args) {
		
		
		Stack<Integer>s=new Stack<>();
		s.add(11);
		s.add(12);
		s.add(13);
		
		s.add(25);
		s.add(16);
		s.add(2);
		
		
		
		//s.pop();
		System.out.println(s);
		
		
		System.out.println(s.peek());
		System.out.println(s.search(16));
		
		System.out.println(s.indexOf(2));
		
		System.out.println(s.size());
		
		System.out.println("/////////////////////////////////");
		
		Queue<Integer>q=new PriorityQueue<>();
		q.add(11);
		q.add(5);
		q.add(19);
		q.add(7);
		q.add(23);
		q.add(3);
		
		System.out.println(q);
		
		
		System.out.println(q.peek());
		
		q.poll();
		System.out.println(q);
		
		
		
	}

}

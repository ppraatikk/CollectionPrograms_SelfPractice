package com.Stack;
import java.util.*;


public class StackAssignment {

	public static void main(String[] args) {
		
		
		Stack<Integer> s=new Stack<>();
		
		s.push(1);
		s.add(2);
		s.add(3);
		s.push(4);
		
		System.out.println(s);
		
		
		System.out.println(	s.peek() );
		
		//System.out.println(s.pop());
		
		System.out.println(s.search(4));
		
		System.out.println(s.lastElement());
		
		System.out.println(s.firstElement());

	}

}

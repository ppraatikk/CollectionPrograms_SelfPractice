package com.Queue;
import java.util.*;

public class AssignmentQus {

	public static void main(String[] args) {
		
		Queue<Integer>q=new PriorityQueue<>();
		
		q.add(11);
		q.add(12);
		q.add(13);
		q.add(14);
		
	    q.offer(21);
	    
	    System.out.println(q);
	    
	  //  q.removeAll(q);
	    
	    System.out.println(q.isEmpty());
	    
	    
		System.out.println(q.peek());
		
		
		
		Queue<Integer>qq=new PriorityQueue<>();
		
		qq.add(54);
		qq.add(51);
		qq.offer(53);
		qq.offer(52);
		
		System.out.println(qq);
		
		int a=qq.peek();
		int b=qq.peek();
		
		System.out.println(a);
		System.out.println(b);
		

	}

}

package com.Queue;
import java.util.*;


class Desc implements Comparator<String>{
	
	@Override
	public int compare(String s1,String s2)
	{
		return s2.compareTo(s1);
	}
}
public class StringQueue_byDescending {

	public static void main(String[] args) {
	
		
		PriorityQueue<String>pq=new PriorityQueue<>(new Desc());
		
		pq.add("Latur");
		pq.add("Nashik");
		pq.add("Amravati");
		pq.add("Mumbai");
		
		System.out.println(pq);
		
		
//		System.out.println(pq.peek());
//		
//		pq.poll();
//		System.out.println(pq);
//		
//		pq.poll();
//		System.out.println(pq);
//		
//		pq.poll();
//		System.out.println(pq);
//		
//		
//		PriorityQueue<Integer>p=new PriorityQueue<>();
//		
//		p.add(11);
//		p.add(13);
//	    p.add(12);
//	    
//	    System.out.println(p);
//	    
//	    System.out.println(p.peek());
		
	}

}

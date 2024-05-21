package com.Queue;
import java.util.*;


public class Declaration_and_Print {

	public static void main(String[] args) {
		
		Queue<Integer>q=new PriorityQueue<>();

		q.add(11);
		q.add(12);
		q.add(13);
		q.add(14);
		
		System.out.println(q);
		
		q.peek();
		System.out.println(q);
		
		q.poll();
		System.out.println(q);
		
		q.poll();
		System.out.println(q);
		
		
		
		PriorityQueue<Integer>qq=new PriorityQueue<>();
		
		qq.add(11);
		qq.add(45);
		qq.add(7);
		qq.add(19);
		
		System.out.println(qq);
		
		//qq.element();
		//System.out.println(qq);
		
		//qq.poll();
		//System.out.println(qq);
		
		qq.poll();
		System.out.println(qq);
		
		System.out.println(qq.peek());
		
	}

}

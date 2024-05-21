package com.Queue;
import java.util.*; 


class Student implements Comparable<Student>{
	int sid;
	String sname;
	int smark;
	
	Student(int sid,String sname,int smark)
	{
		this.sid=sid;
		this.sname=sname;
		this.smark=smark;
	}
	
	public String toString()
	{
		return sid+" "+sname+" "+smark;
	}
	
	@Override
	public int compareTo(Student s)
	{
		return this.sid-s.sid;
	}
	
}
public class CustomQueueStudent {

	public static void main(String[] args) {
		
		PriorityQueue<Student>q=new PriorityQueue<>();

		q.add(new Student(14,"Raj",98));
		q.add(new Student(12,"Yash",88));
		q.add(new Student(13,"Abhi",90));
		
		System.out.println(q);
		
		
		
//		Iterator<Student>itr=q.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
	}

}

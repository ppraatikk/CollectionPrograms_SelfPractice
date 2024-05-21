package com.HashMap;
import java.util.*;

class Student{
	int sid;
	String sname;
	
	Student(int sid,String sname)
	{
		this.sid=sid;
		this.sname=sname;
	}
	
	@Override
	public String toString()
	{
		return sid+" "+sname;
	}
}

public class Custom_Demo3 {

	public static void main(String[] args) {
		

		HashMap<Student,Integer>map=new HashMap<>();
		
		map.put(new Student(1,"Amit"),89);
		map.put(new Student(2,"Ram"),67);
		map.put(new Student(3,"Yash"),71);
		
		System.out.println(map);
		
		System.out.println("//////////////////////////////////////");
		
		
		for(Map.Entry<Student,Integer>m:map.entrySet())
		{
			System.out.println(m);
		}
		
		
		System.out.println("/////////////////////////////////////////");
		
		
		Set s1=map.entrySet();
		Iterator<Map.Entry<Student,Integer>>itr=s1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}

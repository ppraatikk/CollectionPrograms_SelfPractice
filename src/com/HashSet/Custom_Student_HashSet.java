package com.HashSet;
import java.util.*;

class Student implements Comparable<Student>{
	int sid;
	String sname;
	float per;
	
	
	Student(int sid,String sname,float per)
	{
		this.sid=sid;
		this.sname=sname;
		this.per=per;
	}
	
	
	@Override
	public String toString()
	{
		return sid+" "+sname+" "+per;
	}
	
	
	@Override
	public int hashCode()
	{
		return sid;
	}
	
	@Override
	public boolean equals(Object o)
	{
		Student s=(Student)o;
		
		if(this.sid==s.sid)
		{
			return true;
		}
		return false;
	}
	
	@Override
	public int compareTo(Student s)
	{
		return this.sid-s.sid;
	}
	
}
public class Custom_Student_HashSet {

	public static void main(String[] args) {
		

		HashSet<Student>hs=new HashSet<>();
		hs.add(new Student(1,"Yash",89.00f));
		hs.add(new Student(3,"Rohan",79.90f));
		hs.add(new Student(2,"psw",93.47f));
		
		System.out.println(hs);
		
	}

}

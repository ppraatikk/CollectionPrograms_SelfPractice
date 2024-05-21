package com.ArrayListt;
import java.util.*;

class Branch {
	int bid;
	String bname;
	
	Branch(String bname,int bid)
	{
		this.bname=bname;
		this.bid=bid;
	}
	
	public String toString()
	{
		return bname+" "+bid;
	}
}

class Student implements Comparable<Student>{
	int sid;
	String sname;
	Branch b;
	
	Student(int sid,String sname,Branch b)
	{
		this.sid=sid;
		this.sname=sname;
		this.b=b;
	}
	
	public String toString()
	{
		return sid+" "+sname+" "+b;
	}
	
	@Override
	public int compareTo(Student s)
	{
		if(this.sname.equals(s.sname))
		{
			return this.b.bid-s.b.bid;
		}
		return this.sname.compareTo(s.sname);
	}
	
	
}





public class ArrayListCustomDemo2 {

	
public static void main(String[] args) {
		

	ArrayList<Student>list = new ArrayList<>();
	
	list.add(new Student(1,"Yash",new Branch("Cs",101)));
	list.add(new Student(3,"Ram",new Branch("IT",102)));
	list.add(new Student(4,"Yash",new Branch("IT",102)));
	list.add(new Student(2,"Pranav",new Branch("AI",103)));
	list.add(new Student(5,"Rohit",new Branch("Cs",101)));
	
	
	
	
	Collections.sort(list);
	
	ListIterator<Student>itr=list.listIterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}

	
}
}

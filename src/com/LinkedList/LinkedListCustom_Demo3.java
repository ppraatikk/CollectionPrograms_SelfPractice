package com.LinkedList;
import java.util.*;



class Student implements Comparable<Student>{
	int sid;
	String sname;
	int marks[];
	
	Student(int sid,String sname,int marks[])
	{
		this.sid=sid;
		this.sname=sname;
		this.marks=marks;
	}
	
	@Override
	public String toString()
	{
		return sid+" "+sname+" "+Arrays.toString(marks);
	}
	
	@Override
	public int compareTo(Student s)
	{
		return s.sname.compareTo(this.sname);
	}
}



public class LinkedListCustom_Demo3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter No Of Student");
		int no=sc.nextInt();
		
		
		LinkedList<Student>a1=new LinkedList<>();
		
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter Student iid");
			int sid=sc.nextInt();
			
			System.out.println("Enter Student name");
			String sname=sc.next();
			
			System.out.println("ENter marks;");
			int marks[]=new int[5];
			for(int j=0;j<marks.length;j++)
			{
				marks[j]=sc.nextInt();
			}
			Student s=new Student(sid,sname,marks);
			a1.add(s);
		}
		
		Collections.sort(a1);

		System.out.println(a1);
		
		
		
		
	}

}

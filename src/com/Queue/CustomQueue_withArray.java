package com.Queue;
import java.util.*;

class Subj{
	int marks[];
	
	Subj(int marks[])
	{
		this.marks=marks;
	}
	
	public String toString()
	{
		return Arrays.toString(marks);
	}
}
class Stud implements Comparable<Stud>{
	int sid;
	String sname;
	Subj s;
	
	Stud(int sid,String sname,Subj s)
	{
		this.sid=sid;
		this.sname=sname;
		this.s=s;
	}
	
	public String toString()
	{
		return sid+" "+sname+" "+s;
	}
	
	@Override
	public int compareTo(Stud s)
	{
		return this.sid-s.sid;
	}
	
}
public class CustomQueue_withArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		PriorityQueue<Stud>pq=new PriorityQueue<>();

		for(int i=0;i<3;i++)
		{
			System.out.println("Enter Stud Id");
			int sid=sc.nextInt();
			
			System.out.println("Enter Stude Name");
			String sname=sc.next();
			
			System.out.println("Enter Marks");
			int marks[]=new int[3];
			for(int j=0;j<3;j++)
			{
				marks[j]=sc.nextInt();
			}
			
			Stud s=new Stud(sid,sname,new Subj(marks));
			pq.add(s);
		}
  
  
		Iterator<Stud>itr=pq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
  
	}

}

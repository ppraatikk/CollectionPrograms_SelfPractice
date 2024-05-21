package com.ArrayListt;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;




class Emp implements Comparable<Emp>
{
	
	int eid;
	String ename;
	int esalary;
	
	Emp(int eid,String ename,int esalary)
	{
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
	}
	
	public String toString()
	{
		return eid+" "+ename+" "+esalary;
	}
	
	
	public int compareTo(Emp e)
	{
		return e.ename.compareTo(this.ename);
	}
	
	
//	public int compareTo(Emp e)
//	{
//		return e.esalary-this.esalary;
//	}
	
	
}

public class ArrayListCustomDemo1 {

public static void main(String[] args) {
		

		ArrayList<Emp>list = new ArrayList<>();
		
		list.add(new Emp(1,"Ram",4500));
		list.add(new Emp(3,"Yash",2300));
		list.add(new Emp(2,"Rj",2900));
		
		Collections.sort(list);
		
		
		
		Iterator<Emp>itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}

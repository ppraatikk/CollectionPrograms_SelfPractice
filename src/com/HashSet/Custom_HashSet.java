package com.HashSet;
import java.util.*;

class Emp implements Comparable<Emp>{
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
	
	@Override
	public int hashCode()
	{
		return eid;
	}
	
	@Override
	public boolean equals(Object o)
	{
		Emp e=(Emp)o;
		if(this.eid==e.eid)
		{
			return  true; 
		}
		return false;
	}
	
	@Override
	public int compareTo(Emp e)
	{
	 return this.eid-e.eid;	
	}
	
}
class Iddesc implements Comparator<Emp>{
	@Override
	public int compare(Emp e1,Emp e2 )
	{
		return e2.eid-e1.eid;
	}
	
}
public class Custom_HashSet {

	public static void main(String[] args) {
		

		LinkedHashSet<Emp>hs=new LinkedHashSet<>();
		
		
		hs.add(new Emp(101,"Pixxi",45000));
		hs.add(new Emp(103,"RJ",23400));
		hs.add(new Emp(102,"Psw",46700));
		hs.add(new Emp(102,"Psw",96700));
		
		System.out.println(hs);
		
	
		TreeSet<Emp>ts=new TreeSet<>(new Iddesc());
		ts.addAll(hs);
		
		System.out.println(ts);
		
	}

}

package com.Queue;
import java.util.*;


class Employee implements Comparable<Employee>{
	int eid;
	String ename;
	int esalary;
	
	Employee(int eid,String ename,int esalary)
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
	public int compareTo(Employee e)
	{
		return this.eid-e.eid;
	}
	
	@Override
	public int hashCode()
	{
		return eid;
	}
	
	@Override
	public boolean equals(Object o)
	{
		Employee e=(Employee) o;
		
		if(this.eid==e.eid)
		{
			return true;
		}
		return false;
		
	}
	
}
public class CustomQueue1 {

	public static void main(String[] args) {
		
		PriorityQueue<Employee>pq=new PriorityQueue<>();
		
		pq.add(new Employee(102,"Yash",45600));
		pq.add(new Employee(101,"Psw",34500));
		pq.add(new Employee(103,"Rohan",23500));
		pq.add(new Employee(101,"Psw",76000));
		
		System.out.println(pq);
	}

}

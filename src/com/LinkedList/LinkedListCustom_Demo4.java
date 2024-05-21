package com.LinkedList;
import java.util.*;

class Dept{

	int did;
	String dname;
	
	Dept(int did,String dname)
	{
		this.did=did;
		this.dname=dname;
	}
	
	@Override
	public String toString()
	{
		return did+" "+dname;
	}
	
}


class Employee{
	int eid;
	String ename;
	Dept dept;
	
	Employee(int eid,String ename,Dept dept)
	{
		this.eid=eid;
		this.ename=ename;
		this.dept=dept;
	}
	
	@Override
	public String toString()
	{
		return eid+" "+ename+" "+dept;
	}
	
}





public class LinkedListCustom_Demo4 {

	public static void main(String[] args) {
		
		
		
		
		
		
		LinkedList<Employee>list=new LinkedList<>();
		
		
		Employee e1=new Employee(2,"Ram",new Dept(101,"HR"));
		Employee e2=new Employee(1,"Yash",new Dept(102,"Sales"));
		Employee e3=new Employee(5,"Pranav",new Dept(101,"Sales"));
		Employee e4=new Employee(4,"Rohan",new Dept(101,"HR"));
		Employee e5=new Employee(3,"Amit",new Dept(102,"Sales"));
		Employee e6=new Employee(7,"Gajanan",new Dept(102,"Sales"));
		Employee e7=new Employee(6,"Pranav",new Dept(102,"HR"));
		
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		
		
		Iterator<Employee>itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("//////////////////////////////////");
		
		
		
		
		Collections.sort(list,new Ename());
		
		
		
		
		Iterator<Employee>itr1=list.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		
		System.out.println("//////////////////////////////////");
		
		
		
			

	}

}

class Ename implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1,Employee e2)
	{
		if(e1.ename.equals(e2.ename))
		{
			if(e1.dept.did>e2.dept.did)
			{
				return 1;
			}
			else
			{
				return -1;
			}
			
			
		}
		
		return e1.ename.compareTo(e2.ename);
	}
}

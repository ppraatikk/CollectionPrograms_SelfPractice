package com.HashMap;
import java.util.*;


class Employee{
	int eid;
	String ename;
	int esalary;
	String ecity;
	
	Employee(int eid,String ename,int esalary,String ecity)
	{
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
		this.ecity=ecity;
	}
	
	public String toString()
	{
		return eid+" "+ename+" "+esalary+" "+ecity;
	}
}
public class Employee_belong_SameCity {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Employee>list=new ArrayList<>();
		
		System.out.println("Enter No of Employees");
		int no=sc.nextInt();
		
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter E id");
			int eid=sc.nextInt();
			
			System.out.println("Enter E name");
			String ename=sc.next();
			
			System.out.println("Enter E salary");
			int esalary=sc.nextInt();
			
			System.out.println("Enter E city");
			String ecity=sc.next();
			
			Employee e=new Employee(eid,ename,esalary,ecity);
			list.add(e);
		}
		
		 LinkedHashMap<String,ArrayList<String>>m=new LinkedHashMap<>();
		
		 
		 
		
		 for(int i=0;i<list.size();i++)
		 {
			 
			 Employee e=list.get(i);
			 
			 ArrayList<String>a=new ArrayList<>();
			 if(m.containsKey(e.ecity))
			 {
				 a=m.get(e.ecity);
				 a.add(e.ename);
				 m.put(e.ecity,a);
			 }
			 else {
				 a.add(e.ename);
				 m.put(e.ecity,a);
			 }
			 	 
		  }
		 
		 for(Map.Entry<String,ArrayList<String>>mm:m.entrySet())
		 {
			 System.out.println(mm.getKey()+mm.getValue());
		 }
		 
		 
		 
	}

}

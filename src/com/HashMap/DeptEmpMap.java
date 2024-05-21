package com.HashMap;
import java.util.*;

class Employ{
	int eid;
	String ename;
	
	Employ(int eid,String ename)
	{
		this.eid=eid;
		this.ename=ename;
	}
	
	public String toString()
	{
		return eid+" "+ename;
	}
}
class Department{
	int did;
	String dname;
	Employ emp;
	
	Department(int did,String dname,Employ emp)
	{
		this.did=did;
		this.dname=dname;
		this.emp=emp;
	}
	
	public String toString()
	{
		return did+" "+dname+" "+emp;
	}
}
public class DeptEmpMap {

	public static void main(String[] args) {
		
		ArrayList<Department>al=new ArrayList<>();
		
		Department d=new Department(101,"HR",new Employ(1,"Rohan"));
		Department d1=new Department(102,"Sales",new Employ(2,"Yash"));
		Department d2=new Department(102,"Sales",new Employ(1,"Prateek"));
		Department d3=new Department(101,"HR",new Employ(1,"Amit"));
		Department d4=new Department(102,"Sales",new Employ(1,"Gajanan"));
		Department d5=new Department(101,"HR",new Employ(1,"Lalla"));
		
		al.add(d);
		al.add(d1);
		al.add(d2);
		al.add(d3);
		al.add(d4);
		al.add(d5);
		
		HashMap<String,ArrayList<String>>m=new HashMap<>();
		

		
		for(int i=0;i<al.size();i++)
		{
			Department dd=al.get(i);
            ArrayList<String>arl=new ArrayList<>();
	
			if(m.containsKey(dd.dname))
			{
				arl=m.get(dd.dname);
				arl.add(dd.emp.ename);
				m.put(dd.dname,arl);
			}
			else
			{
				arl.add(dd.emp.ename);
				m.put(dd.dname,arl);
			}
					
			
			
		}
		
		for(Map.Entry<String,ArrayList<String>>mm:m.entrySet())
		{
			System.out.println(mm.getKey()+" "+mm.getValue());
		}
		
		
		
		
		
		
	}

}

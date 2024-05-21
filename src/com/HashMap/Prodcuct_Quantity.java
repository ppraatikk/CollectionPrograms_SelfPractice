package com.HashMap;
import java.util.*;

class Product //implements Comparable<Product>
{
	int pid;
	String pname;
	int pprice;
	
	Product(int pid,String pname,int pprice)
	{
		this.pid=pid;
		this.pname=pname;
		this.pprice=pprice;
	}
	
	@Override
	public String toString()
	{
		return pid+" "+pname+" "+pprice;
	}
	
	@Override
	public int hashCode()
	{
		return pid;
	}
	
	@Override
	public boolean equals(Object o)
	{
		Product p=(Product) o;
		
		if(this.pid==p.pid)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
//	@Override
//	public int compareTo(Product p)
//	{
//		return p.pid-this.pid;
//	}
}
public class Prodcuct_Quantity {

	public static void main(String[] args) {
		
		TreeMap<Product,Integer>tm=new TreeMap<>(new Iddesc());
		
		tm.put(new Product(3,"Fan",2499),5);
		tm.put(new Product(1,"TV",10999),2);
		tm.put(new Product(2,"Oven",8999),1);
		tm.put(new Product(2,"Refri",14999),9);
		
		System.out.println(tm);

	}

}
class Iddesc implements Comparator<Product>{
	@Override
	public int compare(Product p1,Product p2)
	{
		return p2.pid-p1.pid;
	}
}

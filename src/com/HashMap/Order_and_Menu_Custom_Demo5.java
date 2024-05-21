package com.HashMap;
import java.util.*;


class Menu{
	int mid;
	String mname;
	int mprice;
	
	Menu(int mid,String mname,int mprice)
	{
		this.mid=mid;
		this.mname=mname;
		this.mprice=mprice;
	}
	
	@Override
	public String toString()
	{
		return mid+" "+mname+" "+mprice;
	}
		
}



class Order{
	int oid;
	int quantity;
	Menu menu;
	
	Order(int oid,int quantity,Menu menu)
	{
		this.oid=oid;
		this.quantity=quantity;
		this.menu=menu;
	}
	
	@Override 
	public String toString()
	{
		return oid+" "+quantity+" "+menu;
	}
}



public class Order_and_Menu_Custom_Demo5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Order>list=new ArrayList<>();
		
		System.out.println("Enter Order");
		int n=sc.nextInt();
		
		
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Oreder Id");
			int oid=sc.nextInt();
			
			System.out.println("Enter Order Quantity");
			int quantity=sc.nextInt();
			
			System.out.println("Enter Menu Id");
			int mid=sc.nextInt();
			
			System.out.println("Enter Menu Name");
			String mname=sc.next();
			
			System.out.println("Enter price Of Menu");
			int mprice=sc.nextInt();
			
			Menu m=new Menu(mid,mname,mprice);
			Order o=new Order(oid,quantity,m);
			list.add(i, o);
			
		}
		
		HashMap<String,Integer>map=new HashMap<>();
		for(Order o:list)
		{
			int total=0;
			if(map.containsKey(o.menu.mname))
			{
				total=map.get(o.menu.mname);
				total=total+(o.menu.mprice*o.quantity);
				map.put(o.menu.mname,total);
			}
			else
			{
				total=o.quantity*o.menu.mprice;
				map.put(o.menu.mname,total);
			}
			
		}
		
		for(Map.Entry<String,Integer>m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	
	}

}

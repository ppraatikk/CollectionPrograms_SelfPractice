package com.HashMap;
import java.util.*;


public class Declaration_Print_Demo1 {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String>map = new HashMap<>();
		
		map.put(1,"Amit");
		map.put(2,"Gajanan");
		map.put(3,"Prteek");
		
		System.out.println(map);
		
		
		System.out.println("////////////////////////////");
		
		
		Set s=map.entrySet();
		Iterator<Map.Entry<Integer,String>>itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		System.out.println("////////////////////////////");
		
		
		
		for(Map.Entry<Integer,String>m:map.entrySet())
		{
			System.out.println(m);
		}
		
	
		
		System.out.println("////////////////////////////");
		
		Set s1=map.keySet();
		Iterator<Integer>it=s1.iterator();
		while(it.hasNext())
		{
			Integer i=it.next();
			System.out.println(i+" "+map.get(i));
		}
				
		
		
		
		

	}

}

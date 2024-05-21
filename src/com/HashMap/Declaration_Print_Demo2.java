package com.HashMap;
import  java.util.*;


public class Declaration_Print_Demo2 {

	public static void main(String[] args) {
		
		
		HashMap<String,String>map=new HashMap<>();
		
		map.put("Pune","411001");
		map.put("Latur","413512");
		map.put("Mumbai","997910");
		
		System.out.println(map);
		
		
		System.out.println("//////////////////////////////////");
		
		
		
		for(Map.Entry<String,String>m:map.entrySet())
		{
			System.out.println(m);
		}
		
		
		System.out.println("////////////////////////////////////");
		
		
		Set s1=map.entrySet();
		Iterator<Map.Entry<String,String>>itr=s1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("///////////////////////////////////");
		
		Set s2=map.keySet();
		Iterator<String>it=s2.iterator();
		while(it.hasNext())
		{
			String s=it.next();
			System.out.println(s+" "+map.get(s));
		}
		
		

	}

}

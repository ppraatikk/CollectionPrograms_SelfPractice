package com.LinkedHashMap;
import java.util.*;


public class TreeMap_Demo2 {

	public static void main(String[] args) {
		
		
		
		LinkedHashMap<Integer,String>map=new LinkedHashMap<>();
		map.put(1,"Gajanan");
		map.put(4, "Prateek");
		map.put(2, "Amit");
		map.put(3,"Yash");
		
		TreeMap<Integer,String>tm=new TreeMap<>(map);
		System.out.println(tm);
		
		
		System.out.println("///////////////////////////////////");
		
		
		HashMap<String,Integer>m=new HashMap<>();
		m.put("Latur",413512);
		m.put("Akola",321322);
		m.put("Pune",411001 );
		m.put("Mumbai",400001);
		
		TreeMap<String,Integer>tm1=new TreeMap<>(m);
		System.out.println(tm1);
		
		
		System.out.println("///////////////////////////////////");
		
		
		NavigableMap<String,Integer>nm=tm1.descendingMap();
		System.out.print(nm);
		
		
	}

}

package com.TreeSet;
import java.util.*;


public class Navigable_Method {

	public static void main(String[] args) {
		
		
		
		TreeSet<String>ts=new TreeSet<>();
		ts.add("lalla");
		ts.add("Ram");
		ts.add("Preteek");
		ts.add("Gajanan");
		ts.add("Amit");
		System.out.println(ts);
		
		
		
		
		NavigableSet<String>ns=ts.descendingSet();
		System.out.println(ns);
		
		
		
		
		

	}

}

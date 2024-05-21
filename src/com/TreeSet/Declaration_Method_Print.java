package com.TreeSet;
import java.util.*;

public class Declaration_Method_Print {

	public static void main(String[] args) {
		
		TreeSet<Integer>ts=new TreeSet<>();
		
		ts.add(12);
		ts.add(11);
		ts.add(14);
		ts.add(13);
		
		System.out.println(ts);
		
		
		
	//	ts.first();
		System.out.println(ts.first());
		
	//	ts.last();
		System.out.println(ts.last());
		
	//  ts.pollFirst();
		System.out.println(ts.pollFirst());
		
		
      	System.out.println(ts.isEmpty());
      	
      	HashSet<Integer>hs=new HashSet<>();
      	hs.add(21);
      	hs.add(23);
      	hs.add(24);
      	hs.add(22);
      	
      	TreeSet<Integer>tss=new TreeSet<>(hs);
      	
      	System.out.println(tss);
      	
      	tss.remove(tss.first());
      	System.out.println(tss);
      	
      	tss.remove(tss.last());
      	System.out.println(tss);
		
		
	}

}

package com.Vector;
import java.util.*;


public class Declare_Enumeration {

	public static void main(String[] args) {
		
		
		
		Vector<String>v=new Vector<>();
		
		v.add("Sham");
		v.add("Ram");
		v.add("Pratik");
		v.add("Amit");
		
		System.out.println(v);
		
		
		
		Enumeration<String>e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
			
		}
		
		
		
		
	}

}

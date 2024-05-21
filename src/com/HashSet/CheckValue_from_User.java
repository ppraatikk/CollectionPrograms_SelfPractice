package com.HashSet;
import java.util.*;


public class CheckValue_from_User {

	public static void main(String[] args) {
		
		HashSet<Integer>hs1=new HashSet<>();
		hs1.add(11);
		hs1.add(12);
		hs1.add(23);
		
		HashSet<Integer>hs2=new HashSet<>();
		hs2.add(21);
		hs2.add(22);
		hs2.add(23);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num=sc.nextInt();
		
		boolean ans1=hs1.contains(num);
		boolean ans2=hs2.contains(num);
		
		if(ans1 && ans2)
			System.out.println("Num is present in both Set");
		else
			System.out.println("Num is not present In both set");

	}

}

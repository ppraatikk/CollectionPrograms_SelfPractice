package com.Logic;


public class Fibonacii_series {

	public static void main(String[] args) {
		
		
		// 0,1,1,2,3,5,8,13,21,34,55,89,144
		
		
		int f=0;
		int s=1;
		int t=0;
		
		System.out.println(f);
		System.out.println(s);
		
		for(int i=1;i<=11;i++)
		{
			t=f+s;
			System.out.println(t);
			f=s;
			s=t;
			
		}
		
	}

}

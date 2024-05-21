package com.Logic;

public class SwapTwo_NO_without_using_third {
	
	public void swap(int a,int b)
	{
		 b=a+b;
		
		 a=b-a;
		 b=b-a;
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
	}

	public static void main(String[] args) {
	
		
		
		
	SwapTwo_NO_without_using_third x =new SwapTwo_NO_without_using_third();
		
	
	 int a=11;
	 int b=42;
	
	x.swap(a, b);

	}

}

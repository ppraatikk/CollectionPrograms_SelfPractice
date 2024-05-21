package com.Exception_Handling;

public class Demo2 {

	public static void main(String[] args) {
		
		
		try {
			int a=10;
			
			System.out.println(a/0);
		}

		catch(ArithmeticException a)
		{
			System.out.println(a);
		}
		
		
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		System.out.println("Hello");

	}

}

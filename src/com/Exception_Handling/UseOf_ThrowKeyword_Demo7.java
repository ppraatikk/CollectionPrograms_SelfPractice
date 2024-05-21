package com.Exception_Handling;

public class UseOf_ThrowKeyword_Demo7 {
	 
	
	public static void show(int age)
	{
		
		try {
			if(age>18)
			{
				System.out.println("Voting is Allowed");
			}
			else
			{
				throw new ArithmeticException("Voting is Not allowed");
			}
		}
		catch(ArithmeticException a)
		{
			System.out.println(a);
		}
		finally {
			System.out.println("it is finally block it is Always Allowed");
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		UseOf_ThrowKeyword_Demo7 x=new UseOf_ThrowKeyword_Demo7();
		
		x.show(17);
		
		
		
		
	}
	
	
}

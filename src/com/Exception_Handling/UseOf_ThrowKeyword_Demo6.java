package com.Exception_Handling;

public class UseOf_ThrowKeyword_Demo6 {
	
	public static void check(int age)
	{
		
		if(age<18)
		{
			throw new ArithmeticException("Driving is not allowed");
			
		}
		else
		{
			System.out.println("Driving is Allowed");
		}
		
	}

	
	
	public static void main(String[] args) {
		
		
		UseOf_ThrowKeyword_Demo6 obj=new UseOf_ThrowKeyword_Demo6();
		
		try {
			obj.check(11);
		}
		
		catch(ArithmeticException b) {
			System.out.println(b);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}

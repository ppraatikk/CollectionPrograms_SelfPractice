package com.Exception_Handling;

class NumberGreaterThanZero extends Exception {
	
	
	NumberGreaterThanZero()
	{
		System.out.println("Negative value is not Allowed");
	}
	NumberGreaterThanZero(String msg)
	{
		super(msg);
	}
}


public class Custom_Exception_Demo10 {
	
	
	public void findEvenNumber(int number1) throws NumberGreaterThanZero
	{
		
		if(number1<0)
		{
			throw new NumberGreaterThanZero("Negative value is not allowed for Checking Even or Odd");
		}
		else
		{
			if(number1 % 2 == 0)
			{
				System.out.println("Number is Even");
			}
			else {
				System.out.println("Number is odd");
			}
			
			
			
		}
		
		
	}


	public static void main(String[] args) {
		


		Custom_Exception_Demo10 obj=new Custom_Exception_Demo10();
		
		try {
			obj.findEvenNumber(-1);
		}
		catch(NumberGreaterThanZero e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}

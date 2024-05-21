package com.Exception_Handling;


class NegativeValueException extends Exception{
	
	  String msg;
	  NegativeValueException()
	  {
		  System.out.println("Negative value not allowed");
	  }
	  NegativeValueException(String msg)
	  {
		  super(msg);
	  }
}


public class Custom_Exception_Demo8 {
	
	public static void calculatePower(int base,int expo) throws NegativeValueException
	{
		if(expo<0)
		{
			throw new NegativeValueException("Negative Value are Not Allowed As Exponent");
		}
		else
		{
			int power=1;
			for(int i=1;i<=expo;i++)
			{
				power=power*base;
			}
			System.out.println(power);
		}
	}

	public static void main(String[] args) {
		
		Custom_Exception_Demo8 x=new Custom_Exception_Demo8();	
		
		try {
			
			x.calculatePower(2,-3);
		}
		catch(NegativeValueException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Block");
		}
		

	}

}

package com.Exception_Handling;

public class Propogation_on_Runtime_Demo5 {
	
	
	    void show()
	    {
	    	add();
	    }
	    void add()
	    {
	    	throw new ArithmeticException("Arithmatic Exception");
	    }
	    
	    void print()
	    {
	    	show();
	    }
	
	

	public static void main(String[] args) {
		
	 Propogation_on_Runtime_Demo5 obj=new Propogation_on_Runtime_Demo5();	
		
		
		try {
			
			obj.print();
		}
		
		catch(ArithmeticException b) {
			System.out.println(b);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally {
			System.out.println("It is AlwayS Exexuted");
		}
		
		
		System.out.println("Exception is Sucessful handled");
		
		
		
		
		
	}
	
	
	
	
	
	

}

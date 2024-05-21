package com.Exception_Handling;

public class Demo4 {

	public static void main(String[] args) {
		
		
		String s=null;
		
		try {
			System.out.println(s.charAt(0));
		}
		
		catch(NullPointerException b)
		{
			System.out.println(b);
		}
		
		finally {
			System.out.println("Always Executed");
		}

		
		
		
		
	}

}

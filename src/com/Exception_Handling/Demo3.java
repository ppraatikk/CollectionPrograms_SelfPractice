package com.Exception_Handling;

public class Demo3 {

	public static void main(String[] args) {
		
		String s="1234Sham";
		
		try {
			int a=Integer.valueOf(s);
			System.out.println(a);
			
		}
		catch(NumberFormatException a)
		{
			System.out.println(a);
		}

	}

}

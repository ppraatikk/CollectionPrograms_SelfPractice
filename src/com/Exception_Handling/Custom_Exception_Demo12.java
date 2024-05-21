package com.Exception_Handling;

import java.util.Scanner;

class StringContainDigit extends Exception{
	
	StringContainDigit()
	{
		System.out.println("String Contain Digit");
	}
	
	StringContainDigit(String msg)
	{
		super(msg);
	}
	
	
}

public class Custom_Exception_Demo12 {
	
	boolean isPresent=false;
	String str1="";
	
	public void stringContainDigit(String str) throws StringContainDigit
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				isPresent=true;
				break;
			}	
		}		
			
		if(isPresent)
		{
			throw new StringContainDigit("String Contain Digit");
		}
		else
		{
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)>='a' && str.charAt(i)<='z')
				{
					str1=str1+ (char)(str.charAt(i)-32);
				}
				else
				{
					str1=str1+str.charAt(i);
				}
			}
			System.out.println(str1);
		}
		
			
		
	}
	
	

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String");
		String str=sc.next();
		
		Custom_Exception_Demo12 x=new Custom_Exception_Demo12();
		
		
		try {
			x.stringContainDigit(str);
		}
		catch(StringContainDigit e)
		{
			System.out.println(e);
		}
		
		
		
	}

}

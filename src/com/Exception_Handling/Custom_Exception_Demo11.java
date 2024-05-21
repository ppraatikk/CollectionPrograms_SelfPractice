package com.Exception_Handling;

import java.util.Scanner;


class NotBinaryNumber extends Exception{
	
	NotBinaryNumber()
	{
		System.out.println("Number is Not Binary");
	}
	NotBinaryNumber(String msg)
	{
		super(msg);
	}
}

public class Custom_Exception_Demo11 {
	
	public void checkBinary(long num) throws NotBinaryNumber
	{
		boolean isPresent=false;
		for (long i=num;i>0;)
		{
			long digit=i%10;
			
			if(digit>=2 && digit<=9)
			{
				isPresent=true;
				break;
			}
			i=i/10;
		}
		
		if(isPresent)
		{
			throw new NotBinaryNumber("Number Is Not Binary");
		}
		else
		{
			System.out.println("Number is binary");
		}
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		long num=sc.nextInt();
		
		
		Custom_Exception_Demo11 x=new Custom_Exception_Demo11();
		
		try {
			x.checkBinary(num);
		}
		catch(NotBinaryNumber a)
		{
			System.out.println(a);
		}
		finally {
			System.out.println("This is Finally Block");
		}
		
		

	}

}

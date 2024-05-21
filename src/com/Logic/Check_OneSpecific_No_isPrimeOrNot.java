package com.Logic;

import java.util.Scanner;


public class Check_OneSpecific_No_isPrimeOrNot {
	
	
	public boolean checkPrime(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			return true;
		}
		else {
			return false;
		}
		
	}
	
	

	public static void main(String[] args) {


   Check_OneSpecific_No_isPrimeOrNot x=new Check_OneSpecific_No_isPrimeOrNot();
		
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Number to check Number is Prime or nOt");
		int num=sc.nextInt();
		
		
		boolean isPrime=x.checkPrime(num);
		
		if(isPrime)
		{
			System.out.println("No IS Prime");
		}
		else{
			System.out.println("No is Not Prime");
		}
		
		
	}

}

package com.Logic;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to Check Armsrtrong");
		int num=sc.nextInt();
		
		int i=num; int count=0;
		while(i>0)
		{
			
			count++;
			i=i/10;
			
		}
		
		
		 int sum=0;
		
		for(int j=num;j>0;)
		{
			int digit=0;
			digit=j%10;
			int pow=1;
			for(int k=1;k<=count;k++)
			{
				pow=pow*digit;
			}
			sum=sum+pow;
			j=j/10;
			
		}
		
		if(num==sum)
			System.out.println("num is armstrong");
		else
			System.out.println("num is not armstrong");

	}

}

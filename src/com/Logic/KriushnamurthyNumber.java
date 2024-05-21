package com.Logic;
import java.util.Scanner;


public class KriushnamurthyNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number to check no is krishnamurthy");
		int num=sc.nextInt();
		
		int i=num; int sum=0;
		while(i>0)
		{
			int digit=i%10;
			
			int fact=1;
			
			for(int j=digit;j>0;j--)
			{
				fact=fact*j;
			}
			
			sum=sum+fact;
			i=i/10;
		}
		

		if(num==sum)
			System.out.println("Number is Krishnmurthy");
		else
			System.out.println("Number is Not Krishnmurthy");
	}

}

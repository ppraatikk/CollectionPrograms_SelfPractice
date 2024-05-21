package com.Logic;
import java.util.Scanner;


public class PallindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number to check Pallidrome");
		int num=sc.nextInt();
		int newnumber=0;
		
		
		for(int i=num;i>0;)
		{
			int digit=0;
			digit=i%10;
			newnumber=(newnumber*10)+digit;
			i=i/10;
		}
		
		
		if(num==newnumber)
			System.out.println("Number is Pallindrome");
		else
			System.out.println("Number is Not pallindrome");
		
		
	}

}

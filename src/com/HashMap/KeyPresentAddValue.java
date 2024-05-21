package com.HashMap;
import java.util.*;

public class KeyPresentAddValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		LinkedHashMap<Integer,Integer>m=new LinkedHashMap<>();
		
		

		for(int i=0;i<5;i++)
		{
			
			System.out.println("Enter Key");
			int num1=sc.nextInt();
			
			System.out.println("Enter Value");
			int num2=sc.nextInt();
			
			
			
			if(m.containsKey(num1))
			{
				m.put(num1,m.get(num1)+num2);
			}
			else
			{
				m.put(num1,num2);
			}
			
			
			
		}
		
		for(Map.Entry<Integer,Integer>mm:m.entrySet())
		{
			System.out.println(mm.getKey()+" "+mm.getValue());
		}
		
	
		
		
		
	}

}

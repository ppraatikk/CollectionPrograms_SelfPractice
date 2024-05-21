package com.Logic;

public class CheckString_isPallindrome_orNot {

	
	public void check(String str)
	{
		StringBuilder sb=new StringBuilder();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			sb.append(str.charAt(i));
		}
		
		if(sb.toString().equals(str))
		{
			System.out.println("String Is Pallindrome");
		}
		else
		{
			System.out.println("String Is Not Pallindrome");
		}
		
	}
	
	public static void main(String[] args) {
		
		
	CheckString_isPallindrome_orNot x=new CheckString_isPallindrome_orNot();

	
	  String str="LeveL";
	  
	  x.check(str);
	  
	
	
	
	
	}

}

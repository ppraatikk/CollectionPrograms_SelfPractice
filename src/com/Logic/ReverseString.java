package com.Logic;

public class ReverseString {
	
	public void reverseString(String s)
	{
		String newstr="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			newstr=newstr+s.charAt(i);
		}
		
		System.out.println(newstr);
	}

	public static void main(String[] args) {
		
		
		String s="Hello World";
		
		ReverseString x=new ReverseString();
		x.reverseString(s);

	}

}

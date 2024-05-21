package com.Logic;

public class Remove_WhiteSpaces {
	
	public void remove(String s)
	{
		
		
		
		String newstr=s.strip();
		newstr=s.trim();
		
		System.out.println(newstr);
	}

	public static void main(String[] args) {
		
		
		
		String s="   Hello  world how  are you ";
		
		Remove_WhiteSpaces x= new Remove_WhiteSpaces();
		
		x.remove(s);

	}

}

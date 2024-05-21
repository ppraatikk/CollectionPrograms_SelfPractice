package com.Exception_Handling;


class StringNotContainVowel extends Exception
{
	  StringNotContainVowel()
	  {
		  System.out.println("String not contain vowel");
	  }
	  StringNotContainVowel(String msg)
	  {
		  super(msg);
	  }
}



public class Cstom_Exception_Demo13 {
	
	
	public void checkVowels(String str) throws StringNotContainVowel
	{
		boolean isPresent=false;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||
					str.charAt(i)=='O'||str.charAt(i)=='U'||str.charAt(i)=='a'||
					str.charAt(i)=='e'||str.charAt(i)=='i'||
					str.charAt(i)=='o'||str.charAt(i)=='u'
					)
			{
				isPresent=true;
				break;
			}
		}
		
		if(isPresent)
		{
			System.out.println("Vowels is Present in String");
		}
		else {
			throw new StringNotContainVowel("StringNotContainVowel");
		}
	}

	public static void main(String[] args) {
		
		
		Cstom_Exception_Demo13 x = new Cstom_Exception_Demo13 ();
		String str="Hlll Wrld";
		
		try {
			x.checkVowels(str);
		}
		catch(StringNotContainVowel a)
		{
			System.out.println(a);
		}
		
	}

}

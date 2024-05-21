package com.Exception_Handling;

public class Demo1 {

	public static void main(String[] args) {
		
		
		try {
			
			int a[]= {1,2,4,5};
			
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException a)
		 {
			System.out.println(a);
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
		
		
		
		
		

	}

}

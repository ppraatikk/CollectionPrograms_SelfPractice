package com.Logic;
import java.util.*;

public class CheckList_ContainOdd_Element {

	public boolean checkOdd(ArrayList<Integer>list)
	{
		
		int count=0;
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)%2==1)
			{
				count++;
			}
		}
		
		if(count>1)
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		
	CheckList_ContainOdd_Element x=new CheckList_ContainOdd_Element();
	
	        ArrayList<Integer>list=new ArrayList<>();
		
	        boolean isOdd=x.checkOdd(list);
	        
	        if(isOdd)
	        {
	        	System.out.println("OddNo Present in List");
	        }
	        else
	        {
	        	System.out.println("OddNo Is Not Present in List");
	        }
	        
	}

}

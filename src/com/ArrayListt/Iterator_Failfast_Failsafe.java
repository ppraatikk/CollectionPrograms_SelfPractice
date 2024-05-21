package com.ArrayListt;
import java.util.*;




public class Iterator_Failfast_Failsafe {

	public static void main(String[] args) {
		
		
		ArrayList<Integer>list = new ArrayList<>();
		
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		
		
	
		Iterator<Integer>itr = list.iterator();
		while(itr.hasNext())
		{
			Integer num=itr.next();
			
			if(num==12)
			{
				
				list.remove(num);    // Fail-Fast
				//itr.remove();       //Fail-Safe
			}
			else
			{
				System.out.println(num);
			}
			
		}
		
		
	
		
		

	}

}

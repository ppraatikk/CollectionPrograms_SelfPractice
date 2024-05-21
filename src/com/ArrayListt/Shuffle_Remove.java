package com.ArrayListt;
import java.util.*;



public class Shuffle_Remove {
	
	
	  public static void shuffle(ArrayList<Integer>list)
	  {
		  Collections.shuffle(list);
		  
		  Iterator<Integer>itr=list.iterator();
		  while(itr.hasNext())
		  {
			  System.out.println(itr.next());
		  }
		  
	  }
	
	
	  public static void remove(ArrayList<Integer>list)
	  {
		  list.remove(0);
		  
		  System.out.println(list);
	  }
	
	  
	  public static void copy(ArrayList<Integer>list)
	  {
		  ArrayList<Integer>list1=new ArrayList<>();
		  list1.addAll(list);
		  
		  System.out.println(list1);
	  }
	
	  
	  public static void replace(ArrayList<Integer>list)
	  {
		  
		 list.set(0,0);
		 
		 System.out.println(list);
	  }
	  
	  public static void compare(ArrayList<Integer>list)
	  {
		  ArrayList<Integer>list1=new ArrayList<>();
			list1.add(1);
			list1.add(2);
			list1.add(3);
			list1.add(4);
		  
		  
		  boolean ans=list.containsAll(list1);
		  
		  if(ans)
			  System.out.println("list contains same element");
		  else
			  System.out.println("list not contain same element");
			
		  
	  }
	  
	  
	  public static void clone(ArrayList<Integer>list)
	  {
		  ArrayList<Integer>list1=new ArrayList<>();
		  list1.add(7);
		  list1.add(8);
		  list1.add(9);
		  
		  list1.clone();
		  
		  System.out.println(list1);
	  }
	
	

	public static void main(String[] args) {
		
		ArrayList<Integer>list=new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		
		Shuffle_Remove obj = new Shuffle_Remove();
		
		//obj.shuffle(list);
		//obj.remove(list);
		//obj.copy(list);
		//obj.replace(list);
		//obj.compare(list);
		obj.clone(list);
		

	}

}

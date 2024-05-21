package com.LinkedHashMap;
import java.util.*;

class Emp{
	int eid;
	String ename;
	
	Emp(int eid,String ename)
	{
		this.eid=eid;
		this.ename=ename;
	}
	
	@Override
	public String toString()
	{
		return eid+" "+ename;
	}
	
}

public class Declare_Print_Demo1 {

	public static void main(String[] args) {
		
		
		
		
		LinkedHashMap<Emp,Integer[]>map=new LinkedHashMap<>();
		
		map.put(new Emp(101,"Ram"),new Integer[] {1,2,4});
		map.put(new Emp(103,"Yash"),new Integer[] {9,4,7});
		map.put(new Emp(104,"Amit"),new Integer[] {2,1,7});
		map.put(new Emp(102,"Gajanan"),new Integer[] {3,6,4});
		
		
		
		
		for(Map.Entry<Emp,Integer[]>m:map.entrySet())
		{
		 System.out.println(m.getKey()+" = "+Arrays.toString(m.getValue()));
		}

		
		
		System.out.println("///////////////////////////////////////////");
		
		
		
		
		TreeMap<Emp,Integer[]>tm=new TreeMap<>(new Desc_Eid());
		tm.putAll(map);
		
		
		
		for(Map.Entry<Emp,Integer[]>t:tm.entrySet())
		{
	     System.out.println(t.getKey()+"="+Arrays.toString(t.getValue()));
		}
		
		
		
		System.out.println("///////////////////////////////////////////");
		
		
		
		
		
		
	}

}
class Desc_Eid implements Comparator<Emp>{
	
	@Override
	public int compare(Emp e1,Emp e2)
	{
		return e2.eid-e1.eid;
	}
}

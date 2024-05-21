package com.HashMap;
import java.util.*;

class Marks{
	  int m[];
	
	Marks(int m[])
	{
		this.m=m;
	}
	
	public String toString()
	{
		return Arrays.toString(m);
	}
	
}
class Studentt{
	int sid;
	String sname;
	
	Studentt(int sid,String sname)
	{
		this.sid=sid;
		this.sname=sname;
	}
	
	@Override
	public String toString()
	{
		return sid+" "+sname;
	}
	
	@Override
	public int hashCode()
	{
		return sid;
	}
	
	@Override
	public boolean equals(Object o)
	{
		Studentt s=(Studentt) o;
		if(this.sid==s.sid)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class Custom_Demo4 {

	public static void main(String[] args) {
		
		
		HashMap<Studentt,Marks>map=new HashMap<>();
		
		//int m[]= {1,2,3};
		
		map.put(new Studentt(101,"Gopal"), new Marks(new int[]{1,2,3} ) );
		map.put(new Studentt(101,"Gopal"), new Marks(new int[]{4,5,6} ) );
		
		System.out.println(map);

	}

}

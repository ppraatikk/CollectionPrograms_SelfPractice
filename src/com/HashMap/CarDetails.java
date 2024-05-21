package com.HashMap;
import java.util.*;

class Car //implements Comparable<Car>
{
	int cid;
	String cname;
	String cno;
	
	
	Car(int cid,String cname,String cno)
	{
		this.cid=cid;
		this.cname=cname;
		this.cno=cno;
		
	}
	
	@Override
	public String toString()
	{
		return cid+" "+cname+" "+cno+" ";
	}
	
	@Override
	public int hashCode()
	{
		return cid;
	}
	
	@Override
	public boolean equals(Object o)
	{
		Car c=(Car)o;
		if(this.cid==c.cid)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
//	@Override
//	public int compareTo(Car c)
//	{
//		return 0;
//	}
	
}
public class CarDetails {

	public static void main(String[] args) {
		
		LinkedHashMap<Car,Integer>map=new LinkedHashMap<>();
		map.put(new Car(11,"BMW","MH24AB2123"),10);
		map.put(new Car(3,"Mercedes","MH24AB9892"),8);
		map.put(new Car(3,"Volvo","MH25R3739"),4);
		map.put(new Car(7,"MiniCupper","MH24AB9892"),5);
		
		System.out.println(map);
	}

}

package com.ArrayListt;
import java.util.*;

class CarId implements Comparator<Car>
{
	public int compare(Car c1,Car c2)
	{
		return c2.modelno-c1.modelno;
	}
}

class CarName implements Comparator<Car>
{
	public int compare(Car c1,Car c2)
	{
		return c2.name.compareTo(c1.name);
	}
}
class Car{
	int modelno;
	String name;
	int price;
	
	Car(int modelno,String name,int price)
	{
		this.modelno=modelno;
		this.name=name;
		this.price=price;
	}
	
	public String toString()
	{
		return modelno+" "+name+" "+price;
	}
}
public class ArrayListCustomDemo3 {

	public static void main(String[] args) {
		
		ArrayList<Car>list = new ArrayList<>();
		 
		list.add(new Car(101,"BMW",195000));
		list.add(new Car(105,"Mercedes",175000));
		list.add(new Car(102,"Jaguar",105000));
		list.add(new Car(104,"Volvo",355000));
		list.add(new Car(103,"Toyota",98000));
		
		
		Collections.sort(list,new CarName());
		
		Iterator<Car>itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}

package com.HashMap;
import java.util.*;

class StudentMarksTotal {
	int sid;
	String sname;
	int marks[];

	StudentMarksTotal()
	{}
	
	StudentMarksTotal(int sid,String sname,int marks[])
	{
		this.sid=sid;
		this.sname=sname;
		this.marks=marks;
	}
	
	@Override
	public String toString()
	{
		return sid+" "+sname+" "+Arrays.toString(marks);
	}
 }	


public class MarksOfStudent {

	public static void main(String[] args) {
		

		StudentMarksTotal sm=new StudentMarksTotal();
		
		ArrayList<StudentMarksTotal>list=new ArrayList<>();

		list.add(new StudentMarksTotal(3,"Yash",new int[]{12,34,56}  ) );
		list.add(new StudentMarksTotal(1,"Rohan",new int[]{90,51,76} ) );
		list.add(new StudentMarksTotal(2,"Yash",new int[]{22,71,96} ) );
		
		TreeMap<Integer,Integer>tm=new TreeMap<>();
		
		
			
			for(int i=0;i<list.size();i++)
			{
				int total=0;
				StudentMarksTotal s=list.get(i);
				
				for(int j=0;j<s.marks.length;j++)
				{
					total=total+s.marks[j];
				}
				tm.put(s.sid,total);
			}
		
			
		NavigableMap<Integer,Integer>nm=tm.descendingMap();	
			System.out.println(nm);
		
	}

}

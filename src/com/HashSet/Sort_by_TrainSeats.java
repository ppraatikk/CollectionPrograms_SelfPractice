package com.HashSet;
import java.util.*;

class Train implements Comparable<Train>{
	int tid;
	String tname;
	int tseat;
	
	Train(int tid,String tname,int tseat)
	{
		this.tid=tid;
		this.tname=tname;
		this.tseat=tseat;
	}
	
	public String toString()
	{
		return tid+" "+tname+" "+tseat;
	}
	
	@Override
	public int compareTo(Train t)
	{
		return this.tid-t.tid;
	}
}

class Seatdesc implements Comparator<Train>{
	
	@Override
	public int compare(Train t1,Train t2)
	{
		return t2.tseat-t1.tseat;
	}
}

public class Sort_by_TrainSeats {

	public static void main(String[] args) {
	
		TreeSet<Train>ts=new TreeSet<>(new Seatdesc());
		
		ts.add(new Train(104,"Shatabdi Exp",120));
		ts.add(new Train(102,"Rajdhani Exp",40));
		ts.add(new Train(101,"Mumbai Meal How Exp",105));
		ts.add(new Train(103,"Sabarmati EXP",90));
		
		System.out.println(ts);
		
	}

}

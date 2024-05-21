package com.LinkedHashMap;
import java.util.*;


public class Frequency_Demo3 {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();

		map.put(1,1);
		map.put(2,1);
		map.put(1,2);
		
		System.out.println(map);
		
	}

}

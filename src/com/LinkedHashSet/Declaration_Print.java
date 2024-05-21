package com.LinkedHashSet;
import java.util.*;

public class Declaration_Print {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer>hs=new LinkedHashSet<>();
		
		hs.add(90);
		hs.add(21);
		hs.add(24);
		hs.add(76);
		
		System.out.println(hs);
		
		Iterator<Integer>itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}

package com.sl.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		set.add("apple");
		set.add("banana");
		set.add(null);
		set.add("banana");
		set.add("cherry");
		set.add("almond");
		
		System.out.println("Size: "+set.size());
		System.out.println(set);
		
		System.out.println("Contains "+set.contains("cherry"));
		
		set.remove(null);
		
		System.out.println(set);
		
		//foreach loop
		for(String i:set)
		{
			System.out.println("foreach::"+i);
		}
		
		//iterate linked list using iterator
          Iterator<String> itr=set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println("itr::"+itr.next());
		}
		
		
		
	}
}
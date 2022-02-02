package com.sl.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> map=new Hashtable<Integer, String>();
		
		map.put(1, "Griezmann");
		map.put(2, "Mbappe");
		map.put(5, "Oliver");
		map.put(8, "Henry");
		//map.put(null,null);
		//map.put(null, "jai");
		//map.put(8, null);
		
		System.out.println(map);
		System.out.println("get element "+map.get(5));
		map.remove(8);
		System.out.println(map);
		
		//iterate using for loop
		for(Map.Entry m :map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}
}
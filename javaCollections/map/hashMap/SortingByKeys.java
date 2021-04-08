package javaCollections.map.hashMap;

import java.util.*;

public class SortingByKeys {

	/**
	 * This program demonstrates HashMap Sorting by Keys
	 * 
	 *
	 */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		/* Declare HashMap Object */
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		//Add Elements
		hmap.put(12, "Liban");
		hmap.put(23, "abdullahi");
		hmap.put(3, "mohamed");
		hmap.put(45, "Roble");
		hmap.put(5, "Warfaa");
		hmap.put(65, "Faarax");
		
		//Display befor sorting the hashmap
		System.out.println("------Before Sorting----");
		Iterator iter = hmap.entrySet().iterator();
		while(iter.hasNext())
		{
			Map.Entry mab = (Map.Entry)iter.next();
			System.out.println("Key is: " + mab.getKey() + " & Value is: " + mab.getValue());
			
		}
		System.out.println();
		
		//Sorting by keys
		Map<Integer, String> ma = new TreeMap<Integer, String>(hmap);
		System.out.println("------After Sorting----");
		Iterator iterator = ma.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry mab = (Map.Entry)iterator.next();
			System.out.println("Key is: " + mab.getKey() + " & Value is: " + mab.getValue());
			
		}
	}

}

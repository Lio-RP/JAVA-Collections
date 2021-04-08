package javaCollections.map.hashMap;

import java.util.*;

public class HashMapExample {

	/**
	 * This program demonstrates HashMap Example
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		/* Declare HashMap Object */
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		//Add Elements
		hmap.put(1, "Liban");
		hmap.put(2, "abdullahi");
		hmap.put(3, "mohamed");
		hmap.put(4, "Roble");
		hmap.put(5, "Warfaa");
		hmap.put(6, "Faarax");
		
		/* Display content using Iterator*/
		Set set = hmap.entrySet();
		Iterator iter = set.iterator();
		while(iter.hasNext())
		{
			Map.Entry mentry = (Map.Entry)iter.next();
			System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
		}
		System.out.println();
		
		/* Get values based on key*/
		System.out.println("The value of key 2: " + hmap.get(2));
		System.out.println();
		
		  /* Remove values based on key*/
		hmap.remove(6);
		System.out.println("Map key and values after removal:");
		Set set2 = hmap.entrySet();
		Iterator iterator = set2.iterator();
		while(iterator.hasNext())
		{
			Map.Entry entry = (Map.Entry)iterator.next();
			System.out.println("Key is: " + entry.getKey() + " & Value is: " + entry.getValue());
		}

	}

}

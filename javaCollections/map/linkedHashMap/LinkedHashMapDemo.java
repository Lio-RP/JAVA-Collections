package javaCollections.map.linkedHashMap;

import java.util.*;

public class LinkedHashMapDemo {

	/**
	 * This program demonstrates LinkedHashMap
	 * LinkedHashMap is a Hash table and linked list implementation of the Map interface, 
	 * with predictable iteration order. This implementation differs from HashMap in that 
	 * it maintains a doubly-linked list running through all of its entries. 
	 * This linked list defines the iteration ordering, which is normally the order 
	 * in which keys were inserted into the map (insertion-order).
	 * 
	 * HashMap doesn’t maintain any order.
		TreeMap sort the entries in ascending order of keys.
		LinkedHashMap maintains the insertion order.
			 */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		/* Declare alinkedhashmap object*/
		LinkedHashMap<Integer, String> lkhmap = new LinkedHashMap<Integer, String>();
		
		//Adding Elements
		lkhmap.put(1, "Liban");
		lkhmap.put(2, "abdullahi");
		lkhmap.put(3, "mohamed");
		lkhmap.put(4, "Roble");
		lkhmap.put(5, "Warfaa");
		lkhmap.put(6, "Faarax");
		
        // Generating a Set of entries
		Set set = lkhmap.entrySet();
		
		  // Displaying elements of LinkedHashMap
		Iterator iter = set.iterator();
		while(iter.hasNext())
		{
			Map.Entry map = (Map.Entry)iter.next();
			System.out.println("Key is: " + map.getKey() + " & Value is: " + map.getValue());
		}

	}

}

package javaCollections.map.hashMap;

import java.util.*;

public class GetSize {

	/**
	 * This program demonstrates how to get size of hashmap
	 *public int size(): Returns the number of key-value mappings in this map.
	 */
	public static void main(String[] args) {
		
		/* Declare HashMap Object */
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		//Add Elements
		hmap.put(12, "Liban");
		hmap.put(23, "Abdullahi");
		hmap.put(3, "Mohamed");
		hmap.put(45, "Roble");
		hmap.put(5, "Warfaa");
		hmap.put(65, "Faarax");
		
		//Get size
		System.out.println("The size of the hashmap is: " + hmap.size());
		
		/*
		 * Since we have 5 key-value pairs in HashMap, the size() method returned integer number 5.
		 * Also, in the above example we have taken Integer keys and String values, 
		 * however if you want to have String key and String value then you can change the generics like this:
		 * HashMap<String, String> hashmap = new HashMap<String, String>();
		 * Remember to add the pairs like this, If you have String keys and values.
			map.put("11", "Value1");
		 * */

	}

}

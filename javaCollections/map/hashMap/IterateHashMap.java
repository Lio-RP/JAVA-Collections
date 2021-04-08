package javaCollections.map.hashMap;

import java.util.*;

public class IterateHashMap {

	/**
	 * This program demonstrates how iterate hashMap
	 * to iterate we are usign the following:
	 * 1 for loop
	 * 2 while loop + iterator
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
		
		/* Iterate Using For Loop*/
		System.out.println("Iterate Using for loop");
		for(Map.Entry me : hmap.entrySet())
			System.out.println("Key is: " + me.getKey() + " & Value is: " + me.getValue());
		System.out.println();
		
		
		/* Iterate USING wHILE lOOP + iTERATOR */
		System.out.println("Iterate Using while loop + iterator");
		
		// Getting a Set of Key-value pairs
		Set set = hmap.entrySet();
		
		// Obtaining an iterator for the entry set
		Iterator iter = set.iterator();
		
		// Iterate through HashMap entries(Key-Value pairs)
		while(iter.hasNext())
		{
			Map.Entry mentry = (Map.Entry)iter.next();
			System.out.println("Key is: " + mentry.getKey() + " & Value is: " + mentry.getValue());
		}

	}

}

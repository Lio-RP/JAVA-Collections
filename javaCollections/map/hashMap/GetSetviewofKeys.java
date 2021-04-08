package javaCollections.map.hashMap;

import java.util.*;

public class GetSetviewofKeys {

	public static void main(String[] args) {
		
		/* Declare HashMap Object */
		HashMap<String, String> hmap = new HashMap<String, String>();
		
		//Add Elements
		hmap.put("key1", "Liban");
		hmap.put("key2", "abdullahi");
		hmap.put("key3", "mohamed");
		hmap.put("key4", "Roble");
		hmap.put("key5", "Warfaa");
		hmap.put("key6", "Faarax");
		
		// Getting Set of HashMap keys
	    /* public Set<K> keySet(): Returns a Set view of the keys contained
	     * in this map. The set is backed by the map, so changes to the map 
	     * are reflected in the set, and vice-versa. 
	     */
		
		Set<String> keys = hmap.keySet();
		
		System.out.println("Set of Keys contains: ");
		 
	    /* If your HashMap has integer keys then specify the iterator like
	     * this: Iterator<Integer> it = keys.iterator();
	     */
		
		Iterator<String> iter = keys.iterator();
		// Displaying keys. Output will not be in any particular order
		while(iter.hasNext())
			System.out.println(iter.next());
		
		/*
		 * Note: The set of keys is backed up by original HashMap so 
		 * if you remove any key from the Set it would automatically be removed from the HashMap.
		 * */
		

	}

}

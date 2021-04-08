package javaCollections.map.hashMap;

import java.util.HashMap;

public class CheckParticularKey {

	/**
	 * this program Check if a particular key exists in HashMap
	 * public boolean containsKey(Object key): Returns true if this map contains a mapping for the specified key.
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
		
		//Check if particular key exist in the hashmap
		System.out.println("is 99 in the hashmap? " + hmap.containsKey(99));
		System.out.println("is 12 in the hashmap? " + hmap.containsKey(12));
	}

}

package javaCollections.map.hashMap;

import java.util.HashMap;

public class CheckParticularValue {

	/**
	 * this program Check if a particular key exists in HashMap
	 * public boolean containsValue(Object value): Returns true if this map maps one or more keys to the specified value.
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
		System.out.println("is Basro in the hashmap? " + hmap.containsValue("Basro"));
		System.out.println("is Liban in the hashmap? " + hmap.containsValue("Liban"));

	}

}

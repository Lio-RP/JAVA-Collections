package javaCollections.map.hashMap;

import java.util.*;

public class RemovingExample {

	/**
	 * In this example we are gonna see how to remove a specific mapping from HashMap 
	 * using the key value of Key-value pair. 
	 * public Value remove(Object key): 
	 * Removes the mapping for the specified key from this map if present and returns the Element value for that particular Key. 
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
		
		//Remove element from hashmap
		Object removedElement = hmap.remove(65);
		System.out.println("Element removed from the hashmap is: " + removedElement);
		
		System.out.println("HashmeLEMENTS: " + hmap);
		
		 // Removing all Mapping
		hmap.clear();
		System.out.println("HashmeLEMENTS: " + hmap);
	}

}

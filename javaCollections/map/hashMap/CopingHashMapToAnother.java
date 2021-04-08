package javaCollections.map.hashMap;

import java.util.*;

public class CopingHashMapToAnother {
	
	/**
	 * This program demonstrates how to copy one hashmap to another hashmape
	 * We will be using putAll() method of HashMap class to perform this operation. 
	 */
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
		
		//Declare another HashMap
		HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();
		
		//Adding elements
		hmap2.put(29, "Basro");
		hmap2.put(55, "Abdulle");
		hmap2.put(21, "Abuubaka");
		
		//copy hashmap hmap to hmap2
		hmap2.putAll(hmap);
		//Display the hashmap
		System.out.println("HashMap2 Contains: " + hmap2);

	}

}

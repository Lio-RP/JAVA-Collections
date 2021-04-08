package javaCollections.map.hashMap;

import java.util.HashMap;

public class heckingHashMap {

	public static void main(String[] args) {
		/* Declare HashMap Object */
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		//checking the hashp map if it empty or not
		System.out.println("is HashMape empty? " + hmap.isEmpty());
		
		//Add Elements
		hmap.put(12, "Liban");
		hmap.put(23, "Abdullahi");
		hmap.put(3, "Mohamed");
		hmap.put(45, "Roble");
		hmap.put(5, "Warfaa");
		hmap.put(65, "Faarax");
		
		//checking the hashp map if it empty or not
		System.out.println("is HashMape empty? " + hmap.isEmpty());

	}

}

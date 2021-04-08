package javaCollections.map.hashMap;

import java.util.*;

public class CloneHashMap {

	/**
	 * A program to clone a HashMap. We will be using following method of HashMap class to perform cloning.
	public Object clone(): Returns a shallow copy of this HashMap instance: the keys and values themselves are not cloned.
	 * @param args
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
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
		
		//Create another hashmap
		HashMap<String, String> hmap2 = new HashMap<String, String>();
		
		
		//Adding elements
		hmap2.put("key10", "Basro");
		hmap2.put("key11", "Abdulle");
		hmap2.put("key12", "Abuubaka");
		System.out.println(hmap2);
		// cloning first HashMap in the second one
		hmap2 = (HashMap)hmap.clone();
		
		System.out.println(hmap2);

	}

}

package javaCollections.set.hashSet;

import java.util.*;

public class HashSetToListOrArrayList {

	/**
	 * This program demonstrates how to convert hashset to list or arraylist
	 * 
	 */
	public static void main(String[] args) {
		
		// HashSet declaration
		HashSet<String> hashSet = new HashSet<String>();
		//Adding elements
		hashSet.add("Liban");
		hashSet.add("Abdullahi");
		hashSet.add("Item3");
		hashSet.add("Item4");
		hashSet.add("Item5");
		hashSet.add("Item6");
		
		//Display the hashset elements
		System.out.println("HashSet Elements: " + hashSet);
		
		 // Creating a List of HashSet elements
		List<String> list = new ArrayList<String>(hashSet);
		
		//Display the ArrayList Elements
		System.out.println("ArrayList Elements: " + list);

	}

}

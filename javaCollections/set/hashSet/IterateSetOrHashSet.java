package javaCollections.set.hashSet;

import java.util.*;

public class IterateSetOrHashSet {

	/**
	 * This Program demonstrates How to Iterate over a Set/HashSet
	 * 
	 * There are following two ways to iterate through HashSet:
		1) Using Iterator
		2) Without using Iterator
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
		
		//Display the hashset
		System.out.println(hashSet);
		
		//Iterate using Iterator class
		Iterator<String> iter = hashSet.iterator();
		System.out.println("Iterated HashSet using iterator:");
		while(iter.hasNext())
			System.out.println(iter.next());
		System.out.println();
		
		//Iterate without using iterator
		System.out.println("iterated HashSet without using iterator:");
		for(String temp:hashSet)
			System.out.println(temp);

	}

}

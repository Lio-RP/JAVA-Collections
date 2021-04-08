package javaCollections.set.hashSet;

import java.util.*;

public class HashSetToTreeSet {

	/**
	 * this program demonstrate how to convert hashset to tree set
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
	
	//Display the hashSet Elements
	System.out.println("HashSet Elements: " + hashSet);
	System.out.println();
	
	  // Creating a TreeSet of HashSet elements
	Set<String> tset = new TreeSet<String>(hashSet);
	
	//Display the treeset
	System.out.println("TreeSet Elements:");
	for(String temp: tset)
		System.out.println(temp);

	}

}

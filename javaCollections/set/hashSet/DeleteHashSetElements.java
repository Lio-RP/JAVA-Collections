package javaCollections.set.hashSet;

import java.util.*;

public class DeleteHashSetElements {

	/**
	 * This program demonstrates Delete all the elements from HashSet
	 * Here we are gonna see how to remove all the elements of HashSet in one go. 
	 * We can do so by calling clear() method of HashSet class.
	 * 
	 * public void clear(): It removes all the elements
	 * from HashSet. The set becomes empty after this method gets called.
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
				
				//Delete All elements from hashset
				hashSet.clear();
				
				//Dsiplaye the hashset
				System.out.println(hashSet);

	}

}

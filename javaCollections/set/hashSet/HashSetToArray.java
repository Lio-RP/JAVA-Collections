package javaCollections.set.hashSet;

import java.util.*;

public class HashSetToArray {

	/**
	 * This program demonstrates how to convert hashset to aray
	 * using hashset.toArray(array);
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
		
		//Convert HashSet to array
		String[] array = new String[hashSet.size()];
		hashSet.toArray(array);
		
		//Display the array elements
		System.out.println("Array Elements: ");
		for(String temp: array)
			System.out.println(temp);
			
			
		
		

	}

}

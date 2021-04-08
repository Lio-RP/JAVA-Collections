package javaCollections.set.hashSet;

import java.util.*;

public class HashSetExample {

	/**
	 * This program demonstrates how to creat HashSet
	 * This class is not synchronized. However it can be synchronized explicitly like this: 
	 * Set s = Collections.synchronizedSet(new HashSet(...));
	 * 
	 * Points to Note about HashSet:
	 * HashSet doesn’t maintain any order, the elements would be returned in any random order.
		HashSet doesn’t allow duplicates. If you try to add a duplicate element in HashSet, the old value would be overwritten.
		HashSet allows null values however if you insert more than one nulls it would still return only one null value.
		HashSet is non-synchronized.
		The iterator returned by this class is fail-fast which means iterator would throw ConcurrentModificationException if HashSet has been modified after creation of iterator, by any means except iterator’s own remove method.
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
		
		//Adding duplicate Elements
		hashSet.add("Liban");
		hashSet.add("Abdullahi");
		
		//Adding Null Elements
		hashSet.add(null);
		hashSet.add(null);
		
		//Dsiplay the HashSet Elements
		System.out.println("HashSet Elements");
		System.out.println(hashSet);
		
	}

}

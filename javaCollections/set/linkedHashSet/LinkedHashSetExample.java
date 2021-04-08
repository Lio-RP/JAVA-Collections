package javaCollections.set.linkedHashSet;

import java.util.*;

public class LinkedHashSetExample {

	/**
	 * this program demonstrates hot create LinkedHashSet Example
	 * LinkedHashSet is also an implementation of Set interface, 
	 * it is similar to the HashSet and TreeSet except the below mentioned differences:
	 * 
	 * 1 HashSet doesn’t maintain any kind of order of its elements.
	   2 TreeSet sorts the elements in ascending order.
	   3 LinkedHashSet maintains the insertion order. Elements gets sorted in the same sequence in which they have been added to the Set.
	 */
	public static void main(String[] args) {
		
		// LinkedHashSet of String Type
		LinkedHashSet<String> lhashSet = new LinkedHashSet<String>();
		
		//Add items
		lhashSet.add("Item1");
		lhashSet.add("Item2");
		lhashSet.add("Item3");
		lhashSet.add("Item4");
		lhashSet.add("Item5");
		lhashSet.add("Item6");
		
		//Display the LinkedHashSet Elements:
		System.out.println(lhashSet);
		

		//LinkedHashSet of Integer typw
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		
		//Adding elements
		linkedHashSet.add(100);
		linkedHashSet.add(25);
		linkedHashSet.add(34);
		linkedHashSet.add(12);
		linkedHashSet.add(5);
		linkedHashSet.add(2);
		
		//Display the elements
		System.out.println(linkedHashSet);
		

	}

}

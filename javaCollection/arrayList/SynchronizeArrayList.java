package javaCollection.arrayList;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizeArrayList
{
	/**
	 * This program demonstrates How to synchronize ArrayList in java with example
	 * There are two ways to synchronize explicitly:
	 * Using Collections.synchronizedList() method
	 * Using thread-safe variant of ArrayList: CopyOnWriteArrayList
	 * 
	 * Method 1: Collections.synchronizedList() method for Synchronizing ArrayList
	 * Method 2: Using CopyOnWriteArrayList
	 * CopyOnWriteArrayList is a thread-safe variant of ArrayList.
	 */

	public static void main(String[] args)
	{
		System.out.println("Method 1: Collections.synchronizedList() method for Synchronizing ArrayList");
		/*
		 * In this example we are using Collections.synchronizedList() method.
		 * The important point to note here is that iterator should be in synchronized block 
		 * in this type of synchronization
		 * */
		List<String> syncal = Collections.synchronizedList(new ArrayList<String>());
		
		//Adding elements to synchronized ArrayList
		syncal.add("liban");
		syncal.add("Cabdullahi");
		syncal.add("Mohamed");
		
		System.out.println("Iterating synchronized ArrayList:");
		synchronized(syncal) {
			Iterator<String> iterator = syncal.iterator();
			while(iterator.hasNext())
				System.out.println(iterator.next());
		}
		System.out.println();
		//Method 2: Using CopyOnWriteArrayList
		System.out.println("Method 2: Using CopyOnWriteArrayList");
		CopyOnWriteArrayList<String> list = new  CopyOnWriteArrayList<String>();
		
		//Adding Elements
		list.add("liban");
		list.add("Cabdullahi");
		list.add("Mohamed");
		list.add("Roble");
		
		System.out.println("Iterating synchronized ArrayList:");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		

	}

}

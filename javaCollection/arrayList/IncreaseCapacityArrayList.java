package javaCollection.arrayList;

import java.util.*;

public class IncreaseCapacityArrayList
{
	/**
	 * This program demonstrates Java ArrayList ensureCapacity() Method example
	 *ArrayList internally implements growable dynamic array which means it can increase and decrease its size automatically.
	 *If we try to add an element to a already full ArrayList then it automatically re-sized internally 
	 *to accommodate the new element however sometimes its not a good approach.
	 *
	 *Consider a scenario when there is a need to add huge number of elements to an already full ArrayList, 
	 *in such case ArrayList has to be resized several number of times which would result in a poor performance.
	 *For such scenarios ensureCapacity() method of Java.util.ArrayList class is very useful as it increases 
	 *the size of the ArrayList by a specified capacity.
	 *
	 *SIGNATURE:
	 *public void ensureCapacity(int minCapacity)
	 */

	public static void main(String[] args)
	{
		// ArrayList with Capacity 4
		ArrayList<String> list1 = new ArrayList<String>(4);
		
		
		 //Adding elements to the ArrayList
		list1.add("Liban Abdullahi");
		list1.add("Basro Abdulle");
		list1.add("Liban Roble");
		list1.add("Mohamed Hazzan");
		list1.add("Cllahi Cali");
		System.out.println("The size of the Arralist: " + list1.size());
		
		//Increase capacity to 5
		list1.ensureCapacity(5);
		list1.add("Mohamed Roble");
		System.out.println("The size of the Arralist: " + list1.size());
		for(String list: list1)
			System.out.println(list);
	}

}

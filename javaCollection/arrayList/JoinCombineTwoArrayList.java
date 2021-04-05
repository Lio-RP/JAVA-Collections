package javaCollection.arrayList;

import java.util.ArrayList;

public class JoinCombineTwoArrayList
{
	/**
	 * This Program Demonstrates How to join/combine two ArrayLists in java
	 *
	 */
	public static void main(String[] args)
	{
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Liban Abdullahi");
		list1.add("Basro Abdulle");
		list1.add("Liban Roble");
		list1.add("Mohamed Hazzan");
		list1.add("Cllahi Cali");
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("Liban Abdullahi");
		list2.add("Basro Abdulle");
		list2.add("Liban Roble");
		list2.add("Mohamed Hazzan");
		list2.add("Cllahi Cali");
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.addAll(list1);
		list3.addAll(list2);
		
		for(String list : list3)
			System.out.println(list);
	}

}

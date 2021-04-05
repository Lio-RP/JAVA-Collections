package javaCollection.linkedList;

import java.util.LinkedList;

public class CkeckParticularElement
{
	/**
	 * This Program demonstrates Check if a particular element exists in LinkedList example
	 * SIGNATURE:
	 * public boolean contains(Object o)
	 * Returns true if this list contains the specified element.
	 * More formally, returns true if and only if this list contains at least one element e such that (o==null ? e==null : o.equals(e)).
	 */
	
	public static void main(String[] args)
	{
		LinkedList<String> list = new LinkedList<String>();
		
		//Adding elements:
		list.add("liban");
		list.add("Basro");
		list.add("Leylo");
		list.add("Abdullahi");
		list.add("Suheylo");
		list.add("liban");
		list.add("liban");
		list.add("Zamiin");
		list.add("Basro");
		list.add("Mohamed");
		list.add("Basro");
		
		// contains() method checks whether the element exists
		if(list.contains("Zamiin"))
		{
			System.out.println("Element zAMIIN is present in List");
		}
		else
		{
			System.out.println("Element zAMIIN is not present in List");
		}
		
		
	}

}

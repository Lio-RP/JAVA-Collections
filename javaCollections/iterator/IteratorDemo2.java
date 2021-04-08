package javaCollections.iterator;

import java.util.*;

public class IteratorDemo2
{
	/**
	 * This program demonstrates how to itorate alist with generic type
	 * @author ENG: roble
	 */

	public static void main(String[] args)
	{ArrayList<String> arrayList = new ArrayList<String>();
		
		//Add Elements 
		arrayList.add("Item1");
		arrayList.add("Item2");
		arrayList.add("Item3");
		arrayList.add("Item4");
		arrayList.add("Item5");
		arrayList.add("Item6");
		arrayList.add("Item7");
		
		//Iterate
		Iterator<String> iter = arrayList.iterator();
		while(iter.hasNext())
		{
			String obj = iter.next(); //We did not type cast iterator returned value[it.next()] as it is not required when using Generics.
			System.out.println(obj);
		}

	}

}

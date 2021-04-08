package javaCollections.iterator;

import java.util.*;

public class IteratorDemo1
{
	/**
	 * This prgram demonstrates how to iterate or loop alist without generic types
	 * @author ENG:Roble
	 * 
	 * Iterator is used for iterating (looping) various collection classes such as HashMap, ArrayList, LinkedList etc.
	 * Iterator took place of Enumeration, which was used to iterate legacy classes such as Vector.
	 * We can use Iterator to traverse List and Set both
	 * 
	 */

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args)
	{
		ArrayList arrayList = new ArrayList();
		
		//Add Elements 
		arrayList.add("Item1");
		arrayList.add("Item2");
		arrayList.add("Item3");
		arrayList.add("Item4");
		arrayList.add("Item5");
		arrayList.add("Item6");
		arrayList.add("Item7");
		
		//Iterate
		Iterator iter = arrayList.iterator();
		while(iter.hasNext())
		{
			String obj = (String)iter.next(); //We typed cast iterator returned value[it.next()] coz we are iterating without generic type.
			System.out.println(obj);
		}
		
		/*
		 * In the above example we have iterated ArrayList without using Generics.
		 * Program ran fine without any issues, however there may be a possibility of ClassCastException if you don’t use Generics (
		 */
	}

}

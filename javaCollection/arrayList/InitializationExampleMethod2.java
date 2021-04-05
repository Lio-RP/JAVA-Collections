package javaCollection.arrayList;

import java.util.*;

public class InitializationExampleMethod2
{
	/**
	 * This Program demonstrates Array list initialization
	 * Method 2: Anonymous inner class method to initialize ArrayList
	 * Syntax1:
	 * 	ArrayList<T> obj = new ArrayList<T>(){{
		   add(Object o1);
		   add(Object o2);
		   add(Object o3);
                   ...
                   ...
		   }};
	 * Syntax2:
	 * 	ArrayList<String> listnames = new ArrayList<String>(){
			private static final long serialVersionUID = 1L;

		{
			add("liban");
			add("basro");
			add("suheylo");
			add("mohamed");
		}};
	 */

	@SuppressWarnings("serial")
	public static void main(String[] args)
	{
		ArrayList<String> listnames = new ArrayList<String>(){{
			add("liban");
			add("basro");
			add("suheylo");
			add("mohamed");
		}};
		
		//Display the list
		System.out.println(listnames);
	}

}

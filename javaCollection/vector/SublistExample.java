package javaCollection.vector;

import java.util.*;

public class SublistExample {
	
	/**
	 * This program demonstrates How to get sub list of Vector example 
	 *SIGNATURE:
	 *public List subList(int fromIndex, int toIndex): 
	 */
	public static void main(String[] args)
	{
		Vector<String> vect = new Vector<String>();
		
		//Add Elements
		vect.addElement("liban");
		vect.addElement("Basro");
		vect.addElement("Suheylo");
		vect.addElement("Zamiin");
		
		/* The method subList(int fromIndex, int toIndex) 
	     * returns a List having elements of Vector 
	     * starting from index fromIndex 
	     * to (toIndex - 1).
	     */
		List<String> sublist = vect.subList(0, 2);
		
		Iterator<String> iter = sublist.iterator();
		
		while(iter.hasNext())
			System.out.println(iter.next());
	}

}

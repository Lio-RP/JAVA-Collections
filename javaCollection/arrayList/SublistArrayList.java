package javaCollection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class SublistArrayList
{
	/**
	 * This program demonstrates How to get sublist of an ArrayList with.
	 * List subList(int fromIndex, int toIndex)
	 * Here fromIndex is inclusive and toIndex is exclusive. 
	 * The subList method returns a list therefore to store the sublist in another ArrayList 
	 * we must need to type cast the returned value.
	 * On the other side if we are storing the returned sublist into a list 
	 * then there is no need to type cast
	 * 
	 * NOTE:
	 * The subList method throws IndexOutOfBoundsException – 
	 * if the specified indexes are out of the range of ArrayList (fromIndex < 0 || toIndex > size).
	 * IllegalArgumentException – if the starting index is greater than the end point index (fromIndex > toIndex).
	 * 
	 */

	public static void main(String[] args)
	{
		ArrayList<String> alist = new ArrayList<String>();
		
		//Adding Elements to our list
		alist.add("Liban");
		alist.add("mohamed");
		alist.add("abdullahi");
		alist.add("Basro");
		alist.add("Suhelyo");
		
	     System.out.println("Original ArrayList Content: "+alist);
	     
	     //Sublist to ArrayList
	     ArrayList<String> names = new ArrayList<String>(alist.subList(1, 3));
	     System.out.println("Sublist to ArrayList: " + names);
	     
	     //sublist to list
	     List<String> name = alist.subList(1, 3);
	     System.out.println("Sublist To List: " + name);
	}

}

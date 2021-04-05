package javaCollection.arrayList;

import java.util.*;

public class EmotyArrayList
{
	/**
	 * This Method demonstrates How to empty an ArrayList in Java
	 * There are two ways to empty an ArrayList – By using ArrayList.clear() method 
	 * or with the help of ArrayList.removeAll() method. 
	 * Although both methods do the same task the way they empty the List is quite different.
	 */
	public static void main(String[] args)
	{
		ArrayList<String> list1 = new ArrayList<String>();
		
		 //Adding elements to the ArrayList
		list1.add("Liban Abdullahi");
		list1.add("Basro Abdulle");
		list1.add("Liban Roble");
		list1.add("Mohamed Hazzan");
		list1.add("Cllahi Cali");
		
		System.out.println("ArrayList Before removing it: " + list1);
		list1.clear();
		System.out.println("ArrayList After removing it: " + list1);
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		 //Adding elements to the ArrayList
		list2.add("Liban Abdullahi");
		list2.add("Basro Abdulle");
		list2.add("Liban Roble");
		list2.add("Mohamed Hazzan");
		list2.add("Cllahi Cali");
		
		System.out.println("ArrayList Before removing it: " + list2);
		list2.removeAll(list2);
		System.out.println("ArrayList After removing it: " + list2);
	}
	
	/**
	 * As you can both the methods did the same job, they emptied the ArrayList. 
	 * It’s time to determine which method gives good performance.
	 * The actual code of clear() method:
	 * public void clear() {
		    for (int i = 0; i < size; i++)
		        arraylist[i] = null;
		
		    size = 0;
		    } Here arraylist is an instance of ArrayList class
		    
	 * Code of removeAll() method:
	 * public boolean removeAll(Collection c) {
		    boolean ismodified = false;
		    Iterator iterator = iterator();
		    while (iterator.hasNext()) {
		        if (c.contains(iterator.next())) {
		            iterator.remove();
		            ismodified = true;
		        }
		    }
		    return ismodified;
		}
		
		*By seeing the code of both the methods we can very well say that clear() method 
		*gives better performance compared to the removeAll() method.
		*Performance of clear: O(n)
		Performance of removeAll: O(n^2)
	*/

}

package javaCollections.map.hashMap;

import java.util.*;

public class SortingByValues {

	/**
	 * This program demonstrates how to sort hashmap by values
	 * 
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		/* Declare HashMap Object */
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		//Add Elements
		hmap.put(12, "Liban");
		hmap.put(23, "Abdullahi");
		hmap.put(3, "Mohamed");
		hmap.put(45, "Roble");
		hmap.put(5, "Warfaa");
		hmap.put(65, "Faarax");
		
		//Display befor sorting the hashmap
		System.out.println("------Before Sorting----");
		Iterator iter = hmap.entrySet().iterator();
		while(iter.hasNext())
			{
				Map.Entry mab = (Map.Entry)iter.next();
				System.out.println("Key is: " + mab.getKey() + " & Value is: " + mab.getValue());
					
			}
		System.out.println();
		
		Map<Integer, String> map = sortByValues(hmap);
		Iterator iterator = map.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry me = (Map.Entry)iterator.next();
			System.out.println("Key is: " + me.getKey() + " & Value is: " + me.getValue());
		}

	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static HashMap sortByValues(HashMap map) { 
	       List list = new LinkedList(map.entrySet());
	       // Defined Custom Comparator here
	       Collections.sort(list, new Comparator() {
	            public int compare(Object o1, Object o2) {
	               return ((Comparable) ((Map.Entry) (o1)).getValue())
	                  .compareTo(((Map.Entry) (o2)).getValue());
	            }
	       });

	       // Here I am copying the sorted list in HashMap
	       // using LinkedHashMap to preserve the insertion order
	       HashMap sortedHashMap = new LinkedHashMap();
	       for (Iterator it = list.iterator(); it.hasNext();) {
	              Map.Entry entry = (Map.Entry) it.next();
	              sortedHashMap.put(entry.getKey(), entry.getValue());
	       } 
	       return sortedHashMap;
	  }

}


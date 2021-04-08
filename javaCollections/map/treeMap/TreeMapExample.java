package javaCollections.map.treeMap;

import java.util.*;

public class TreeMapExample {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		/* Declare alinkedhashmap object*/
		TreeMap<Integer, String> treehmap = new TreeMap<Integer, String>();
		
		//Adding Elements
		treehmap.put(11, "Liban");
		treehmap.put(25, "abdullahi");
		treehmap.put(3, "mohamed");
		treehmap.put(42, "Roble");
		treehmap.put(54, "Warfaa");
		treehmap.put(6, "Faarax");
		
        // Generating a Set of entries
		Set set = treehmap.entrySet();
		
		  // Displaying elements of LinkedHashMap
		Iterator iter = set.iterator();
		while(iter.hasNext())
		{
			Map.Entry map = (Map.Entry)iter.next();
			System.out.println("Key is: " + map.getKey() + " & Value is: " + map.getValue());
		}


	}

}

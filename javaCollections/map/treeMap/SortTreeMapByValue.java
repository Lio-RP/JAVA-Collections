package javaCollections.map.treeMap;

import java.util.*;

public class SortTreeMapByValue {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		/* Declare alinkedhashmap object*/
		TreeMap<String, String> treehmap = new TreeMap<String, String>();
		
		//Adding Elements
		treehmap.put("Key1", "Liban");
		treehmap.put("Key2", "Abdullahi");
		treehmap.put("Key3", "Mohamed");
		treehmap.put("Key4", "Roble");
		treehmap.put("Key5", "Warfaa");
		treehmap.put("Key6", "Faarax");
		
		// Calling the method sortByvalues
		Map sortedMap = sortByValues(treehmap);
		
		 // Get a set of the entries on the sorted map
		Set set = sortedMap.entrySet();
		
		
		// Get an iterator
		Iterator iter = set.iterator();
		
		//dISPLAY eLEMENTS
		while(iter.hasNext())
		{
			Map.Entry map = (Map.Entry)iter.next();
			System.out.println(map.getKey() + ": " + map.getValue());
		}
	}
	
	public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map)
	{
		Comparator<K> valueComparator = new Comparator<K>()
				{
					public int compare(K k1, K k2)
					{
						int compare = map.get(k1).compareTo(map.get(k2));
						if (compare == 0)
							return 1;
						else
							return compare;
					}
				};
				
				Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
				sortedByValues.putAll(map);
				return sortedByValues;
	}
	

}

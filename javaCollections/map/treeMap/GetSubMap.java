package javaCollections.map.treeMap;

import java.util.*;

public class GetSubMap {

	public static void main(String[] args) {
		

		TreeMap<String, String> tremap = new TreeMap<String, String>();
		
		//Add Elements
		tremap.put("Key1", "Item1");
		tremap.put("Key2", "Item2");
		tremap.put("Key3", "Item3");
		tremap.put("Key4", "Item4");
		tremap.put("Key5", "Item5");
		tremap.put("Key6", "Item6");
		
		// Displaying TreeMap elements
	    System.out.println("TreeMap Contains : " + tremap);
	 
	    // Getting the sub map
	    /* public SortedMap<K,V> subMap(K fromKey,K toKey): Returns 
	     * a view of the portion of this map whose keys range from 
	     * fromKey, inclusive, to toKey, exclusive. 
	     * (If fromKey and toKey are equal, the returned map is empty.) 
	     * The returned map is backed by this map, so changes in the 
	     * returned map are reflected in this map, and vice-versa. 
	     * The returned map supports all optional map operations that 
	     * this map supports.
	     */
	    
	    SortedMap<String, String> sortedMap = tremap.subMap("Key2", "Key6");
	    System.out.println("SubMap Contains: " + sortedMap);
	    
	    //Removing element fromn submap
	    sortedMap.remove("Key5");
	    
	    System.out.println("TreeMap Contains : " + tremap);
	    

	}

}

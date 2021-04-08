package javaCollections.map.treeMap;

import java.util.TreeMap;

public class RemoveKeyValueMaping {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		

		TreeMap<String, String> tremap = new TreeMap<String, String>();
		
		//Add Elements
		tremap.put("Key1", "Item1");
		tremap.put("Key2", "Item2");
		tremap.put("Key3", "Item3");
		tremap.put("Key4", "Item4");
		tremap.put("Key5", "Item5");
		tremap.put("Key6", "Item6");
		
		// Get the size of three map elements
	    System.out.println("TreeMap Contains Before removing element: " + tremap);
	    
	    //Remove element
	    Object removedValue = tremap.remove("Key6");
	    System.out.println("TreeMap Contains After removing element : " + tremap);
	    
	    //Remove all mappings from TreeMap
	    // Make TreeMap empty
	    /* public void clear(): It removes all of the mappings from 
	     * this map. The map will be empty after this call returns.
	     */
	    
	    tremap.clear();
	    System.out.println("TreeMap Contains After clearing elements : " + tremap);

	}

}

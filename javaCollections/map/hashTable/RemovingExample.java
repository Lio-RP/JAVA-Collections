package javaCollections.map.hashTable;

import java.util.*;

public class RemovingExample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// Creating a Hashtable
		Hashtable<String, String> hashTable = new Hashtable<String, String>();
								
						/* Adding key-value pairs to Hashtable
					     * public V put(K key, V value): Maps the specified key to the 
					     * specified value in this hashtable. Neither the key nor the 
					     * value can be null. The value can be retrieved by calling the 
					     * get method with a key that is equal to the original key.
					     */
						//Adding Elements
		hashTable.put("Key1", "Liban");
		hashTable.put("Key2", "Abdullahi");
		hashTable.put("Key3", "Mohamed");
		hashTable.put("Key6", "Roble");
		hashTable.put("Key5", "Warfaa");
		hashTable.put("Key4", "Faarax");
		
		
		//Before remove
	    System.out.println("Hashtable contains:" + hashTable);
	 
	    // Removing key-value pairs for key 44
	    Object removedValue = hashTable.remove("Key4");
	 
	    //After remove
	    System.out.println("After remove:");
	    System.out.println("Hashtable Key-value pairs: " + hashTable);
	    
	    //Remove all mappings from Hashtable
	    hashTable.clear();
	    System.out.println("Hashtable Key-value pairs: " + hashTable);

	}

}

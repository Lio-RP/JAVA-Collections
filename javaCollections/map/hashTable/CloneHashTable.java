package javaCollections.map.hashTable;

import java.util.*;

public class CloneHashTable {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// Creating a Hashtable
		Hashtable<String, String> hashTable = new Hashtable<String, String>();
										
		hashTable.put("Key1", "Liban");
		hashTable.put("Key2", "Abdullahi");
		hashTable.put("Key3", "Mohamed");
		hashTable.put("Key6", "Roble");
		hashTable.put("Key5", "Warfaa");
		hashTable.put("Key4", "Faarax");
		
		//Declare another hastable
		Hashtable<String, String> hashTable2 = new Hashtable<String, String>();
		
		//Clone hashtable to hashTable2
		hashTable2 = (Hashtable)hashTable.clone();
		System.out.println("Hashtable2 contains:" + hashTable2);

	}

}

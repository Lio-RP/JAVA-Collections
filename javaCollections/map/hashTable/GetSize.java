package javaCollections.map.hashTable;

import java.util.Hashtable;

public class GetSize {

	public static void main(String[] args) {
		
		// Creating a Hashtable
		Hashtable<String, String> hashTable = new Hashtable<String, String>();
										
		hashTable.put("Key1", "Liban");
		hashTable.put("Key2", "Abdullahi");
		hashTable.put("Key3", "Mohamed");
		hashTable.put("Key6", "Roble");
		hashTable.put("Key5", "Warfaa");
		hashTable.put("Key4", "Faarax");
		
		//get the size of hashtable
		System.out.println("The Size of HashTable: " + hashTable.size());

	}

}

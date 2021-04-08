package javaCollections.map.hashMap;

import java.util.*;
import java.io.*;

public class DeSerializationHashMap {

	/**
	 * This program demonstrates how to Deserialize hashmap
	 *De-Serialization: It is a process of reading the Object and it’s properties from a file along with the Object’s content.
	 *
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = null;
		
		try {
			FileInputStream fi = new FileInputStream("hashmap.ser");
			ObjectInputStream ois = new ObjectInputStream(fi);
			map = (HashMap)ois.readObject();
			fi.close();
			ois.close();
		}catch(IOException ioe) {
			ioe.printStackTrace();
			return;
		}catch(ClassNotFoundException c) {
			c.printStackTrace();
			return;
		}
		
		System.out.println("-----Deserialized HashMap.....");
	      // Display content using Iterator
		for(Iterator iter = map.entrySet().iterator(); iter.hasNext();)
		{
			Map.Entry me = (Map.Entry)iter.next();
			System.out.println("Key is: " + me.getKey() + " & Value is: " + me.getValue());
		}

	}

}

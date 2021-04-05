package javaCollection.arrayList;

import java.util.ArrayList;
import java.io.*;

public class SerializeArrayList
{
	/**
	 * This program demonstrates  How to serialize ArrayList in java
	 * ArrayList is serializable by default. 
	 * Serialization: Run the below class and it will create a file myfile 
	 * which will be having ArrayList object in form of Stream of bytes. 
	 * We would be using “myfile” at the receivers end to recreate the Object from stream of bytes. 
	 * Note: We did not implemented the Serializable interface in the below class 
	 * because ArrayList is already been serialized by default.
	 */
	public static void main(String[] args)
	{
		ArrayList<String> em = new ArrayList<String>();
		
		//Adding employee in the list
		em.add("Liban Abdullahi");
		em.add("Basro Abdulle");
		em.add("Liban Roble");
		em.add("Mohamed Hazzan");
		em.add("Cllahi Cali");
		
		try {
			FileOutputStream fos = new FileOutputStream("myfile");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(em);
			oos.close();
			fos.close();
		}catch(IOException io)
		{
			io.printStackTrace();
		}
		

	}

}

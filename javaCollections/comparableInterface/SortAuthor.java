package javaCollections.comparableInterface;

import java.util.*;

public class SortAuthor {

	public static void main(String[] args) {
		
		ArrayList<Author> au = new ArrayList<Author>();
		
		//Add Elements
		au.add(new Author(103, "Mohamed", "Liban", "Java"));
		au.add(new Author(101, "Abuubakar", "Basro", "Financial Analize"));
		au.add(new Author(104, "Abuubakar", "Ayaan", "Bublic Health"));
		au.add(new Author(102, "Daahir", "Mohamed", "Computyer Science"));
		
		//Sort
		Collections.sort(au);
		
		//Display
		Iterator<Author> iter = au.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());

	}

}

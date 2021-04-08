package javaCollections.comparatorInterface;

import java.util.*;

public class MainClass {

	public static void main(String[] args)
	{
		ArrayList<Author> au = new ArrayList<Author>();
		
		//Add Elements
		au.add(new Author(103, "Mohamed", "Liban", "Java"));
		au.add(new Author(101, "Abuubakar", "Basro", "Financial Analize"));
		au.add(new Author(104, "Abuubakar", "Ayaan", "Bublic Health"));
		au.add(new Author(102, "Daahir", "Mohamed", "Computyer Science"));
		
		//Sort By Name
		Collections.sort(au);
		
		//Display the content
		System.out.println("Sorted Author Info By name:");
		Iterator<Author> iter = au.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		System.out.println();
		
		//Sort By AuthorID
		Collections.sort(au, new AuthorIDComparator());
		
		//Display the content
		System.out.println("Srted Author Info By ID: \n");
		System.out.println("ID" + "\t    Name" + " \t   Book");
		for(Author author : au)
			System.out.println(author.getAUTHORID() + "   \t" + author.getFullName() + "\t" + author.getBookName());
		System.out.println();
		
		//Sort By Book
		Collections.sort(au, new AuthorBookComparator());
		//Display the content
		System.out.println("Srted Author Info By Book: \n");
		System.out.println("ID" + "\t    Name" + " \t  Book");
		for(Author author : au)
			System.out.println(author.getAUTHORID() + "   \t" + author.getFullName() + "\t" + author.getBookName());
	}

}

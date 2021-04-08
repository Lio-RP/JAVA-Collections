package javaCollections.comparableInterface;

public class Author implements Comparable<Author>
{
	private int authorID;
	private String firstName;
	private String lastName;
	private String bookName;
	
	//Constructor
	public Author(int authorID, String lastName, String firstName, String bookName)
	{
		this.authorID = authorID;
		this.lastName = lastName;
		this.firstName = firstName;
		this.bookName = bookName;
	}
	
	//Geter and Seter
	public int getAUTHORID()
	{
		return authorID;
	}
	public String getFullName()
	{
		return firstName + " " + lastName;
	}
	public String getBookName()
	{
		return bookName;
	}
	/*
	@Override
	public int compareTo(Author obj)
	{
		//Sort by lastname
		int sortlast = this.lastName.compareTo(obj.lastName);
		return sortlast == 0 ? this.firstName.compareTo(obj.firstName) : sortlast;
	}
	*/
	
	@Override
	public int compareTo(Author obj)
	{
		//sort by ID
		if (this.authorID == obj.authorID)
			return 0;
		else if (this.authorID > obj.authorID)
			return 1;
		else
			return -1;
		
		/* return this.authorID == obj.authorID ? 0: this.authorID > obj.authorID ? 1 : -1*/
	}

	
	@Override
	public String toString()
	{
		return "[authorID=" + authorID + ", Last_Name=" + lastName + ", First Name=" + firstName + ", Book=" + bookName + "]";
	}

}

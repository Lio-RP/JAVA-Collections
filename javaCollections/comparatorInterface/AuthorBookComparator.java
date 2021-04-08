package javaCollections.comparatorInterface;

import java.util.*;

public class AuthorBookComparator implements Comparator<Author>
{
	//Compare to Author Books
	@Override
	public int compare(Author au1, Author au2)
	{
		return au1.getBookName().compareTo(au2.getBookName());
	}
	
}

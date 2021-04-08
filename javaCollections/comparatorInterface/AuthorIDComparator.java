package javaCollections.comparatorInterface;

import java.util.*;

public class AuthorIDComparator implements Comparator<Author>
{
	//Compare by Author ID
	@Override
	public int compare(Author au1, Author au2)
	{
		return au1.getAUTHORID()-au2.getAUTHORID();
	}

}

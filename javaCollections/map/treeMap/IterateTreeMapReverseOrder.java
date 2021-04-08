package javaCollections.map.treeMap;

import java.util.*;

public class IterateTreeMapReverseOrder {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		Map<String, String> tremap = new TreeMap<String, String>(Collections.reverseOrder());
		
		//Add Elements
		tremap.put("Key1", "Item1");
		tremap.put("Key2", "Item2");
		tremap.put("Key3", "Item3");
		tremap.put("Key4", "Item4");
		tremap.put("Key5", "Item5");
		tremap.put("Key6", "Item6");
		
		Set set = tremap.entrySet();
		
		Iterator iter = set.iterator();
		while(iter.hasNext())
		{
			Map.Entry map = (Map.Entry)iter.next();
			System.out.println(map.getKey() + ": " + map.getValue());
		}

	}

}

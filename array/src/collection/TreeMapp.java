package collection;

import java.util.TreeMap;

public class TreeMapp {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put( 20000,"Navaj");
		map.put( 14000,"Komal");
		map.put(17500,"Shivani");
		map.put(19000,"Rohan");
		map.put(18000,"John");
		
		System.out.println(map);
		System.out.println(map.tailMap(19000));
		System.out.println(map.tailMap(19000).keySet());
		System.out.println(map.headMap(19000));
		
		
	}
}

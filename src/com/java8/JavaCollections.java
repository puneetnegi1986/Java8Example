package com.java8;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class JavaCollections {
	
	public static void main(String arr[]){
		
		NavigableSet<String> set=new TreeSet<>();		
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("k");
		set.add("e");
		set.add("z");
		System.out.println(set.subSet("b", "z"));
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());	
		
		Map<String,Integer> map=new HashMap<>();
		
		map.put("puneet", 64276);
		map.put("Dheerendra", 64999);
		map.put("Deepak", 64244);
		map.put("HanshRaj", 45678);
		map.put("Yogesh", 64273);
		
		/** 
		 * Sorting Map by Values
		 */
	    LinkedHashMap<String,Integer> map1=map.entrySet()
	              .stream()
	              .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
	              .collect(Collectors.toMap(
	                Map.Entry::getKey, 
	                Map.Entry::getValue, 
	                (e1, e2) -> e1, 
	                LinkedHashMap::new
	              ));
		map1.entrySet().forEach(e -> System.out.println("Keys " + e.getValue() + " Value.." + e.getKey()));
	}

}

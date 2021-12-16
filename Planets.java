package com.xworkz.mapping;

import java.util.Map;
import java.util.*;

public class Planets {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
	
	
	map.put("Earth",1);
	map.put("Mars",2);
	map.put("Saturn",82);
	map.put("Jupiter",79);
	map.put("Neptune",14);
	
	System.out.println(map.size());
	Integer value=map.get("Venus");
	System.out.println(value);
	
	
	boolean contains=map.containsKey("Jupiter");
	System.out.println(contains);
	
	contains=map.containsValue(1);
	System.out.println(contains);
	
	Set<String> keys=map.keySet();
	
	keys.forEach((e)->{
	 System.out.println(e);	
	});
	
}
}
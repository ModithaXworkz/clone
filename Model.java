package com.xworkz.mapping;

import java.util.Map;
import java.util.*;

public class Model{
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
	
	
	map.put("Dell XPS",13);
	map.put("Lenova ThinkPad X",12);
	map.put("HP Envy",15);
	map.put("Toshiba",14);
	map.put("MacBook Pro",13);
	map.put("Dell XPS",12);
	
	System.out.println(map.size());
	Integer value=map.get("MacBook Pro");
	System.out.println(value);
	
	
	boolean contains=map.containsKey("Samsung");
	System.out.println(contains);
	
	contains=map.containsValue(12);
	System.out.println(contains);
	
	Set<String> keys=map.keySet();
	
	keys.forEach((e)->{
	 System.out.println(e);	
	});
	
}
}
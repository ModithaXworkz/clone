package com.xworkz.mapping;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Aadhar {
	public static void main(String[] args) {
		Map<String,Long> map=new HashMap<String,Long>();
	
	
	
	map.put("Shilpa",245123467L);
	map.put("Moditha",322987601L);
	map.put("Shwetha",1365931502L);
	map.put("Sowmya",5487960247L);
	map.put("Sushma",8619100484L);
	map.put("Shruthi",4044862535L);
	map.put("Suma",2726540936L);
	map.put("Supritha",3976805319L);
	
	System.out.println(map.size());
	Long value=map.get("Shilpa");
	System.out.println(value);
	
	
	boolean contains=map.containsKey("Moditha");
	System.out.println(contains);
	
	contains=map.containsValue(1365931502L);
	System.out.println(contains);
	
	Set<String> keys=map.keySet();
	
	keys.forEach((e)->{
	 System.out.println(e);	
	 
	});
	
}
}
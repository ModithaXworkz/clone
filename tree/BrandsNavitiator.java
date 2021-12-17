package com.xworkz.tree;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class BrandsNavitiator {

	public static void main(String[] args) {
		
		Map<String, Integer>  barMap = new HashMap<String, Integer>();
		barMap.put("Wish You Were Beer", 185);
		barMap.put("The Meeting Palace", 95);
		barMap.put("Modi's Resto Bar", 120);
		barMap.put("CockTail Village", 60);
		barMap.put("Cheers & Beers", 404);
		barMap.put("White Hart", 309);
		barMap.put("Royal Oak",416);
		
		Set<String> set =  barMap.keySet();
		set.forEach((e)->System.out.println(e));
		System.out.println("\n");
		Collection<Integer> collection =  barMap.values();
		collection.forEach((e)->System.out.println(e));
		System.out.println("\n");
		Set<Map.Entry<String, Integer>> entries = barMap.entrySet();
		Iterator<Entry<String, Integer>> iterator = entries.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println("\n");
		System.out.println("After Asending");
		System.out.println("=============================================================");
		
		Map<String, Integer>  barMa = new TreeMap<String, Integer>((e,e1)->e.compareTo(e1));
		barMap.put("Wish You Were Beer", 185);
		barMap.put("The Meeting Palace", 95);
		barMap.put("Modi's Resto Bar", 120);
		barMap.put("CockTail Village", 60);
		barMap.put("Cheers & Beers", 404);
		barMap.put("White Hart", 309);
		barMap.put("Royal Oak",416);
		
		
		Set<String> set2 = barMa.keySet();
		set2.forEach((e)->System.out.println(e));
		System.out.println("\n");
		Collection<Integer> collection2 = barMa.values();
		collection2.forEach((e)->System.out.println(e));
		System.out.println("\n");
		Set<Map.Entry<String, Integer>> entries2 = barMa.entrySet();
		Iterator<Entry<String, Integer>> iterator2 = entries2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry<String, Integer> entry = iterator2.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
		

		System.out.println("\n");
		System.out.println("After Descending");
		System.out.println("=============================================================");
		
		Map<String, Integer>  bar = new TreeMap<String, Integer>((e,e1)->e1.compareTo(e));
		barMap.put("Wish You Were Beer", 185);
		barMap.put("The Meeting Palace", 95);
		barMap.put("Modi's Resto Bar", 120);
		barMap.put("CockTail Village", 60);
		barMap.put("Cheers & Beers", 404);
		barMap.put("White Hart", 309);
		barMap.put("Royal Oak",416);
		
		Set<String> set3 = bar.keySet();
		set3.forEach((e)->System.out.println(e));
		System.out.println("\n");
		Collection<Integer> collection3 = bar.values();
		collection3.forEach((e)->System.out.println(e));
		System.out.println("\n");
		Set<Map.Entry<String, Integer>> entries3 = bar.entrySet();
		Iterator<Entry<String, Integer>> iterator3 = entries3.iterator();
		while (iterator3.hasNext()) {
			Map.Entry<String, Integer> entry = iterator3.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
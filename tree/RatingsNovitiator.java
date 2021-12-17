package com.xworkz.tree;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class RatingsNovitiator {
	public static void main(String[] args) {
		
		Map<String, Double> movieMap = new HashMap<String, Double>();
		movieMap.put("Kotigobba 3", 6.8);
		movieMap.put("Most Eligible Bachelor", 6.4);
		movieMap.put("Narappa", 8.2);
		movieMap.put("Drishyam 2", 8.6);
		movieMap.put("Operation JAVA", 8.2);
		movieMap.put("Salaga", 7.4);
		movieMap.put("Sakth", 8.6);
	
		Set<String> movieKeys =  movieMap.keySet();
		movieKeys.forEach((e)->System.out.println(e));
		System.out.println("\n");
		Collection<Double> movieValues = movieMap.values();
		movieValues.forEach((e)->System.out.println(e));
		System.out.println("\n");
		Set<Map.Entry<String, Double>> movieEntries = movieMap.entrySet();
		Iterator<Entry<String, Double>> iterable = movieEntries.iterator();
		while (iterable.hasNext()) {
			Map.Entry<String, Double> entry = iterable.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println(" ");
		System.out.println("After Asending");
		System.out.println("=============================================================");
		
		Map<String, Double> movieMa = new TreeMap<String, Double>((e,e1)->e.compareTo(e1));
		movieMap.put("Kotigobba 3", 6.8);
		movieMap.put("Most Eligible Bachelor", 6.4);
		movieMap.put("Narappa", 8.2);
		movieMap.put("Drishyam 2", 8.6);
		movieMap.put("Operation JAVA", 8.2);
		movieMap.put("Salaga", 7.4);
		movieMap.put("Sakth", 8.6);
	
		Set<String> set = movieMa.keySet();
		set.forEach((e)-> System.out.println(e));
		System.out.println("\n");
		Collection<Double> collection = movieMa.values();
		collection.forEach((e)->System.out.println(e));
		System.out.println("\n");
		Set<Map.Entry<String, Double>> entries = movieMa.entrySet();
		Iterator<Entry<String, Double>> iterator = entries.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Double> entry = iterator.next();
			System.out.println(entry.getKey()+ " " + entry.getValue());
		}

		System.out.println("\n");
		System.out.println("After Descending");
		System.out.println("=============================================================");
		
		Map<String, Double> movie = new TreeMap<String, Double>((e,e1)->e1.compareTo(e));
		movieMap.put("Kotigobba 3", 6.8);
		movieMap.put("Most Eligible Bachelor", 6.4);
		movieMap.put("Narappa", 8.2);
		movieMap.put("Drishyam 2", 8.6);
		movieMap.put("Operation JAVA", 8.2);
		movieMap.put("Salaga", 7.4);
		movieMap.put("Sakth", 8.6);
		
		Set<String> set2 = movie.keySet();
		set2.forEach((e)->System.out.println(e));
		System.out.println("\n");
		Collection<Double> collection2 = movie.values();
		collection2.forEach((e)->System.out.println(e));
		System.out.println("\n");
		Set<Map.Entry<String, Double>> entries2 = movie.entrySet();
		Iterator<Entry<String, Double>> iterator2 = entries2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry<String, Double> entry = iterator2.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}

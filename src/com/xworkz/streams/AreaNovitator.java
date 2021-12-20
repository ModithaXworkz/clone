package com.xworkz.streams;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AreaNovitator {
public static void main(String[] args) {
	Stream<String> areaStream=Stream.of("Maruthinagar","Girinagar","JP nagar","Kuvempu nagar","Jaya nagar","BTM Layout","MG Road","Kumarswami Layout","Gandhi Nagar","Jalahalli","Banasvadi","Shivajinagar","VIvek nagar","Smapige Road","Padmanab Nagar"," BM Road","Lakshmipura","Shivananda layout","Saraswathi Layoout","Jenukal Nagar");
	List<String> tempList=areaStream
	           .map(String::toLowerCase)
	           .sorted()
	           .collect(Collectors.toList());
	           tempList.forEach((p)->System.out.println(p));
	           

	           
	 System.out.println("Areas in descending order");
	           
	 Stream<String> areaStream1=Stream.of("Maruthinagar","Girinagar","JP nagar","Kuvempu nagar","Jaya nagar","BTM Layout","MG Road","Kumarswami Layout","Gandhi Nagar","Jalahalli","Banasvadi","Shivajinagar","VIvek nagar","Smapige Road","Padmanab Nagar"," BM Road","Lakshmipura","Shivananda layout","Saraswathi Layoout","Jenukal Nagar");		 
	 List<String> tempList1=areaStream1
	       	           .map(String::toUpperCase)
	       	           .sorted(Collections.reverseOrder())
	       	           .collect(Collectors.toList());
	       	           tempList1.forEach((p)->System.out.println(p));
}
}
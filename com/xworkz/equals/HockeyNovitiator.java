package com.xworkz.equals;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;



public class HockeyNovitiator {
	public static void main(String[] args) {
		
		Hockey dto = new Hockey("Bharat Army", 81, 12, "India");
		Hockey dto1 = new Hockey("The Kookaburras", 69, 19, "Australia");
		Hockey dto2 = new Hockey("Kenya Hockey Union", 10, 4, "Kenya");
		Hockey dto3 = new Hockey("Oranje", 59, 21, "Netherland");
		Hockey dto4 = new Hockey("Redsticks", 19, 8, "Spain");
		Hockey dto5 = new Hockey("Green Shirts", 60, 22, "Pakistan");
		
		Set<Hockey> dtos = new LinkedHashSet<Hockey>();
		dtos.add(dto5);
		dtos.add(dto3);
		dtos.add(dto1);
		dtos.add(dto);
		dtos.add(dto4);
		dtos.add(dto2);
		boolean b = dto5.equals(dto2);
		System.out.println(b);
		Optional<Hockey> optional =  dtos.stream().filter((e)->e.getWins()>30).sorted((e1,e2)->e2.getTeamName().compareTo(e1.getTeamName())).findFirst();
		System.out.println(dtos.size());
		System.out.println(optional);
	}
}
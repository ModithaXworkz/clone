package com.xworkz.SDTO;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ZooNovitiator {
	public static void main(String[] args) {
		Zoo zo=new Zoo(1,"Jaya Chamarajendra odeyar","Karnataka",300);
		Zoo zo1=new Zoo(2,"Nandankanan Zoological Park","Odisha",250);
		Zoo zo2=new Zoo(3,"Lion Safar","Shivmoga",100);
		Zoo zo3=new Zoo(4,"Arignar Anna Zoological park","Vandalur",200);
		Zoo zo4=new Zoo(5,"Bannerugatta","Karnataka",200);
		
		Stream<Zoo> str=Stream.of(zo,zo1,zo2,zo3,zo4);
		List<Zoo>  temp=str.sorted((e1,e2)->e2.getTicketPrice().compareTo(e1.getTicketPrice())).collect(Collectors.toList());
		temp.forEach((e)->System.out.println(e));
		
	}

}
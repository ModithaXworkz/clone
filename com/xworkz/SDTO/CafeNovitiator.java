package com.xworkz.SDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CafeNovitiator {
public static void main(String[] args) {
	Cafe cf=new Cafe(1,"Cafepoint","Ask",4.8f);
	Cafe cf1=new Cafe(2,"Vashista","Banglore",5.0f);
	Cafe cf2=new Cafe(3,"Ashok","Hassan",4.2f);
	Cafe cf3=new Cafe(4,"CCD","Arsikere",5.0f);
	Cafe cf4=new Cafe(5,"Malanad Cafe Bar","Banglore",5.0f);
	
	List<Cafe> cafe=new ArrayList<Cafe>();
	cafe.add(cf4);
	cafe.add(cf3);
	cafe.add(cf2);
	cafe.add(cf1);
	cafe.add(cf);
	
	cafe.stream().filter((e)->e.getRating()>3).sorted((d1,d2)->d2.getName().compareTo(d1.getName())).collect(Collectors.toList()).forEach((e)->System.out.println(e));
}
}
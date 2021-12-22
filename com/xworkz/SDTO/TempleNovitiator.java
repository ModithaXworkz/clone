package com.xworkz.SDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class TempleNovitiator {
	public static void main(String[] args) {
		
	
	Temple tp=new Temple(10,"Sharada peetha","Singeri","Sri Sharadaamba",1720);
	Temple tp1=new Temple(20,"Tirumala","Tirupati","Venkateshawra",7000);
	Temple tp2=new Temple(30,"Southadka","Belthangadi","MahaGanapathi",500);
	Temple tp3=new Temple(40,"Chamundibeta","Mysore","Chamundeshwari",1000);
	Temple tp4=new Temple(50,"RayaraMata","Mathralaya","Ragavendrasrigalu",1000);
	

	
	List<Temple>  tmpl=new ArrayList<Temple>();
	tmpl.add(tp4);
	tmpl.add(tp3);
	tmpl.add(tp2);
	tmpl.add(tp1);
    tmpl.add(tp);

     tmpl.stream().filter((v)->v.getVisitorsPerDay()>1000).sorted((d1,d2)->d2.getVisitorsPerDay().compareTo(d1.getVisitorsPerDay())).collect(Collectors.toList()).forEach((v)->System.out.println(v));
	
	
	}
}
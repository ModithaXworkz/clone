package com.xworkz.SDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HeadPhoneNovitiator {
public static void main(String[] args) {
		HeadPhone hd=new HeadPhone(1,"Molife","Wireless",19218,2750d);
		HeadPhone hd1=new HeadPhone(2,"Redmi","Wireless",20964,2100d);
		HeadPhone hd2=new HeadPhone(3,"Sony","Wireless",25416,2990d);
		HeadPhone hd3=new HeadPhone(4,"JBL"," Wireless",21103,2499d);
		HeadPhone hd4=new HeadPhone(5,"Apple AirPods Pro","Wireless",21814,3199d);
		
		List<HeadPhone> head=new ArrayList<HeadPhone>();
		head.add(hd4);
		head.add(hd3);
		head.add(hd2);
		head.add(hd1);
		head.add(hd);
		
		head.stream().sorted((e1,e2)->e2.getId().compareTo(e1.getId())).collect(Collectors.toList()).forEach((d)->System.out.println(d));
		System.out.println(System.lineSeparator());
		
		System.out.println(System.lineSeparator());
		head.stream().filter((t)->t.getType()=="Wireless").sorted((e1,e2)->e1.getBrand().compareTo(e2.getBrand())).collect(Collectors.toList()).forEach((a)->System.out.println(a));
	
		System.out.println(System.lineSeparator());
      head.stream().sorted((e1,e2)->e2.getId().compareTo(e1.getId())).map((a)->a.getModel()).collect(Collectors.toList()).forEach((a)->System.out.println(a));
	}

}
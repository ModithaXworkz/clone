package com.xworkz.SDTO;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class RiversNovitiator {
public static void main(String[] args) {
	Rivers rv=new Rivers(1,"Kaveri","Karnataka",805,33);
	Rivers rv1=new Rivers(2,"Yamuna","Delhi",1376,27);
	Rivers rv2=new Rivers(3,"Tunga","Karnataka ",147,25);
	Rivers rv3=new Rivers(4,"Bhadra","Karnataka",120,12);
	Rivers rv4=new Rivers(5,"Godavari","Maharashtra",1465,35);

	 Stream<Rivers> rvr=Stream.of(rv,rv1,rv2,rv3,rv4);
	List<Rivers> tmp=rvr.filter((a)->a.getLength()>500).sorted((d1,d2)->d2.getNoOfDams().compareTo(d1.getNoOfDams())).collect(Collectors.toList());
        tmp.forEach((a)->System.out.println(a));
        	System.out.println(System.lineSeparator());
        
        Stream<Rivers> rvr1=Stream.of(rv,rv1,rv2,rv3,rv4);
    	List<Rivers> tmp1=rvr1.filter((a)->a.getNoOfDams()>20).sorted((d1,d2)->d1.getNoOfDams().compareTo(d2.getNoOfDams())).collect(Collectors.toList());
            tmp1.forEach((e)->System.out.println(e));

        
}
}

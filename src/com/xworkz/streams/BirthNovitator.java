package com.xworkz.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirthNovitator {
	public static void main(String[] args) {
		Stream<Integer> birthYearStream=Stream.of(2000,2004,2012,2015,1997,1987,1999,1977,1992,1996,2015,2014,2003,2009,2003,2007,2026,1985,2032,2022);
		List<Integer> tempList=birthYearStream
		           .filter((p)->p>1997)
		           .sorted()
		           .collect(Collectors.toList());
		           tempList.forEach((p)->System.out.println(p));
	}

}
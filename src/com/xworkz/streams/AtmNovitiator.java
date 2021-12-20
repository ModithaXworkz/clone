package com.xworkz.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AtmNovitiator {
	public static void main(String[] args) {
		Stream<Integer> atmPinStream=Stream.of(2305,4576,1000,1782,986,0124,0045,0567,897,4563,1267,0017,0056,0023,2323,765,0216,0175,1050,2322);
		List<Integer> tempList=atmPinStream
		           .filter((p)->p>1000)
		           .sorted()
		           .collect(Collectors.toList());
		           tempList.forEach((p)->System.out.println(p));
	}

}
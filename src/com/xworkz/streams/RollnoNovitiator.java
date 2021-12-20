package com.xworkz.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RollnoNovitiator {
	public static void main(String[] args) {
		Stream<Integer> rollNoStream=Stream.of(24,52,01,13,22,12,23,45,34,15,02,26,27,34,28,37,44,38,20,19,18,16);
		List<Integer> tempList=rollNoStream
				.filter((p)->p>20)
				.sorted()
				.collect(Collectors.toList());
		tempList.forEach((p)->System.out.println(p));
	}

}
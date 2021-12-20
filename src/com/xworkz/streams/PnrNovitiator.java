package com.xworkz.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PnrNovitiator {
public static void main(String[] args) {
	Stream<Long> pnrStream=Stream.of(7890765432L,6361692839L,9481625999L,1964325171L,9437844666L,1234890876L,1290876504L,5678908765L,7890765478L,3456789076L,7890876890L,6789065436L,8907654327L,8907689076L,5678764424L,4356789045L,8906547894L);
	List<Long> tempList=pnrStream
	           .filter((p)->p>7000000000L)
	           .sorted()
	           .collect(Collectors.toList());
	           tempList.forEach((p)->System.out.println(p));
}
}
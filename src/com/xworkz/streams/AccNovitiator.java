package com.xworkz.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AccNovitiator {
public static void main(String[] args) {
	Stream<Long> accountNoStream=Stream.of(636169283923051L,916423371706221L,948162599901097L,948377466632509L,888446092191215L,801742305997100L,710011223220199L,8814723455601017L,502307132003999L,231350999120003L,201711121320189L,501223089756148L);
	List<Long> tempList=accountNoStream
	           .filter((p)->p>200000000000L)
	           .sorted()
	           .collect(Collectors.toList());
	           tempList.forEach((p)->System.out.println(p));
}
}
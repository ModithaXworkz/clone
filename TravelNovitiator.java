package com.xworkz.omkar.cloneableInterface;

public class TravelNovitiator {

	
	
			public static void main(String[] args) throws CloneNotSupportedException {
				Travel tr = new Travel();
									    tr.setName("Akash");
										tr.setLocation("Hong Kong");
										tr.setType("Airways");
										tr.setTotalmembers(32);
										tr.setTotaldays(13);
										tr.setCost(10000);
										System.out.println(tr.toString());
										
										Object object = tr.clone();
										Travel tr1 = (Travel)object;
										System.out.println(tr1.toString());
									}
								}
								


					
				

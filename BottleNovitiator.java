package com.xworkz.omkar.cloneableInterface;

public class BottleNovitiator {



			public static void main(String[] args) throws CloneNotSupportedException {
				Bottle bn = new Bottle();
			    bn.setName("Smart Personalized Stainless Steel Water Bottle");
				bn.setBottlecolor("silver");
				bn.setType("waterbottle");
				bn.setQuality("High steel");
				System.out.println(bn.toString());
				
				Object object = bn.clone();
				Bottle bottle1 = (Bottle)object;
				System.out.println(bottle1.toString());
			}
		}
		


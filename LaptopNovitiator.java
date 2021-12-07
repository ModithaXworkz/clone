package com.xworkz.omkar.cloneableInterface;

public class LaptopNovitiator {

	
		public static void main(String[] args) throws CloneNotSupportedException {
			Laptop hpLap = new Laptop();
			hpLap.setName("HP");
			hpLap.setRam(8);
			hpLap.setProcessor("Core i5");
			hpLap.setType("GP");
			hpLap.setScreenInInch(15.6);
			System.out.println(hpLap.toString());
			
			Object object=hpLap.clone();
		    Laptop hpLaptop = (Laptop)object;
			System.out.println(hpLaptop.toString());
		}
	}
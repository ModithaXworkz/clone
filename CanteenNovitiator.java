package com.xworkz.omkar.cloneableInterface;

public class CanteenNovitiator {
	
	
			
		public static void main(String[] args) throws CloneNotSupportedException {
			Canteen ct = new Canteen();
								    ct.setName("Mathaji Tea Stall");
									ct.setLocation("PrakasNagar, Bangalore");
									ct.setContactNo(6931662652l);
									ct.setTotalItems(25);
									ct.setCost(10);
									System.out.println(ct.toString());
									
									Object object = ct.clone();
									Canteen ct1 = (Canteen)object;
									System.out.println(ct1.toString());
								}
							}
							


				
			
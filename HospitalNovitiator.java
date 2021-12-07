package com.xworkz.omkar.cloneableInterface;

public class HospitalNovitiator {

	
	
						public static void main(String[] args) throws CloneNotSupportedException {
							Hospital hs = new Hospital();
						    hs.setName("JC Hospital");
							hs.setLocation("Marthhalli, Bangalore");
							hs.setContactNo(8945617326l);
							hs.setTotalMembers(50);
							System.out.println(hs.toString());
							
							Object object = hs.clone();
							Hospital hs1 = (Hospital)object;
							System.out.println(hs1.toString());
						}
					}
					


		
	
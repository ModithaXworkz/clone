package com.xworkz.omkar.cloneableInterface;

public class ShowRoomNovitiator {

	
		
							public static void main(String[] args) throws CloneNotSupportedException {
								ShowRoom sw = new ShowRoom();
							    sw.setName("MODI GOLD");
								sw.setLocation("VijayNagar, Bangalore");
								sw.setContactNo(631662893);
								sw.setSpecialized("BIKES....ROYAL ENFIELD");
								System.out.println(sw.toString());
								
								Object object = sw.clone();
								ShowRoom sw1 = (ShowRoom)object;
								System.out.println(sw1.toString());
							}
						}
						


			
		


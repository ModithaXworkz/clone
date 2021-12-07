package com.xworkz.omkar.cloneableInterface;

public class InstituteNovitiator {



					public static void main(String[] args) throws CloneNotSupportedException {
						Institute ins = new Institute();
					    ins.setName("Xworkz");
						ins.setLocation("RajajiNagar Bangalore");
						ins.setContactNo(8529637411l);
						ins.setTotalMembers(120);
						System.out.println(ins.toString());
						
						Object object = ins.clone();
						Institute ins1 = (Institute)object;
						System.out.println(ins1.toString());
					}
				}
				


	
	
	
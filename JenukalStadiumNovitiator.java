package com.xworkz.omkar.cloneableInterface;

public class JenukalStadiumNovitiator {

		public static void main(String[] args) throws CloneNotSupportedException {
			JenukalStadium Stadium = new JenukalStadium();
		    Stadium.setName("Swammi Jenukal Stadium");
			Stadium.setContactNumber(8895623559L);
			Stadium.setCapacity(1000);
			Stadium.setOwner("Government of Karnataka");
			Stadium.setTeam("RCB");
			System.out.println(Stadium.toString());
			
			Object object = Stadium.clone();
			JenukalStadium Stadium2 = (JenukalStadium)object;
			System.out.println(Stadium2.toString());
		}
	}
	

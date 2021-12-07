package com.xworkz.curd.dao.gym;


	import java.util.ArrayList;
	import java.util.Collection;
	import java.util.Iterator;

	public class GymDAO {

		private Collection<String> gymName = new ArrayList<>();
		
		public boolean save(String name) {
			return gymName.add(name);
		}
		
		public boolean find(String gym) {
			return gymName.contains(gym);
		}
		
		public boolean findByIgnoringCases(String gName) {
			Iterator<String> itr = gymName.iterator();
			while(itr.hasNext()) {
				String tempName = itr.next();
				if(tempName.equalsIgnoreCase(gName)) {
					return true;
				}
			}
			return false;
		}
		
		public boolean findByIgnoringCasesAndSpaces(String gymNa) {
			Iterator<String> itr = gymName.iterator();
			while(itr.hasNext()) {
				String tempName = itr.next();
				tempName = tempName.replace(" ", "");
				if(tempName.equalsIgnoreCase(gymNa.replace(" ", ""))) {
					return true;
				}
			}
			return false;
		}
	}
	
	

package com.xworkz.curd.dao;



	import java.util.ArrayList;
	import java.util.Collection;
	import java.util.Iterator;

	public class IplTeamsDAO {

		private Collection<String> iplTeams = new ArrayList<>();
		
		public boolean save(String teams) {
			return iplTeams.add(teams);
		}
		
		public boolean find(String ipl) {
			return iplTeams.contains(ipl);
		}
		
		public boolean findTeamsByIgnoringCases(String iplTeam) {
			Iterator<String> itr = iplTeams.iterator();
			while(itr.hasNext()) {
				String tempName = itr.next();
				if(tempName.equalsIgnoreCase(iplTeam)) {
					return true;
				}
			}
			return false;
		}
		
		public boolean findTeamsByIgnoringCasesAndSpaces(String iplTea) {
			Iterator<String> itr = iplTeams.iterator();
			while(itr.hasNext()) {
				String tempName = itr.next();
				tempName = tempName.replace(" ", "");
				if(tempName.equalsIgnoreCase(iplTea.replace(" ", ""))) {
					return true;
				}
			}
			return false;
		}
	}


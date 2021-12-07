package com.xworkz.curd.dao;

public class IplTeamsDAONovitiator {
	


		public static void main(String[] args) {
			IplTeamsDAO iplTeamsDAO = new IplTeamsDAO();
			iplTeamsDAO.save("Royal Challengers Bangalore");
			iplTeamsDAO.save("Mumbai Indians");
			iplTeamsDAO.save("Chennai Super Kings");
			iplTeamsDAO.save("Rajasthan Royals");
			iplTeamsDAO.save("Delhi Capitals");
			iplTeamsDAO.save("Kolkata Knight Riders");
			iplTeamsDAO.save("Punjab Kings");
			iplTeamsDAO.save("Sunrisers Hyderabad");
			
			System.out.println("Comparing values");
			boolean found = iplTeamsDAO.find("Royal Challengers Bangalore");
			boolean found1 = iplTeamsDAO.find("Mumbai indians");
			System.out.println(found + "\n" + found1);
			
			System.out.println("Comparing values and neglating cases");
			found = iplTeamsDAO.findTeamsByIgnoringCases("Chennai Super Kings");
			found1 = iplTeamsDAO.findTeamsByIgnoringCases("RajasthanRoyals");
			System.out.println(found + "\n" + found1);
			
			System.out.println("Comparing values, neglating cases and spaces");
			found = iplTeamsDAO.findTeamsByIgnoringCasesAndSpaces("Kolkata Knight Riders");
			found1 = iplTeamsDAO.findTeamsByIgnoringCasesAndSpaces("Punjab Kings");
			boolean found2 = iplTeamsDAO.findTeamsByIgnoringCasesAndSpaces("Sunrisershyderabad");
			System.out.println(found + "\n" + found1 + "\n" + found2);
		}
	}
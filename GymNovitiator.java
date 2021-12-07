package com.xworkz.curd.dao.gym;

public class GymNovitiator {

		public static void main(String[] args) {
			GymDAO gymDAO = new GymDAO();
			gymDAO.save("Haute Fitness, Sahakara Nagar");
			gymDAO.save("Vriddhi Fitness");
			gymDAO.save("F45 Training");
			gymDAO.save("Snap Fitness Bangalore");
			gymDAO.save("We Fitness, JP Nagar");
			
			System.out.println("Comparing values");
			boolean found = gymDAO.find("Vriddhi Fitness");
			boolean found1 = gymDAO.find("Snap fitness Bangalore");
			System.out.println(found + "\n" + found1);
			
			System.out.println("Comparing values and neglating cases");
			found = gymDAO.findByIgnoringCases("Haute Fitness, Sahakara Nagar");
			found1 = gymDAO.findByIgnoringCases("We fitness, JP Nagar");
			System.out.println(found + "\n" + found1);
			
			System.out.println("Comparing values, neglating cases and spaces");
			found = gymDAO.findByIgnoringCasesAndSpaces("Snap Fitness Bangalore");
			found = gymDAO.findByIgnoringCasesAndSpaces("Haute Fitness,Sahakara Nagar");
			System.out.println(found + "\n" + found1);
		}
	}


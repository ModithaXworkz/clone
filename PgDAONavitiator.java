package com.xworkz.curd.dao.gym;

public class PgDAONavitiator {

		public static void main(String[] args) {
			PgDAO pgDAO = new PgDAO();
			pgDAO.save("Gajanana PG");
			pgDAO.save("Kushi PG");
			pgDAO.save("Sai PG");
			pgDAO.save("Brahmi PG");
			pgDAO.save("Kushi PG 1");
			
			System.out.println("Comparing values");
			boolean found = pgDAO.find("Kushi PG");
			boolean found1 = pgDAO.find("Brahmi pg");
			System.out.println(found + "\n" + found1);
			
			System.out.println("Comparing values and neglating cases");
			found = pgDAO.findPgByIgnoringCases("sai PG");
			found1 = pgDAO.findPgByIgnoringCases("BrahmiPG");
			System.out.println(found + "\n" + found1);
			
			System.out.println("Comparing values, neglating cases and spaces");
			found = pgDAO.findPgByIgnoringCasesAndSpaces("Kushi PG 1");
			found1 = pgDAO.findPgByIgnoringCasesAndSpaces("Kushi PG1");
			System.out.println(found + "\n" + found1);
			}
	}


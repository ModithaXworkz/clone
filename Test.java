package com.xworkz.functional;

public class Test {

		public static void main(String[] args) {
			 EmailDAO dao = new EmailDAO();
			 dao.save("moditha5@gmail.com");
			 dao.save("moditha5@gmail.in");
			 
			 Email email1= new FindByEmail();
			 System.out.println(dao.find(email1, "moditha5@gmail.com"));
			 
			Email email2 = new FindBycom();
			System.out.println(dao.find(email2, ".com"));
			Email email3 = new FindByin();
			System.out.println(dao.find(email3, "in"));
					
		}
	}

	


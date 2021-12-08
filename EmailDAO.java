package com.xworkz.functional;

	import java.util.ArrayList;
	import java.util.Collection;
	import java.util.Iterator;

	public class EmailDAO {
	Collection<String> cln = new ArrayList<String>();
	public boolean save(String id ) {
		return cln.add(id);
	}
	 
	public boolean find( Email email , String value){
		 Iterator<String> itr = cln.iterator();
		 while (itr.hasNext()) {
			 String temp = itr.next();
			 if(email.search(temp, value)) {
				 return true;
			 }
		 }
		 		return false;
	}

	}



package com.xworkz.functional;

public class FindByin implements Email {

		@Override
		public boolean search(String value1, String value2) {
		String s=value1.substring(value1.length()-3, value1.length() );
		if(s.equals(value2)) {
			return true;
		}
			return false;
		}

	}

	
	
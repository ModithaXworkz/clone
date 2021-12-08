package com.xworkz.functional;

public class FindBycom  implements Email{


		@Override
		public boolean search(String value1, String value2) {
			String s1=value1.substring(value1.length()-4, value1.length());
			if(s1.equals(value2)) {
				return true;
			}
			return false;
		}
		

	}



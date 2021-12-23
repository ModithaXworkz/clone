package com.xworkz.equals;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
 
public class CompanyNovitiator {
	public static void main(String[] args) {
		
		Company dto = new Company(1, "Wipro", "Thierry Delaporte", 201508995550.00);
		Company dto1 = new Company(2, "Capgemini", "Aiman Ezzat", 1344166560000.00);
		Company dto2 = new Company(3, "Cognizant", "Brian Humphries", 1389589575000.00);
		Company dto3 = new Company(4, "Accenture", "Julie Sweet ", 3793203975000.00);
		Company dto4 = new Company(5, "Eurofins", "Gilles G. Martin", 458303400000.00);
		Company dto5 = new Company(6, "Oracle", "Shailender Kumar", 728620350000.00);
		Company dto6 = new Company(6, "Oracle", "Shailender Kumar", 728620350000.00);
		
		Set<Company> dtos = new LinkedHashSet<Company>(); 
		dtos.add(dto5);
		dtos.add(dto3);
		dtos.add(dto1);
		dtos.add(dto4);
		dtos.add(dto);
		dtos.add(dto2);
		dtos.add(dto6);
		
		boolean b = dto5.equals(dto6);
		System.out.println(b);
	
		Optional<Company> optional = dtos.stream().filter((w)->w.getTurnOver()>140000000000.00).findFirst();
		System.out.println(dtos.size());
		System.out.println(optional);
	}
}

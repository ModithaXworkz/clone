package com.xworkz.equals;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class ProductNovitiator {
	public static void main(String[] args) {
		
		Product dto = new Product(1, "Realme", "Mobile", 19999.00, 1);
		Product dto1 = new Product(2, "Dell", "Laptop", 49999.00, 2);
		Product dto2 = new Product(3, "Boat", "Audio", 2999.00, 10);
		Product dto3 = new Product(4, "Philips", "Home Appliances", 1449.00, 4);
		Product dto4 = new Product(5, "Samsung", "Home Entertainment", 17499.00, 1);
		Product dto5 = new Product(6, "Asus", "Computers", 24999.00, 3);
		
		Set<Product> dtos = new LinkedHashSet<Product>();
		dtos.add(dto5);
		dtos.add(dto3);
		dtos.add(dto2);
		dtos.add(dto4);
		dtos.add(dto);
		dtos.add(dto1);
		
		boolean b = dto.equals(dto1);
		System.out.println(b);
		
		Optional<Product> optional = dtos.stream().filter((d)->d.getPrice()>10000.0).findFirst();
		System.out.println(dtos.size());
		System.out.println(optional);
	}
}
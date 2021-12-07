package com.xworkz.omkar.cloneableInterface;

public class ShoppingMallNovitiator {

	
		public static void main(String[] args) throws CloneNotSupportedException {
			ShoppingMall shoppingMalls = new ShoppingMall();
			shoppingMalls.setName("Garuda Mall");
			shoppingMalls.setLocation("Magrath Rd, Ashok Nagar, Bengaluru");
			shoppingMalls.setContactNo(18040698857L);
			shoppingMalls.setNoOfShops(120);
			shoppingMalls.setTotalGates(2);
			System.out.println(shoppingMalls.toString());
			
			Object object = shoppingMalls.clone();
			ShoppingMall shoppingMalls2 = (ShoppingMall)object;
			System.out.println(shoppingMalls2.toString());
		}
	
	
	
}

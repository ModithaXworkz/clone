package com.xworkz.omkar.cloneableInterface;

public class ShoppingMall implements Cloneable {

	
	
		private String name;
		private String location;
		private long contactNo;
		private int noOfShops;
		private int totalGates;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public long getContactNo() {
			return contactNo;
		}
		public void setContactNo(long contactNo) {
			this.contactNo = contactNo;
		}
		public int getNoOfShops() {
			return noOfShops;
		}
		public void setNoOfShops(int noOfShops) {
			this.noOfShops = noOfShops;
		}
		public int getTotalGates() {
			return totalGates;
		}
		public void setTotalGates(int totalGates) {
			this.totalGates = totalGates;
		}
		
		@Override
		public Object clone() throws CloneNotSupportedException {
			System.out.println("Invoked clone method");
			return super.clone();
		}
		@Override
		public String toString() {
			return "ShoppingMalls [name=" + name + ", location=" + location + ", contactNo=" + contactNo + ", noOfShops="
					+ noOfShops + ", totalGates=" + totalGates + "]";
		}
		
		
	}

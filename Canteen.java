package com.xworkz.omkar.cloneableInterface;

public class Canteen implements Cloneable {

	
					private String name;
					private String location;
					private  long contactNo;
					private int totalItems;
					private int cost;
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

					public int getTotalItems() {
						return totalItems;
					}

					public void setTotalItems(int totalItems) {
						this.totalItems = totalItems;
					}

					public int getCost() {
						return cost;
					}

					public void setCost(int cost) {
						this.cost = cost;
					}

					
					
					
					
				
					
					

					@Override
					public String toString() {
						return "Canteen[name=" + name + ", location=" + location + ", contactNo=" + contactNo+ ",  totalItems=" + totalItems+ ",cost="+ cost+"]";
					}
					
					@Override
					public Object clone() throws CloneNotSupportedException {
						System.out.println("Invoked cloneable");
						return super.clone();
					}
					
				}


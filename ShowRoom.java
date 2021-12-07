package com.xworkz.omkar.cloneableInterface;

public class ShowRoom implements Cloneable {
	 

					private String name;
					private String location;
					private  long contactNo;
					private String specialized;
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

					public String getSpecialized() {
						return specialized;
					}

					public void setSpecialized(String specialized) {
						this.specialized = specialized;
					}

					
				
					
					

					@Override
					public String toString() {
						return "ShowRoom [name=" + name + ", location=" + location + ", contactNo=" + contactNo+ ",   specialized=" +  specialized+ "]";
					}
					
					@Override
					public Object clone() throws CloneNotSupportedException {
						System.out.println("Invoked cloneable");
						return super.clone();
					}
					
				}





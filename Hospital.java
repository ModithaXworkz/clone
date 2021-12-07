package com.xworkz.omkar.cloneableInterface;

public class Hospital  implements Cloneable {
	

				
					private String name;
					private String location;
					private  long contactNo;
					private int totalMembers;
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

					public int getTotalMembers() {
						return totalMembers;
					}

					public void setTotalMembers(int totalMembers) {
						this.totalMembers = totalMembers;
					}

					
					
				
					
					

					@Override
					public String toString() {
						return "Hospital [name=" + name + ", location=" + location + ", contactNo=" + contactNo+ ",  totalmembers=" + totalMembers+ "]";
					}
					
					@Override
					public Object clone() throws CloneNotSupportedException {
						System.out.println("Invoked cloneable");
						return super.clone();
					}
					
				}

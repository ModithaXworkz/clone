package com.xworkz.omkar.cloneableInterface;

public class JenukalStadium implements Cloneable {

	
	
		private String name;
		private long contactNumber;
		private int capacity;
		private String owner;
		private String team;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(long contactNumber) {
			this.contactNumber = contactNumber;
		}
		public int getCapacity() {
			return capacity;
		}
		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}
		public String getOwner() {
			return owner;
		}
		public void setOwner(String owner) {
			this.owner = owner;
		}
		public String getTeam() {
			return team;
		}
		public void setTeam(String team) {
			this.team = team;
		}
		
		@Override
		public String toString() {
			return "JenukalStadium [name=" + name + ", contactNumber=" + contactNumber + ", capacity=" + capacity
					+ ", owner=" + owner + ", team=" + team + "]";
		}
		
		@Override
		public Object clone() throws CloneNotSupportedException {
			System.out.println("Invoked cloneable");
			return super.clone();
		}
		
	}


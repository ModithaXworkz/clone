package com.xworkz.omkar.cloneableInterface;

public class Travel implements Cloneable {

	
		
						private String name;
						private String location;
						private String type;
						private int totalmembers;
						private int totaldays;
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

						public String getType() {
							return type;
						}

						public void setType(String type) {
							this.type = type;
						}

						public int getTotalmembers() {
							return totalmembers;
						}

						public void setTotalmembers(int totalmembers) {
							this.totalmembers = totalmembers;
						}

						public int getTotaldays() {
							return totaldays;
						}

						public void setTotaldays(int totaldays) {
							this.totaldays = totaldays;
						}

						public int getCost() {
							return cost;
						}

						public void setCost(int cost) {
							this.cost = cost;
						}

					
						
					
						
						

						@Override
						public String toString() {
							return "Travel[name=" + name + ", location=" + location + ", type=" + type+ ",  totalMembers=" + totalmembers+ ", totaldays=" + totaldays+ ",cost="+ cost+"]";
						}
						
						@Override
						public Object clone() throws CloneNotSupportedException {
							System.out.println("Invoked cloneable");
							return super.clone();
						}
						
					}



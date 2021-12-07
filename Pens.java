package com.xworkz.omkar.cloneableInterface;

public class Pens implements Cloneable{


		
		
			private String name;
			private String color;
			private String type;
			private int cost;
			
		
			
			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getColor() {
				return color;
			}

			public void setColor(String color) {
				this.color = color;
			}

			public String getType() {
				return type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public int getCost() {
				return cost;
			}

			public void setCost(int cost) {
				this.cost = cost;
			}

			@Override
			public String toString() {
				return "Pens [name=" + name + ", color=" + color + ", type=" + type+ ",  cost=" + cost + "]";
			}
			
			@Override
			public Object clone() throws CloneNotSupportedException {
				System.out.println("Invoked cloneable");
				return super.clone();
			}
			
		}


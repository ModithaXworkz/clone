package com.xworkz.omkar.cloneableInterface;

public class Bottle implements Cloneable {
	     
		
			private String name;
			 private String bottlecolor;
		      private String type;
		      private String quality;
		
			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getBottlecolor() {
				return bottlecolor;
			}

			public void setBottlecolor(String bottlecolor) {
				this.bottlecolor = bottlecolor;
			}
			public String getType() {
				return type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getQuality() {
				return quality;
			}

			public void setQuality(String quality) {
				this.quality = quality;
			}

			
			
			
			
			@Override
			public String toString() {
				return "Bottle [name=" + name + ", bottlecolor=" + bottlecolor + ", type=" + type + ", quality=" + quality + "]";
			}
			
			@Override
			public Object clone() throws CloneNotSupportedException {
				System.out.println("Invoked cloneable");
				return super.clone();
			}
			
		}



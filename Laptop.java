package com.xworkz.omkar.cloneableInterface;

	public class Laptop implements Cloneable {
		
			private String name;
			private int ram;
			private String type;
			private String processor;
			private double screenInInch;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getRam() {
				return ram;
			}
			public void setRam(int ram) {
				this.ram = ram;
			}
			public String getType() {
				return type;
			}
			public void setType(String type) {
				this.type = type;
			}
			public String getProcessor() {
				return processor;
			}
			public void setProcessor(String processor) {
				this.processor = processor;
			}
			public double getScreenInInch() {
				return screenInInch;
			}
			public void setScreenInInch(double screenInInch) {
				this.screenInInch = screenInInch;
			}
			@Override
			public String toString() {
				return "HpLaptop [name=" + name + ", ram=" + ram + ", type=" + type + ", processor=" + processor
						+ ", screenInInch=" + screenInInch + "]";
			}
			
			@Override
			public Object clone() throws CloneNotSupportedException {
				System.out.println("invoked cloneable");
				return super.clone();
			}
			
		}
	


			
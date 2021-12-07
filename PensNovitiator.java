package com.xworkz.omkar.cloneableInterface;

public class PensNovitiator {




				public static void main(String[] args) throws CloneNotSupportedException {
					Pens pen = new Pens();
				    pen.setName("parker");
					pen.setColor("Blue");
					pen.setType("ball");
					pen.setCost(120);
					System.out.println(pen.toString());
					
					Object object = pen.clone();
					Pens pen1 = (Pens)object;
					System.out.println(pen1.toString());
				}
			}
			


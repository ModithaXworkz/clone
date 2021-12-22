package com.xworkz.SDTO;

public class Zoo {

private Integer id;
private String name;
private String stateName;
private Integer ticketPrice;
public Zoo(Integer id, String name, String stateName, Integer ticketPrice) {
	super();
	this.id = id;
	this.name = name;
	this.stateName = stateName;
	this.ticketPrice = ticketPrice;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getStateName() {
	return stateName;
}
public void setStateName(String stateName) {
	this.stateName = stateName;
}
public Integer getTicketPrice() {
	return ticketPrice;
}
public void setTicketPrice(Integer ticketPrice) {
	this.ticketPrice = ticketPrice;
}
@Override
public String toString() {
	return "Zoo [id=" + id + ", name=" + name + ", stateName=" + stateName + ", ticketPrice=" + ticketPrice
			+ "]";
}

}
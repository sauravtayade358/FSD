package com.simplilearn.ecommerce;

public class Product {

	
	private int id;
	private String pname;
	private String os;
	private String processor;
	private int price;
	
public Product() {}


public Product(String pname, String os, String processor, int price) {
		
		this.pname = pname;
		this.os = os;
		this.processor = processor;
		this.price = price;
	}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getPname() {
	return pname;
}


public void setPname(String pname) {
	this.pname = pname;
}


public String getOs() {
	return os;
}


public void setOs(String os) {
	this.os = os;
}


public String getProcessor() {
	return processor;
}


public void setProcessor(String processor) {
	this.processor = processor;
}


public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
}




}
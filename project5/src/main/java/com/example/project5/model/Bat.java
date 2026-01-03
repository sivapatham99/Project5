package com.example.project5.model;

public class Bat {
	
	private int id;
	private String name;
	private double price ;
	public int getId() {
		return id;
	}
	public Bat() {
		
	}
	public Bat(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}

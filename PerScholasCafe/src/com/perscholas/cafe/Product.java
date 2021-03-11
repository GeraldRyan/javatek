package com.perscholas.cafe;

abstract public class Product {
	protected String name, description;
	protected double price;
	protected int quantity;
	static double tax = .025;

	public Product() {
		super();  // Object constructor.
		}
	
	public Product(String name, double price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.quantity = 0;  // anticipating what they want
	}

	abstract public double calculateProductTotal();
	

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


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}




}

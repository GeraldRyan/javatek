package com.perscholas.cafe;

public class Product {
	private String name, description;
	private double price, quantity;

	public Product(String name, double price, String description, double quantity) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.quantity = quantity;
	}


	public Product() {
		super();
		}

	public calculateProductTotal() {
		return price * quantity;
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


	public void setPrice(String price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getQuantity() {
		return quantity;
	}


	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}




}

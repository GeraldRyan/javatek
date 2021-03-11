package com.perscholas.cafe;

public class Mocha extends Product {

	public Mocha(String name, double price, String description) {
		super(name, price, description);
		// TODO Auto-generated constructor stub
	}

	public Mocha() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calculateProductTotal() {
		return this.price * this.quantity;
	}

}

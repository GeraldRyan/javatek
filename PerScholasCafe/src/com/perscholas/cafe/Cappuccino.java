package com.perscholas.cafe;

public class Cappuccino extends Product {

	public Cappuccino(String name, double price, String description) {
		// TODO Auto-generated constructor stub
		super(name, price, description);
	}

	@Override
	public double calculateProductTotal() {
		return this.price * this.quantity;
	}

}

package com.perscholas.cafe;

public class Espresso extends Product {

	public Espresso(String name, double price, String description) {
		super(name, price, description);

	}

	@Override
	public double calculateProductTotal() {
		return this.price * this.quantity;
	}
}

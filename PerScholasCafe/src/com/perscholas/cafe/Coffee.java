package com.perscholas.cafe;

public class Coffee extends Product {

	public Coffee() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Coffee(String name, double price, String description) {
		super(name, price, description);
	}

	@Override
	public double calculateProductTotal() {
		return this.price * this.quantity;
	}

}

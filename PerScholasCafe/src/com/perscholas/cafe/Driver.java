package com.perscholas.cafe;

import java.util.Scanner;

public class Driver {

	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Coffee coffee = new Coffee("coffee", 2.99, "dark roast");
		Espresso espresso = new Espresso("espresso", 3.99, "italiano");
		Cappuccino cappuccino = new Cappuccino("cappuccino", 4.99, "molto bene");
		Scanner sn = new Scanner(System.in);
		System.out.println("How many cupts of coffee do you want");
		coffee.setQuantity(sn.nextInt());
		System.out.println("How many espressos will you be desiring?");
		espresso.setQuantity(sn.nextInt());
		System.out.println("What about the cappuccino?");
		cappuccino.setQuantity(sn.nextInt());
		
		double subTotal = coffee.calculateProductTotal() + espresso.calculateProductTotal() + cappuccino.calculateProductTotal();
		double tax = subTotal * .025;
		double Total = subTotal + tax;
		
		System.out.printf("Your total comes to: %f. \n Tax is: %f and total is %s\n", subTotal, tax, Total);
		
	}
}
package com.example;

public class CartSystem extends TheSystem {
	CartSystem() {
	}

	private double calcSalesTax(double price, int qty) {
		return price * qty * .05;
	}

	private double calcSubTotal(double price, int qty) {
		return Math.round((price + calcSalesTax(price, qty)) * 100) / 100;
	}

	@Override
	public void display() {
		double totalPre =0, totalTax = 0;
		System.out.println("Cart:");
		System.out.format("%-20s %-20s %-10s %-10s %-10s\n", "Name", "Description", "Price", "Quantity", "Sub Total");
		for (Item i : itemCollection.values()) {
			totalPre = totalPre + (i.getItemPrice()*i.getQuantity());
			totalTax = totalTax + calcSalesTax(totalPre, 1);
			System.out.format("%-20s %-20s %-10.2f %-10d %-10.2f", i.getItemName(), i.getItemDesc(), i.getItemPrice(), i.getQuantity(), calcSubTotal(i.getItemPrice(), i.getQuantity()));
		}
		System.out.format("%-20s %-20.2f\n", "Pre-tax Total", totalPre);
		System.out.format("%-20s %-20.2f\n", "Tax", totalTax);
		System.out.format("%-20s %-20.2f\n", "Total", totalPre + totalTax);
	}
}

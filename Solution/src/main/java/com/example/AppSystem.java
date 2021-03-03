package com.example;

import java.io.File;

public class AppSystem extends TheSystem {
	AppSystem() {
//		super(); // this wasn't included
	}

	@Override
	public void display() {
		System.out.println("AppSystem Inventory:");
		System.out.format("%-20s %-20s %-10s %-10s\n", "Name", "Description", "Price", "Available Quantity");
		for (Item i : itemCollection.values()) {
			System.out.format("%-20s %-20s %-10.2f %-10d\n", i.getItemName(), i.getItemDesc(), i.getItemPrice(), i.getAvailableQuantity());
		}
	}

	@Override 
	public Boolean add(Item item) {
		if (item == null) {
			return false;
		} else if (itemCollection.containsKey(item.getItemName())) {
			System.out.printf("%s is already in the system\n", item.getItemName());
			return false;
		} else {
			itemCollection.put(item.getItemName(), item);
			return true;
		}
	}

	public Item reduceAvailableQuantity(String item_name) {  // remove item if qty is 0 expected null but got obj
		if (itemCollection.containsKey(item_name)){
			Item i = itemCollection.get(item_name);
			i.setAvailableQuantity(i.getAvailableQuantity() -1);
			if (i.getAvailableQuantity() == 0) {
				itemCollection.remove(item_name);
			}
			return i;
		}
		return null;
	}
}

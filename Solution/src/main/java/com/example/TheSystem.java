package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public abstract class TheSystem {

	protected HashMap<String, Item> itemCollection;

	TheSystem() {
		this.itemCollection = new HashMap<String, Item>();
		if (getClass().getSimpleName().equals("AppSystem")) {
			// Try
			File sampleFile = new File("resources/sample.txt");
			try {
				Scanner scanner = new Scanner(sampleFile);
//				ArrayList<String> data = new ArrayList<String>();
				while (scanner.hasNextLine()) {
					String[] itemInfo = scanner.nextLine().split("\\s\\s");
//					System.out.println("printing item info" + itemInfo);
					Item newItem = new Item(itemInfo[0], itemInfo[1], Double.parseDouble(itemInfo[2]), Integer.parseInt(itemInfo[3]));
					itemCollection.put(itemInfo[0], newItem);
//				data.add(scanner.nextLine());
				}
				scanner.close();
			} catch (FileNotFoundException e) {
				System.out.println("File not found!");
				e.printStackTrace();
			}
		}
	}

	public HashMap<String, Item> getItemCollection() {
		return itemCollection;
	}

	public Boolean checkAvailability(Item item) {
		if (item == null) {
			System.out.println("Please enter a legitimate item");
			return false;
		}
		if (item.getQuantity() >= item.getAvailableQuantity()) {
			System.out.printf("System is unable to add %s to the cart. System only has %d %ss\n", item.getItemName(), item.getAvailableQuantity(), item.getItemName());
			return false;
		}
		if (item.getAvailableQuantity() < 1) {
			return false;
		}
		return true;
	}

	public Boolean add(Item item) { // add to cart vs add to inventory. Must be overriden. One of these is the
									// default (consumer or business).

		if (item == null) {
			return false;
		} else if (itemCollection.containsKey(item.getItemName())) { // item already in collection- increase by 1
			itemCollection.get(item.getItemName()).setQuantity(item.getQuantity() + 1);
			return true;
		} else if (!itemCollection.containsKey(item.getItemName())) { // item not in collection (i.e. cart or inventory), make 1
			itemCollection.put(item.getItemName(), item);
			return true;
		} else {
			return false;
		}
	}

	public Item remove(String itemName) {
		if (this.itemCollection.containsKey(itemName)) {
			return itemCollection.remove(itemName);
		}
		return null;

//TODO 		return itemCollection.remove(itemName); // this should be enough- should return null by default if key not there. try when completed
	}

	public abstract void display();
}

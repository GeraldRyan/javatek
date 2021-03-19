package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
	@Id
	private int id;
	private String name;
	private double price;

	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	public Item(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

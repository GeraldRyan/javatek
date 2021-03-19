package entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Order {
	@Id
	int id;
	Date date;
	double total_revenue;
	
//	@OneToMany(targetEntity=Item.class)  // makes jpa generate table

	public Order() {
		// TODO Auto-generated constructor stub
	}

}
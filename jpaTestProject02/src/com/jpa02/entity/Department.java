package com.jpa02.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="department")
public class Department {
	@Id
	private int Id;
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	private String name, state;
	
	public Department(int id, String name, String state) {
		super();
		this.Id = id;
		this.name = name;
		this.state = state;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return String.format("%3s %15s %20s", Id, name, state);
	}
	
	public Department() {
		
	}

}

package com.jpa02.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import org.junit.runners.parameterized.*;

@Entity
@Table (name = "temployee")
@NamedQuery(query="select e from Employee e where e.id = :eID", name="getEmpById")
public class Employee {
	@Id
	private int id;
	private String name;
	private String title;
	private double salary;
	public Employee() {
		super();
	}
	public Employee(int id, String name, String title, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return String.format("%3s %15s %20s %10.2f", id, name, title, salary);
	}
//	
//	@Override
//	public boolean equals(Object o) {
//		Employee comparedTo = (Employee) o;
//		if (this.id==comparedTo.getId()
//			&& this.name.equals(comparedTo.getName())
//			&& this.title.equals(comparedTo.getTitle())
//			&& this.salary==comparedTo.getSalary()) {
//			return true;
//		}
//		
//		return false;
//	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
}


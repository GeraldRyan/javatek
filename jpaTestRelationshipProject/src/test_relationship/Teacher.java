package test_relationship;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Teacher {
	@Id
	private int eid;
	private String ename;
	private double salary;
	
	@ManyToOne
	private Department department;
	
	public Teacher() {
		super();
	}
	public Teacher(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
//		this.department = department;
	}
}
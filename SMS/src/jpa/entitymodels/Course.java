package jpa.entitymodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Course")
public class Course {
	@Id
	@Column(name="id")
	int cId;
	@Column(name="name", length=50, nullable=false)
	String cName;
	@Column(name="Instructor", length=50, nullable=false)
	String cInstructorName;
	

	public Course(int cId, String cName, String cInstructorName) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cInstructorName = cInstructorName;
	}


	public Course() {
		// TODO Auto-generated constructor stub
	}


	public int getcId() {
		return cId;
	}


	public void setcId(int cId) {
		this.cId = cId;
	}


	public String getcName() {
		return cName;
	}


	public void setcName(String cName) {
		this.cName = cName;
	}


	public String getcInstructorName() {
		return cInstructorName;
	}


	public void setcInstructorName(String cInstructorName) {
		this.cInstructorName = cInstructorName;
	}


	@Override
	public String toString() {
		return String.format("\n%5s %20s %20s\n", cId, cName, cInstructorName);
	}

}

package jpa.entitymodels;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Course")
public class Course {
	@Id
	int cId;
	String cName;
	String cInstructorName;
	

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

}

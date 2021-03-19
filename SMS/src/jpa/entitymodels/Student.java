package jpa.entitymodels;


import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@Column(name="email", length=50, nullable=false)
	String sEmail;
	@Basic
	@Column(name="name", length=50, nullable=false)
	String sName;
	@Basic
	@Column(name="password", length=50, nullable=false)
	String sPass;
//	@Basic
//	@Column(name="sCourses")
	@Transient
	List<String> sCourses;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String email, String sName, String sPass, List<String> sCourses) {
		super();
		this.sEmail = email;
		this.sName = sName;
		this.sPass = sPass;
		this.sCourses = sCourses;
	}


	public Student(String email, String name, String password) {
		this.sEmail = email;
		this.sName = name;
		this.sPass = password;
	}

	public String getSEmail() {
		return sEmail;
	}

	public void setSEmail(String email) {
		this.sEmail = email;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsPass() {
		return sPass;
	}

	public void setsPass(String sPass) {
		this.sPass = sPass;
	}

	public List<String> getsCourses() {
		return sCourses;
	}

	public void setsCourses(List<String> sCourses) {
		this.sCourses = sCourses;
	}

	@Override
	public String toString() {
		return String.format("\n%5s %20s %20s %20s\n", sEmail, sName, "multiple", "*******");
	}

}

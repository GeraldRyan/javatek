package jpa.entitymodels;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@Column(name="email")
	String email;
	@Basic
	@Column(name="sName")
	String sName;
	@Basic
	@Column(name="sPass")
	String sPass;
	@Basic
	@Column(name="sCourses")
	List<String> sCourses;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String email, String sName, String sPass, List<String> sCourses) {
		super();
		this.email = email;
		this.sName = sName;
		this.sPass = sPass;
		this.sCourses = sCourses;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

}

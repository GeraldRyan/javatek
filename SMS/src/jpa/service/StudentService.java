package jpa.service;

import java.util.ArrayList;
import java.util.List;

import jpa.dao.StudentDAO;
import jpa.dbConnection.DBConnection;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class StudentService extends DBConnection implements StudentDAO {

	public StudentService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Student> getAllStudents() {
		this.connect();
		List<Student> studs = em.createQuery("select s from Student s").getResultList();
		this.disconnect();
		return studs;
	}

	@Override
	public Student getStudentByEmail(String email) {
		this.connect();
		try {
			Student s = em.find(Student.class, email);
			this.disconnect();
			return s;
		} catch (Exception e) {
			e.printStackTrace();
			this.disconnect();
			return null;
		}
	}

	@Override
	public boolean validateStudent(String email, String sPassword) {
		Student s = this.getStudentByEmail(email);
		if (s.getsPass().equals(sPassword)) {
			return true;
		}
		return false;
	}

	@Override
	public void registerStudentToCourse(String sEmail, int cId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Course getStudentCourse(String sEmail) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean populateDB() {
		try {

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}

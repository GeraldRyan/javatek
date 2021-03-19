package jpa.service;

import java.util.ArrayList;
import java.util.List;

import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class StudentService implements StudentDAO {

	public StudentService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validateStudent(String email, String sPassword) {
		// TODO Auto-generated method stub
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

}

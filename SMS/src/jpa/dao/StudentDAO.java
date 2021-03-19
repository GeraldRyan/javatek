package jpa.dao;

import java.util.ArrayList;
import java.util.List;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public interface StudentDAO {
	public List<Student> getAllStudents();
	
	public Student getStudentByEmail(String email);
	
	public boolean validateStudent(String email, String sPassword);
	
	public void registerStudentToCourse(String sEmail, int cId);
	
	public Course getStudentCourse(String sEmail);

}

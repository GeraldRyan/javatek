package jpa.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

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
		this.connect();
		Student s = em.find(Student.class, sEmail);
		em.getTransaction().begin();
		Course c = em.find(Course.class, cId);
		System.out.println("course you want to add");
		System.out.println(c);
		List<Course> studentcourses = s.getsCourses();
//		if c in student --> return
		if (studentcourses.contains(c)){
			System.out.println("You're already enrolled in this course, but we appreciate your enthusiasm");
			return;
		}
		studentcourses.add(c);
		System.out.println(studentcourses.size());
		s.setsCourses(studentcourses);
//		em.persist(studentcourses);
		em.getTransaction().commit();
		this.disconnect();
	}
	@Override
	public List<Course> getStudentCourses(String sEmail) {
//		 em.createQuery("select c from Course c where c.cId = :givenID").getResultList();
		Student s = this.getStudentByEmail(sEmail);
		List<Course> courses = s.getsCourses();
		return courses;
	}


	public void addStudent(String email, String name, String password) {
		Student s = new Student(email, name, password);
		this.connect();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		this.disconnect();
	}

	public boolean populateDB() {
		try {
			this.addStudent("hluckham0@google.ru", "Hazel Luckham", "X1uZcoIh0dj");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}

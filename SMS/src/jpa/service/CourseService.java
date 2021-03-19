package jpa.service;

import java.util.ArrayList;
import java.util.List;

import jpa.dao.CourseDAO;
import jpa.dbConnection.DBConnection;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class CourseService extends DBConnection implements CourseDAO {

	public CourseService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Course> getAllCourses() {
		this.connect();
		List<Course> curs = em.createQuery("select c from Course C").getResultList();
		this.disconnect();
		return curs;
	}
	
	public void addCourse(int id, String name, String professor) {
		Course c = new Course(id, name, professor);
		this.connect();
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		this.disconnect();
	}
	public boolean populateDB() {
		try {
			this.addCourse(1, "English", "Anderea Scamaden");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}

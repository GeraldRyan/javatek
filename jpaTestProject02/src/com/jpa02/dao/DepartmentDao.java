package com.jpa02.dao;

import java.util.List;

import com.jpa02.dbConnection.DBConnection;
import com.jpa02.entity.Department;

public class DepartmentDao extends DBConnection implements DepartmentDaoI {

	@Override
	public void addDepartment(Department D) {
		this.connect();
		em.getTransaction().begin();
		em.persist(D);
		em.getTransaction().commit();
		this.disconnect();
	}

	@Override
	public Department getDepartment(int id) {
		this.connect();
		Department D = em.find(Department.class, id);
		this.disconnect();
		return D;
	}
	
	@Override
	public void removeDepartment(int id) {
		this.connect();
		Department d = em.find(Department.class, id);
		em.getTransaction().begin();
		em.remove(d);
		em.getTransaction().commit();
		this.disconnect();
	}

	@Override
	public boolean updateDepartment(Department dept) {
		this.connect();
		em.getTransaction().begin();
		Department d = em.find(Department.class, dept.getId());
		if (d!=null) {
			d.setName(dept.getName());
			d.setState(dept.getState());
			em.getTransaction().commit();
			this.disconnect();
			return true;
		}
		this.disconnect();
		return false;
	}

	@Override
	public List<Department> getAllDepts() {
		this.connect();
		List<Department> listdepart = em.createQuery("select d from Department d").getResultList();
		this.disconnect();
		return listdepart;
	}

}

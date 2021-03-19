package com.jpa02.dao;

import java.util.List;

import javax.persistence.Query;

import com.jpa02.dbConnection.DBConnection;
import com.jpa02.entity.Employee;

public class EmployeeDao extends DBConnection implements EmployeeDaoI {

	@Override
	public boolean addEmp(Employee emp) {
		try {
			this.connect();
			em.getTransaction().begin();
			em.persist(emp);
			em.getTransaction().commit();
			this.disconnect();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Employee getEmp(int id) {
		this.connect();
//		Employee empFound = em.find(Employee.class, id);
//		Query q = em.createQuery("select e from Employee e where e.id = :eID");
		Query q = em.createNamedQuery("getEmpById");
		q.setParameter("eID", id);
		List<Employee> emps = q.getResultList();
		Employee empFound = null;
		for (Employee e: emps) {
			empFound = e;
			break;
		}
		this.disconnect();
		return empFound;
	}

	@Override
	public List<Employee> getAllEmp() {
		this.connect();
		List<Employee> emps = em.createQuery("select e from Employee e").getResultList();
		this.disconnect();
		return emps;
	}

}

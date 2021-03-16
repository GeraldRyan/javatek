package com.jpa01.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa01.entity.Employee;

public class EmployeeService implements EmployeeServiceI{

	@Override
	public void addEmp(Employee emp) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_test01");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit(); // needed to save to database
		em.close();
		emf.close();

	}
	
	@Override 
	public Employee getEmp(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_test01");
		EntityManager em = emf.createEntityManager();
		Employee empFound = em.find(Employee.class, id);
		return empFound;
	}


}

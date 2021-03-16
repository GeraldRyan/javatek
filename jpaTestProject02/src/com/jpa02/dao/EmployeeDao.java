	package com.jpa02.dao;

import java.sql.SQLException;

import com.jpa02.dbConnection.DBConnection;
import com.jpa02.entity.Employee;

public class EmployeeDao extends DBConnection implements EmployeeDaoI {

	@Override
	public void addEmp(Employee emp) {
		this.connect(); // extends DB Connection so it runs
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		this.disconnect();
	}

	@Override
	public Employee getEmp(int id) {
		this.connect();
		Employee empFound = em.find(Employee.class, id);
		this.disconnect();
		return empFound;
	}

	@Override
	public void updateEmployeeSalary(int id, double new_salary) throws SQLException {
		this.connect();
		em.getTransaction().begin(); // starts preparing the statement
		Employee emp = em.find(Employee.class, id);
		emp.setSalary(new_salary);
		em.getTransaction().commit();
		this.disconnect();
	}

	@Override
	public boolean updateEmp(Employee emp) {
		this.connect();
		em.getTransaction().begin();
		// Confirm employee exists
		Employee e = em.find(Employee.class, emp.getId());
		if (e!=null) {
			e.setName(emp.getName());
			e.setTitle(emp.getTitle());
			e.setSalary(emp.getSalary());
			em.getTransaction().commit();
			this.disconnect();
			return true;
		}
		else {
			System.out.println("Employee not found");
//			em.persist(emp); // use if you want to add
//			em.getTransaction().commit();
			this.disconnect();
			return false;
		}
	}

}

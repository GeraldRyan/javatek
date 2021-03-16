package com.jpa02.dao;

import java.sql.SQLException;
import java.util.List;

import com.jpa02.entity.Employee;

public interface EmployeeDaoI {
	public void addEmp(Employee emp);
	public Employee getEmp(int id);
	public void updateEmployeeSalary(int id, double new_salary) throws SQLException;
	public boolean updateEmp(Employee emp);
//	public void removeEmp(int id);
//	public List<Employee> getAllEmp();
}

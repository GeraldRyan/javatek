package com.jpa02.service;

import java.sql.SQLException;

import com.jpa02.dao.EmployeeDao;
import com.jpa02.entity.Employee;

public class EmployeeService {
	private EmployeeDao empD = new EmployeeDao();
	
	public void addEmpService(Employee emp) {
		empD.addEmp(emp);
	}
	
	public Employee getEmpService(int id) {
		return empD.getEmp(id);
	}
	
	public boolean validateEmpService(int id, String name, String title) {
		Employee empFound = empD.getEmp(id);
		if (empFound!=null) {
			if(empFound.getName().equals(name) && empFound.getTitle().equals(title)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean updateEmpService(Employee e) {
		// TODO check if employee is in db
		return empD.updateEmp(e);
	}
	
	public void updateEmployeeSalaryService(int id, double new_salary) throws SQLException {
		empD.updateEmployeeSalary(id, new_salary);
	}
	
}

package com.jpa01.service;

import java.util.List;
import com.jpa01.entity.Employee;

public interface EmployeeServiceI {
	public void addEmp(Employee emp);
	public Employee getEmp(int id);
//	public void updateEmp(Employee emp);
//	public void removeEmp(int id);
//	public List<Employee> getAllEmp();
}
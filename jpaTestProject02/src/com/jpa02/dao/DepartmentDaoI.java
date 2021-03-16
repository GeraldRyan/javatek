package com.jpa02.dao;

import java.util.List;

import com.jpa02.entity.Department;

public interface DepartmentDaoI {
	public void addDepartment(Department D);
	public Department getDepartment(int id);
	public boolean updateDepartment(Department d);
	public void removeDepartment(int id);
	public List<Department> getAllDepts();
}

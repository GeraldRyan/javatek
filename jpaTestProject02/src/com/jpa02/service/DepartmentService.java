package com.jpa02.service;

import java.util.List;

import com.jpa02.dao.DepartmentDao;
import com.jpa02.entity.Department;


public class DepartmentService {
	private DepartmentDao DeptD = new DepartmentDao();
	
	public void addDepartment(Department D) {
		DeptD.addDepartment(D);
	}
	
	public Department getDepartment(int id) {
		return DeptD.getDepartment(id);
	}
	
	public boolean updateDepartmentService(Department d) {
		return DeptD.updateDepartment(d);
	}
	
	public void removeDepartmentService(int id) {
		DeptD.removeDepartment(id);
	}
	
	public List<Department> getAllDeptsService(){
		return DeptD.getAllDepts();
	}
}

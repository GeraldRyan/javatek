package com.jpa02.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.jpa02.dao.EmployeeDao;
import com.jpa02.entity.Employee;

public class EmployeeDaoTest {
	static EmployeeDao eDao;
	
	@BeforeClass
	public static void setUp() {
		eDao = new EmployeeDao();
		System.out.println("BeforeClass");
	}
	@Before
	public void beforeTest() {
		System.out.println("BeforeTest");
	}
	@Test
	public void testGetEmp() {
		System.out.println("testGetEmp");
		Employee expected = new Employee(150, "Jean", "CEO", 300000.00);
		Employee actual = eDao.getEmp(150);
//		assertEquals(expected.getName(), actual.getName());
//		assertEquals(expected.getTitle(), actual.getTitle());
		assertEquals(expected, actual);
	}

}

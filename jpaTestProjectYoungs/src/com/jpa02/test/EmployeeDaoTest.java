package com.jpa02.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.jpa02.dao.EmployeeDao;
import com.jpa02.entity.Employee;

@RunWith(Parameterized.class)
public class EmployeeDaoTest {
	static EmployeeDao eDao;
	
	int empId;
	Employee empExpected;
	
	public EmployeeDaoTest(int empId, Employee empExpected) {
		this.empId = empId;
		this.empExpected = empExpected;
	}
	
	@Parameterized.Parameters
	public static Collection params() {
		return Arrays.asList(new Object[][] {
			{150, new Employee(150, "Jean", "CEO", 300000.00)},
			{201, new Employee(201, "Gerald", "Software Engineer", 90000.00)}
		});
	}
	
	@BeforeClass
	public static void setUp() {
		eDao = new EmployeeDao();
//		System.out.println("BeforeClass");
	}
	@Before
	public void beforeTest() {
//		System.out.println("BeforeTest");
	}
	@Test
	public void testGetEmp() {
		System.out.println("testGetEmp");
		Employee actual = eDao.getEmp(this.empId);
		assertEquals(this.empExpected, actual);
	}
	
	@Test
	public void testAddEmp() {
		System.out.println("testingAddEmp");
		Employee empNew = new Employee(9157, "Reiner", "ArmoredTitan", 156);
		assertTrue(eDao.addEmp(empNew));
//		Employee actual = eDao.getEmp(this.empId);
//		assertEquals(this.empExpected, actual);
	}

}

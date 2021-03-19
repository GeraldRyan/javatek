package jUnits;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class jUnits {
	TestThis testObj = new TestThis();
//
//	@Test
//	public void test() {
////		pass("Not yet implemented");
//	}

	@BeforeClass
	public static void printFoo() {
		System.out.println("Before class");
	}

	@AfterClass
	public static void printBar() {
		System.out.println("After class");
	}

	@After
	public void afterEach() {
		System.out.println("After Test");
	}

	@Before
	public void beforeEach() {
		System.out.println("After Test");
	}

	@Test
	public void getAtIndex() {
		System.out.println("Testing Get At Index");
		assertEquals("Tony", testObj.getNameAtIndex(2));
		assertEquals("Mike", testObj.getNameAtIndex(0));
	}

	@Test
	public void addName() {
		System.out.println("Testing add Name");
		testObj.addName("Jared");
		assertEquals(testObj.getNameAtIndex(testObj.getNames().size() - 1), "Jared");
	}

}

//Tests for getNameAtIndex()
//Test 1 Data: 
//Input = 2
//Expected = “Tony”
//Test 2 Data:
//Input = 0
//Expected = “Mike”
//Test for addName()
//Note: use getNames() to check results
//Test Data:
//Input = “Jared”
//Expected = Last entry of getNames() arraylist should be “Jared”

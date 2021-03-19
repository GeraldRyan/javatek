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
		System.out.println("Bef"
				+ "ore test");
	}
	

	@Test
	public void testGetEmp() {
		Employee expected = new Employee(150, "jean", "CEO", 300000);
		Employee actual = eDao.getEmp(150);
		assertEqual(expected.getName(), actual.getName());
		assertEqual(expected.getTitle(), actual.getTitle());
	}

}

/**
 * 
 */
package jpa.entitymodels;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jpa.service.CourseService;
import jpa.service.StudentService;

/**
 * @author User
 *
 */
public class StudentTest {
	StudentService sapp = new StudentService();
	CourseService capp = new CourseService();

	@Test
	public void test() {
		Student s = sapp.getStudentByEmail("cstartin3@flickr.com");
		assertEquals("XYHzJ1S", s.getsPass());
	}

}

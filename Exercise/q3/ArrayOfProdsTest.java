package q3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayOfProdsTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
	}
	
	@Test
	public void testArrayProudct() {
		int [] input = {8,10,2};
		int [] expected = {20,16,80};
		assertEquals(ArrayOfProds.array_of_prods(input), expected);
	}

}

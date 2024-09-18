package ut;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.example.Calculator;
//hello
public class CalculatorTest {

	static Calculator cl;

	@BeforeClass
	public static void setUp() {
		cl = new Calculator();
	}

	@AfterClass
	public static void tearDown() {
		System.gc();
	}

	@Test
	public void testAdd() {

		assertTrue(cl.doAdd(1, 2) == 3);
	}

	@Test
	public void testSub() {
		assertTrue(cl.doSub(1, 1) == 0);
	}

	@Test
	public void testMul() {
		assertTrue(cl.doMul(9, 2) == 18);
	}

	@Test
	public void testDiv() {
		assertTrue(cl.doDiv(8, 2) == 4);
	}
	
	@Test
	public void testAddWithEquals() {
	    assertEquals(3.0, cl.doAdd(1.0, 2.0), 0.0001); // Provide a small delta for floating-point comparison
	}

}

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import c206_ws.Calculator;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a=1234;
		int b=8765;
		Calculator cal=new Calculator();
		int actual=cal.add(a, b);
		int expected=9999;
		assertEquals(actual,expected);
	}
	@Test
	public void testSub() {
		//fail("Not yet implemented");
		int a=9876;
		int b=4321;
		Calculator cal=new Calculator();
		int actual=cal.subtract(a, b);
		int expected=5555;
		assertEquals(actual,expected);
	}
	@Test
	public void testMul() {
		//fail("Not yet implemented");
		int a=5;
		int b=7;
		Calculator cal=new Calculator();
		int actual=cal.multiply(a, b);
		int expected=35;
		assertEquals(actual,expected);
	}
	@Test
	public void testDiv() {
		//fail("Not yet implemented");
		int a=90;
		int b=10;
		Calculator cal=new Calculator();
		int actual=cal.divide(a, b);
		int expected=9;
		assertEquals(actual,expected);
	}

}

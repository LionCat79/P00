import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculateTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		
	}
	@Test 
	public void testAdd() { 
		int a = 4321;
		int b = 1234; 
		Calculator cal = new Calculator(); 
		int actual = cal.add(a, b);
		int expected = 5555; 
		assertEquals (expected, actual);
	}
		
	@Test
	public void testSubtract() {
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
		int expected = 3087;
		assertEquals (expected, actual);
		}
	@Test 
	public void testMultiply() { 
		int a = 10; 
		int b = 5; 
		Calculator cal = new Calculator(); 
		int actual = cal.multiply(a, b);  
		int expected = 50; 
		assertEquals (expected, actual); 

	} 
	public void testDivide() { 
	    int a = 50; 
	    int b = 10; 
	    Calculator cal = new Calculator(); 
	    double actual = cal.divide(a, b);  
	    double expected = 5; 
	    double delta = 0.0001; 
	    assertEquals(expected, actual, delta); 

	} 



	} 

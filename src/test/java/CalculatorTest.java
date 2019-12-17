import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	calculator cal;
	int a,b;
	

	@Before
	public void setUp() throws Exception {
		cal =  new calculator();
	}

	@After
	public void tearDown() throws Exception {
		cal = null;
	}

	@Test
	public void testadd() {
		a=cal.add(3, 5);
		assertEquals(8, cal.add(3, 5));
		System.out.print(a);
	}

	@Test
	public void testmul() {
		b=cal.mul(34, 46);
		assertEquals(15, cal.mul(3, 5));
		System.out.print(b);

	}

}

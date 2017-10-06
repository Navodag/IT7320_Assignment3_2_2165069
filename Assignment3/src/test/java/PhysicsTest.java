import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PhysicsTest {
	int m, a, d, s; 
	Physics obj;

	@Before
	public void setUp() throws Exception {
		obj = new Physics();
		m = 30;
		a = 120;
		d = 15;
		s = 50;
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
		m = 0;
		a = 0;	
		d = 0;
		s = 0;
	}

	@Test
	public void testForce() {
		int ans = m*a;
		assertEquals (ans,obj.force(m,a));	
	}

	@Test
	public void testTime() {
		assertEquals (0.3,obj.time(d,s),0.1);	
	}

	@Test
	public void testWeight() {
		assertEquals (300,obj.weight(m));	
	}

}

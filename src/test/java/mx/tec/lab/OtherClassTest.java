package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OtherClassTest {

	@Test
	public void testMultiply() {
		int x = 2, y = 5;
		OtherClass oc = new OtherClass();
		
		assertEquals(x * y, oc.multiply(x, y));
	}

	@Test
	public void testMultiply_ExceptionIsThrown() {
		int x = 1500, y = 5;
		OtherClass oc = new OtherClass();
		
		assertThrows(IllegalArgumentException.class, () -> oc.multiply(x, y));
	}

}

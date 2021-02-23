package mx.tec.lab;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.util.Arrays;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UnderstandingAssertsApplicationTests {

	@Test
	public void whenAssertingEquality_thenEqual() {
		String expected = "Winter is coming";
		String actual = "Not today";
		
		// assertEquals(expected, actual);
		assertEquals(expected, actual, "Failure - strings are not equal");
	}
	
	@Test
	public void whenAssertingArraysEquality_thenEqual() {
		char[] expected = {'J', 'u', 'n', 'i', 't'};
		char[] actual = "Junit".toCharArray();
		
		assertArrayEquals(expected, actual);
	}

	@Test
	public void givenNullArrays_whenAssertingArraysEquality_thenEqual() {
		int[] expected = null;
		int[] actual = null;
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void whenAssertingNull_thenTrue() {
		Object longclaw = null;
		
		assertNull(longclaw, "The longclaw should be null");
		// If we want to assert that an object should not be null we can use the assertNotNull assertion
	}
	
	@Test
	public void whenAssertingNull_thenFalse() {
		Object longclaw = new Object();
		
		assertNotNull(longclaw, "The longclaw should be null");
		// If we want to assert that an object should be null we can use the assertNull assertion
	}
	
	@Test
	public void whenAssertingNotSameObject_thenDifferent() {
		Object oathkeeper = new Object();
		Object widowswall = new Object();
		
		assertNotSame(oathkeeper, widowswall);
		// When we want to verify that two variables refer to the same object, we can use the assertSame assertion
	}
	
	@Test
	public void whenAssertingNotSameObject_thenSame() {
		Object oathkeeper = new Object();
		Object widowswall = oathkeeper;
		
		assertSame(oathkeeper, widowswall);
		// When we want to verify that two variables don't refer to the same object, we can use the assertNotSame assertion
	}
	
	@Test
	public void whenAssertingConditions_thenVerified() {
		assertTrue(5 > 4, "5 is greater than 4");
		assertFalse(5 > 6, "5 is not greater than 6");
	}
	
	@Test
	public void whenCheckingExceptionMessage_thenEqual() {
		AnyClass ac = new AnyClass();
		
		try {
			ac.methodThatShouldThrowException();
			fail("Exception not thrown");
		} catch (UnsupportedOperationException e) {
			assertEquals("Operation Not Supported", e.getMessage());
		}
	}
	
	@Test
	public void testAssertThatHasItems() {
		String list[] = {"Harrenhal", "Dragonstone", "Winterfell", "Riverrun"};
		assertThat(Arrays.asList(list)).contains("Winterfell", "Riverrun");
	}
	
}

package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class OtherClassTest {
	@Test
	public void testMultiply() {
		int x = 998;
		
		assertTrue(x < 1000, "The value is less than 1000");
	}

	@Test
	public void testMultiply_ExceptionIsThrown() {
		int x = 1000;
		assertFalse(x < 1000, "The value is greater than 999");
	}
}
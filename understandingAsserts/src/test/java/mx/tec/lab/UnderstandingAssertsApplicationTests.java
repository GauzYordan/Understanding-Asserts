package mx.tec.lab;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UnderstandingAssertsApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void whenAssertingEquality_thenEqual() {
	    String expected = "Winter is coming";
	    String actual = "Not today";
	 
	    //assertEquals(expected, actual);
	     assertEquals(expected, actual, "failure - strings are not equal");
	}

	@Test
	public void whenAssertingArraysEquality_thenEqual() {
	    char[] expected = {'J','u','n','i','t'};
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
	    //if we want to assert that an object should not be null we can use the assertNotNull assertion
	}
	
	@Test
	public void whenAssertingNull_thenFalse() {
	    Object longclaw = new Object();
	     
	    assertNotNull(longclaw, "The longclaw should NOT be null");
	    //if we want to assert that an object should not be null we can use the assertNotNull assertion
	}
	
	@Test
	public void whenAssertingNotSameObject_thenDifferent() {
	    Object oathkeeper = new Object();
	    Object widowswall = new Object();
	 
	    assertNotSame(oathkeeper, widowswall);
	    // when we want to verify that two variables refer to the same object, we can use the assertSame assertion
	}

	@Test
	public void whenAssertingNotSameObject_thenSame() {
	    Object oathkeeper = new Object();
	    Object widowswall = oathkeeper;
	 
	    assertSame(oathkeeper, widowswall);
	    // when we want to verify that two variables refer to the same object, we can use the assertSame assertion
	}
	
	@Test
	public void whenAssertingConditions_thenVerified() {
	    assertTrue(5 > 4, "5 is greater then 4");
	    assertFalse(5 > 6, "5 is not greater then 6");
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
	    assertThat(Arrays.asList("Harrenhal", "Dragonstone", "Winterfell")).contains("Winterfell", "Dragonstone");	
	}
	
}

import static org.junit.Assert.*;

import org.junit.Test;


public class RomanToNumeralTest {

	RomanToNumeral  converter = new RomanToNumeral();
	@Test
	public void testI() {
		assertEquals(1,converter.Numeralfor("I"));
	}
	
	@Test
	public void testII() {
		assertEquals(2,converter.Numeralfor("II"));
	}
	
	@Test
	public void testMCCLIX() {
		assertEquals(1259,converter.Numeralfor("MCCLIX"));
	}
	
	@Test
	public void testIV() {
		assertEquals(4,converter.Numeralfor("IV"));
	}
	
	@Test
	public void testHello() {
		assertEquals(0,converter.Numeralfor("Hello"));
	}
	
	@Test
	public void testInvalid() {
		assertEquals(0,converter.Numeralfor("IL"));
	}
	
	
}

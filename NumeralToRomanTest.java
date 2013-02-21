import static org.junit.Assert.*;

import org.junit.Test;


public class NumeralToRomanTest {
	
	NumeralToRoman converter = new NumeralToRoman();
	
	@Test
	public void test1() {
		assertEquals("I", converter.Romanfor(1));
	}
	
	@Test
	public void test2() {
		assertEquals("DLV", converter.Romanfor(555));
	}
	
	@Test	
	public void test155() {
		assertEquals("XCVIII", converter.Romanfor(98));
	}
	
	@Test	
	public void test4() {
		assertEquals("CCLXXIV", converter.Romanfor(274));
	}
	
	@Test	
	public void test49() {
		assertEquals("MMMCDXXVI", converter.Romanfor(3426));
	}
}

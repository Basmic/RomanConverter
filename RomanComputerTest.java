import static org.junit.Assert.*;

import org.junit.Test;


public class RomanComputerTest {

	RomanComputer computer = new RomanComputer();

	@Test
	public void testASum() {
	  assertEquals("XI", computer.compute("IX + II"));
	}
	
	@Test
	public void testBSum() {
	  assertEquals("MMMMCCCLIII", computer.compute("DLV + XCVIII + CCLXXIV + MMMCDXXVI"));
	}

	@Test
	public void testHello() {
	  assertEquals("", computer.compute("Hello + World + CIVIL"));
	}

}

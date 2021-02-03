package Kata8;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOrOddTest {
	
	@Test
	public void testEvenOrOdd() {
		EvenOrOdd eoo = new EvenOrOdd();
		assertEquals(eoo.evenOrOdd(6), "Even");
		assertEquals(eoo.evenOrOdd(7), "Odd");
	}
}
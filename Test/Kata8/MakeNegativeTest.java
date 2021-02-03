package Kata8;

import org.junit.Test;

import static org.junit.Assert.*;

public class MakeNegativeTest {
	
	@Test
	public void makeNegativeNum() {
		assertEquals(-42, MakeNegative.makeNegativeNum(42));
	}
}
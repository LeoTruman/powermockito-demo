package de.cellent.bt.test_demo.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.cellent.bt.test_demo.impl.SquareCalculator;

/**
 * Obviously, this test is a piece of cake.
 * 
 * @author bjoern
 */
public class A_SimpleTest {

	/** Class under Test. */
	private SquareCalculator calculator;
	
	@Before
	public void setup() {
		calculator = new SquareCalculator();
	}
	
	@Test
	public void testCalculate() {
		assertEquals(0, calculator.square(0));
		assertEquals(1, calculator.square(1));
		assertEquals(4, calculator.square(2));
		assertEquals(289, calculator.square(17));
		assertEquals(1, calculator.square(-1));
		assertEquals(4, calculator.square(-2));
		assertEquals(289, calculator.square(-17));
	}

}

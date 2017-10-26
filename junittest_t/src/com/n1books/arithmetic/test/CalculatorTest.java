package com.n1books.arithmetic.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.n1books.arithmetic.Calculator;

public class CalculatorTest {
	Calculator c;
	@Before
	public void testStart() {
		c = new Calculator();
	}
	
	@After
	public void testEnd() {
		c.clear();
	}
	
	@Test
	public void testAdd() {
		c.add(10);
		assertEquals(10, c.getResult());
	}

	@Test
	public void testSub() {
		c.sub(10);
		assertEquals(-10, c.getResult());
	}

	@Ignore
	@Test
	public void testMul() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testDiv() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testGetResult() {
		fail("Not yet implemented");
	}

}

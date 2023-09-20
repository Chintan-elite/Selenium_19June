package com;

import static org.junit.Assert.assertEquals;

import org.Calc;
import org.junit.Test;

public class J003_CalcTest {
	
	@Test
	public void addTest()
	{
		Calc c = new Calc();
		int result =  c.add(10, 20);
		int expected = 30;
		
		assertEquals(expected, result);	
	}
	
	@Test
	public void squareTest()
	{
		Calc c = new Calc();
		int result = c.square(10);
		int expected = 100;
		
		assertEquals(expected, result);
	}
}

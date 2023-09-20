package com;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class J002_AssertionDemo {
	
	@Test
	public void test()
	{
		int a = 10;
		int b = 20;
		
		
		//assertEquals(b, a);
		//assertNotEquals(b, a);
		//assertTrue(a>b);
		//assertFalse(a<b);
		//assertNull(a);
		
		
		int i[] = {10,20,30,40,50,60,70,80};
		int j[] = {10,20,30,40,50,60,70,90};
		
		assertArrayEquals(i, j);
		
	}
}

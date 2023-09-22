package com;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.Calc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class J007_ParameterisedTest {
	

	int a;
	int b;
	int expectedResult;

	public J007_ParameterisedTest(int a, int b, int expectedResult) {
		super();
		this.a = a;
		this.b = b;
		this.expectedResult = expectedResult;
	}

	@Test
	public void addTest()
	{
		Calc c = new Calc();
		int result =  c.add(a, b);
		int expected = expectedResult;
		assertEquals(expected, result);	
	}
	
	@Parameters
	public static List<Object[]> getData()
	{
		Object[][] obj = new Object[4][3];
		
		obj[0][0] = 10;
		obj[0][1] = 20;
		obj[0][2] = 30;
		
		obj[1][0] = 200;
		obj[1][1] = 10;
		obj[1][2] = 210;
		
		obj[2][0] = 100;
		obj[2][1] = 200;
		obj[2][2] = 300;
		
		obj[3][0] = 11;
		obj[3][1] = 20;
		obj[3][2] = 130;
		
		return Arrays.asList(obj);
		
	}
	
	
	
	
}

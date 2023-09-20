package com;

import org.junit.Ignore;
import org.junit.Test;

public class J001_FirstTest {
		
	@Test
	public void test1()
	{
		System.out.println("Running test1...");
	}
	
	@Ignore
	@Test
	public void test2()
	{
		System.out.println("Running test2...");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Running test3");
	}
	
}

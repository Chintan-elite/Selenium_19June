package com;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class J005_AnnotationDemo {
	
	@Test
	public void alpha()
	{
		System.out.println("runinng alpha test");
	}
	
	@Test
	public void beta()
	{
		System.out.println("running beta test");
	}
	@Test
	public void gama()
	{
		System.out.println("Runing gama test");
	}
	
	@Before
	public void beforeTest()
	{
		System.out.println("Running before every test");
	}
	
	@After
	public void afterTest()
	{
		System.out.println("Running after every test");
	}
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Runing before all test");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("Runing after all test");
	}
	
}

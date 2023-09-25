package org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Payment {
		
		@Test(groups = "smoke")
		public void creditCard()
		{
			System.out.println("Running creditcard payment");
		}
		
		@Test(groups = "sanity")
		public void debitCard()
		{
			System.out.println("Running debitcard payment");
		}
		
		@Test
		public void cod()
		{
			System.out.println("Runing Cod payment");
		}
		
		
//		@BeforeMethod
//		public void beoreMethod()
//		{
//			System.out.println("runinng before method...");
//		}
//		
//		@AfterMethod
//		public void afterMetho()
//		{
//			System.out.println("running after method...");
//		}
//		
//		@BeforeClass
//		public void beforeClass()
//		{
//			System.out.println("Running before class");
//		}
//		
//		@AfterClass
//		public void afterClass()
//		{
//			System.out.println("Runinng after class");
//		}
//		
//		@BeforeTest
//		public void beforeTest()
//		{
//			System.out.println("Running before test");
//		}
//		
//		@AfterTest
//		public void afterTest()
//		{
//			System.out.println("Runinng after test");
//		}
		
}

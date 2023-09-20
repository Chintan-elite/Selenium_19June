package com;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Driverconnection;

public class J006_FB {
	
	static WebDriver driver;
	@BeforeClass
	public static void setUp()
	{
		 driver = Driverconnection.connect("https://www.fb.com");	
	}
	
	@AfterClass
	public static void close()
	{
		driver.quit();
	}
	
	@Test
	public void title()
	{
		String actualTitle = driver.getTitle();
		String expectedTitle = "Fb";
		assertEquals(expectedTitle, actualTitle);
		
	}
	
	@Test
	public void login()
	{
		driver.findElement(By.id("email")).sendKeys("test");
		driver.findElement(By.id("pass")).sendKeys("test123");
	}
}

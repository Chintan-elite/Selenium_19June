package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import util.Driverconnection;

public class J004_TitleCheck {
	
	@Test
	public void title()
	{
		WebDriver driver = Driverconnection.connect("https://www.fb.com");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Fb";
		assertEquals(expectedTitle, actualTitle);
		driver.close();
	}
}

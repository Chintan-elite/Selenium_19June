package listener;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import util.Driverconnection;

public class FBTest {
			
		
	@Test
	public void title(ITestContext i)
	{
		WebDriver driver = Driverconnection.connect("https://www.fb.com");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Fb";
		i.setAttribute("mydriver", driver);
		assertEquals(expectedTitle, actualTitle);
		
	}
	
	@Test
	public void login(ITestContext i)
	{
		WebDriver driver = Driverconnection.connect("https://www.fb.com");
		driver.findElement(By.id("email")).sendKeys("test");
		driver.findElement(By.id("pass")).sendKeys("test123");
		driver.findElement(By.name("login")).click();
		i.setAttribute("mydriver", driver);
		assertEquals("Error", driver.getTitle());
	}
	
	
}

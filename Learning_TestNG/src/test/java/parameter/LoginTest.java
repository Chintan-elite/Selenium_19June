package parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import util.Driverconnection;



public class LoginTest {
	
		@Parameters({"username","password"})
		@Test
		public void login(String uname, String pass)
		{
			WebDriver driver= Driverconnection.connect("https://www.fb.com");
			driver.findElement(By.id("email")).sendKeys(uname);
			driver.findElement(By.id("pass")).sendKeys(pass);
		}
}

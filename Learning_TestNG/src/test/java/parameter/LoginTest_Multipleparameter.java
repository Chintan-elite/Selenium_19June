package parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import util.Driverconnection;



public class LoginTest_Multipleparameter {
	
		WebDriver driver;
		@BeforeClass
		public void setUp()
		{
			 driver= Driverconnection.connect("https://www.fb.com");
		}
		
		@AfterClass
		public void close()
		{
			driver.quit();
		}
	
		@Test(dataProvider = "dp")
		public void login(String uname, String pass)
		{
			
			WebElement username =  driver.findElement(By.id("email"));
			username.clear();
			username.sendKeys(uname);
			WebElement password =  driver.findElement(By.id("pass"));
			password.clear();
			password.sendKeys(pass);
		}
		
		@DataProvider(name="dp")
		public Object[][] getData()
		{
			Object obj[][] = new Object[3][2];
			
			obj[0][0] = "test@gmail.com";
			obj[0][1] = "test";
			
			obj[1][0] = "tech@gmail.com";
			obj[1][1] = "tech";
			
			obj[2][0] = "abc@gmail.com";
			obj[2][1] = "abc";
			
			
			return obj;
				
		}
		
		
		
		
		
}

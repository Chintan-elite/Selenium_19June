package com;

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
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		@DataProvider(name="dp")
		public Object[][] getData()
		{
			
			ExcellReader ex = new ExcellReader("C:\\Users\\CHINTAN\\OneDrive\\Desktop\\test\\testing_demo.xlsx", "login");
			int row = ex.rowCount();
			int col = ex.colCount();
			
			Object obj[][] = new Object[row-1][col];
			
			for(int i=1;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					String data = ex.getData(i, j);
					obj[i-1][j] = data;
				}
			}	
			return obj;
				
		}
		
		
		
		
		
}

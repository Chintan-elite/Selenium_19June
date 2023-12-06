package com;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.Driverconnection;

public class Day4 {
	
		WebDriver driver;
		@BeforeClass
		public void setup()
		{
			
			driver = Driverconnection.connect(Util.URL);
		}
		
		@AfterClass
		public void close()
		{
			driver.quit();
		}
	
		@Test(dataProvider = "dp")
		public void test(String username, String password,String title)
		{
			Day1Page d = new Day1Page(driver);
			d.enterEmail(username);
			d.enterPass(password);
			d.loginClick();
			
			try {
				
				driver.switchTo().alert().accept();
				
				
			} catch (Exception e) {
				
				
				
			}
			
			
			String actualTitle = driver.getTitle();
			
			assertEquals(actualTitle, title);;
			
			driver.navigate().back();
			
			
		}
		
		
		@DataProvider(name="dp")
		public Object[][] getData()
		{
			ExcelReader e = new ExcelReader();
			int row = e.rowCount();
			int col = e.colCount();
			
			Object obj[][]=new Object[row-1][col];
			
			for(int i=1;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					String data = e.getData(i, j);
					obj[i-1][j] = data;
				}
			}
			
			return obj;
		}
		
		
}

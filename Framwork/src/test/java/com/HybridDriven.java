package com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HybridDriven {
		
	WebDriver driver = null;
	@Test(dataProvider = "dp")
	public void test(String function,String keyword, String locator, String location,String data)
	{
		//System.out.println(function+" "+keyword+" "+locator+" "+location+" "+data);
	
		if(keyword.equals("browser"))
		{
			if(data.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "D:\\selenuum data\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(data.equals("ff"))
			{
				System.setProperty("webdriver.gecko.driver", "D:\\selenuum data\\geckodriver-v0.33.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if(data.equals("edge"))
			{
				System.setProperty("webdriver.edge.driver", "D:\\selenuum data\\edgedriver_win64\\msedgedriver.exe");
				driver = new EdgeDriver();
			}
		}
		else if(keyword.equals("url"))
		{
			driver.get(data);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
		}
		else if(keyword.equals("input"))
		{
			if(locator.equals("id"))
			{
				driver.findElement(By.id(location)).sendKeys(data);
			}
			else if(locator.equals("name"))
			{
				driver.findElement(By.name(location)).sendKeys(data);
			}
			else if(locator.equals("xpath"))
			{
				driver.findElement(By.xpath(location)).sendKeys(data);
			}
		}
		else if(keyword.equals("click"))
		{
			if(locator.equals("id"))
			{
				driver.findElement(By.id(location)).click();
			}
			else if(locator.equals("name"))
			{
				driver.findElement(By.name(location)).click();
			}
			else if(locator.equals("xpath"))
			{
				driver.findElement(By.xpath(location)).click();
			}
		}
		else if(keyword.equals("select"))
		{
			if(locator.equals("id"))
			{
				Select values = new Select(driver.findElement(By.id(location)));
				values.selectByVisibleText(data);
			}
			else if(locator.equals("name"))
			{
				Select values = new Select(driver.findElement(By.name(location)));
				values.selectByVisibleText(data);
			}
			else if(locator.equals("xpath"))
			{
				Select values = new Select(driver.findElement(By.xpath(location)));
				values.selectByVisibleText(data);
			}
		}
	
	
	
	}
	
	
	
	@DataProvider(name="dp")
	public Object[][] getData()
	{
		
		ExcellReader ex = new ExcellReader("C:\\Users\\CHINTAN\\OneDrive\\Desktop\\test\\testing_demo.xlsx", "erp");
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

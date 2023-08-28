package datepicket;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class D001_DatepickerDemo {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.connect("https://www.globalsqa.com/demo-site/datepicker/");
		
		var myDate = "12";
		var myMonth = "June";
		var myYear = "2027";
		
		
		WebElement frame = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[1]/p/iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("datepicker")).sendKeys("08/09/2027");
		
		
//		var currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();
//		
//		int i1 = Integer.parseInt(currentYear);
//		int i2 = Integer.parseInt(myYear);
//		
//		if(i2>i1)
//		{
//			//next
//			while(!driver.findElement(By.className("ui-datepicker-year")).getText().equals(myYear))
//			{
//				driver.findElement(By.xpath("//a[@title='Next']/span")).click();
//			}
//			
//			while(!driver.findElement(By.className("ui-datepicker-month")).getText().equals(myMonth))
//			{
//				driver.findElement(By.xpath("//a[@title='Next']/span")).click();
//			}
//		}
//		else
//		{
//			//prev
//			while(!driver.findElement(By.className("ui-datepicker-year")).getText().equals(myYear))
//			{
//				driver.findElement(By.xpath("//a[@title='Prev']/span")).click();
//			}
//			
//			while(!driver.findElement(By.className("ui-datepicker-month")).getText().equals(myMonth))
//			{
//				driver.findElement(By.xpath("//a[@title='Prev']/span")).click();
//			}	
//		}
//		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
//		for(WebElement date : dates)
//		{
//			if(date.getText().equals(myDate))
//			{
//				date.click();
//			}
//		}
//		
		
	}
}

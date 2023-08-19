package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.service.DriverFinder;

import util.Driverconnection;

public class B008_Webtable1 {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.connect("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		
//		String data = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[3]/td[3]")).getText();
//		System.out.println(data);
//		
		
		//tc-1
//		List<WebElement> structures = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/th"));
//		if(structures.size()==4)
//		{
//			System.out.println("Yes !! verified");
//		}
//		else
//		{
//			System.out.println("Failed");
//		}
		
		
		
		//tc-2
//		List<WebElement> th = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr/th"));
//		List<WebElement> td = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr/td"));
//		
//		int total = th.size()+td.size();
//		
//		if(total==2)
//		{
//			System.out.println("Yes !! verified");
//		}
//		else
//		{
//			System.out.println("Failed");
//		}
		
		//tc-3
		List<WebElement> height = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/td[3]"));
		
		for(WebElement h : height)
		{
			String s = h.getText();
			System.out.println(s.substring(0,s.indexOf('m')));
		}
		
		
		
		
		
		
		
		driver.quit();
		
		
		
	}
}

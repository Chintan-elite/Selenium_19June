package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class B007_Xpath {

	
	public static void main(String[] args) {
		
	  
		
		WebDriver driver = Driverconnection.connect("https://selectorshub.com/xpath-practice-page/");
		
	
		//driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("search");
	
	
		
		//driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("abcd");
		
		
		WebElement e =  driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[4]/td[4]"));
		String data = e.getText();
		System.out.println(data);
		
	
		
	}
	
}

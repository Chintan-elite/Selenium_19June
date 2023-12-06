package com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class Day1 {
	
	public static final Logger log = LogManager.getLogger(Day1.class);
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.connect(Util.URL);
		
		Day1Page d = new Day1Page(driver);
		d.enterEmail(Util.USERNAME);
		d.enterPass(Util.PASSWORD);
		d.loginClick();
		
		try {
			String homeHeader = driver.findElement(By.xpath("//table[@class='layout']/tbody/tr/td/table/tbody/tr[3]/td")).getText();
			
			if(homeHeader.contains(Util.USERNAME))
			{
				//System.out.println("Passed");
				log.info("Passed");
			}
			else
			{
				//System.out.println("Failed");
				log.info("Failed");
			}
			
			
		} catch (Exception e) {
			//System.out.println("Failed");
			log.info("Failed");
		}
		
		
		
		
		
		
	}
}

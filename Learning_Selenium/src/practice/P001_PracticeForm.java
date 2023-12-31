package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import util.Driverconnection;

public class P001_PracticeForm {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.connect("https://demoqa.com/automation-practice-form");
		
		
		driver.findElement(By.id("firstName")).sendKeys("Test");
		driver.findElement(By.id("lastName")).sendKeys("test");
		driver.findElement(By.id("userEmail")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//*[@for='gender-radio-1']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9285968574");
		
		String myDate = "28";
		String myMonth = "June";
		String myYear = "2018";
		
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		Select months = new Select(month);
		months.selectByVisibleText(myMonth);
		
		
		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		Select years = new Select(year);
		years.selectByVisibleText(myYear);
		
		
		List<WebElement> dates= driver.findElements(By.xpath("//div[@class='react-datepicker__week']/div"));
		
		for(WebElement date : dates)
		{
			if(date.getText().equals(myDate))
			{
				if(date.getAttribute("aria-label").contains(myMonth))
				{
					date.click();
					break;
				}
			}
		}
		
		WebElement subject = driver.findElement(By.id("subjectsContainer"));
		Actions builder = new Actions(driver);
		
		builder.click(subject)
				.sendKeys("Maths")
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER)
				.build()
				.perform();
		
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
		
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\CHINTAN\\OneDrive\\Desktop\\TOPS-logo.png");
		
		driver.findElement(By.id("currentAddress")).sendKeys("surat, gujarat");
		
		
		
		
		
		
		
	}
}

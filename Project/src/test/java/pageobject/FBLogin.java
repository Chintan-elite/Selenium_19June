package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Driverconnection;

public class FBLogin {		
	public static void main(String[] args) {
		
		
		WebDriver driver = Driverconnection.connect("https://www.fb.com");
		
		//LoginPage login  = new LoginPage(driver);
		LoginPage2 login  = new LoginPage2(driver);
		
		login.enterEmail("test@gmail.com");
		login.enterPass("test");
		login.loginClick();
		
		
		
	}
}

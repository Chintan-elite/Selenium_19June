package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import util.Driverconnection;

public class D001_DB {
	
	@Test
	public void test()
	{
		
		WebDriver driver = Driverconnection.connect("https://www.fb.com");
		WebElement email = driver.findElement(By.id("email"));
		WebElement password= driver.findElement(By.id("pass"));
		
		
		try {
			
			//load db driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded...");
			
			//establish connection
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","root");
			System.out.println("connection established");
			
			//create statmeent
			Statement st = cn.createStatement();
			
			//execute sqery
			ResultSet rs =  st.executeQuery("select * from login");
			
			//extract resultset
			while(rs.next())
			{
				int id = rs.getInt(1);
				String uname = rs.getString(2);
				String pass = rs.getString(3);
				
				//System.out.println(id+" "+uname+" "+pass);
				email.clear();
				email.sendKeys(uname);
				password.clear();
				password.sendKeys(pass);
			}
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

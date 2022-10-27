package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass{
	public LoginPage(ChromeDriver driver) {
		this.driver=driver; 
	}
	
	public LoginPage enterUsername(String username) throws IOException {
		
       try {
		driver.findElement(By.id("username")).sendKeys(username);
		reportStep("Username is entered successfully", "pass");
	} catch (Exception e) {
		reportStep(e+"Username is not entered successfully", "fail");
	}
       
       return this;
	}
	
	public LoginPage enterPassword(String password) throws IOException {
		try {
			driver.findElement(By.id("password")).sendKeys(password);
			reportStep("Password is entered successfully", "pass");
		} catch (Exception e) {
			reportStep("Password is not entered successfully", "fail");
		}
		return this;
	}
	
	public WelcomePage clickLoginButton() throws IOException {
		try {
			driver.findElement(By.className("decorativeSubmit")).click();
			reportStep("Login button is clicked successfully", "pass");
		} catch (Exception e) {
			reportStep("Login button is not clicked successfully", "fail");
		}
		return  new WelcomePage(driver);
		
		
	}
	

}

package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass{
	
	@Given("Enter the username as {string}")
	public LoginPage enterUsername(String string) {
		getDriver().findElement(By.id("username")).sendKeys(string);
		return this;
	}
	@Given("Enter the password as {string}")
	public LoginPage enterPassword(String string) {
		getDriver().findElement(By.id("password")).sendKeys(string);
		return this;
	}
	@When("Click on  Login button")
	public MyHomePage clickloginbutton() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new MyHomePage();
	}
	
	
	
	}
	



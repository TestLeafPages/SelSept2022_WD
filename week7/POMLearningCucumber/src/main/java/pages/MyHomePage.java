package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyHomePage extends BaseClass {
	@Then("HomPage should be displayed")
	public MyHomePage hompage() {
		boolean displayed = getDriver().findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
	}
	@Given("Click CRMSFA link")
	public MyLeadsPage clickcrmsfalink() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyLeadsPage();
	}
	

	}

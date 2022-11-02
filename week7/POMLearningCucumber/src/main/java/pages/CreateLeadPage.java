package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.When;

public class CreateLeadPage extends BaseClass{
	
	
	
	
	@When("Enter the companyName as (.*)$")
	public CreateLeadPage entercompanyname(String companyName) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		return this;
	}
	@When("Enter the firstName as (.*)$")
	public CreateLeadPage enterfirstname(String firstName) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		return this;
	}
	@When("Enter the LastName as (.*)$")
	public CreateLeadPage enterlastname(String lastName) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		return this;
	}
	@When("Click on the CreateLeads Button")
	public ViewLeadsPage clickcreateleadsbutton() {
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeadsPage();
	}

	
}

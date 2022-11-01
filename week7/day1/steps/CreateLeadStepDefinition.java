package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateLeadStepDefinition extends BaseClass{
	
	@Given("Click CRMSFA link")
	public void clickcrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	
	}
	@And("Click Leads Button")
	public void clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@And("Click CreateLead link")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@When("Enter the companyName as (.*)$")
	public void enterCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}
	
	@And("Enter the firstName as (.*)$")
	public void enterFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}
	@And("Enter the LastName as (.*)$")
	public void enterLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}
	
	@And("Click on the CreateLeads Button")
	public void clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
	}

}

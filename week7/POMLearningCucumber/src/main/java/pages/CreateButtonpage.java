package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Given;

public class CreateButtonpage extends BaseClass{
	@Given("Click CreateLead link")
	public CreateLeadPage clickcreateleadlink() {
		getDriver().findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}

}

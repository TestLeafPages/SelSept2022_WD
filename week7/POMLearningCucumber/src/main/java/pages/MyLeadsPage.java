package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Given;

public class MyLeadsPage extends BaseClass{
	@Given("Click Leads Button")
	public CreateButtonpage clickleadsbutton() {
		getDriver().findElement(By.linkText("Leads")).click();
		return new CreateButtonpage();
	}

}

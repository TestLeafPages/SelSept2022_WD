package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass{
	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateLeadPage enterCompanyName(String cn) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cn);
		return this;

	}
	public CreateLeadPage enterFirstName(String fn) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fn);
		return this;

	}
	public CreateLeadPage enterLastName(String ln) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(ln);
		return this;

	}
	  
	public ViewLeadPage clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);

	}


}

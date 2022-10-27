package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class FindLeadsPage extends BaseClass{
	public FindLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	
	public FindLeadsPage enterFirstName() {
	driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys("Subraja");
	return this;

	}
	
	public FindLeadsPage clickFindLeadsButton() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a
	public ViewLeadPage clickFirstLead() {
		driver.findElement(By.xpath("div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadPage(driver);
	}
}

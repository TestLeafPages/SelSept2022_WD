package week5.day1testcase;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditLead extends BaseClass{
	@BeforeTest
	public void setUp() {
		ExcelFileName="EditLead";

	}
	
@Test(dataProvider="fetch")
	public  void editLead(String pn,String cn) throws InterruptedException {
	
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pn);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cn);
		driver.findElement(By.name("submitButton")).click();

	}
}

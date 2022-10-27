package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewLeadPage extends BaseClass{
	public ViewLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public void verify() {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (text.contains("Subraja")) {
			System.out.println("Lead created for first data successfully");
		}
		else if(text.contains("Vidhya")) {
			System.out.println("Lead created for second data successfully");
		}
		else {
			System.out.println("Not created");
		}

	}

}

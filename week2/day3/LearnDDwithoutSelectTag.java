package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDDwithoutSelectTag {
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		   
		   ChromeDriver driver = new ChromeDriver();
		   //open the url
		   driver.get("https://login.salesforce.com/?locale=in");
		   //to maximize
		   driver.manage().window().maximize();
           //implicit wait
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   //verify the title
		   String title = driver.getTitle();
		   System.out.println(title);
		   //Thread.sleep(5000);
		   //find the username(Demosalesmanager)
		   driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		 
		   //find the password(crmsfa)
		   driver.findElement(By.id("password")).sendKeys("Password#123");
		   
		   //click on the login button
		   driver.findElement(By.id("Login")).click();
		   //non-select dd
		   driver.findElement(By.xpath("//span[text()='Create']")).click();
		   driver.findElement(By.xpath("//span[text()='Custom Tab']")).click();
		   driver.close();
	}

}

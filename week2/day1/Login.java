package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		//setup the path using wdm
	   WebDriverManager.chromedriver().setup();
	   //System.out.println(System.getProperty("webdriver.chrome.driver"));
	   //launch the browser
	   ChromeDriver driver = new ChromeDriver();
	   //open the url
	   driver.get("http://leaftaps.com/opentaps/control/main");
	   //to maximize
	   driver.manage().window().maximize();
	   //verify the title
	   String title = driver.getTitle();
	   System.out.println(title);
	   
	   //find the username(Demosalesmanager)
	   driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	   
	   //find the password(crmsfa)
	   driver.findElement(By.id("password")).sendKeys("crmsfa");
	   
	   //click on the login button
	   driver.findElement(By.className("decorativeSubmit")).click();
	   //By using tagName
	  String text = driver.findElement(By.tagName("h2")).getText();
	  System.out.println(text);
	   //click on crmsfa link
	   driver.findElement(By.linkText("CRM/SFA")).click();
	   //CLick on leads link
	   driver.findElement(By.linkText("Leads")).click();
	  //Click on Create Lead link 
	   driver.findElement(By.partialLinkText("Create")).click(); 
	   
//	   Type the CompanyName
	   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf"); 
//	   10)Type the firstName
	   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
//	   11)Type the lastName
	   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
//	   12)Click on the Create Lead button
	   driver.findElement(By.name("submitButton")).click();
//	   13)Verify the title
       System.out.println(driver.getTitle());

	}

}

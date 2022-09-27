package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	public static void main(String[] args) {
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
		   
//		   Type the CompanyName
		   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf"); 
//		   10)Type the firstName
		   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
//		   11)Type the lastName
		   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		   //handle dropdown
		   WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		   //Create a Select class and pass the WebElement
		   Select dd = new Select(source);
		   //use the object and call the methods
		   dd.selectByIndex(2);

	}

}

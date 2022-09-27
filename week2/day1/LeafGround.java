package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) {
		//setup the path using wdm
	   WebDriverManager.chromedriver().setup();
	   //System.out.println(System.getProperty("webdriver.chrome.driver"));
	   //launch the browser
	   ChromeDriver driver = new ChromeDriver();
	   //open the url
	   driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0qj2i7yt583j17y9t565iw2d2346630.node0");
	   //to maximize
	   driver.manage().window().maximize();
	   //verify the title
	   String title = driver.getTitle();
	   System.out.println(title);
	   //to get the attribute
	  String attribute = driver.findElement(By.id("j_idt88:name")).getAttribute("placeholder");
	
	   System.out.println(attribute);
	   
	   driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("India",Keys.TAB);
	   //get the text
	   String text = driver.findElement(By.tagName("h5")).getText();
	   System.out.println(text);
	  
	}

}

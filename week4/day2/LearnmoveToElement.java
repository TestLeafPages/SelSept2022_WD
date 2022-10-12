package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnmoveToElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Find the element
		WebElement mte = driver.findElement(By.xpath("//span[text()='Prime']"));
		//Create an Actions class
		Actions builder = new Actions(driver);
		//Use the instance of Actions class to access all the methods
		builder.moveToElement(mte).perform();
		
		

	}

}

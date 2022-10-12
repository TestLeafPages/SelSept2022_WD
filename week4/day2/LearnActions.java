package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//disable notification
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notification");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement kids = driver.findElement(By.linkText("KIDS"));
		Actions builder = new Actions(driver); 
		builder.moveToElement(kids).perform();
	    driver.findElement(By.linkText("Soft Toys")).click();
	    WebElement img = driver.findElement(By.xpath("//div[@class='imgHolder']"));
	    builder.moveToElement(img).perform();
	    System.out.println(driver.findElement(By.xpath("//div[text()='Quick View']")).getText());
	    
	    
		
		

	}

}

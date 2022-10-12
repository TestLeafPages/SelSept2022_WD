package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSnapshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node03verg0z075n31ai7n4a3r1rfp365346.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement drag = driver.findElement(By.id("form:conpnl_header"));
		Point location = drag.getLocation();
		int x = location.getX();
		int y = location.getY();
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(drag, x, y).perform();
		WebElement ele1 = driver.findElement(By.xpath("(//td[text()='Bamboo Watch'])[2]"));
		WebElement ele2 = driver.findElement(By.xpath("(//td[text()='Bracelet'])[2]"));
		builder.clickAndHold(ele2).moveToElement(ele1).perform();
//		Thread.sleep(3000);
//		WebElement verifyColumns = driver.findElement(By.xpath("//span[text()='Row moved']"));
//		String text = verifyColumns.getText();
//		if (text.contains("Row moved")) {
//		System.out.println("Reoredered successfully");	
//		}
//		else {
//			System.out.println("Not done");
//		}
	    WebElement scroll = driver.findElement(By.xpath("//label[text()='2022 - All Rights Reserved']"));
	    builder.scrollToElement(scroll).perform();
	    String text2 = scroll.getText();
	    System.out.println(text2);
	    //To take snapshot
	    File source = driver.getScreenshotAs(OutputType.FILE);
	    File destination = new File("./Snaps/drag.png");
	    FileUtils.copyFile(source, destination);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		

	}

}

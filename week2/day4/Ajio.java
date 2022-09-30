package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
//		1)Login to Ajio website(https://www.ajio.com/)



//			   5)Print the text of the number of items displayed 1)Login to Ajio website(https://www.ajio.com/)
//				   2)Type oneplus pro in the search box("Women",keys.Enter)
//				   3)Click on the Sarees check box under Cateogory
//				   4)Click on sort by dropdown and click Whats new
				 //  5)Print the text of the number of items displayed 
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		// open the url
		// 1)Login to amazon website(https://www.amazon.in/)
		driver.get("https://www.ajio.com/");
		// to maximize
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		   2)Type oneplus pro in the search box("Women",keys.Enter)
		driver.findElement(By.name("searchVal")).sendKeys("Women",Keys.ENTER);
//		   3)Click on the Sarees check box under Cateogory
		driver.findElement(By.xpath("//label[contains(text(),'Sarees')]")).click();
//		   4)Click on sort by dropdown and click Whats new
		WebElement dropDown = driver.findElement(By.xpath("//div[@class='filter-dropdown']//select"));
		Select sec = new Select(dropDown);
		//sec.selectByValue("newn");
		sec.selectByVisibleText("What's New");
		
		String text = driver.findElement(By.xpath("//div[@class='filter']//div")).getText();
		System.out.println(text);
		System.out.println(text.replaceAll("[^a-zA-Z]", ""));
		if(text.equals("items")) {
			System.out.println("Successfully printed");
		}
		else {
			System.out.println("Not printed");
		}
		
		
	}

}

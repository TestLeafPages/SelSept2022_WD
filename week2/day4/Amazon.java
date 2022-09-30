package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
 
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		// open the url
		// 1)Login to amazon website(https://www.amazon.in/)
		driver.get("https://www.amazon.in/");
		// to maximize
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		   2)Type oneplus pro in the search box("OneplusPro",keys.Enter)
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Onepluspro", Keys.ENTER);
//		   4)Click on the first resulting mobile
		String text2 = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		
//		   5)Print the price  in the console 
		//String text = driver.findElement(By.xpath("//span[@class='a-price a-text-price a-size-medium apexPriceToPay']")).getText();
		System.out.println(text2);
		String replaceAll = text2.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);

	}

}

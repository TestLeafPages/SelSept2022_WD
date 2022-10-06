package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		// open the url
		// 1)Login to amazon website(https://www.amazon.in/)
		driver.get("https://www.facebook.com/");
		// to maximize
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		List<String> list = new ArrayList<String>();
		for (WebElement each : links) {

			String text = each.getText();
			System.out.println(text);
			list.add(text);
			
			
			
		}

	}

}

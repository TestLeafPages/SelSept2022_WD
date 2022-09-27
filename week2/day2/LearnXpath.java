package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// System.out.println(System.getProperty("webdriver.chrome.driver"));
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		// open the url
		driver.get("https://www.leafground.com/select.xhtml");
		// to maximize
		driver.manage().window().maximize();
		// verify the title
		WebElement findElement = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select sec = new Select(findElement);
		List<WebElement> options = sec.getOptions();
		System.out.println(options.size());

        for (WebElement each : options) {
        	Thread.sleep(3000);
        	each.click();
			String text = each.getText();
			System.out.println(text);
		}
	}

}

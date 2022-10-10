package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Find the element
		WebElement dd = driver.findElement(By.xpath("//div[@class='example'][6]/select"));
		//create an  obj for Select class
		Select sec = new Select(dd);
		//use getOptions() from Select class
		List<WebElement> options = sec.getOptions();
		//Iterate through a for loop
		for (int i = 0; i < options.size(); i++) {
			if(i==2 || i==3) {
			options.get(i).click();
			}
		}
		
	}

}

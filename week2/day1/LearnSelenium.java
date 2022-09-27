package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium {

	public static void main(String[] args) {
		//setup the path using wdm
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
	   
	   

	}

}

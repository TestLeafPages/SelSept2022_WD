package week5.day1testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public  RemoteWebDriver driver;
	public String ExcelFileName;
	
	@Parameters({"url","username","password","browser"})
	@BeforeMethod
	public void preCondition(String url,String username,String password,String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))	{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

	}

	@AfterTest
	public void postCondition() {
		// driver.close();
	}
	@DataProvider(name="fetch",indices=1)
	public String[][] fetchData() throws IOException {
		String[][] data = ReadExcel.readExcel(ExcelFileName);
		return data;
		
		
		
	}

}

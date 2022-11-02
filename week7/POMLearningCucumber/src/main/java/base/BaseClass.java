package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

public class BaseClass extends AbstractTestNGCucumberTests{

//	public  ChromeDriver driver;
	public String ExcelFileName;
	
    private static final ThreadLocal<RemoteWebDriver> rd = new ThreadLocal<RemoteWebDriver>();
    
    //settermethod
   public void setDriver() {
	   rd.set(new ChromeDriver());
   }
   
   //gettermethod
  public RemoteWebDriver  getDriver() {
	 return rd.get(); 
  }
    
    
    
    
	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
	//	driver = new ChromeDriver();
		setDriver();//initialize the driver
		getDriver().get("http://leaftaps.com/opentaps/");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@AfterMethod
	public void postCondition() {
		// driver.close();
	}

	@DataProvider(name = "fetch")
	public String[][] fetchData() throws IOException {
		return ReadExcel.readExcel(ExcelFileName);
	}
	 
}

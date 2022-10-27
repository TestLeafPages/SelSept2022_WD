package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

public class BaseClass {

	public ChromeDriver driver;
	public String ExcelFileName;
	public static ExtentReports extent;
	public String testName,testDescription,testCategory,testAuthor;
	public static ExtentTest test;
	
    @BeforeSuite
	public void startreport() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		reporter.setAppendExisting(true);
        extent = new ExtentReports();
		extent.attachReporter(reporter);
	}

   
    
    @BeforeClass
    public void testcaseDetails() {
        test = extent.createTest(testName,testDescription);
		test.assignCategory(testCategory);
		test.assignAuthor(testAuthor);

	}
    
    public int takeSnap() throws IOException {
       int ranNum=(int)(Math.random()*999999+999999);
	   File source = driver.getScreenshotAs(OutputType.FILE);
	   File dest = new File("./snaps/img"+ranNum+".png");
	   FileUtils.copyFile(source, dest);
	   return ranNum;
	   

	}
    public void reportStep(String msg,String status) throws IOException {
		if (status.equalsIgnoreCase("pass")) {
			test.pass(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());	
		}
		else if(status.equalsIgnoreCase("fail")) {
			test.fail(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());
		}

	}
    
    
    
    
    
    
	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@AfterMethod
	public void postCondition() {
		// driver.close();
	}

	@DataProvider(name = "fetch")
	public String[][] fetchData() throws IOException {
		return ReadExcel.readExcel(ExcelFileName);
	}
	 @AfterSuite
	    public void stopReport() {
			extent.flush();

		}

}

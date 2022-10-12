package week4.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		//Click on the button to get an alert
//		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
//		//Move the control to the alert
//		Alert alert = driver.switchTo().alert();
//		//To get  the text
//		String text = alert.getText();
//		System.out.println("Text of the simple alert box "+text);
//		//accept the alert->click Ok
//		alert.accept();
		//Confirm alert
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		//Move the control
		Alert alert = driver.switchTo().alert();
//		//To cancel an alert
		alert.dismiss();
		//Get the text after dismissing the alert
		String text = driver.findElement(By.id("result")).getText();
		System.out.println("After dismissing the alert : "+text);
		
	}

}

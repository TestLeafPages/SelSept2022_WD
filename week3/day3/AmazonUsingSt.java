package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonUsingSt {

	public static void main(String[] args) {



//	   4)print the lowest Price
		WebDriverManager.chromedriver().setup();

		EdgeDriver driver = new EdgeDriver();
		
//		1)Go to Amazon url
		driver.get("https://www.amazon.in/");
		// to maximize
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		   2)Type phones
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones",Keys.ENTER);
//		   3)Print price of every phone
		List<WebElement> phoneElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer>list = new ArrayList<Integer>();
		for (int i = 0; i <phoneElements.size() ; i++) {
		
			String price = phoneElements.get(i).getText().replace(",", "");
			//System.out.println(price);
		Integer parseint = Integer.parseInt(price);
			list.add(parseint);
		}
		int size = list.size();
		System.out.println("Size of List " +size);
		
		//Collections.sort(list);
		System.out.println(list);
		//System.out.println("The lowest price of this list is " +list.get(0));
		//Declare a set
		Set<Integer> unique = new HashSet<Integer>(list);
		int size2 = unique.size();
		System.out.println("Size of Set "+size2);
		System.out.println(unique);
		
		List<Integer> list1 = new ArrayList<Integer>(unique);
		System.out.println(list1.get(0));
		
		
		

		
		

	}

}

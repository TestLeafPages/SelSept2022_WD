package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Print the heading
		WebElement heading = driver.findElement(By.tagName("h1"));
		// print the text
		String text2 = heading.getText();
		System.out.println("Heading " + text2);
		// find the no:of header
		List<WebElement> header = driver.findElements(By.xpath("//table//th"));
		int size = header.size();
		System.out.println("Size of header " + size);
		// Iterate through all the header of the table
		for (WebElement each : header) {
			//print the text
			String text = each.getText();
			System.out.println(text);
		}
		//find the no:of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		System.out.println("No: of rows in a table " + rows.size());
		// To print a single data
		System.out.println("Single data "+driver.findElement(By.xpath("//table//tr[4]//td[1]")).getText());
		// To print entire table data
		System.out.println("Entire row data==============");
		for (int i = 1; i < rows.size(); i++) {
			System.out.println(rows.get(i).getText());
			
		}
		// To print the entire data
		for (int i = 1; i <= rows.size(); i++) {// 1<=4
			List<WebElement> cols = driver.findElements(By.xpath("//table//tr[" + i + "]//td"));// tr[4]//td
			for (int j = 1; j <= cols.size(); j++) {
				String text = driver.findElement(By.xpath("//table//tr[" + i + "]//td[" + j + "]")).getText();// tr[1]//td[1]
				System.out.println(text);
			}
		}
		// to get the data of the first column
		List<WebElement> dataFC = driver.findElements(By.xpath("//table//tr//td[1]"));
		List<String> list = new ArrayList<String>();
		for (WebElement eachData : dataFC) {
			String text = eachData.getText();
			list.add(text);

		}
		System.out.println("Datas in the first column : " + list);
		//to click on all the checkboxes
		List<WebElement> findElements = driver.findElements(By.xpath("//table//tr//td[3]"));
		for (WebElement eachCheckBox : findElements) {
			eachCheckBox.click();
		}
	}

}

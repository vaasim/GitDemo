package WebDriverPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)");
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		
		// Handling Table Elements
		
		// getting table coloumn values and adding and comparing
		
		List<WebElement> values = driver.findElements(By.xpath("//div[@class='tableFixHead']/descendant::tbody/tr/td[4]"));
		int sum =0;
		for(int i=0;i<values.size();i++) {
			
			sum = sum + Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);
		
		//parsing of string
		
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		System.out.println(total);
		Assert.assertEquals(sum, total);
		

	}

}


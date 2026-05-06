package Techniques;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteDropdownAssessment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("unit");
		Thread.sleep(5000);
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='ui-menu-item-wrapper']"));
		for(int i=0;i<li.size();i++) {
			Thread.sleep(5000);
			System.out.println( li.get(i).getText()); 
			
		if(li.get(i).getText() == "United States (USA)") {
		System.out.println("Success");
		driver.findElement(By.xpath("(//div[@class='ui-menu-item-wrapper']/parent::li)['"+i+"']")).click();
		}
		}

	}

}

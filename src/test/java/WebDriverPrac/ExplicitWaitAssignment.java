package WebDriverPrac;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitAssignment {
	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver;
	
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
	
	driver.findElement(By.xpath("//input[@value='user']/following-sibling::span")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
	driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
	
	
	WebElement user = driver.findElement(By.xpath("//select[@class='form-control']"));
	
	Select dp = new Select(user);
	dp.selectByVisibleText("Consultant");
	
	
	driver.findElement(By.xpath("//input[@id='terms']")).click();
	driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
	
	String[] itemsToBeAdded = {"iphone X","Blackberry"};
	
	addItems(driver,wait,itemsToBeAdded);
	}
	
	
	public static void addItems(WebDriver driver, WebDriverWait wait,String[] itemsToBeAdded) {
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='ProtoCommerce Home']")));
		int s = itemsToBeAdded.length;
		
		
		List<WebElement> phonesAvailable = driver.findElements(By.xpath("//h4[@class='card-title']/a"));
		int totalPhones = phonesAvailable.size();
		int j=0;
		for(int i=0; i<totalPhones;i++) {
			
			String ph = phonesAvailable.get(i).getText();
			
			List items = Arrays.asList(itemsToBeAdded);
			if(items.contains(ph)) {
				driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
				j++;
			}
			
			if (j==s) {
				break;
			}
		}
		
		
		
	}

}

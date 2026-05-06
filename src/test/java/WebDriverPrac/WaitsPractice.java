package WebDriverPrac;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Explicit wait 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// Wait for the element to be visible
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		Thread.sleep(5000);
		String[] itemsToBeAdded= {"Cucumber","Beetroot"};
		addItems(driver,itemsToBeAdded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
	}
	
	public static void addItems(WebDriver driver, String[] itemsToBeAdded)
	{
		List<WebElement> itemsInSite = driver.findElements(By.xpath("//h4[@class='product-name']"));
		int a = itemsInSite.size();
		
		int j=0;
		for(int i=0;i<a;i++) {
			List itemsNeededList = Arrays.asList(itemsToBeAdded);
			//String b = itemsInSite.get(i).getText();
			String[] name=itemsInSite.get(i).getText().split("-");
			String formattedName=name[0].trim();
			if(itemsNeededList.contains(formattedName)) {
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
			}
			if(j==itemsToBeAdded.length) {
				break;
			}
		}      
	}

}

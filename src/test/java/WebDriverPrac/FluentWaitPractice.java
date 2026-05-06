package WebDriverPrac;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(5))
			       .ignoring(NoSuchElementException.class);
		
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		    	 if(driver.findElement(By.xpath("//button[text()='Start']")).isDisplayed()) {
		    		 return driver.findElement(By.xpath("//button[text()='Start']"));
		    	 }
		    	 else {
		    		 return null;
		    	 }
		      
		     }
		   });
		
	}

}

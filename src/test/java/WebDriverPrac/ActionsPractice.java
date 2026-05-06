package WebDriverPrac;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(15000);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		
		//w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//a[@data-nav-role='signin'])[1]"))));
		WebElement Account = driver.findElement(By.xpath("(//a[@data-nav-role='signin'])[1]"));
		
		
		
		Actions a = new Actions(driver);
		
		a.moveToElement(Account).build().perform();
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).keyDown(Keys.SHIFT).sendKeys("mobile")
		.doubleClick().build().perform();
		System.out.println(driver.findElement(By.id("twotabsearchtextbox")).getText());

	}

}
